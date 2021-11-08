MAXCOUNT=10
count=1
#Array name is number

while [ "$count" -le $MAXCOUNT ]; do
 number[$count]=$(( ( RANDOM % 10 ) + 100 ))
 let "count += 1"
done

echo "${number[*]}"

largest=${number[0]}
secondGreatest='unset'

for((i=1; i < ${#number[@]}; i++))
do
  if [[ ${number[i]} > $largest ]]
  then
    secondGreatest=$largest
    largest=${number[i]}
  elif (( ${number[i]} != $largest )) && { [[ "$secondGreatest" = "unset" ]] || [[ ${number[i]} > $secondGreatest ]]; }
  then
    secondGreatest=${number[i]}
  fi
done

echo "secondGreatest = $secondGreatest"

smallest=${number[0]}
secondSmallest='unset'

for((i=1; i < ${#number[@]}; i++))
do
  if [[ ${number[i]} < $smallest ]]
  then
    secondSmallest=$smallest
    smallest=${number[i]}
  elif (( ${number[i]} != $smallest )) && { [[ "$secondSmallest" = "unset" ]] || [[ ${number[i]} > $secondSmallest ]]; }
  then
    secondSmallest=${number[i]}
  fi

done
echo "secondSmallest = $secondSmallest"


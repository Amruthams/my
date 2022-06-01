#factorial of a number using function


if [ $# -ne 0 ]
then 
	echo "Syntax is <$0> "
	exit 1
fi

fact()  #factorial function
{
	n=$1
	i=1
	f=1
	while [ $i -le $n ]
	do
	 f=`expr $f \* $i`
	 i=`expr $i + 1`
	done
	return $f
}


echo "Enter a number "   #calling function
read no
fact $no
echo "$no! =$?"



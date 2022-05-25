#2. Shell script to read 3 numbers and test whether they can be sides of a triangle

if [ $# -ne 0 ]
then
 echo "syntax is <$0>"
 exit 1
fi

echo "Enter the 3 numbers:"
read n1 n2 n3
a=`expr $n1 + $n2`
b=`expr $n1 + $n3`
c=`expr $n2 + $n3`
if [ $a -gt $n3  -a  $b -gt $n2 -a $c -gt $n1 ]
then
    echo " $n1 ,$n2, $n3 are sides of a tringle"
else 
    echo " $n1 ,$n2 ,$n3 are not sides of a triangle"
fi

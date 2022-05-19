#2. Shell script to read 3 numbers and test whether they can be sides of a triangle

if [ $# -ne 1 ] 
then 
echo "syntax error"
exit
fi
p=$1
i=2
while [ $i -le `expr $p / 2` ]
do
    if [ `expr $p % $i` -eq 0 ]
    then
        echo "the number $p is not a prime number"

        exit

    fi
i=`expr $i + 1`
done
echo "the number $p is a prime number"

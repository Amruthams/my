#6. Shell script to count the number of words and lines in a file


if [ $# -ne 1 ]
then
        echo "syntax error"
        exit
fi



filename=$1
ter='tty'
exec < $filename
i=0
j=0
while read line
do
	i=`expr $i +1`
for c in $line
	j=`expr $j + 1`

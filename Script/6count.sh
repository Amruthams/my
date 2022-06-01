#6. Shell script to count the number of words and lines in a file


if [ $# -ne 1 ]
then
        echo "syntax error < $0  filename >"
        exit
fi



filename=$1
ter=`tty`      #terminal
exec < $filename   #execute 
i=0
j=0
while read line
do
	i=`expr $i + 1`
for c in $line
do
	j=`expr $j + 1`
done
done
echo " The file $filename has :"
echo " No of lines = $i"
echo " No of words = $j"
exec < $ter      #keyboard


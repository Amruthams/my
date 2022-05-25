#5.Shell script to compare two files. If the files are identical delete one



if [ $# -ne 0 ]
then
    echo "syntax error <$0>"
    exit
fi



echo "Enter file1:"
read file1
echo "Enter file2:"
read file2
cmp $file1 $file2 > /dev/null
if [ $? -eq 0 ]
then
	rm $file2
	echo " The 2 files are identical, file2 is removed."
fi
echo "Files are not identical,no file deleted."

#5.Shell script to compare two files. If the files are identical delete one







echo "Enter file1:"
read file1
echo "Enter file2:"
read file2
cmp $file1 $file2
if [ $? -eq 0 ]
then
	rm $file2
	echo " file2 removed"
fi
echo "files are not identical"

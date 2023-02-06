echo "Proceed if you've established a connection with Eustis!"
echo -n "What is your NID? "
read nid

echo -n "What is the path of the file?"
read dir

scp $dir $nid@eustis.eecs.ucf.edu:~/

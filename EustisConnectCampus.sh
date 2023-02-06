echo Proceed if you are on campus!
echo -n "What is your NID?"
read nid
echo Your NID is $nid

ssh $nid@eustis.eecs.ucf.edu

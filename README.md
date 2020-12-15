# Dynamic-Array
Dynamic array is an indexable array that you can change the size of which can shrink and expand.
This dynamic Array will also contain the following method 
Constructor( empty){
Initialize Array 
Initialize size of array 
Available position set to size of array - 1
}
constructor ( size ){
Initial array ( size) 
Size of array set to size 
Available position set to size - 1
}

Method :
Add(item , location ) - add an item to a specific location 
Append (item )  - add an item to the end of the list
Pop - remove the last item 
Remove (location ) - remove the item at the certain location 
Sort ( )  - sort the item in the array
Variable 
Array 
Size of array 
Available 

Add( item , location ){


Check if the list is not empty 
Check if the location is < size
	If not increase size of list by creating new list copying the element from the old list to the new list and set the old list  equal to the new list
Add item to the location 
Issue with adding item in specific location
Append ( item)
Check if the list is not empty 
Check if the location is < size
	If not increase size of list by creating new list copying the element from the old list to the new list and set the old list  equal to the new list
Add item to the end of list 


pop() 
Check if the list is not empty 
Remove last element 

Sort( implement binary search)
variable :

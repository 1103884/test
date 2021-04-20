

package javaapplication3;

public class NewClass {
 public int []studentIDs=new int [14];
 public int currentIndex;
 void inser (int value){
     if (currentIndex<studentIDs.length){
         studentIDs [currentIndex] = value;
         currentIndex++;
 }
    }
 void update (int Index, int value){
     if (Index < studentIDs.length){
         studentIDs [Index]= value;
         
     };
 }
}
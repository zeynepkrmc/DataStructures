//PROCEDURE SHELL_SORT(ARRAY, N)  
   //WHILE GAP < LENGTH(ARRAY) /3 :
                    //GAP = ( INTERVAL * 3 ) + 1      
   //END WHILE LOOP
   //WHILE GAP > 0 :
       //FOR (OUTER = GAP; OUTER < LENGTH(ARRAY); OUTER++):
             //INSERTION_VALUE = ARRAY[OUTER]
                    //INNER = OUTER;
             //WHILE INNER > GAP-1 AND ARRAY[INNER – GAP] >= INSERTION_VALUE:
                    //ARRAY[INNER] = ARRAY[INNER – GAP]
                    //INNER = INNER – GAP
              //END WHILE LOOP
                  //ARRAY[INNER] = INSERTION_VALUE
       //END FOR LOOP
       //GAP = (GAP -1) /3;    
   //END WHILE LOOP
//END SHELL_SORT
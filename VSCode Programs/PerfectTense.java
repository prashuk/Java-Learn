import java.util.*;

// class Solution {
//     public static void main(String[] args) {
//         String input = "look at {this {specific|particular} example|an example {like|such as} this} in the sky.";
//         String result = "";
//         String suffix = "";
//         for(int i = 0; i < input.length(); i++) {
//             if(input.charAt(i) == '{') {
//                 result = result + getRandomString(input.substring(i+1, input.length()-1));
//                 break;
//             }
// 			result = result + input.charAt(i);
//         }
//         for(int i = input.length()-1; i >= 0; i--) {
//             if(input.charAt(i) == '}') {
//                 break;
//             }
//             suffix = input.charAt(i) + suffix;
// 		}
// 		result = result + suffix;
// 		System.out.println(result);
//     }
    
//     public static String getRandomString(String str) {
//         List<String> strList = new ArrayList<>();
//         String temp = "";
//         for(int i = 0; i < str.length(); i++) {
//             if(str.charAt(i) != '{' && str.charAt(i) != '|' && str.charAt(i) != '}') {
// 				temp = temp + str.charAt(i);
// 				// print(temp);
// 			}
// 			if(str.charAt(i) == '|') {
// 				strList.add(temp);
// 				temp = "";
// 				continue;
// 			}
// 			if(str.charAt(i) == '}') {
// 				strList.add(temp);
// 				break;
// 			}
// 			if(str.charAt(i) == '{') {
// 				temp = temp + getRandomString(str.substring(i+1,str.length()-1));
// 				int count = 1;
// 				i++;
// 				while(count > 0) {
// 					if (str.charAt(i) == '{') count ++;
// 					if (str.charAt(i) == '}') count --;
// 					i++;
// 				}
// 				i--;
// 			}
// 			// print(strList);
// 		}
// 		// return strList.get(0);
//         Random rand = new Random();
//         return strList.get(rand.nextInt(strList.size()));
// 	}
	
// 	public static void print(Object obj) {
// 		System.out.println(obj);
// 	}
// }



// class Solution {
//     public static void main(String[] args) {
//         String input = "look at {this {specific|particular} example|an example {like|such as} this} in the sky";
//         String result = "";
//         String suffix = "";
//         for(int i = 0; i < input.length(); i++) {
//             if(input.charAt(i) == '{') {
//                 result = result + getRandomString(input.substring(i+1, input.length()-1));
//                 break;
//             }
//             result = result + input.charAt(i);
//         }
//         for(int i = input.length()-1; i >= 0; i--) {
//             if(input.charAt(i) == '}') {
//                 break;
//             }
//             suffix = input.charAt(i) + suffix;
//         }
//         result = result + suffix;
//         System.out.println(result);
//     }
    
//     public static String getRandomString(String str) {
//         List<String> strList = new ArrayList<>();
//         String temp = "";
//         for(int i = 0; i < str.length(); i++) {
//             if(str.charAt(i) != '{' && str.charAt(i) != '|' && str.charAt(i) != '|') {
//                 temp = temp + str.charAt(i);
//             }
//             if(str.charAt(i) == '|') {
//                 strList.add(temp);
//                 temp = "";
//                 continue;
//             }
//             if(str.charAt(i) == '}') {
//                 strList.add(temp);
//                 break;
//             }
//             if(str.charAt(i) == '{') {
//                 temp = temp + getRandomString(str.substring(i+1,str.length()-1));
//                 int count = 1;
//                 i++;
//                 while(count > 0) {
//                     if (str.charAt(i) == '{') count ++;
//                     if (str.charAt(i) == '}') count --;
//                     i++;
//                 }
//                 i--;
//             }
//         }
//         Random rand = new Random();
//         return strList.get(rand.nextInt(strList.size()));
//     }
// }


class Solution {
    public static void main(String[] args) {
        String input = "look at {this {specific|particular} example|an example {like|such as} this} in the sky";
        String result = "";  //appending final result into this
        String suffix = "";  //part of input after the last '}' 
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '{') {
                result = result + getRandomString(input.substring(i+1, input.length()-1));
                break;
            }
            result = result + input.charAt(i);
        }
        for(int i = input.length()-1; i >= 0; i--) {
            if(input.charAt(i) == '}') {
                break;
            }
            suffix = input.charAt(i) + suffix;
        }
        if (!result.equals(suffix)) {
            result = result + suffix;
        }
        System.out.println(result);
    }
    
    // return random option out of all the string options 
    public static String getRandomString(String str) {
        List<String> strList = new ArrayList<>(); // list of all the available options with in current set of {}
        String temp = "";
        for(int i = 0; i < str.length(); i++) {
            
            //if no {,|,} then add to current option.
            if(str.charAt(i) != '{' && str.charAt(i) != '|' && str.charAt(i) != '}') {
                temp = temp + str.charAt(i);
            }
            
            if(str.charAt(i) == '|') {
                strList.add(temp);
                temp = "";
                continue;
            }
            if(str.charAt(i) == '}') {
                strList.add(temp);
                break;
            }
            
            // new set of {} have been encountered do we resolve them before continuing
            if(str.charAt(i) == '{') {
                temp = temp + getRandomString(str.substring(i+1,str.length()-1));
                int count = 1;
                
                // since new brace brackets have been resolved, we continue resolving the curent braces after the new }
                i++;
                while(count > 0) {
                    if (str.charAt(i) == '{') count ++;
                    if (str.charAt(i) == '}') count --;
                    i++;
                }
                i--;
            }
        }
        
        // rendom option is selecting from the list
        Random rand = new Random();
        return strList.get(rand.nextInt(strList.size()));
    }
}
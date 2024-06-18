function reverseString(s: string[]): void {

    let left =0; let right = s.length-1;
    while(left<=right){
        const temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;
    }

    console.log(s);

};


function reverse(num: number): number {
    let rev = 0;
    const sign = Math.sign(num);
    num = Math.abs(num);


    while(num>0){
        let digit = num%10    
        num = Math.floor(num/10)

// Check for overflow before it happens
if (rev > (2**31 - 1) / 10 || (rev === (2**31 - 1) / 10 && digit > 7)) {
    return 0; // Overflow case for positive numbers
}
if (rev > (2**31) / 10 || (rev === (2**31) / 10 && digit > 8)) {
    return 0; // Overflow case for negative numbers
}
        rev = rev*10+digit
    }

    
return rev *sign;
};


//reverseString(['a','b','c','d'])
// console.log(reverse(1234))

function firstUniqChar(s: string): number { 
    const count = new Map<string,number>();
    for(const ch of s){
        if(count.has(ch)){
            count.set(ch,1+(count.get(ch) || 0))
        }
        else{
            count.set(ch,1)
        }
    }
    
    for(let i=0;i<s.length;i++){
        if(count.get(s[i]) === 1){
            return i;
        }
    }
    
    return -1;
};

console.log(firstUniqChar('loveleetcode'))


function isAnagram(s: string, t: string): boolean {
    if(s.length < 1 || t.length > (5*(10**4)) || t.length != s.length) return false;
    const schMap = new Map<string,number>();
    const tchMap = new Map<string,number>();
    for(let i  =0 ;i < s.length;i++){
        addToMap(s[i],schMap);
        addToMap(t[i],tchMap);
    }

    for(let [key,value] of tchMap){
        if(tchMap.size !== schMap.size || 
            !schMap.has(key) || 
            schMap.get(key) !== value)
             return false;
    } 

    return true;
};

function addToMap(key:string,map:Map<string,number>){
    let value = map.get(key) ?? 0;
    map.set(key,++value);
}

// console.log(isAnagram('aacc','ccac'))

function isPalindrome(s: string): boolean {
    if(s.length<1 || s.length > 2*(10**5)) return false;
    s = s.toLocaleLowerCase().replace(/[^a-zA-Z0-9]/g,'');
  return s === s.split('').reverse().join('');  
};

function isAPalindrome(s: string): boolean {
    const y = s.replace(/[^a-z0-9]/gi, '').toLowerCase()
  
    for (let i = 0; i < y.length; i++){
        if (y[i] !== y[y.length - 1 - i]) return false
    }
      
  
    return true
  }

console.log(isAPalindrome("A man, a plan, a canal: Panama"))

function strStr(haystack: string, needle: string): number {
  
    if(haystack.length<1 || needle.length> 10**4) return -1;
    if( needle.length > haystack.length) return -1;

    for(let i =0;i <= haystack.length-needle.length;i++){
        let match  = true;
        for(let j =0 ;j< needle.length;j++){
            console.log(haystack[i+j],needle[j])
            if(haystack[i+j] !== needle[j]){
                match=false;
                break;
            }  
        }
        if(match){
            return i;
        }
    }

    return -1;

};

// console.log(strStr('a','a'))

function longestCommonPrefix(strs: string[]): string {
    if(strs.length < 0 && strs.length > 200) return ''
    let prefix = strs[0];
    for(let i =1; i<strs.length;i++){
        const currentStr = strs[i];
        if(currentStr.length < 0 && currentStr.length > 200) return ''

        let j = 0;

        while(j < currentStr.length && j < prefix.length && currentStr[j] === prefix[j]){
            j++;
        }

        prefix = prefix.substring(0,j);
        
        if(prefix === '')break;
        
    }
  return prefix
};

// console.log(longestCommonPrefix(["flower","flow","flight"]))

function myAtoi(s: string): number {
  if(s.length < 0 || s.length >200) return 0;
  s = s.trim();
  let sign = 1;
  let i = 0;
  let result = 0;
  if(s[i]==='-') sign = -1; else i++;

  while(i<s.length && isDigit[s[i]]){
    let digit = parseInt(s[i]);

    if (result > Math.floor((2**31 - 1 - digit) / 10)) {
        return sign === -1 ? -2147483648 : 2147483647;
    }
    result = result*10+digit;
    i++;
  }
  
  
    return sign*result;  
};

// Helper function to check if a character is a digit
function isDigit(c) {
    return c >= '0' && c <= '9';
}
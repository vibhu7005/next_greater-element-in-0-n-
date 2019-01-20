//stack balanced parenthesis 
import java.util.*;
public class Main 
{
    Boolean check(String s)
    {
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            int a;
            switch(s.charAt(i))
            {
                case '}':
                    a=stack.pop();
                    if(a=='['||a=='(')
                    return false;
                     break;
                case ')':
                    a=stack.pop();
                    if(a=='['||a=='{')
                    return false;
                     break;
                case ']':
                        a=stack.pop();
                      if(a=='('||a=='{')
                      return false;
                       break;
            }
        }
        return stack.isEmpty();
            
        }
        public static void main(String[] args)
        {
            Main obj=new Main();
            String exp="{()}[";
            if(obj.check(exp))
            System.out.print("balanced");
            else
            System.out.print("not balanced");
        }
}

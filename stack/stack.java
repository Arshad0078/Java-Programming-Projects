package stack;
class stack
{
    int a[];
    int n;
    static int top;
    stack(int n)
    {
        this.n = n;
        a = new int[n];
        top=-1;
    }
    void push(int item)
    {
        if (top==n-1){
            System.out.println("stack is full");
        }
        else{
            a[++top]=item;
            System.out.println("Element Inserted:"+item);
        }
    }
    void pop()
    {
        if (top<0)
        {
            System.out.println("stack is Underflow");
        }
        else{
            System.out.println("Element Deleted:"+a[top--]);
        }
    }
}
class demo{
        public static void main(String[] args)
        {
            int num=5;
            stack mystack = new stack(num);
            for (int i=0;i<num;i++){
                mystack.push(i);
            }
            mystack.push(90);
            System.out.println("Elements in my stack");
            for (int i=0;i<num;i++)
            {
                mystack.pop();
            }
            mystack.pop();
        }
}
package 方阵;

public class Test2 {  
    public static int N = 5;  
    int [][] result = new int[N][N];  
    public static void main(String[] args) {  
        Test2 rm = new Test2();  
        rm.generateRotate(1, 0, N);  
        rm.printResult();  
    }  
      
    //生成旋转矩阵  
    public void generateRotate(int num, int beg, int size){  
        if(size == 1){  
            result[beg][beg] = num;  
            return;  
        }  
          
        if(size == 0){  
            return;  
        }  
        //生成左边区域 
        int i = beg;  
        int j = beg;  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = num;  
            num++;  
            i++;  
        }  
          
        //生成下边区域
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = num;  
            num++;  
            j++;  
        }  
          
        //生成右边区域  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = num;  
            num++;  
            i--;  
        }  
          
        //生成上边区域
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = num;  
            num++;  
            j--;  
        }  
          
        //递归调用  
        generateRotate(num, beg + 1, size - 2);  
    }  
      
    //打印结果  
    public void printResult(){  
        for(int i = 0; i < N; i++){  
            for(int j = 0; j < N; j++){ 
            	if(5<result[i][j]&&result[i][j]<10)
            	{System.out.print(result[i][j] + "    ");}
            	else
                {System.out.print(result[i][j] + "   ");}  
                if(j == N - 1){  
                    System.out.println();  
                }  
            }  
        }  
    }  
}
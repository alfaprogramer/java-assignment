public class Assigment {
    
    static int abs(int d)
    {
        return d < 0 ? -1 * d : d;
    }
   public static void main(String[] args) {
    

    int i, j;
    for (i = 0; i < 6; i++)
    {
        for (j = 0; j < 6; j++)
        {
            if (i == 0)
                System.out.printf("*");
            else if (j == 6 / 2)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
       
       
    }

   
     

    
    for (i = 0; i <6; i++)
    {
        System.out.printf("*");
        for (j = 0; j < 6; j++)
        {
            if ((i == 0 || i == 6 - 1)
                || (i ==6 / 2
                    && j <=6 / 2))
                System.out.printf("*");
            else
                continue;
        }
        System.out.printf("\n");
       
    }

    for (i = 0; i < 6; i++)
    {
        System.out.printf("*");
        for (j = 0; j <= 6; j++)
        {
            if (i == 6 - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }

    for (i = 0; i < 6; i++)
    {
        if (i != 0 && i != 6 - 1)
            System.out.printf("*");
        else
            System.out.printf(" ");
        for (j = 0; j < 6; j++)
        {
            if (((i == 6 - 1)
                && j >= 0
                && j < 6 - 1))
                System.out.printf("*");
            else if (j == 6 - 1 && i != 0
                    && i != 6 - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }

    for (i = 0; i <6; i++)
    {
        for (j = 0; j <6; j++)
        {
            if ((i == 0 || i ==6 / 2
                || i ==6 - 1))
                System.out.printf("*");
            else if (i <6 / 2
                    && j == 0)
                System.out.printf("*");
            else if (i >6 / 2
                    && j ==6 - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }

    int half = 6 / 2, dummy = half;
    for (i = 0; i < 6; i++)
    {
        System.out.printf("*");
        for (j = 0; j <= half; j++)
        {
            if (j == abs(dummy))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
        dummy--;
    }

    int  space = (6 / 3);
    int width = 6 / 2 + 6 / 5 + space + space;
    for (i = 0; i < 6; i++)
    {
        for (j = 0; j <= width; j++)
        {
            if (j == width - abs(space)
                || j == abs(space))
                System.out.printf("*");
            else if ((i == 0
                    || i == 6 - 1)
                    && j > abs(space)
                    && j < width - abs(space))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (space != 0
            && i < 6 / 2)
        {
            space--;
        }
        else if (i >= (6 / 2 + 6 / 5))
            space--;
        System.out.printf("\n");
    }
    System.out.printf("\n");
    System.out.printf("\n");
    System.out.printf("\n");
    System.out.printf("\n");

    for (i = 0; i < 6; i++)
    {
        for (j = 0; j < 6; j++)
        {
            if (i == 0 || i == 6 - 1)
                System.out.printf("*");
            else if (j == 6 / 2)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }


    int  counter = 0;
    for (i = 0; i < 6; i++)
    {
        System.out.printf("*");
        for (j = 0; j <= 6; j++)
        {
            if (j == 6)
                System.out.printf("*");
            else if (j == counter)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        counter++;
        System.out.printf("\n");
    }

    for (i = 0; i < 6; i++)
    {
        System.out.printf("*");
        for (j = 0; j < 6; j++)
        {
            if ((i == 0 || i == 6 - 1)
                || (i == 6 / 2
                    && j <= 6 / 2))
                System.out.printf("*");
            else
                continue;
        }
        System.out.printf("\n");


        for (i = 0; i < 6; i++)
    {
        if (i != 0 && i != 6 - 1)
            System.out.printf("*");
        else
            System.out.printf(" ");
        for (j = 0; j < 6; j++)
        {
            if (((i == 6 - 1)
                && j >= 0
                && j < 6 - 1))
                System.out.printf("*");
            else if (j == 6 - 1 && i != 0
                    && i != 6 - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }
    }

    
    for (i = 0; i < 6; i++)
    {
        System.out.printf("*");
        for (j = 0; j < width; j++)
        {
            if ((i == 0 || i == half)
                && j < (width - 2))
                System.out.printf("*");
            else if (j == (width - 2)
                    && !(i == 0 || i == half))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }

    for (i = 0; i < 6; i++)
    {
        for (j = 0; j <= width; j++)
        {
            if (j == width - abs(space)
                || j == abs(space))
                System.out.printf("*");
            else if ((i == 0
                    || i == 6 - 1)
                    && j > abs(space)
                    && j < width - abs(space))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (space != 0
            && i < 6 / 2)
        {
            space--;
        }
        else if (i >= (6 / 2 + 6/ 5))
            space--;
        System.out.printf("\n");
    }

    for (i = 0; i < 6; i++)
    {
        System.out.printf("*");
        for (j = 0; j <= 6; j++)
        {
            if (j == 6)
                System.out.printf("*");
            else if (j == counter)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        counter++;
        System.out.printf("\n");
    }
}
}

    

        
    


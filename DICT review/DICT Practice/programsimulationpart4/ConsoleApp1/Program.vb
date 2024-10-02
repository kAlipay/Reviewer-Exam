Imports System

Module Program
    Sub Main(args As String())
        Dim a As Integer
        Dim b As Integer

        a = 1
        b = 1

        While a < 5
            While b < 3
                Console.Write("[" & a & "," & b & "]")
                b += 1
            End While
            b = 1
            a += 1
            Console.WriteLine()

        End While
        Console.ReadKey()

    End Sub
End Module

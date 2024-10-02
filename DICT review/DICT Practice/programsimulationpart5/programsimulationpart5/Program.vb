Imports System

Module Program
    Sub Main(args As String())
        For row = 1 To 4
            For column = 1 To 6
                If column = 1 Or column = 6 Then
                    Console.Write("^")
                Else
                    Console.Write("*_")
                End If
            Next
            Console.WriteLine()
        Next
    End Sub
End Module

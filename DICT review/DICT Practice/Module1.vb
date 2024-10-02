Module Module1

    Sub Main()
        'dim name as string = "pinoyeinstein"

        'if name <> "pinayeinstein" then
        '    console.write("true")
        'else
        '    console.write("false")
        'end if
        'console.readkey()

        'Dim num As Integer = 10

        'If num < 30 Then
        '    Console.Write("True")
        'Else
        '    Console.Write("False")
        'End If
        'Console.ReadKey()

        'Dim num As Integer
        'Console.Write("Type a number:")
        'num = Console.ReadLine()

        'If num >= 101 Then
        '    Console.Write("Wrong number")
        'ElseIf num >= 95 Then
        '    Console.Write("Impressive")
        'ElseIf num >= 90 Then
        '    Console.Write("Very Good")
        'ElseIf num >= 85 Then
        '    Console.Write("Good")
        'ElseIf num >= 80 Then
        '    Console.Write("Fair")

        'Else
        '    Console.Write("Failed")
        'End If
        'Console.ReadKey()
        'Dim num As Integer = 10

        'If num <> 5 Or num = 10 Then
        '    Console.Write("True")
        'Else
        '    Console.Write("False")
        'End If
        'Console.ReadKey()

        'Dim num As Integer = 9

        'If Not (num <> 9) Then
        '    Console.Write("True")
        'Else
        '    Console.Write("False")
        'End If
        'Console.ReadKey()


        'Dim num As Integer = 9

        'If num <> 9 Xor num > 8 Then
        '    Console.Write("True")
        'Else
        '    Console.Write("False")
        'End If
        'Console.ReadKey()


        For row = 1 To 5
            For column = 1 To 5
                If column = 1 Or column = 5 Then
                    Console.Write("^")
                Else
                    Console.Write("*_")
                End If
            Next
            Console.WriteLine()
        Next
    End Sub

End Module
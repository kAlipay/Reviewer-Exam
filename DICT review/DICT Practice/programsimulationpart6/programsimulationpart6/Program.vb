Imports System

Module Program
    Sub Main(args As String())
        Dim range As Integer = 6
        Dim TempRange As Integer = range

        For row = 1 To range
            For column = 1 To range
                If column <> TempRange Then
                    Console.Write(" ")
                ElseIf column Mod 2 = 0 Then
                    For c = 1 To row
                        Console.Write("% ")

                    Next
                Else
                    For d = 1 To row
                        Console.Write("* ")
                    Next
                End If
            Next
            Console.WriteLine()
            TempRange -= 1
        Next

    End Sub
End Module

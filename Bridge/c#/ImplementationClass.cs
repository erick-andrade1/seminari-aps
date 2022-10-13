public class EmailSender : IMessageSender
{
    public void SendMessage(string subject, string body)
    {
        Console.WriteLine($"Email\n{subject}\n{body}\n");
    }
}

public class MSMQSender : IMessageSender
{
    public void SendMessage(string subject, string body)
    {
        Console.WriteLine($"MSMQ\n{subject}\n{body}\n");
    }
}

public class WebServiceSender : IMessageSender
{
    public void SendMessage(string subject, string body)
    {
        Console.WriteLine($"Web Service\n{subject}\n{body}\n");
    }
}
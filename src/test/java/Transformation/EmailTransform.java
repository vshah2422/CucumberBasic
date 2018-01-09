package Transformation;

public class EmailTransform extends cucumber.api.Transformer<String>

{
    @Override
    public String transform (String userName)
    {
        return userName.concat("@ea.com");
    }
}

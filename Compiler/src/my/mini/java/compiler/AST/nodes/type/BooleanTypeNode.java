package my.mini.java.compiler.AST.nodes.type;

import my.mini.java.compiler.AST.nodes.literals.IdLiteralNode;
import org.antlr.v4.runtime.Token;

/**
 * Created by alex on 11/28/2016.
 */
public class BooleanTypeNode extends TypeNode
{
    public BooleanTypeNode(Token type)
    {
        this.type = new IdLiteralNode(type);
        loc = type;
    }

    public BooleanTypeNode(TypeNode type)
    {
        if (type.type != null)
        {
            this.type = type.type;
            this.loc = type.type.value;
        }
        else
        {
            this.loc = type.loc;
        }
    }
}

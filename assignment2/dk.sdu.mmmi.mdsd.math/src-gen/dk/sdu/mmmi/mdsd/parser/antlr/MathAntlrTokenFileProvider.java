/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MathAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("dk/sdu/mmmi/mdsd/parser/antlr/internal/InternalMath.tokens");
	}
}

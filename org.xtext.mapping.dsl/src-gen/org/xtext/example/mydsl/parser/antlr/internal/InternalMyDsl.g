/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;
 	
    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ListeQuestions";	
   	}
   	
   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleListeQuestions
entryRuleListeQuestions returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListeQuestionsRule()); }
	 iv_ruleListeQuestions=ruleListeQuestions 
	 { $current=$iv_ruleListeQuestions.current; } 
	 EOF 
;

// Rule ListeQuestions
ruleListeQuestions returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getListeQuestionsAccess().getQuestionsQuestionParserRuleCall_0()); 
	    }
		lv_questions_0_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListeQuestionsRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_0_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_id_0_0=RULE_ID
		{
			newLeafNode(lv_id_0_0, grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='!' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3());
    }
)
;





// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Radio' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getRadioKeyword_0()); 
    }

    |
	kw='Text' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1()); 
    }

    |
	kw='TextArea' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getTextAreaKeyword_2()); 
    }

    |
	kw='DropDown' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getDropDownKeyword_3()); 
    }

    |
	kw='CheckBox' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getCheckBoxKeyword_4()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



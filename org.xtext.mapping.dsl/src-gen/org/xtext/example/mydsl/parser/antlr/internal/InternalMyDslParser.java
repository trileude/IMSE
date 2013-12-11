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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'!'", "'Radio'", "'Text'", "'TextArea'", "'DropDown'", "'CheckBox'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



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



    // $ANTLR start "entryRuleListeQuestions"
    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleListeQuestions returns [EObject current=null] : iv_ruleListeQuestions= ruleListeQuestions EOF ;
    public final EObject entryRuleListeQuestions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListeQuestions = null;


        try {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleListeQuestions= ruleListeQuestions EOF )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleListeQuestions= ruleListeQuestions EOF
            {
             newCompositeNode(grammarAccess.getListeQuestionsRule()); 
            pushFollow(FOLLOW_ruleListeQuestions_in_entryRuleListeQuestions75);
            iv_ruleListeQuestions=ruleListeQuestions();

            state._fsp--;

             current =iv_ruleListeQuestions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListeQuestions85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListeQuestions"


    // $ANTLR start "ruleListeQuestions"
    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleListeQuestions returns [EObject current=null] : ( (lv_questions_0_0= ruleQuestion ) )* ;
    public final EObject ruleListeQuestions() throws RecognitionException {
        EObject current = null;

        EObject lv_questions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_questions_0_0= ruleQuestion ) )* )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_questions_0_0= ruleQuestion ) )*
            {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_questions_0_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_questions_0_0= ruleQuestion )
            	    {
            	    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_questions_0_0= ruleQuestion )
            	    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_questions_0_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListeQuestionsAccess().getQuestionsQuestionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleListeQuestions130);
            	    lv_questions_0_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListeQuestionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_0_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListeQuestions"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion166);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ruleQuestion returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= '!' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= '!' ) )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= '!' )
            {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= '!' )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= '!'
            {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_id_0_0= RULE_ID )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion218); 

            			newLeafNode(lv_id_0_0, grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleQuestion235); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getColonKeyword_1());
                
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:141:1: ( (lv_type_2_0= ruleType ) )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: (lv_type_2_0= ruleType )
            {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: (lv_type_2_0= ruleType )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleQuestion256);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleQuestion268); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType305);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Radio' | kw= 'Text' | kw= 'TextArea' | kw= 'DropDown' | kw= 'CheckBox' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:28: ( (kw= 'Radio' | kw= 'Text' | kw= 'TextArea' | kw= 'DropDown' | kw= 'CheckBox' ) )
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:184:1: (kw= 'Radio' | kw= 'Text' | kw= 'TextArea' | kw= 'DropDown' | kw= 'CheckBox' )
            {
            // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:184:1: (kw= 'Radio' | kw= 'Text' | kw= 'TextArea' | kw= 'DropDown' | kw= 'CheckBox' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:185:2: kw= 'Radio'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleType354); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getRadioKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:2: kw= 'Text'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleType373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:2: kw= 'TextArea'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleType392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getTextAreaKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:206:2: kw= 'DropDown'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleType411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getDropDownKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mapping.dsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:2: kw= 'CheckBox'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleType430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getCheckBoxKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleListeQuestions_in_entryRuleListeQuestions75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListeQuestions85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleListeQuestions130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion218 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleQuestion235 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQuestion256 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleType354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleType373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleType411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType430 = new BitSet(new long[]{0x0000000000000002L});

}
package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Radio'", "'Text'", "'TextArea'", "'DropDown'", "'CheckBox'", "':'", "'!'"
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
    public String getGrammarFileName() { return "../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleListeQuestions"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleListeQuestions : ruleListeQuestions EOF ;
    public final void entryRuleListeQuestions() throws RecognitionException {
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleListeQuestions EOF )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleListeQuestions EOF
            {
             before(grammarAccess.getListeQuestionsRule()); 
            pushFollow(FOLLOW_ruleListeQuestions_in_entryRuleListeQuestions61);
            ruleListeQuestions();

            state._fsp--;

             after(grammarAccess.getListeQuestionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListeQuestions68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListeQuestions"


    // $ANTLR start "ruleListeQuestions"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleListeQuestions : ( ( rule__ListeQuestions__QuestionsAssignment )* ) ;
    public final void ruleListeQuestions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__ListeQuestions__QuestionsAssignment )* ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__ListeQuestions__QuestionsAssignment )* )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__ListeQuestions__QuestionsAssignment )* )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__ListeQuestions__QuestionsAssignment )*
            {
             before(grammarAccess.getListeQuestionsAccess().getQuestionsAssignment()); 
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__ListeQuestions__QuestionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__ListeQuestions__QuestionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__ListeQuestions__QuestionsAssignment_in_ruleListeQuestions94);
            	    rule__ListeQuestions__QuestionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getListeQuestionsAccess().getQuestionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListeQuestions"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleQuestion EOF )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion122);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Question__Group__0 ) )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Question__Group__0 ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Question__Group__0 )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion155);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleType EOF )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType182);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Type__Alternatives )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType215);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: rule__Type__Alternatives : ( ( 'Radio' ) | ( 'Text' ) | ( 'TextArea' ) | ( 'DropDown' ) | ( 'CheckBox' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ( ( 'Radio' ) | ( 'Text' ) | ( 'TextArea' ) | ( 'DropDown' ) | ( 'CheckBox' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
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
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:1: ( 'Radio' )
                    {
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:1: ( 'Radio' )
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:150:1: 'Radio'
                    {
                     before(grammarAccess.getTypeAccess().getRadioKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives252); 
                     after(grammarAccess.getTypeAccess().getRadioKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:6: ( 'Text' )
                    {
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:6: ( 'Text' )
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: 'Text'
                    {
                     before(grammarAccess.getTypeAccess().getTextKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives272); 
                     after(grammarAccess.getTypeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:165:6: ( 'TextArea' )
                    {
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:165:6: ( 'TextArea' )
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:166:1: 'TextArea'
                    {
                     before(grammarAccess.getTypeAccess().getTextAreaKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives292); 
                     after(grammarAccess.getTypeAccess().getTextAreaKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:6: ( 'DropDown' )
                    {
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:6: ( 'DropDown' )
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: 'DropDown'
                    {
                     before(grammarAccess.getTypeAccess().getDropDownKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives312); 
                     after(grammarAccess.getTypeAccess().getDropDownKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:6: ( 'CheckBox' )
                    {
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:6: ( 'CheckBox' )
                    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:1: 'CheckBox'
                    {
                     before(grammarAccess.getTypeAccess().getCheckBoxKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives332); 
                     after(grammarAccess.getTypeAccess().getCheckBoxKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Question__Group__0"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0364);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0367);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: rule__Question__Group__0__Impl : ( ( rule__Question__IdAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:1: ( ( ( rule__Question__IdAssignment_0 ) ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:1: ( ( rule__Question__IdAssignment_0 ) )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:1: ( ( rule__Question__IdAssignment_0 ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( rule__Question__IdAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_0()); 
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Question__IdAssignment_0 )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:2: rule__Question__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Question__IdAssignment_0_in_rule__Question__Group__0__Impl394);
            rule__Question__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1424);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1427);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: rule__Question__Group__1__Impl : ( ':' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ( ( ':' ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ':' )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ':' )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ':'
            {
             before(grammarAccess.getQuestionAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Question__Group__1__Impl455); 
             after(grammarAccess.getQuestionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:261:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2486);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2489);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: rule__Question__Group__2__Impl : ( ( rule__Question__TypeAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( ( ( rule__Question__TypeAssignment_2 ) ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Question__TypeAssignment_2 ) )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Question__TypeAssignment_2 ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( rule__Question__TypeAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getTypeAssignment_2()); 
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__Question__TypeAssignment_2 )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:2: rule__Question__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Question__TypeAssignment_2_in_rule__Question__Group__2__Impl516);
            rule__Question__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: rule__Question__Group__3 : rule__Question__Group__3__Impl ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( rule__Question__Group__3__Impl )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:2: rule__Question__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3546);
            rule__Question__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: rule__Question__Group__3__Impl : ( '!' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( ( '!' ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( '!' )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( '!' )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: '!'
            {
             before(grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__3__Impl574); 
             after(grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__ListeQuestions__QuestionsAssignment"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: rule__ListeQuestions__QuestionsAssignment : ( ruleQuestion ) ;
    public final void rule__ListeQuestions__QuestionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ( ruleQuestion ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ruleQuestion )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ruleQuestion )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ruleQuestion
            {
             before(grammarAccess.getListeQuestionsAccess().getQuestionsQuestionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__ListeQuestions__QuestionsAssignment618);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getListeQuestionsAccess().getQuestionsQuestionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListeQuestions__QuestionsAssignment"


    // $ANTLR start "rule__Question__IdAssignment_0"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:339:1: rule__Question__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Question__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( ( RULE_ID ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( RULE_ID )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( RULE_ID )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__IdAssignment_0649); 
             after(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__IdAssignment_0"


    // $ANTLR start "rule__Question__TypeAssignment_2"
    // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: rule__Question__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Question__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( ( ruleType ) )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( ruleType )
            {
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( ruleType )
            // ../org.xtext.mapping.dsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: ruleType
            {
             before(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Question__TypeAssignment_2680);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleListeQuestions_in_entryRuleListeQuestions61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListeQuestions68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListeQuestions__QuestionsAssignment_in_ruleListeQuestions94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0364 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_0_in_rule__Question__Group__0__Impl394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1424 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Question__Group__1__Impl455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2486 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__TypeAssignment_2_in_rule__Question__Group__2__Impl516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__3__Impl574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__ListeQuestions__QuestionsAssignment618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__IdAssignment_0649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Question__TypeAssignment_2680 = new BitSet(new long[]{0x0000000000000002L});

}
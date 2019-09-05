package trivia;

public class GithubTriviaQuestions 
{
	public static String question1(char questionOrAnswer) 
	{
		String question1 	= "Check if you have Git on your computer by typing this into Bash. (Two words)";
		String answer1 		= "git --version";
		
		switch (questionOrAnswer) 
		{
		case 'q':	return question1;
		case 'a':	return answer1;
		default:	return "";
		}
	}
	
	public static String question2(char questionOrAnswer) 
	{
		String question2 	= "Set your name by typing this into Bash: ___ ______ ________ ____.____ \"Your Name\"";
		String answer2 		= "git config --global user.username";
		
		switch (questionOrAnswer) 
		{
		case 'q':	return question2;
		case 'a':	return answer2;
		default:	return "";
		}
	}

	public static String question3(char questionOrAnswer) 
	{
		String question3 	= "What command do you type to make Git initialize (start tracking) the folder you are in?";
		String answer3 		= "git init";
		
		switch (questionOrAnswer) 
		{
		case 'q':	return question3;
		case 'a':	return answer3;
		default:	return "";
		}
	}
	
	public static String mansBestFriend() {
		return "                                         do.\\r\\n\" + \r\n" + 
				"			\"                                        :NOX\\r\\n\" + \r\n" + 
				"			\"                                       ,NOM@:\\r\\n\" + \r\n" + 
				"			\"                                       :NNNN:\\r\\n\" + \r\n" + 
				"			\"                                       :XXXON\\r\\n\" + \r\n" + 
				"			\"                                       :XoXXX.\\r\\n\" + \r\n" + 
				"			\"                                       MM;ONO:\\r\\n\" + \r\n" + 
				"			\"  .oob..                              :MMO;MOM\\r\\n\" + \r\n" + 
				"			\" dXOXYYNNb.                          ,NNMX:MXN\\r\\n\" + \r\n" + 
				"			\" Mo\\\"'  '':Nbb                        dNMMN MNN:\\r\\n\" + \r\n" + 
				"			\" Mo  'O;; ':Mb.                     ,MXMNM MNX:\\r\\n\" + \r\n" + 
				"			\" @O :;XXMN..'X@b.                  ,NXOMXM MNX:\\r\\n\" + \r\n" + 
				"			\" YX;;NMMMM@M;;OM@o.                dXOOMMN:MNX:\\r\\n\" + \r\n" + 
				"			\" 'MOONM@@@MMN:':NONb.            ,dXONM@@MbMXX:\\r\\n\" + \r\n" + 
				"			\"  MOON@M@@MMMM;;:OOONb          ,MX'\\\"':ONMMMMX:\\r\\n\" + \r\n" + 
				"			\"  :NOOM@@MNNN@@X;\\\"\\\"XNN@Mb     .dP\\\"'   ,..OXM@N:\\r\\n\" + \r\n" + 
				"			\"   MOON@@MMNXXMMO  :M@@M...@o.oN\\\"\\\"\\\":OOOXNNXXOo:\\r\\n\" + \r\n" + 
				"			\"   :NOX@@@MNXXXMNo :MMMM@K\\\"`,:;NNM@@NXM@MNO;.'N.\\r\\n\" + \r\n" + 
				"			\"    NO:X@@MNXXX@@O:'X@@@@MOOOXMM@M@NXXN@M@NOO ''b\\r\\n\" + \r\n" + 
				"			\"    `MO.'NMNXXN@@N: 'XXM@NMMXXMM@M@XO\\\"'\\\"XM@X;.  :b\\r\\n\" + \r\n" + 
				"			\"     YNO;'\\\"NXXXX@M;;::\\\"XMNN:\\\"\\\"ON@@MO: ,;;.:Y@X: :OX.\\r\\n\" + \r\n" + 
				"			\"      Y@Mb;;XNMM@@@NO: ':O: 'OXN@@MO\\\" ONMMX:`XO; :X@.\\r\\n\" + \r\n" + 
				"			\"      '@XMX':OX@@MN:    ;O;  :OX@MO\\\" 'OMM@N; ':OO;N@N\\r\\n\" + \r\n" + 
				"			\"       YN;\\\":.:OXMX\\\"': ,:NNO;';XMMX:  ,;@@MNN.'.:O;:@X:\\r\\n\" + \r\n" + 
				"			\"       `@N;;XOOOXO;;:O;:@MOO;:O:\\\"\\\" ,oMP@@K\\\"YM.;NMO;`NM\\r\\n\" + \r\n" + 
				"			\"        `@@MN@MOX@@MNMN;@@MNXXOO: ,d@NbMMP'd@@OX@NO;.'bb.\\r\\n\" + \r\n" + 
				"			\"       .odMX@@XOOM@M@@XO@MMMMMMNNbN\\\"YNNNXoNMNMO\\\"OXXNO..\\\"\\\";o.\\r\\n\" + \r\n" + 
				"			\"     .ddMNOO@@XOOM@@XOONMMM@@MNXXMMo;.\\\"' .\\\":OXO ':.'\\\"'\\\"'  '\\\"\\\"o.\\r\\n\" + \r\n" + 
				"			\"    'N@@X;,M@MXOOM@OOON@MM@MXOO:\\\":ONMNXXOXX:OOO               \\\"\\\"ob.\\r\\n\" + \r\n" + 
				"			\"   ')@MP\\\"';@@XXOOMMOOM@MNNMOO\\\"\\\"   '\\\"OXM@MM: :OO.        :...';o;.;Xb.\\r\\n\" + \r\n" + 
				"			\"  .@@MX\\\" ;X@@XXOOM@OOXXOO:o:'      :OXMNO\\\"' ;OOO;.:     ,OXMOOXXXOOXMb\\r\\n\" + \r\n" + 
				"			\" ,dMOo:  oO@@MNOON@N:::\\\"      .    ,;O:\\\"\\\"'  .dMXXO:    ,;OX@XO\\\"\\\":ON@M@\\r\\n\" + \r\n" + 
				"			\":Y@MX:.  oO@M@NOXN@NO. ..: ,;;O;.       :.OX@@MOO;..   .OOMNMO.;XN@M@P\\r\\n\" + \r\n" + 
				"			\",MP\\\"OO'  oO@M@O:ON@MO;;XO;:OXMNOO;.  ,.;.;OXXN@MNXO;.. oOX@NMMN@@@@@M:\\r\\n\" + \r\n" + 
				"			\"`' \\\"O:;;OON@@MN::XNMOOMXOOOM@@MMNXO:;XXNNMNXXXN@MNXOOOOOXNM@NM@@@M@MP\\r\\n\" + \r\n" + 
				"			\"   :XN@MMM@M@M:  :'OON@@XXNM@M@MXOOdN@@@MM@@@@MMNNXOOOXXNNN@@M@MMMM\\\"'\\r\\n\" + \r\n" + 
				"			\"   .oNM@MM@ONO'   :;ON@@MM@MMNNXXXM@@@@M@PY@@MMNNNNNNNNNNNM@M@M@@P'\\r\\n\" + \r\n" + 
				"			\"  ;O:OXM@MNOOO.   'OXOONM@MNNMMXON@MM@@b. 'Y@@@@@@@@@@@@@M@@MP\\\"'\\\"\\r\\n\" + \r\n" + 
				"			\" ;O':OOXNXOOXX:   :;NMO:\\\":NMMMXOOX@MN@@@@b.:M@@@M@@@MMM@\\\"\\\"\\\"\\\"\\r\\n\" + \r\n" + 
				"			\" :: ;\\\"OOOOOO@N;:  'ON@MO.'\\\":\\\"\\\"OOOO@@NNMN@@@. Y@@@MMM@@@@b\\r\\n\" + \r\n" + 
				"			\" :;   ':O:oX@@O;;  ;O@@XO'   \\\"oOOOOXMMNMNNN@MN\\\"\\\"YMNMMM@@MMo.\\r\\n\" + \r\n" + 
				"			\" :N:.   ''oOM@NMo.::OX@NOOo.  ;OOOXXNNNMMMNXNM@bd@MNNMMM@MM@bb\\r\\n\" + \r\n" + 
				"			\"  @;O .  ,OOO@@@MX;;ON@NOOO.. ' ':OXN@NNN@@@@@M@@@@MNXNMM@MMM@,\\r\\n\" + \r\n" + 
				"			\"  M@O;;  :O:OX@@M@NXXOM@NOO:;;:,;;ON@NNNMM'`\\\"@@M@@@@@MXNMMMMM@N\\r\\n\" + \r\n" + 
				"			\"  N@NOO;:oO;O:NMMM@M@OO@NOO;O;oOOXN@NNM@@'   `Y@NM@@@@MMNNMM@MM\\r\\n\" + \r\n" + 
				"			\"  ::@MOO;oO:::OXNM@@MXOM@OOOOOOXNMMNNNMNP      \\\"\\\"MNNM@@@MMMM@MP\\r\\n\" + \r\n" + 
				"			\"    @@@XOOO':::OOXXMNOO@@OOOOXNN@NNNNNNNN        '`YMM@@@MMM@P'\\r\\n\" + \r\n" + 
				"			\"    MM@@M:'''' O:\\\":ONOO@MNOOOOXM@NM@NNN@P  -hrr-     \\\"`\\\"\\\"\\\"MM'\\r\\n\" + \r\n" + 
				"			\"    ''MM@:     \\\"' 'OOONMOYOOOOO@MM@MNNM\\\"\\r\\n\" + \r\n" + 
				"			\"      YM@'         :OOMN: :OOOO@MMNOXM'\\r\\n\" + \r\n" + 
				"			\"      `:P           :oP''  \\\"'OOM@NXNM'\\r\\n\" + \r\n" + 
				"			\"       `'                    ':OXNP'\\r\\n\" + \r\n" + 
				"			\"                               '\\\"'\"";
	}
}
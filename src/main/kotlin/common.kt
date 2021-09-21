enum class KeyNameCode(event:Int,name:String){
    KEY_ESC(1,"ESC"),
    KEY_1(2,"1"),
    KEY_2(3,"2"),
    KEY_3(4,"3"),
    KEY_4(5,"4"),
    KEY_5(6,"5"),
    KEY_6(7,"6"),
    KEY_7(8,"7"),
    KEY_8(9,"8"),
    KEY_9(10,"9"),
    KEY_0(11,"0"),
    KEY_MINUS(12,"MINUS"),
    KEY_EQUAL(13,"EQUAL"),
    KEY_BACKSPACE(14,"BACKSPACE"),
    KEY_TAB(15,"TAB"),
    KEY_Q(16,"Q"),
    KEY_W(17,"W"),
    KEY_E(18,"E"),
    KEY_R(19,"R"),
    KEY_T(20,"T"),
    KEY_Y(21,"Y"),
    KEY_U(22,"U"),
    KEY_I(23,"I"),
    KEY_O(24,"O"),
    KEY_P(25,"P"),
    KEY_LEFTBRACE(26,"LEFTBRACE"),
    KEY_RIGHTBRACE(27,"RIGHTBRACE"),
    KEY_ENTER(28,"ENTER"),
    KEY_LEFTCTRL(29,"LEFTCTRL"),
    KEY_A(30,"A"),
    KEY_S(31,"S"),
    KEY_D(32,"D"),
    KEY_F(33,"F"),
    KEY_G(34,"G"),
    KEY_H(35,"H"),
    KEY_J(36,"J"),
    KEY_K(37,"K"),
    KEY_L(38,"L"),
    KEY_SEMICOLON(39,"SEMICOLON"),
    KEY_APOSTROPHE(40,"APOSTROPHE"),
    KEY_GRAVE(41,"GRAVE"),
    KEY_LEFTSHIFT(42,"LEFTSHIFT"),
    KEY_BACKSLASH(43,"BACKSLASH"),
    KEY_Z(44,"Z"),
    KEY_X(45,"X"),
    KEY_C(46,"C"),
    KEY_V(47,"V"),
    KEY_B(48,"B"),
    KEY_N(49,"N"),
    KEY_M(50,"M"),
    KEY_COMMA(51,"COMMA"),
    KEY_DOT(52,"DOT"),
    KEY_SLASH(53,"SLASH"),
    KEY_RIGHTSHIFT(54,"RIGHTSHIFT"),
    KEY_KPASTERISK(55,"KPASTERISK"),
    KEY_LEFTALT(56,"LEFTALT"),
    KEY_SPACE(57,"SPACE"),
    KEY_CAPSLOCK(58,"CAPSLOCK"),
    KEY_F1(59,"F1"),
    KEY_F2(60,"F2"),
    KEY_F3(61,"F3"),
    KEY_F4(62,"F4"),
    KEY_F5(63,"F5"),
    KEY_F6(64,"F6"),
    KEY_F7(65,"F7"),
    KEY_F8(66,"F8"),
    KEY_F9(67,"F9"),
    KEY_F10(68,"F10"),
    KEY_NUMLOCK(69,"NUMLOCK"),
    KEY_SCROLLLOCK(70,"SCROLLLOCK"),
    KEY_KP7(71,"KP7"),
    KEY_KP8(72,"KP8"),
    KEY_KP9(73,"KP9"),
    KEY_KPMINUS(74,"KPMINUS"),
    KEY_KP4(75,"KP4"),
    KEY_KP5(76,"KP5"),
    KEY_KP6(77,"KP6"),
    KEY_KPPLUS(78,"KPPLUS"),
    KEY_KP1(79,"KP1"),
    KEY_KP2(80,"KP2"),
    KEY_KP3(81,"KP3"),
    KEY_KP0(82,"KP0"),
    KEY_KPDOT(83,"KPDOT"),
    KEY_ZENKAKUHANKAKU(85,"ZENKAKUHANKAKU"),
    KEY_102ND(86,"102ND"),
    KEY_F11(87,"F11"),
    KEY_F12(88,"F12"),
    KEY_RO(89,"RO"),
    KEY_KATAKANA(90,"KATAKANA"),
    KEY_HIRAGANA(91,"HIRAGANA"),
    KEY_HENKAN(92,"HENKAN"),
    KEY_KATAKANAHIRAGANA(93,"KATAKANAHIRAGANA"),
    KEY_MUHENKAN(94,"MUHENKAN"),
    KEY_KPJPCOMMA(95,"KPJPCOMMA"),
    KEY_KPENTER(96,"KPENTER"),
    KEY_RIGHTCTRL(97,"RIGHTCTRL"),
    KEY_KPSLASH(98,"KPSLASH"),
    KEY_SYSRQ(99,"SYSRQ"),
    KEY_RIGHTALT(100,"RIGHTALT"),
    KEY_LINEFEED(101,"LINEFEED"),
    KEY_HOME(102,"HOME"),
    KEY_UP(103,"UP"),
    KEY_PAGEUP(104,"PAGEUP"),
    KEY_LEFT(105,"LEFT"),
    KEY_RIGHT(106,"RIGHT"),
    KEY_END(107,"END"),
    KEY_DOWN(108,"DOWN"),
    KEY_PAGEDOWN(109,"PAGEDOWN"),
    KEY_INSERT(110,"INSERT"),
    KEY_DELETE(111,"DELETE"),
    KEY_MUTE(113,"MUTE"),
    KEY_VOLUMEDOWN(114,"VOLUMEDOWN"),
    KEY_VOLUMEUP(115,"VOLUMEUP"),
    KEY_POWER(116,"POWER"),
    KEY_PAUSE(119,"PAUSE"),
    KEY_YEN(124,"YEN"),
    KEY_LEFTMETA(125,"LEFTMETA"),
    KEY_RIGHTMETA(126,"RIGHTMETA"),
    KEY_COMPOSE(127,"COMPOSE"),
    KEY_STOP(128,"STOP"),
    KEY_PROPS(130,"PROPS"),
    KEY_UNDO(131,"UNDO"),
    KEY_FRONT(132,"FRONT"),
    KEY_COPY(133,"COPY"),
    KEY_OPEN(134,"OPEN"),
    KEY_PASTE(135,"PASTE"),
    KEY_FIND(136,"FIND"),
    KEY_CUT(137,"CUT"),
    KEY_HELP(138,"HELP"),
    KEY_MENU(139,"MENU"),
    KEY_CALC(140,"CALC"),
    KEY_SETUP(141,"SETUP"),
    KEY_SLEEP(142,"SLEEP"),
    KEY_WAKEUP(143,"WAKEUP"),
    KEY_XFER(147,"XFER"),
    KEY_SCREENLOCK(152,"SCREENLOCK"),
    KEY_SCROLLUP(177,"SCROLLUP"),
    KEY_SCROLLDOWN(178,"SCROLLDOWN"),
    KEY_KPLEFTPAREN(179,"KPLEFTPAREN"),
    KEY_KPRIGHTPAREN(180,"KPRIGHTPAREN"),
    KEY_F13(183,"F13"),
    KEY_F14(184,"F14"),
    KEY_F15(185,"F15"),
    KEY_F16(186,"F16"),
    KEY_F17(187,"F17"),
    KEY_F18(188,"F18"),
    KEY_F19(189,"F19"),
    KEY_F20(190,"F20"),
    KEY_F21(191,"F21"),
    KEY_F22(192,"F22"),
    KEY_F23(193,"F23"),
    KEY_F24(194,"F24")
}
const val MOJI_UNDEF :Int = 0
const val MOJI_A :Int = 1
const val MOJI_I :Int = 2
const val MOJI_U :Int = 3
const val MOJI_E :Int = 4
const val MOJI_O :Int = 5
const val MOJI_KA :Int = 6
const val MOJI_KI :Int = 7
const val MOJI_KU :Int = 8
const val MOJI_KE :Int = 9
const val MOJI_KO :Int = 10
const val MOJI_SA :Int = 11
const val MOJI_SI :Int = 12
const val MOJI_SU :Int = 13
const val MOJI_SE :Int = 14
const val MOJI_SO :Int = 15
const val MOJI_TA :Int = 16
const val MOJI_TI :Int = 17
const val MOJI_TU :Int = 18
const val MOJI_TE :Int = 19
const val MOJI_TO :Int = 20
const val MOJI_NA :Int = 21
const val MOJI_NI :Int = 22
const val MOJI_NU :Int = 23
const val MOJI_NE :Int = 24
const val MOJI_NO :Int = 25
const val MOJI_HA :Int = 26
const val MOJI_HI :Int = 27
const val MOJI_HU :Int = 28
const val MOJI_HE :Int = 29
const val MOJI_HO :Int = 30
const val MOJI_MA :Int = 31
const val MOJI_MI :Int = 32
const val MOJI_MU :Int = 33
const val MOJI_ME :Int = 34
const val MOJI_MO :Int = 35
const val MOJI_YA :Int = 36
const val MOJI_YI :Int = 37
const val MOJI_YU :Int = 38
const val MOJI_YE :Int = 39
const val MOJI_YO :Int = 40
const val MOJI_RA :Int = 41
const val MOJI_RI :Int = 42
const val MOJI_RU :Int = 43
const val MOJI_RE :Int = 44
const val MOJI_RO :Int = 45
const val MOJI_GA :Int = 46
const val MOJI_GI :Int = 47
const val MOJI_GU :Int = 48
const val MOJI_GE :Int = 49
const val MOJI_GO :Int = 50
const val MOJI_ZA :Int = 51
const val MOJI_ZI :Int = 52
const val MOJI_ZU :Int = 53
const val MOJI_ZE :Int = 54
const val MOJI_ZO :Int = 55
const val MOJI_DA :Int = 56
const val MOJI_DI :Int = 57
const val MOJI_DU :Int = 58
const val MOJI_DE :Int = 59
const val MOJI_DO :Int = 60
const val MOJI_BA :Int = 61
const val MOJI_BI :Int = 62
const val MOJI_BU :Int = 63
const val MOJI_BE :Int = 64
const val MOJI_BO :Int = 65
const val MOJI_PA :Int = 66
const val MOJI_PI :Int = 67
const val MOJI_PU :Int = 68
const val MOJI_PE :Int = 69
const val MOJI_PO :Int = 70
const val MOJI_WA :Int = 71
const val MOJI_WI :Int = 72
const val MOJI_WU :Int = 73
const val MOJI_WE :Int = 74
const val MOJI_WO :Int = 75
const val MOJI_XA :Int = 76
const val MOJI_XI :Int = 77
const val MOJI_XU :Int = 78
const val MOJI_XE :Int = 79
const val MOJI_XO :Int = 80
const val MOJI_XYA :Int = 81
const val MOJI_XYI :Int = 82
const val MOJI_XYU :Int = 83
const val MOJI_XYE :Int = 84
const val MOJI_XYO :Int = 85
const val MOJI_XTU :Int = 86
const val MOJI_NN :Int = 87
const val MOJI_VU :Int = 88
const val MOJI_DEL :Int = 89
const val MOJI_BS :Int = 90
const val MOJI_QUESTION :Int = 91
const val MOJI_SLASH :Int = 92
const val MOJI_TILDE :Int = 93
const val MOJI_LKAGI :Int = 94
const val MOJI_RKAGI :Int = 95
const val MOJI_LBRACKET :Int = 96
const val MOJI_RBRACKET :Int = 97
const val MOJI_LPAREN :Int = 98
const val MOJI_RPAREN :Int = 99
const val MOJI_0 :Int = 100
const val MOJI_1 :Int = 101
const val MOJI_2 :Int = 102
const val MOJI_3 :Int = 103
const val MOJI_4 :Int = 104
const val MOJI_5 :Int = 105
const val MOJI_6 :Int = 106
const val MOJI_7 :Int = 107
const val MOJI_8 :Int = 108
const val MOJI_9 :Int = 109
const val MOJI_MINUS :Int = 110
const val MOJI_PERIOD :Int = 111
const val MOJI_COMMA :Int = 112
const val MOJI_KUTEN :Int = 113
const val MOJI_KUTOUTEN :Int = 114
const val MOJI_NAKAGURO :Int = 115
const val MOJI_DAKUTEN :Int = 116
const val MOJI_HANDAKUTEN :Int = 117
const val MOJI_LKAKKO :Int = 118
const val MOJI_RKAKKO :Int = 119
const val MOJI_MAX :Int = 119 // last index

// Oyayubi State
const val STATE_FIRST :Int = 1
const val STATE_MOJIHOLD :Int = 2
const val STATE_OYAHOLD :Int = 3
const val STATE_REPEAT :Int = 4
const val STATE_MOJIOYAHOLD :Int = 5

// Oyayubi Event Type
const val ET_KEYDOWN :Int = 1
const val ET_KEYUP :Int = 2
const val ET_TIMER :Int = 3

const val LEFTOYA :Int = 1
const val RIGHTOYA :Int = 2

const val IMTYPE_NONE :Int = 0
const val IMTYPE_FCITX :Int = 1
const val IMTYPE_IBUS :Int = 2
const val IMTYPE_UIM :Int= 3
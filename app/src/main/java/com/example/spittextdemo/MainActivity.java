package com.example.spittextdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.read.widget.OnPageChangeListener;
import com.read.widget.PageView;
import com.read.widget.StringAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    public String FILE_CHAPTER = "破落的院中，站了一个骷髅般的女人，她抬起脸，就这么呆呆的望着眼前的梨花。\\n　　忽是一阵冷风吹来，而她却似是浑然未知一样，而风亦是吹起了她的衣袖，空空荡荡的，也只是余下了一截狰狞的手腕断骨。\\n　　她没有手。\\n　　外面的门吱咛的一声开了，接着一名穿着华服的女人走了过来，她唇角带笑，眸底却是冰冷，就连那张艳的红唇之上，也是擒着一抹恶质的弧度。\\n　　“清辞妹妹，我来看你了。”\\n　　娄紫茵笑道，“这些年，你可好？”她笑着，这笑也是越加的美艳了几分。\\n　　沈清辞用自己的断腕接住了一片梨花，长睫敛下的目光却隐下了一份木然。\\n　　“呵呵……”娄紫茵再是捂着嘴娇笑了起来。\\n　　“妹妹，我只是来告诉你一件事情的，你不是一直很想知道，你大姐如何了吗？”\\n　　“我们再是如何也是姐妹一场，自是要告知你一声的。”\\n　　娄紫茵再是勾起了自己的红唇，\\n　　“妹妹，你知道吗？今天你唯一的亲人已经死了，你的姐姐死了啊，你知道她是怎么死的吗，是被活活烧死的，烧成炭黑的一团，人都是扭在了一起啊，你可知道，这几年来，她可是送来了不少的银子，可惜你一文钱也没有用上，所以她就死了，也是死不瞑目，你们沈家人终于是死光了啊，可是你什么时候才去陪他们？”\\n　　她笑的自己的脸都是疼了，可是沈清辞却似乎连一点的表情都是没有，也是一点的感觉都是没有，她就只是低着头，看着自己的断腕，这是齐齐被切了手掌，当时也不知道如何的疼痛，如何的撕心。\\n　　娄紫茵伸出手，啪的一声，就往沈清辞的脸上扇了一巴掌\\n　　“沈清辞，你果然是都是冷血的，你父亲死时，你没有哭，你兄长被五马分尸时，你也没有哭，你大姐被嫁于全京城最是龌龊的男人之时，你也没有哭，现在她死了，她被折断了四肢，再是被活生生烧死的，怎么，你还是没有一滴的眼泪吗？”\\n　　沈清辞抬起脸，惨白的脸上，只有一双冷瞳就这么不声不响的盯着眼前的华服女人，却是让华服女人愣了一下，不过很快过的，再是扬起了自己迷人的红唇。\\n　　“你已经被我砍了双手，你还想要杀我吗，凭什么，凭你的断腕吗？”而她再是扬起了手，可是沈清辞却是连躲都是没有躲过，就只有那一双冷冷的双瞳，或许就像是别人的说的，她没有心，她冷血，她连一点的喜怒哀乐都是没有。\\n　　这一次，娄紫茵的手始始终都是没有放下，而是轻轻的拍着沈清辞没有任何血色的脸，你说你怎么这样倔的，只要你听话一些，把我们娄家的香典交出来，我就可以让相公放你一命，也可以让相公再是纳你为妾，你说这样还不好吗？\\n　　“妹妹，别这样不识抬举，你看你的不识抬举害死多少人啊，”华服女人再是扇了扇她的脸，只是触手间的，却几乎都是冰一样的刺骨寒冷。\\n　　一个人的体温怎的如此冷，可是眼前的沈清辞就如此，她的身体就好是没有半点的体温一样，没有血色，也是就无温度。\\n　　“妹妹，我劝你还是将香典给姐姐吧，这样姐姐还能帮着你大姐准备一幅薄棺，让她入土为安，不至于生前横死，死后还要落的一个孤魂野鬼的下场。”\\n　　“娄紫茵……”\\n　　冷的几乎都是没有一丝的悲哀，淡的几乎都是体会不到了人间的八苦。\\n　　就只是这三上字，平平的，折折的，也是无味的。\\n　　娄紫茵一愣，突然间再是笑开了，妹妹是不是愿意说了，我可是很久没有听过你叫姐姐的名子了，你不是最爱相公吗，这样就对了，她唇角轻抬，语气微讽。\\n　　你说，你早知今日又何必当初呢，如果你早说，相公也便不会砍断你手腕了，你的白竹也便不会死了。\\n　　“娄紫茵……”\\n　　再是这一声，沈清辞的冷瞳里面终是聚了一些光，可是反射出来的却又是一种空洞，\\n　　她抬起自己的断腕，放在了娄紫茵的面胶，“你说是不是没有手，便不再能杀人了？”\\n　　“你自己不就是断碗，不问问自己，为何要问别人？”\\n　　娄紫茵再是抚了抚自己的墨发，然后上前，纤白的手指也是放在了这棵长的奇形的梨树上，“这棵树到是长的不错，花开的真好，可是……”她抬起脸，脸部的表情也是尽数而去，“妹妹，你也应该知道姐姐是最讨厌梨花了，所以明日姐姐便会让人砍掉它，妹妹你说可好？\\n　　眼前落下的那一树的洁白，沈清辞再是伸出断碗，断碗上面有了一朵完美的梨花，她突然间笑了，就像如是这洁白的花朵一般，白的无色透明着。\\n　　她将自己的断碗抬起，将这朵梨花放在了自己的嘴里，不知道从何而来的香，让院外所有的人不由的都是停下了步子。\\n　　好香，是的，好香。\\n　　不知道哪一种香，似梨非梨，似梅非梅，又似雪中莲，竟是有些说不来的冷。\\n　　“娄紫茵……”这是沈清辞第三次的叫着这个名子，她要记住什么，哪怕是在变成了鬼也不会忘记。\\n　　“你真的认为没有的手就真的不能杀人吗？”她的声音幽幽的，却是无人知道，此时，她抬起另一条胳膊，这条胳膊也是没有手腕，可是在手腕里面却是长着半把剪刀。\\n　　这半把剪刀活生生的长在了肉里，同皮肉长在一起，同根骨接在一起，同血肉融在一起。\\n　　娄紫茵慢条斯理理自己的华服，如果你还能杀人，我娄紫茵就能当皇后了.\\n　　结果她的话还没有落下，就感觉自己的背心一疼。\\n　　她啊的一声尖叫出了声，也是将身后枯瘦的女人一推，那女人干瘦像是鬼一样的身体，就连风都是会向那一身的衣服里灌去，沈清辞退了一步，风还是吹着她空空荡荡的身体，而她右手的断腕上面，长着半把剪刀。\\n　　谁说没有手的人就不能杀人的，她不知道娄紫茵是不是会做皇后，可是她却会杀了她。\\n　　“来人，来人……”";
    public String SECOND_CHAPTER = "{\"code\":0,\"msg\":\"请求成功\",\"data\":{\"book_id\":4278,\"title\":\"贵女重生：侯府下堂妻\",\"chapter_id\":1845099,\"chapter_title\":\"第2章\",\"content\":\"　　破落的院中，站了一个骷髅般的女人，她抬起脸，就这么呆呆的望着眼前的梨花。\\n　　忽是一阵冷风吹来，而她却似是浑然未知一样，而风亦是吹起了她的衣袖，空空荡荡的，也只是余下了一截狰狞的手腕断骨。\\n　　她没有手。\\n　　外面的门吱咛的一声开了，接着一名穿着华服的女人走了过来，她唇角带笑，眸底却是冰冷，就连那张艳的红唇之上，也是擒着一抹恶质的弧度。\\n　　“清辞妹妹，我来看你了。”\\n　　娄紫茵笑道，“这些年，你可好？”她笑着，这笑也是越加的美艳了几分。\\n　　沈清辞用自己的断腕接住了一片梨花，长睫敛下的目光却隐下了一份木然。\\n　　“呵呵……”娄紫茵再是捂着嘴娇笑了起来。\\n　　“妹妹，我只是来告诉你一件事情的，你不是一直很想知道，你大姐如何了吗？”\\n　　“我们再是如何也是姐妹一场，自是要告知你一声的。”\\n　　娄紫茵再是勾起了自己的红唇，\\n　　“妹妹，你知道吗？今天你唯一的亲人已经死了，你的姐姐死了啊，你知道她是怎么死的吗，是被活活烧死的，烧成炭黑的一团，人都是扭在了一起啊，你可知道，这几年来，她可是送来了不少的银子，可惜你一文钱也没有用上，所以她就死了，也是死不瞑目，你们沈家人终于是死光了啊，可是你什么时候才去陪他们？”\\n　　她笑的自己的脸都是疼了，可是沈清辞却似乎连一点的表情都是没有，也是一点的感觉都是没有，她就只是低着头，看着自己的断腕，这是齐齐被切了手掌，当时也不知道如何的疼痛，如何的撕心。\\n　　娄紫茵伸出手，啪的一声，就往沈清辞的脸上扇了一巴掌\\n　　“沈清辞，你果然是都是冷血的，你父亲死时，你没有哭，你兄长被五马分尸时，你也没有哭，你大姐被嫁于全京城最是龌龊的男人之时，你也没有哭，现在她死了，她被折断了四肢，再是被活生生烧死的，怎么，你还是没有一滴的眼泪吗？”\\n　　沈清辞抬起脸，惨白的脸上，只有一双冷瞳就这么不声不响的盯着眼前的华服女人，却是让华服女人愣了一下，不过很快过的，再是扬起了自己迷人的红唇。\\n　　“你已经被我砍了双手，你还想要杀我吗，凭什么，凭你的断腕吗？”而她再是扬起了手，可是沈清辞却是连躲都是没有躲过，就只有那一双冷冷的双瞳，或许就像是别人的说的，她没有心，她冷血，她连一点的喜怒哀乐都是没有。\\n　　这一次，娄紫茵的手始始终都是没有放下，而是轻轻的拍着沈清辞没有任何血色的脸，你说你怎么这样倔的，只要你听话一些，把我们娄家的香典交出来，我就可以让相公放你一命，也可以让相公再是纳你为妾，你说这样还不好吗？\\n　　“妹妹，别这样不识抬举，你看你的不识抬举害死多少人啊，”华服女人再是扇了扇她的脸，只是触手间的，却几乎都是冰一样的刺骨寒冷。\\n　　一个人的体温怎的如此冷，可是眼前的沈清辞就如此，她的身体就好是没有半点的体温一样，没有血色，也是就无温度。\\n　　“妹妹，我劝你还是将香典给姐姐吧，这样姐姐还能帮着你大姐准备一幅薄棺，让她入土为安，不至于生前横死，死后还要落的一个孤魂野鬼的下场。”\\n　　“娄紫茵……”\\n　　冷的几乎都是没有一丝的悲哀，淡的几乎都是体会不到了人间的八苦。\\n　　就只是这三上字，平平的，折折的，也是无味的。\\n　　娄紫茵一愣，突然间再是笑开了，妹妹是不是愿意说了，我可是很久没有听过你叫姐姐的名子了，你不是最爱相公吗，这样就对了，她唇角轻抬，语气微讽。\\n　　你说，你早知今日又何必当初呢，如果你早说，相公也便不会砍断你手腕了，你的白竹也便不会死了。\\n　　“娄紫茵……”\\n　　再是这一声，沈清辞的冷瞳里面终是聚了一些光，可是反射出来的却又是一种空洞，\\n　　她抬起自己的断腕，放在了娄紫茵的面胶，“你说是不是没有手，便不再能杀人了？”\\n　　“你自己不就是断碗，不问问自己，为何要问别人？”\\n　　娄紫茵再是抚了抚自己的墨发，然后上前，纤白的手指也是放在了这棵长的奇形的梨树上，“这棵树到是长的不错，花开的真好，可是……”她抬起脸，脸部的表情也是尽数而去，“妹妹，你也应该知道姐姐是最讨厌梨花了，所以明日姐姐便会让人砍掉它，妹妹你说可好？\\n　　眼前落下的那一树的洁白，沈清辞再是伸出断碗，断碗上面有了一朵完美的梨花，她突然间笑了，就像如是这洁白的花朵一般，白的无色透明着。\\n　　她将自己的断碗抬起，将这朵梨花放在了自己的嘴里，不知道从何而来的香，让院外所有的人不由的都是停下了步子。\\n　　好香，是的，好香。\\n　　不知道哪一种香，似梨非梨，似梅非梅，又似雪中莲，竟是有些说不来的冷。\\n　　“娄紫茵……”这是沈清辞第三次的叫着这个名子，她要记住什么，哪怕是在变成了鬼也不会忘记。\\n　　“你真的认为没有的手就真的不能杀人吗？”她的声音幽幽的，却是无人知道，此时，她抬起另一条胳膊，这条胳膊也是没有手腕，可是在手腕里面却是长着半把剪刀。\\n　　这半把剪刀活生生的长在了肉里，同皮肉长在一起，同根骨接在一起，同血肉融在一起。\\n　　娄紫茵慢条斯理理自己的华服，如果你还能杀人，我娄紫茵就能当皇后了.\\n　　结果她的话还没有落下，就感觉自己的背心一疼。\\n　　她啊的一声尖叫出了声，也是将身后枯瘦的女人一推，那女人干瘦像是鬼一样的身体，就连风都是会向那一身的衣服里灌去，沈清辞退了一步，风还是吹着她空空荡荡的身体，而她右手的断腕上面，长着半把剪刀。\\n　　谁说没有手的人就不能杀人的，她不知道娄紫茵是不是会做皇后，可是她却会杀了她。\\n　　“来人，来人……”\",\"status\":1,\"sort\":0,\"last_chapter_id\":0,\"next_chapter_id\":1845099,\"chapter_price\":0}}";
    public String THIRD_CHAPTER = "{\"code\":0,\"msg\":\"请求成功\",\"data\":{\"book_id\":4278,\"title\":\"贵女重生：侯府下堂妻\",\"chapter_id\":1845099,\"chapter_title\":\"第3章\",\"content\":\"　　破落的院中，站了一个骷髅般的女人，她抬起脸，就这么呆呆的望着眼前的梨花。\\n　　忽是一阵冷风吹来，而她却似是浑然未知一样，而风亦是吹起了她的衣袖，空空荡荡的，也只是余下了一截狰狞的手腕断骨。\\n　　她没有手。\\n　　外面的门吱咛的一声开了，接着一名穿着华服的女人走了过来，她唇角带笑，眸底却是冰冷，就连那张艳的红唇之上，也是擒着一抹恶质的弧度。\\n　　“清辞妹妹，我来看你了。”\\n　　娄紫茵笑道，“这些年，你可好？”她笑着，这笑也是越加的美艳了几分。\\n　　沈清辞用自己的断腕接住了一片梨花，长睫敛下的目光却隐下了一份木然。\\n　　“呵呵……”娄紫茵再是捂着嘴娇笑了起来。\\n　　“妹妹，我只是来告诉你一件事情的，你不是一直很想知道，你大姐如何了吗？”\\n　　“我们再是如何也是姐妹一场，自是要告知你一声的。”\\n　　娄紫茵再是勾起了自己的红唇，\\n　　“妹妹，你知道吗？今天你唯一的亲人已经死了，你的姐姐死了啊，你知道她是怎么死的吗，是被活活烧死的，烧成炭黑的一团，人都是扭在了一起啊，你可知道，这几年来，她可是送来了不少的银子，可惜你一文钱也没有用上，所以她就死了，也是死不瞑目，你们沈家人终于是死光了啊，可是你什么时候才去陪他们？”\\n　　她笑的自己的脸都是疼了，可是沈清辞却似乎连一点的表情都是没有，也是一点的感觉都是没有，她就只是低着头，看着自己的断腕，这是齐齐被切了手掌，当时也不知道如何的疼痛，如何的撕心。\\n　　娄紫茵伸出手，啪的一声，就往沈清辞的脸上扇了一巴掌\\n　　“沈清辞，你果然是都是冷血的，你父亲死时，你没有哭，你兄长被五马分尸时，你也没有哭，你大姐被嫁于全京城最是龌龊的男人之时，你也没有哭，现在她死了，她被折断了四肢，再是被活生生烧死的，怎么，你还是没有一滴的眼泪吗？”\\n　　沈清辞抬起脸，惨白的脸上，只有一双冷瞳就这么不声不响的盯着眼前的华服女人，却是让华服女人愣了一下，不过很快过的，再是扬起了自己迷人的红唇。\\n　　“你已经被我砍了双手，你还想要杀我吗，凭什么，凭你的断腕吗？”而她再是扬起了手，可是沈清辞却是连躲都是没有躲过，就只有那一双冷冷的双瞳，或许就像是别人的说的，她没有心，她冷血，她连一点的喜怒哀乐都是没有。\\n　　这一次，娄紫茵的手始始终都是没有放下，而是轻轻的拍着沈清辞没有任何血色的脸，你说你怎么这样倔的，只要你听话一些，把我们娄家的香典交出来，我就可以让相公放你一命，也可以让相公再是纳你为妾，你说这样还不好吗？\\n　　“妹妹，别这样不识抬举，你看你的不识抬举害死多少人啊，”华服女人再是扇了扇她的脸，只是触手间的，却几乎都是冰一样的刺骨寒冷。\\n　　一个人的体温怎的如此冷，可是眼前的沈清辞就如此，她的身体就好是没有半点的体温一样，没有血色，也是就无温度。\\n　　“妹妹，我劝你还是将香典给姐姐吧，这样姐姐还能帮着你大姐准备一幅薄棺，让她入土为安，不至于生前横死，死后还要落的一个孤魂野鬼的下场。”\\n　　“娄紫茵……”\\n　　冷的几乎都是没有一丝的悲哀，淡的几乎都是体会不到了人间的八苦。\\n　　就只是这三上字，平平的，折折的，也是无味的。\\n　　娄紫茵一愣，突然间再是笑开了，妹妹是不是愿意说了，我可是很久没有听过你叫姐姐的名子了，你不是最爱相公吗，这样就对了，她唇角轻抬，语气微讽。\\n　　你说，你早知今日又何必当初呢，如果你早说，相公也便不会砍断你手腕了，你的白竹也便不会死了。\\n　　“娄紫茵……”\\n　　再是这一声，沈清辞的冷瞳里面终是聚了一些光，可是反射出来的却又是一种空洞，\\n　　她抬起自己的断腕，放在了娄紫茵的面胶，“你说是不是没有手，便不再能杀人了？”\\n　　“你自己不就是断碗，不问问自己，为何要问别人？”\\n　　娄紫茵再是抚了抚自己的墨发，然后上前，纤白的手指也是放在了这棵长的奇形的梨树上，“这棵树到是长的不错，花开的真好，可是……”她抬起脸，脸部的表情也是尽数而去，“妹妹，你也应该知道姐姐是最讨厌梨花了，所以明日姐姐便会让人砍掉它，妹妹你说可好？\\n　　眼前落下的那一树的洁白，沈清辞再是伸出断碗，断碗上面有了一朵完美的梨花，她突然间笑了，就像如是这洁白的花朵一般，白的无色透明着。\\n　　她将自己的断碗抬起，将这朵梨花放在了自己的嘴里，不知道从何而来的香，让院外所有的人不由的都是停下了步子。\\n　　好香，是的，好香。\\n　　不知道哪一种香，似梨非梨，似梅非梅，又似雪中莲，竟是有些说不来的冷。\\n　　“娄紫茵……”这是沈清辞第三次的叫着这个名子，她要记住什么，哪怕是在变成了鬼也不会忘记。\\n　　“你真的认为没有的手就真的不能杀人吗？”她的声音幽幽的，却是无人知道，此时，她抬起另一条胳膊，这条胳膊也是没有手腕，可是在手腕里面却是长着半把剪刀。\\n　　这半把剪刀活生生的长在了肉里，同皮肉长在一起，同根骨接在一起，同血肉融在一起。\\n　　娄紫茵慢条斯理理自己的华服，如果你还能杀人，我娄紫茵就能当皇后了.\\n　　结果她的话还没有落下，就感觉自己的背心一疼。\\n　　她啊的一声尖叫出了声，也是将身后枯瘦的女人一推，那女人干瘦像是鬼一样的身体，就连风都是会向那一身的衣服里灌去，沈清辞退了一步，风还是吹着她空空荡荡的身体，而她右手的断腕上面，长着半把剪刀。\\n　　谁说没有手的人就不能杀人的，她不知道娄紫茵是不是会做皇后，可是她却会杀了她。\\n　　“来人，来人……”\",\"status\":1,\"sort\":0,\"last_chapter_id\":0,\"next_chapter_id\":1845099,\"chapter_price\":0}}";
    private List<CharSequence> pages = new ArrayList<>();
    private ArrayList<TextView> mTvs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PageView pageView = findViewById(R.id.pageView);

        ArrayList<String> titles = new ArrayList<>();
        titles.add("第1章");
        titles.add("第2章");
        titles.add("第3章");

        ArrayList<String> contents = new ArrayList<>();
        contents.add(FILE_CHAPTER);
        contents.add(SECOND_CHAPTER);
        contents.add(THIRD_CHAPTER);

        pageView.setAdapter(new StringAdapter() {
            @Override
            protected String getPageSource(int section) {
                return contents.get(section);
            }

            @Override
            public int getSectionCount() {
                return titles.size();
            }

            @Override
            public String getSectionName(int section) {
                return titles.get(section);
            }

            @Override
            public boolean hasNextSection(int currentSection) {
                if (currentSection < titles.size() - 1) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean hasPreviousSection(int currentSection) {
                if (currentSection == 0) {
                    return false;
                }
                return true;
            }
        });
        pageView.setPageMode(0);
        pageView.openSection(0);
        pageView.setOnPageChangeListener(new OnPageChangeListener() {
            @Override
            public void onChapterChange(int pos) {
                Log.e("aaa", "下一章：" + pos);
            }

            @Override
            public void onPageCountChange(int count) {
                Log.e("aaa", "总页数：" + count);
            }

            @Override
            public void onPageChange(int pos, int all) {
                Log.e("aaa", "本章总页码" + all + "-->当前页码" + pos);
                if (pos == 0) {
                    Log.e("aaa", "请求上一章");
                } else if (pos == all - 1) {
                    Log.e("aaa", "请求下一张");
                }
            }
        });

    }
}
package com.mfr.dsa.twopointers;

public class MinMovesToMakePalindrome {
    public static void main(String[] args) {
        //String str = "xcxoxoc";
        String str = "iywuupcxsnnunjoxlfexjwnctpvveeidyuujsoiwernhkqrapejwfqnjbmnuogrkilaweqoolfdajmlynmgczejwvypvzexdktpguzjibiriaitqddpcopwuruufbersytzrxubvasqacwvqqytlifxtzzyzuzlwarmffxasnommwmrxgcukqekbvgaavruirtbgbkbvzypnrnuylvqbrmrnmqkoopqbdsuwwiwpimnuwyxxlvonbeooxduewyqksyhsauamakjeosifueeonanwkbdtuiwefmhjvtpickmzukgalnvummlujfqwmmiitczjeqszkufeippspjmquckjynzegcrdiikypsowsfdfvdztkwonheylwtqnjeylhspwqcypjewwutryvhwpecxvuauqpofrjsaqvzqifrqnboefoilmqjmbluifwoeulzeznwpwmkjvulzaiqukrgaelijzoyczgimfdyfucziorcmtsnsdlejpzissdzbprxxosgjpwjrrgzfriupddcwfrkozmkcduwrobeeieyeojygxvygngoiozrwhjetztflldtdwwoewpfkiyordzanjwpgyedgiagamwqxklbdvfbmotoqlwwqnojyajvrarwzwmllpleugowgbngmcafifmstzrscesuntfjiluendbylpcblftxyorzgaqumbyuuqdkizzbwviuxwzlhqnfmhzcpiasntihuihyfljxwovvtiwkdmynasmwxxdzcvqtjjkbyazakeovaapyrzeleqzmfwfyxynmwztqtaxvvvvovkhondjwpaqrouhgcxpdccosfchyeymvilwfouwqkqbhpmwmjrmvckimtnhtiudjhonanabezgzkzvoohhuxytwsudlzyoxopnkanznwtnxwuzqprdqharxhwuuqwvddwtavfostazxskmatfchxvhozlvjzduhfghqzxkoxvewssejmnerdptvpvdutfgaeltmiagoytwbtryooqkgzzievtjreroktspmmyncnbhroskmiscaiowlew";
        int moves = minMovesToMakePalindrome(str);
        System.out.println("Moves:" +moves);
    }
    public static int minMovesToMakePalindrome(String s) {
        char[] chars = s.toCharArray();

        int moves = 0;

        for (int start = 0, end = chars.length - 1; start < end; ++start) {
            int index = end;
            for (; index > start; --index) {
                if (chars[start] == chars[index]) {
                    for (; index < end; ++index) {
                        char temp = chars[index];
                        chars[index] = chars[index + 1];
                        chars[index + 1] = temp;
                        ++moves;
                    }
                    --end;
                    break;
                }
            }
            if (index == start) {
                moves += chars.length / 2 - start;
            }
        }
        return moves;
    }
}

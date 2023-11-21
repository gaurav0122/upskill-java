package com.credit.serviceimpl;

import org.springframework.stereotype.Service;

import com.credit.exception.NotValidCreditCard;
import com.credit.service.CreditService;

@Service
public class CreditServiceImpl implements CreditService{

	@Override
	public String validateCreditcard(String cardnumber) {
		int len = cardnumber.length();
		for(char c:cardnumber.toCharArray()) {
			if(!(c>='0' && c<='9')) {
				throw new NotValidCreditCard("Card Number should contains only numbers");
			}
		}
		if(len<15 ) {
			throw new NotValidCreditCard("Length of credit card is too less");
		}
		if(len>19 ) {
			throw new NotValidCreditCard("Length of credit card is too more");
		}
		if(len==15) {
			int x = (cardnumber.charAt(0)-'0')*1000 + (cardnumber.charAt(1)-'0')*100 + (cardnumber.charAt(2)-'0')*10 + (cardnumber.charAt(3)-'0');
			if(x==2014 || x== 2149) {
				return "enRoute";
			}
		}
		if(len>=16 && len <=19) {
			if(cardnumber.charAt(0)=='4') {
				return "visa";
			}
			int x = (cardnumber.charAt(0)-'0')*1000 + (cardnumber.charAt(1)-'0')*100 + (cardnumber.charAt(2)-'0')*10 + (cardnumber.charAt(3)-'0');
			if(x>=3528 && x<3589) {
				return "JCB";
			}
			System.out.println(x);
			x=(x*10) + (cardnumber.charAt(4)-'0');
			x=(x*10) + (cardnumber.charAt(5)-'0');
			System.out.println(x);
			if((x>=601100 && x<=601109)||(x>=601120 && x<=601149)||(x>=601177 && x<=601179)||(x>=601186 && x<=601199)||(x>=604000 && x<=659999) || x==601174) {
				return "Discover";
			}
			if((cardnumber.charAt(0)=='5' && (cardnumber.charAt(1)>='1' && cardnumber.charAt(1)<='5')) && (x>=510000 && x<559999)) {
				return "Mastercard";
			}
			if((cardnumber.charAt(0)=='2' && (cardnumber.charAt(1)>='2' && cardnumber.charAt(1)<='7')) && (x>=222100 && x<272099)) {
				return "Mastercard";
			}
		}
		
		throw new NotValidCreditCard("Not a Valid Credit card");
		
		
	}

}

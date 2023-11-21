
import opennlp.summarization.textrank.TextRankSummarizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.pro10.kma.MorphAnalysis;
import com.pro10.kma.analyzer.ProToken;

import opennlp.summarization.preprocess.DefaultDocProcessor;

public class Test {
	private static MorphAnalysis morph;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextRankSummarizer textSum = new TextRankSummarizer();
		
		String text = "5월 4일 뉴스 모니터링 전달 드립니다.   5월 3일(월) 배포한 < 더이누스 가정의 달 맞아 라이브 커머스로 욕실 리모델링 패키지 첫 판매 > 보도자료와 관련해 뉴스1, 매일경제 등 총 6개 매체에 게재되어 자사 기사로 보내 드립니다.     감사합니다.   THE INUS Daily News Monitoring 2021년 5월 4일 (화) [자사] No. 일자 매체 기자명 기사 제목 지면/온라인 1 5월 3일 뉴스1 문대현 '더이누스', 5월 맞이 라이브커머스…욕실 리모델링 패키지 판매 온라인 2 5월 3일 매일경제 이종화 더이누스, 가정의 달 맞아 라이브 커머스로 욕실 리모델링 패키지 첫 판매 온라인 3 5월 3일 아시아경제 김보경 더이누스, 내일 첫 라이브커머스…욕실 리모델링 패키지 판매 온라인 4 5월 3일 이투데이 이다원 더이누스, 가정의달 맞아 첫 ‘라방’…욕실 리모델링 패키지 판매 온라인 5 5월 3일 이뉴스투데이 고선호 더이누스, 라이브 커머스서 욕실 리모델링 패키지 첫 판매 온라인 6 5월 3일 e대한경제 문수아 더이누스, 라이브 커머스로 욕실 리모델링 패키지 첫 판매 온라인 [욕실업계] No. 일자 매체 기자명 기사 제목 지면/온라인 1 5월 4일 뉴스핌 송현주 'LX 새집 살림' 나선 하우시스… 신성장동력도 확보할까 온라인 [인테리어업계] No. 일자 매체 기자명 기사 제목 지면/온라인 1 5월 3일 한국경제 김병근 생분해 비닐·재생종이 완충재…'착한 포장' 늘리는 가구업계";
		String line = "5월 4일 뉴스 모니터링 전달 드립니다.   5월 3일(월) 배포한 < 더이누스 가정의 달 맞아 라이브 커머스로 욕실 리모델링 패키지 첫 판매 > 보도자료와 관련해 뉴스1, 매일경제 등 총 6개 매체에 게재되어 자사 기사로 보내 드립니다.     감사합니다.   THE INUS Daily News Monitoring 2021년 5월 4일 (화) [자사] No. 일자 매체 기자명 기사 제목 지면/온라인 1 5월 3일 뉴스1 문대현 '더이누스', 5월 맞이 라이브커머스…욕실 리모델링 패키지 판매 온라인 2 5월 3일 매일경제 이종화 더이누스, 가정의 달 맞아 라이브 커머스로 욕실 리모델링 패키지 첫 판매 온라인 3 5월 3일 아시아경제 김보경 더이누스, 내일 첫 라이브커머스…욕실 리모델링 패키지 판매 온라인 4 5월 3일 이투데이 이다원 더이누스, 가정의달 맞아 첫 ‘라방’…욕실 리모델링 패키지 판매 온라인 5 5월 3일 이뉴스투데이 고선호 더이누스, 라이브 커머스서 욕실 리모델링 패키지 첫 판매 온라인 6 5월 3일 e대한경제 문수아 더이누스, 라이브 커머스로 욕실 리모델링 패키지 첫 판매 온라인 [욕실업계] No. 일자 매체 기자명 기사 제목 지면/온라인 1 5월 4일 뉴스핌 송현주 'LX 새집 살림' 나선 하우시스… 신성장동력도 확보할까 온라인 [인테리어업계] No. 일자 매체 기자명 기사 제목 지면/온라인 1 5월 3일 한국경제 김병근 생분해 비닐·재생종이 완충재…'착한 포장' 늘리는 가구업계";
		
		if (morph == null) {
		      morph = new MorphAnalysis(true, false, true);
		      morph.loadFile("E:\\work\\workspace_sts\\Test\\src\\resources");
		    } 
		
		List<ProToken> p1 = morph.getAutoMorpheme(line.trim());

    	// System.out.println("================================"+p1);

    	for(ProToken p : p1) {

    		 //System.out.println("=="+ p.getTerm());

    	}

		//System.out.println();
		//System.out.println(textSum.summarize(text, new DefaultDocProcessor(), 100));
		
	}

}

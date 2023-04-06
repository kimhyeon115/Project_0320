package Package_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SungjukInOutmoniter {

	public static void main(String[] args) {
		try {
			String inName = "sungjukin/sungjuk.txt";		//입력할 파일
			String outName = "sungjukin/result.txt";		//출력할 파일
			
			String[] name = new String[5];
			int[] kor = new int[5];
			int[] eng = new int[5];
			int[] mat = new int[5];
			int[] aver = new int[5];
			int[] rank = new int[5];
			int size = name.length;
			
			FileReader in = new FileReader(inName);			//파일에서 읽는 인터페이스
			BufferedReader br = new BufferedReader(in);		//파일 읽는 용량 업그레이드 인터페이스
			
			int idx = 0;
			String line = null;			//초기값 설정
			
			while(true) {				//무한 반복
				line = br.readLine();
				if(line==null) break;	//데이터 끝날시 무한 반복 탈출
				System.out.println(line);
				
				StringTokenizer st = new StringTokenizer(line,",");		//데이터에서 ',' 기준으로 분리해서 입력 기억
				while(st.hasMoreElements()) {							//토큰할 게 있을 때까지 반목
					name[idx] = st.nextToken();
					kor[idx] = Integer.parseInt(st.nextToken());		//String을 int로 형변환
					eng[idx] = Integer.parseInt(st.nextToken());		//(형변환 하는 이유 밑에서 계산에서 사용하기 위함)
					mat[idx] = Integer.parseInt(st.nextToken());
					
				}//while end
				idx++;
			}//while end
			for(int a=0; a<size; a++) {									//평균 구하는 반복문
				aver[a]=(kor[a] + eng[a] + mat[a]) / 3;
			}
			for(int a=0; a<size; a++) {									//등수 구하는 반복문
				for(int b=0; b<size; b++) {
					if(aver[a]<aver[b]) {
						rank[a]++;
					}
				}
				rank[a] = rank[a]+1;
			}
			FileWriter fw = new FileWriter(outName);					
			PrintWriter out = new PrintWriter(fw,false);
			
			out.println("*********성 / 적 / 결 / 과**********");			//out<<< 인터페이스의 참조 변수
			out.println("-----------------------------------");
			out.println("이름      국어   영어   수학   평균   등수");
			out.println("-----------------------------------");
			
			for(idx=0; idx<size; idx++) {
				out.printf("%-5s %5d %5d %5d %5d %5d",
						name[idx],kor[idx],eng[idx],mat[idx],aver[idx],rank[idx]);
				out.println();
			}//for end
			out.println("-----------------------------------");
			
			in.close(); br.close();
			fw.close();	out.close();
			
		}catch(Exception e) {
			System.out.println("실패" + e);
		}
	}

}

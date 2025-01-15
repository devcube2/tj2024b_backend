package practice.network;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class RoadAddress {

    public static void main(String[] args) {
        try {
            // 도로명주소 API 키 (발급받은 키를 입력하세요)
            String apiKey = "devU01TX0FVVEgyMDI1MDEwMzIwMTczMzExNTM4MTk=";

            // 검색할 주소 키워드
//          String keyword = "인천광역시 미추홀구";
            String keyword = "경기 부천시 소사구 경인로 10번길 25-44";

            // API URL 생성
            String apiURL = "https://www.juso.go.kr/addrlink/addrLinkApi.do";
            StringBuilder urlBuilder = new StringBuilder(apiURL);
            urlBuilder.append("?confmKey=").append(apiKey);
            urlBuilder.append("&currentPage=1"); // 현재 페이지
            urlBuilder.append("&countPerPage=10"); // 한 페이지에 출력할 데이터 수
            urlBuilder.append("&keyword=").append(URLEncoder.encode(keyword, "UTF-8"));
            urlBuilder.append("&resultType=json"); // 결과 형식 (JSON)

            // URL 연결
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // 응답 코드 확인
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // JSON 파싱
                parseJsonResponse(response.toString());
            } else {
                System.out.println("HTTP 요청 실패. 응답 코드: " + responseCode);
            }

            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseJsonResponse(String jsonResponse) {
        try {
            // Simple JSON 파서
            JSONParser parser = new JSONParser();
            JSONObject rootObject = (JSONObject) parser.parse(jsonResponse);

            // results 객체 가져오기
            JSONObject results = (JSONObject) rootObject.get("results");

            // common 객체에서 총 검색 결과 수 확인
            JSONObject common = (JSONObject) results.get("common");
            String totalCount = (String) common.get("totalCount");
            System.out.println("총 검색 결과 수: " + totalCount);

            // juso 배열 가져오기
            JSONArray jusoArray = (JSONArray) results.get("juso");
            for (Object obj : jusoArray) {
                JSONObject address = (JSONObject) obj;
                System.out.println(address);
                String roadAddr = (String) address.get("roadAddr");
                String jibunAddr = (String) address.get("jibunAddr");
                String zipNo = (String) address.get("zipNo");
                String si = (String) address.get("siNm");        
                String sgg = (String) address.get("sggNm");                

                System.out.println("도로명 주소: " + roadAddr);
                System.out.println("지번 주소: " + jibunAddr);
                System.out.println("우편번호: " + zipNo);
                System.out.println("시: " + si);
                System.out.println("구: " + sgg);
//                System.out.println("시:  + " + si);
                System.out.println("-------------------------");
            }
        } catch (Exception e) {
            System.out.println("JSON 파싱 중 오류 발생:");
            e.printStackTrace();
        }
    }
}


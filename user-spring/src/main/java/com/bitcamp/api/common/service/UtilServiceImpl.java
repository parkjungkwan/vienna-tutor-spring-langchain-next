package com.bitcamp.api.common.service;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance = new UtilServiceImpl();
    private UtilServiceImpl(){}
    public static UtilService getInstance(){return instance;}

    @Override
    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        //0 이상 50 미만의 값을 생성하고 150을 더해줌으로써 키의 범위를 150 이상 200 미만으로 만듦
        return start + (int)(Math.random() * gapBetweenStartAndEnd);
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        return (Math.round((start + Math.random() * gapBetweenStartAndEnd) * 10) / 10.0);
    }

    @Override
    public String createRandomName() {
        String[] names = {"이정재", "마동석", "송강호", "윤여정", "황정민",
                "정우성", "이병헌", "현 빈", "유해진", "손석구",
                "전도연", "손예진", "하지원", "김하늘", "송중기",
                "하정우", "장동건","원 빈", "박해일", "소지섭", "김혜수"};
        return names[createRandomInteger(0,20)];
    }

    @Override
    public String createRandomTitle() {
        String[] titles = {"혼인과 가족생활","국가는 대외무역","국회의 정기회",
                "헌법재판소 재판관의 임기","체포·구속·압수 또는 수색","대통령이 제1항",
                "신체장애자 및 질병·노령","법률이 정하는 바","국민이 되는 요건","국가의 보호","법률로서 확정"};
        return titles[createRandomInteger(0,10)];
    }

    @Override
    public String createRandomContent() {
        String[] content = {
                "혼인과 가족생활은 개인의 존엄과 양성의 평등을 기초로 성립되고 유지되어야 하며, 국가는 이를 보장한다.",
                "국가는 대외무역을 육성하며, 이를 규제·조정할 수 있다.",
                "국회의 정기회는 법률이 정하는 바에 의하여 매년 1회 집회되며",
                "국회의 임시회는 대통령 또는 국회재적의원 4분의 1 이상의 요구에 의하여 집회된다.",
                "헌법재판소 재판관의 임기는 6년으로 하며, 법률이 정하는 바에 의하여 연임할 수 있다.",
                "체포·구속·압수 또는 수색을 할 때에는 적법한 절차에 따라 검사의 신청에 의하여 법관이 발부한 영장을 제시하여야 한다.",
                "다만, 현행범인인 경우와 장기 3년 이상의 형에 해당하는 죄를 범하고 도피 또는 증거인멸의 염려가 있을 때에는 사후에 영장을 청구할 수 있다.",
                "국회는 국정을 감사하거나 특정한 국정사안에 대하여 조사할 수 있으며, 이에 필요한 서류의 제출 또는 증인의 출석과 증언이나 의견의 진술을 요구할 수 있다.",
                "대한민국의 국민이 되는 요건은 법률로 정한다. 국회의원과 정부는 법률안을 제출할 수 있다.",
                "대통령이 제1항의 기간내에 공포나 재의의 요구를 하지 아니한 때에도 그 법률안은 법률로서 확정된다.",
                "대통령은 내란 또는 외환의 죄를 범한 경우를 제외하고는 재직중 형사상의 소추를 받지 아니한다.",
                "신체장애자 및 질병·노령 기타의 사유로 생활능력이 없는 국민은 법률이 정하는 바에 의하여 국가의 보호를 받는다.",
                "법관이 중대한 심신상의 장해로 직무를 수행할 수 없을 때에는 법률이 정하는 바에 의하여 퇴직하게 할 수 있다."
        };
        return content[createRandomInteger(0,13)];
    }

    @Override
    public String createRandomCompany() {
        String[] companies = {"구글","엔비디아","메타","삼성","LG","애플"};
        return null;
    }

    @Override
    public String createRandomJob() {
        String[] names = {"경찰", "소방관", "세일즈맨", "교수", "회계사",
                "공무원", "의사"};
        return names[createRandomInteger(0,6)];
    }

    @Override
    public String createRandomUsername() {
        String username = "";
        for(;
            username.length() < 5;
            username += String.valueOf((char)('a' + this.createRandomInteger(0, 26))));
        return username;
    }
}

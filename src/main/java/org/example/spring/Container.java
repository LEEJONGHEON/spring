package org.example.spring;

//유사 스프링 컨테이너
//의존성 주입
public class Container {

    // 쉐프 빈 등록
    // <bean id="chef" class="org.example.spring.KimChef" />

    public Chef chef() {
        return new KimChef();
    }

    // 레스토랑 빈 등록
    // <bean id="restaurant" class="org.example.spring.KoreanRestaurant">
    //     <constructor-args ref="chef" />
    // </bean>
    public KoreanRestaurant restaurant() {
        return new KoreanRestaurant(chef());
    }

    public FrenchRestaurant frenchRestaurant() {
        return new FrenchRestaurant(chef());
    }

    public Hotel hotel() {
        return new Hotel(
                new SuiteRoom(),
                frenchRestaurant()
        );
    }
}

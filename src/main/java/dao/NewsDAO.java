package dao;

import models.News;
import java.util.*;

public class NewsDAO {

    private static final List<News> data = new ArrayList<>();

    static {
        data.add(new News(
                1,
                "Giới thiệu Struts 2",
                "Hướng dẫn chi tiết framework Struts 2.",
                "https://picsum.photos/300/200?1",
                "Struts 2 là một framework MVC mạnh mẽ cho các ứng dụng web Java. "
                        + "Nó giúp tách biệt rõ ràng giữa tầng trình bày, điều khiển và xử lý nghiệp vụ, "
                        + "giúp mã nguồn dễ bảo trì và mở rộng."));

        data.add(new News(
                2,
                "Spring Boot vs Struts",
                "So sánh hai framework web phổ biến.",
                "https://picsum.photos/300/200?2",
                "Spring Boot giúp xây dựng ứng dụng nhanh chóng bằng cách tự động cấu hình, "
                        + "trong khi Struts 2 cung cấp cơ chế điều khiển linh hoạt hơn cho những hệ thống lớn. "
                        + "Cả hai đều hỗ trợ mô hình MVC và RESTful API."));

        data.add(new News(
                3,
                "Jakarta EE 10 là gì?",
                "Tìm hiểu về phiên bản mới nhất của Jakarta EE.",
                "https://picsum.photos/300/200?3",
                "Jakarta EE 10 là phiên bản tiếp nối của Java EE, được Eclipse Foundation phát triển. "
                        + "Phiên bản này tập trung vào cải tiến hiệu năng, hỗ trợ cloud-native và chuẩn hóa API hiện đại."));
    }

    public static List<News> getAll() {
        return data;
    }

    public static News getById(int id) {
        return data.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
    }
}

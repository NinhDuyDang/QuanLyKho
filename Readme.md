# Hướng dẫn cài đặt

## Yêu cầu
- Hệ quản trị cơ sở dữ liệu MySQL
- IDE phù hợp: IntelliJ, Eclipes, ...

## Các bước cài đặt
### Bước 1: Thiết lập cơ sở dữ liệu
- Sau khi cài đặt MySQL trên máy, ta tiến hành khởi tạo cơ sở dữ liệu và import cơ sở dữ liệu đã cho vào hệ thống, lưu ý đặt tên cơ sở dữ liệu là “db_quanlyxuatnhapkho” hoặc có thể thay thế khi config.
- Thiết lập các thuộc tính cơ sở dữ liệu trong file application.properties để phù hợp với cài đặt của cá nhân.

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/database_name
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

spring.jpa.hibernate.ddl-auto=update
logging.level.org.hibernate.SQL=DEBUG

```
### Bước 2: Chạy chương trình
- Tiến hành clone code từ https://github.com/nhp1807/Project2-QuanLyXuatNhapKho hoặc tải theo định dạng .zip.
```bash
git clone https://github.com/nhp1807/Project2-QuanLyXuatNhapKho.git

```
- Tiếp theo sử dụng Visual Studio Code hoặc IntelliJ mở folder dẫn vào chương trình. Để chạy chương trình, ta chạy file 'QuanLyNhapXuatKhoApplication.java' theo đường dẫn sau:  '\src\main\java\com\example\QuanLyNhapXuatKho\QuanLyNhapXuatKhoApplication.java'

- Sau khi khởi chạy server thành công. Tiếp theo mở trình duyệt và truy cập vào đường dẫn localhost:8080 để bắt đầu sử dụng chương trình.
- Tài khoản được cung cấp của ***admin*** là ***admin*** và mật khẩu là admin
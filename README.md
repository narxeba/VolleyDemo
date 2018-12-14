# VolleyDemo
Hướng dẫn sử dụng thư viện Volley trong Android

Volley được Google giới thiệu vào khoảng tháng 6/2013. Volley là một thư viện dùng để send và recieve response từ Server sử dụng giao thức HTTP.

Volley có các điểm nổi bật dưới đây:
<ul>
 	<li>Tự động lập lịch (scheduling) cho các request.</li>
 	<li>Caching Response.</li>
 	<li>Hỗ trợ set độ ưu tiên cho các request (priority).</li>
 	<li>Hỗ trợ nhiều kết quả trả về (String, JSONObject, JSONArray, Bitmap…)</li>
 	<li>Có thể huỷ Request.</li>
</ul>
<strong>Các class sử dụng trong Volley:</strong>

<strong>RequestQueue</strong>: Là hằng đợi giữ các Request.

<strong>Request</strong>: là lớp cơ sở của các Request trong Volley, chứa thông tin về request HTTP.

<strong>StringRequest</strong>: Kết thừa từ Request, là class đại diện cho request trả về String.

<strong>JSONObjectRequest</strong>: Là HTTP request có kết quả trả về là JSONObject.

<strong>JSONArrayRequest</strong>: Là HTTP request có kết quả trả về là JSONArray.

<strong>ImageRequest</strong>: Là HTTP request có kết quả trả về là Bitmap.

Ngoài ra chúng ta có thể tạo custom request. 

Chi tiết bài viết <a href="http://ntcde.com/android/huong-dan-su-dung-thu-vien-volley-trong-android.html">Hướng dẫn sử dụng Volley parse json</a>

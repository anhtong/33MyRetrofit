package com.anhtong8x.a33myretrofit.configs;

/**
 * Created by Administrator on 5/12/2018.
 * MVP va REST full
 * Co 1 man hinh Login lay ve token
 *
 * *) Ve mvp: có 3 thư mục
 * 1. Models/users
 * - LoginRequest: class chua thông tin request lên srv
 * - LoginResponse: class data thong tin srv tra ve ( moi mot api co 1 data tra ve khac nhau )
 *
 * Models/base
 * - ApiResponse: class co kieu T data trong do T sẽ là các class dinh nghia du lieuj tra ve theo tưng ham api.
 * Vi Data tra ve cua moi api khac nhau nên dung kieu T này
 * No khai bao trong ( Apiinteface/ network )
 *
 * 2. Presenter/users
 * - LoginInterface: 1 interface co ham xu ly login
 * - LoginLogic: implement tu interface tren. Chua cac ham xư ly login, gán gia trị vao cac view ket qua
 * ( MVP thi view k goi den model, Presenter sẽ giao tiep voi M và V )
 *
 * 3. View/user
 * - LoginInterface: 2 interface chua cac ham tao view
 * - LoginActiviti: view man hình noi co bien presenter gọi den cac presnet va model
 *
 * 4. config
 * - Appconfig:
 *
 * 5. network
 * - ApiClient: tao doi tong retrofit
 * - ApiInterface: dinh danh cac ham lam viec voi api ( nho khai bao trong gradle )
 *
 */

public class AppConfig {
    public static String BASE_URL = "http://14.225.3.30:461/";     // url restrofit
}

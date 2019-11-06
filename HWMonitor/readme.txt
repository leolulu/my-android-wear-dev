说明：

注意：这是个独立手表应用，不要装到手机上，一定要装到手表上！！！！

Version：0.0.1
Author：Zike Zhang

功能：手表和手机的蓝牙连接断开后，震动提醒，持续五秒。连接恢复后，断续震动提醒。

原理：当手表的蓝牙连接状态改变后，系统会发出android.bluetooth.device.action.ACL_DISCONNECTED或android.bluetooth.device.action.ACL_CONNECTED广播，接收这个广播，然后震动就好。
1、需要声明<uses-permission android:name="android.permission.BLUETOOTH"/>    <uses-permission android:name="android.permission.VIBRATE"/>这两个权限
2、在reciever中加上<action android:name="android.bluetooth.device.action.ACL_DISCONNECTED"/>    <action android:name="android.bluetooth.device.action.ACL_CONNECTED"/>，即静态注册

问题：
1、只监视蓝牙状态，而不分辨蓝牙状态变化的原因。例如：手表又连接了蓝牙耳机，那么蓝牙耳机连接和断开也会导致震动。这个问题也好解决，但是大部分手表没连耳机，即使连了也无所谓，不会产生很大困扰，因此，等下个版本再改吧。
2、这是个STANDALONE的手表应用，只能通过ADB下载到手表端！！！或者自己用Android Studio编译源码后自动推到手表上。
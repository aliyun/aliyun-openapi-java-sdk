/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.GetDeviceConfigsResponse;
import com.aliyuncs.wyota.model.v20210420.GetDeviceConfigsResponse.Data;
import com.aliyuncs.wyota.model.v20210420.GetDeviceConfigsResponse.Data.CustomResourcePackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceConfigsResponseUnmarshaller {

	public static GetDeviceConfigsResponse unmarshall(GetDeviceConfigsResponse getDeviceConfigsResponse, UnmarshallerContext _ctx) {
		
		getDeviceConfigsResponse.setRequestId(_ctx.stringValue("GetDeviceConfigsResponse.RequestId"));
		getDeviceConfigsResponse.setCode(_ctx.stringValue("GetDeviceConfigsResponse.Code"));
		getDeviceConfigsResponse.setMessage(_ctx.stringValue("GetDeviceConfigsResponse.Message"));

		Data data = new Data();
		data.setUuid(_ctx.stringValue("GetDeviceConfigsResponse.Data.Uuid"));
		data.setSerialNo(_ctx.stringValue("GetDeviceConfigsResponse.Data.SerialNo"));
		data.setUserCustomId(_ctx.stringValue("GetDeviceConfigsResponse.Data.UserCustomId"));
		data.setSecureNetworkType(_ctx.stringValue("GetDeviceConfigsResponse.Data.SecureNetworkType"));
		data.setEnableWlan(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableWlan"));
		data.setEnableBluetooth(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableBluetooth"));
		data.setEnableAdb(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableAdb"));
		data.setDefinePowerButton(_ctx.integerValue("GetDeviceConfigsResponse.Data.DefinePowerButton"));
		data.setEnableLockScreenPassword(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableLockScreenPassword"));
		data.setAutoLockScreenTime(_ctx.integerValue("GetDeviceConfigsResponse.Data.AutoLockScreenTime"));
		data.setSleepTime(_ctx.integerValue("GetDeviceConfigsResponse.Data.SleepTime"));
		data.setUsbStorage(_ctx.integerValue("GetDeviceConfigsResponse.Data.UsbStorage"));
		data.setLocalUsbPrint(_ctx.integerValue("GetDeviceConfigsResponse.Data.LocalUsbPrint"));
		data.setDeviceLock(_ctx.integerValue("GetDeviceConfigsResponse.Data.DeviceLock"));
		data.setLockPassword(_ctx.stringValue("GetDeviceConfigsResponse.Data.LockPassword"));
		data.setAutoUpdate(_ctx.integerValue("GetDeviceConfigsResponse.Data.AutoUpdate"));
		data.setEnableUnlockPassword(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableUnlockPassword"));
		data.setCustomPowerOn(_ctx.integerValue("GetDeviceConfigsResponse.Data.CustomPowerOn"));
		data.setEnableAutoLockScreen(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableAutoLockScreen"));
		data.setAutoLogin(_ctx.integerValue("GetDeviceConfigsResponse.Data.AutoLogin"));
		data.setCustomIdleAction(_ctx.integerValue("GetDeviceConfigsResponse.Data.CustomIdleAction"));
		data.setIdleTime(_ctx.integerValue("GetDeviceConfigsResponse.Data.IdleTime"));
		data.setScheduledPowerOff(_ctx.stringValue("GetDeviceConfigsResponse.Data.ScheduledPowerOff"));
		data.setEnableScheduledPowerOff(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableScheduledPowerOff"));
		data.setUrcl(_ctx.stringValue("GetDeviceConfigsResponse.Data.Urcl"));
		data.setEnableModifyPassword(_ctx.integerValue("GetDeviceConfigsResponse.Data.EnableModifyPassword"));
		data.setDisplayResolution(_ctx.stringValue("GetDeviceConfigsResponse.Data.DisplayResolution"));
		data.setDisplayScaleRatio(_ctx.stringValue("GetDeviceConfigsResponse.Data.DisplayScaleRatio"));
		data.setDisplayLayout(_ctx.stringValue("GetDeviceConfigsResponse.Data.DisplayLayout"));

		CustomResourcePackage customResourcePackage = new CustomResourcePackage();
		customResourcePackage.setLoginPageLogo(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.LoginPageLogo"));
		customResourcePackage.setLoginPageBackground(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.LoginPageBackground"));
		customResourcePackage.setPersonalCenterLogo(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.PersonalCenterLogo"));
		customResourcePackage.setDesktopWallpaper(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.DesktopWallpaper"));
		customResourcePackage.setStartLogo(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.StartLogo"));
		customResourcePackage.setStartMenuLogo(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.StartMenuLogo"));
		customResourcePackage.setConfigAboutLogo(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.ConfigAboutLogo"));
		customResourcePackage.setUpgradeLogo(_ctx.stringValue("GetDeviceConfigsResponse.Data.CustomResourcePackage.UpgradeLogo"));
		data.setCustomResourcePackage(customResourcePackage);
		getDeviceConfigsResponse.setData(data);
	 
	 	return getDeviceConfigsResponse;
	}
}
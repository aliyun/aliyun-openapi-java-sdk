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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse;
import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse.Devices;
import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse.Devices.ConnectConfigsItem;
import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse.Devices.CustomResourcePackage;
import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse.Devices.EndUserDTO;
import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse.Devices.LabelDTO;
import com.aliyuncs.wyota.model.v20210420.ListDevicesResponse.Devices.PeripheralConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicesResponseUnmarshaller {

	public static ListDevicesResponse unmarshall(ListDevicesResponse listDevicesResponse, UnmarshallerContext _ctx) {
		
		listDevicesResponse.setRequestId(_ctx.stringValue("ListDevicesResponse.RequestId"));
		listDevicesResponse.setTotalCount(_ctx.longValue("ListDevicesResponse.TotalCount"));
		listDevicesResponse.setPageSize(_ctx.integerValue("ListDevicesResponse.PageSize"));
		listDevicesResponse.setMessage(_ctx.stringValue("ListDevicesResponse.Message"));
		listDevicesResponse.setPageNumber(_ctx.integerValue("ListDevicesResponse.PageNumber"));
		listDevicesResponse.setCode(_ctx.stringValue("ListDevicesResponse.Code"));

		List<Devices> data = new ArrayList<Devices>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesResponse.Data.Length"); i++) {
			Devices devices = new Devices();
			devices.setActiveTime(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ActiveTime"));
			devices.setAlias(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Alias"));
			devices.setAutoType(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].AutoType"));
			devices.setBuildId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].BuildId"));
			devices.setClientId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ClientId"));
			devices.setClientType(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ClientType"));
			devices.setId(_ctx.longValue("ListDevicesResponse.Data["+ i +"].Id"));
			devices.setIsActive(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].IsActive"));
			devices.setModel(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Model"));
			devices.setOrderId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].OrderId"));
			devices.setSerialNo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].SerialNo"));
			devices.setSource(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Source"));
			devices.setTenantId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].TenantId"));
			devices.setUuid(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Uuid"));
			devices.setBluetooth(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Bluetooth"));
			devices.setWlan(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Wlan"));
			devices.setEtherMac(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EtherMac"));
			devices.setSecureNetworkType(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].SecureNetworkType"));
			devices.setEnableWlan(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableWlan"));
			devices.setEnableBluetooth(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableBluetooth"));
			devices.setEnableAdb(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableAdb"));
			devices.setGmtSync(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].GmtSync"));
			devices.setDefinePowerButton(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].DefinePowerButton"));
			devices.setEnableLockScreenPassword(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableLockScreenPassword"));
			devices.setSleepTime(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].SleepTime"));
			devices.setAutoLockScreenTime(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].AutoLockScreenTime"));
			devices.setUsbStorage(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].UsbStorage"));
			devices.setLocalUsbPrint(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].LocalUsbPrint"));
			devices.setDeviceLock(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].DeviceLock"));
			devices.setGmtModified(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].GmtModified"));
			devices.setDeviceIpV4(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DeviceIpV4"));
			devices.setDeviceMqttConnectionStatus(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].DeviceMqttConnectionStatus"));
			devices.setLockPassword(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].LockPassword"));
			devices.setEnableUnlockPassword(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableUnlockPassword"));
			devices.setCustomPowerOn(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].CustomPowerOn"));
			devices.setEnableAutoLockScreen(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableAutoLockScreen"));
			devices.setAutoLogin(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].AutoLogin"));
			devices.setCustomIdleAction(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].CustomIdleAction"));
			devices.setIdleTime(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].IdleTime"));
			devices.setScheduledPowerOff(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ScheduledPowerOff"));
			devices.setEnableScheduledPowerOff(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableScheduledPowerOff"));
			devices.setCustomProperty(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomProperty"));
			devices.setLocationInfo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].LocationInfo"));
			devices.setLastLoginUser(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].LastLoginUser"));
			devices.setDevicePlatform(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DevicePlatform"));
			devices.setDeviceOS(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DeviceOS"));
			devices.setDeviceName(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DeviceName"));
			devices.setEnableModifyPassword(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].EnableModifyPassword"));
			devices.setDisplayResolution(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DisplayResolution"));
			devices.setDisplayScaleRatio(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DisplayScaleRatio"));
			devices.setDisplayLayout(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DisplayLayout"));

			PeripheralConfig peripheralConfig = new PeripheralConfig();
			peripheralConfig.setPolicyStrategy(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].PeripheralConfig.PolicyStrategy"));
			peripheralConfig.setUsbStorage(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].PeripheralConfig.UsbStorage"));
			peripheralConfig.setUsbPrinter(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].PeripheralConfig.UsbPrinter"));
			peripheralConfig.setUsbAndInternalCamera(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].PeripheralConfig.UsbAndInternalCamera"));
			peripheralConfig.setDefaultPolicy(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].PeripheralConfig.DefaultPolicy"));
			devices.setPeripheralConfig(peripheralConfig);

			CustomResourcePackage customResourcePackage = new CustomResourcePackage();
			customResourcePackage.setLoginPageLogo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.LoginPageLogo"));
			customResourcePackage.setLoginPageBackground(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.LoginPageBackground"));
			customResourcePackage.setPersonalCenterLogo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.PersonalCenterLogo"));
			customResourcePackage.setDesktopWallpaper(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.DesktopWallpaper"));
			customResourcePackage.setStartLogo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.StartLogo"));
			customResourcePackage.setStartMenuLogo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.StartMenuLogo"));
			customResourcePackage.setConfigAboutLogo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.ConfigAboutLogo"));
			customResourcePackage.setUpgradeLogo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CustomResourcePackage.UpgradeLogo"));
			devices.setCustomResourcePackage(customResourcePackage);

			List<EndUserDTO> endUserList = new ArrayList<EndUserDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListDevicesResponse.Data["+ i +"].EndUserList.Length"); j++) {
				EndUserDTO endUserDTO = new EndUserDTO();
				endUserDTO.setEndUserId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].EndUserId"));
				endUserDTO.setId(_ctx.longValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].Id"));
				endUserDTO.setSerialNo(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].SerialNo"));
				endUserDTO.setTenantId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].TenantId"));
				endUserDTO.setBindTime(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].BindTime"));
				endUserDTO.setAdDomain(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].AdDomain"));
				endUserDTO.setUserType(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].UserType"));
				endUserDTO.setDirectoryId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].EndUserList["+ j +"].DirectoryId"));

				endUserList.add(endUserDTO);
			}
			devices.setEndUserList(endUserList);

			List<LabelDTO> labelList = new ArrayList<LabelDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListDevicesResponse.Data["+ i +"].LabelList.Length"); j++) {
				LabelDTO labelDTO = new LabelDTO();
				labelDTO.setContent(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].LabelList["+ j +"].Content"));
				labelDTO.setGmtCreate(_ctx.longValue("ListDevicesResponse.Data["+ i +"].LabelList["+ j +"].GmtCreate"));
				labelDTO.setGmtModified(_ctx.longValue("ListDevicesResponse.Data["+ i +"].LabelList["+ j +"].GmtModified"));
				labelDTO.setLabelId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].LabelList["+ j +"].LabelId"));
				labelDTO.setTenantId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].LabelList["+ j +"].TenantId"));

				labelList.add(labelDTO);
			}
			devices.setLabelList(labelList);

			List<ConnectConfigsItem> connectConfigs = new ArrayList<ConnectConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDevicesResponse.Data["+ i +"].ConnectConfigs.Length"); j++) {
				ConnectConfigsItem connectConfigsItem = new ConnectConfigsItem();
				connectConfigsItem.setPeripheralVid(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ConnectConfigs["+ j +"].PeripheralVid"));
				connectConfigsItem.setPeripheralPid(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ConnectConfigs["+ j +"].PeripheralPid"));
				connectConfigsItem.setRedirectPolicy(_ctx.integerValue("ListDevicesResponse.Data["+ i +"].ConnectConfigs["+ j +"].RedirectPolicy"));
				connectConfigsItem.setConnectScript(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].ConnectConfigs["+ j +"].ConnectScript"));

				connectConfigs.add(connectConfigsItem);
			}
			devices.setConnectConfigs(connectConfigs);

			data.add(devices);
		}
		listDevicesResponse.setData(data);
	 
	 	return listDevicesResponse;
	}
}
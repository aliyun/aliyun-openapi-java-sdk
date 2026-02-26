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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.GetDeviceConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceConfigsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String uuid;

		private String serialNo;

		private String userCustomId;

		private String secureNetworkType;

		private Integer enableWlan;

		private Integer enableBluetooth;

		private Integer enableAdb;

		private Integer definePowerButton;

		private Integer enableLockScreenPassword;

		private Integer autoLockScreenTime;

		private Integer sleepTime;

		private Integer usbStorage;

		private Integer localUsbPrint;

		private Integer deviceLock;

		private String lockPassword;

		private Integer autoUpdate;

		private Integer enableUnlockPassword;

		private Integer customPowerOn;

		private Integer enableAutoLockScreen;

		private Integer autoLogin;

		private Integer customIdleAction;

		private Integer idleTime;

		private String scheduledPowerOff;

		private Integer enableScheduledPowerOff;

		private String urcl;

		private Integer enableModifyPassword;

		private String displayResolution;

		private String displayScaleRatio;

		private String displayLayout;

		private CustomResourcePackage customResourcePackage;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getSerialNo() {
			return this.serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getUserCustomId() {
			return this.userCustomId;
		}

		public void setUserCustomId(String userCustomId) {
			this.userCustomId = userCustomId;
		}

		public String getSecureNetworkType() {
			return this.secureNetworkType;
		}

		public void setSecureNetworkType(String secureNetworkType) {
			this.secureNetworkType = secureNetworkType;
		}

		public Integer getEnableWlan() {
			return this.enableWlan;
		}

		public void setEnableWlan(Integer enableWlan) {
			this.enableWlan = enableWlan;
		}

		public Integer getEnableBluetooth() {
			return this.enableBluetooth;
		}

		public void setEnableBluetooth(Integer enableBluetooth) {
			this.enableBluetooth = enableBluetooth;
		}

		public Integer getEnableAdb() {
			return this.enableAdb;
		}

		public void setEnableAdb(Integer enableAdb) {
			this.enableAdb = enableAdb;
		}

		public Integer getDefinePowerButton() {
			return this.definePowerButton;
		}

		public void setDefinePowerButton(Integer definePowerButton) {
			this.definePowerButton = definePowerButton;
		}

		public Integer getEnableLockScreenPassword() {
			return this.enableLockScreenPassword;
		}

		public void setEnableLockScreenPassword(Integer enableLockScreenPassword) {
			this.enableLockScreenPassword = enableLockScreenPassword;
		}

		public Integer getAutoLockScreenTime() {
			return this.autoLockScreenTime;
		}

		public void setAutoLockScreenTime(Integer autoLockScreenTime) {
			this.autoLockScreenTime = autoLockScreenTime;
		}

		public Integer getSleepTime() {
			return this.sleepTime;
		}

		public void setSleepTime(Integer sleepTime) {
			this.sleepTime = sleepTime;
		}

		public Integer getUsbStorage() {
			return this.usbStorage;
		}

		public void setUsbStorage(Integer usbStorage) {
			this.usbStorage = usbStorage;
		}

		public Integer getLocalUsbPrint() {
			return this.localUsbPrint;
		}

		public void setLocalUsbPrint(Integer localUsbPrint) {
			this.localUsbPrint = localUsbPrint;
		}

		public Integer getDeviceLock() {
			return this.deviceLock;
		}

		public void setDeviceLock(Integer deviceLock) {
			this.deviceLock = deviceLock;
		}

		public String getLockPassword() {
			return this.lockPassword;
		}

		public void setLockPassword(String lockPassword) {
			this.lockPassword = lockPassword;
		}

		public Integer getAutoUpdate() {
			return this.autoUpdate;
		}

		public void setAutoUpdate(Integer autoUpdate) {
			this.autoUpdate = autoUpdate;
		}

		public Integer getEnableUnlockPassword() {
			return this.enableUnlockPassword;
		}

		public void setEnableUnlockPassword(Integer enableUnlockPassword) {
			this.enableUnlockPassword = enableUnlockPassword;
		}

		public Integer getCustomPowerOn() {
			return this.customPowerOn;
		}

		public void setCustomPowerOn(Integer customPowerOn) {
			this.customPowerOn = customPowerOn;
		}

		public Integer getEnableAutoLockScreen() {
			return this.enableAutoLockScreen;
		}

		public void setEnableAutoLockScreen(Integer enableAutoLockScreen) {
			this.enableAutoLockScreen = enableAutoLockScreen;
		}

		public Integer getAutoLogin() {
			return this.autoLogin;
		}

		public void setAutoLogin(Integer autoLogin) {
			this.autoLogin = autoLogin;
		}

		public Integer getCustomIdleAction() {
			return this.customIdleAction;
		}

		public void setCustomIdleAction(Integer customIdleAction) {
			this.customIdleAction = customIdleAction;
		}

		public Integer getIdleTime() {
			return this.idleTime;
		}

		public void setIdleTime(Integer idleTime) {
			this.idleTime = idleTime;
		}

		public String getScheduledPowerOff() {
			return this.scheduledPowerOff;
		}

		public void setScheduledPowerOff(String scheduledPowerOff) {
			this.scheduledPowerOff = scheduledPowerOff;
		}

		public Integer getEnableScheduledPowerOff() {
			return this.enableScheduledPowerOff;
		}

		public void setEnableScheduledPowerOff(Integer enableScheduledPowerOff) {
			this.enableScheduledPowerOff = enableScheduledPowerOff;
		}

		public String getUrcl() {
			return this.urcl;
		}

		public void setUrcl(String urcl) {
			this.urcl = urcl;
		}

		public Integer getEnableModifyPassword() {
			return this.enableModifyPassword;
		}

		public void setEnableModifyPassword(Integer enableModifyPassword) {
			this.enableModifyPassword = enableModifyPassword;
		}

		public String getDisplayResolution() {
			return this.displayResolution;
		}

		public void setDisplayResolution(String displayResolution) {
			this.displayResolution = displayResolution;
		}

		public String getDisplayScaleRatio() {
			return this.displayScaleRatio;
		}

		public void setDisplayScaleRatio(String displayScaleRatio) {
			this.displayScaleRatio = displayScaleRatio;
		}

		public String getDisplayLayout() {
			return this.displayLayout;
		}

		public void setDisplayLayout(String displayLayout) {
			this.displayLayout = displayLayout;
		}

		public CustomResourcePackage getCustomResourcePackage() {
			return this.customResourcePackage;
		}

		public void setCustomResourcePackage(CustomResourcePackage customResourcePackage) {
			this.customResourcePackage = customResourcePackage;
		}

		public static class CustomResourcePackage {

			private String loginPageLogo;

			private String loginPageBackground;

			private String personalCenterLogo;

			private String desktopWallpaper;

			private String startLogo;

			private String startMenuLogo;

			private String configAboutLogo;

			private String upgradeLogo;

			public String getLoginPageLogo() {
				return this.loginPageLogo;
			}

			public void setLoginPageLogo(String loginPageLogo) {
				this.loginPageLogo = loginPageLogo;
			}

			public String getLoginPageBackground() {
				return this.loginPageBackground;
			}

			public void setLoginPageBackground(String loginPageBackground) {
				this.loginPageBackground = loginPageBackground;
			}

			public String getPersonalCenterLogo() {
				return this.personalCenterLogo;
			}

			public void setPersonalCenterLogo(String personalCenterLogo) {
				this.personalCenterLogo = personalCenterLogo;
			}

			public String getDesktopWallpaper() {
				return this.desktopWallpaper;
			}

			public void setDesktopWallpaper(String desktopWallpaper) {
				this.desktopWallpaper = desktopWallpaper;
			}

			public String getStartLogo() {
				return this.startLogo;
			}

			public void setStartLogo(String startLogo) {
				this.startLogo = startLogo;
			}

			public String getStartMenuLogo() {
				return this.startMenuLogo;
			}

			public void setStartMenuLogo(String startMenuLogo) {
				this.startMenuLogo = startMenuLogo;
			}

			public String getConfigAboutLogo() {
				return this.configAboutLogo;
			}

			public void setConfigAboutLogo(String configAboutLogo) {
				this.configAboutLogo = configAboutLogo;
			}

			public String getUpgradeLogo() {
				return this.upgradeLogo;
			}

			public void setUpgradeLogo(String upgradeLogo) {
				this.upgradeLogo = upgradeLogo;
			}
		}
	}

	@Override
	public GetDeviceConfigsResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

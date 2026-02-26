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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.ListDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevicesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Integer pageSize;

	private String message;

	private Integer pageNumber;

	private String code;

	private List<Devices> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Devices> getData() {
		return this.data;
	}

	public void setData(List<Devices> data) {
		this.data = data;
	}

	public static class Devices {

		private String activeTime;

		private String alias;

		private String autoType;

		private String buildId;

		private String clientId;

		private String clientType;

		private Long id;

		private String isActive;

		private String model;

		private String orderId;

		private String serialNo;

		private String source;

		private String tenantId;

		private String uuid;

		private String bluetooth;

		private String wlan;

		private String etherMac;

		private String secureNetworkType;

		private Integer enableWlan;

		private Integer enableBluetooth;

		private Integer enableAdb;

		private String gmtSync;

		private Integer definePowerButton;

		private Integer enableLockScreenPassword;

		private Integer sleepTime;

		private Integer autoLockScreenTime;

		private Integer usbStorage;

		private Integer localUsbPrint;

		private Integer deviceLock;

		private String gmtModified;

		private String deviceIpV4;

		private Integer deviceMqttConnectionStatus;

		private String lockPassword;

		private Integer enableUnlockPassword;

		private Integer customPowerOn;

		private Integer enableAutoLockScreen;

		private Integer autoLogin;

		private Integer customIdleAction;

		private Integer idleTime;

		private String scheduledPowerOff;

		private Integer enableScheduledPowerOff;

		private String customProperty;

		private String locationInfo;

		private String lastLoginUser;

		private String devicePlatform;

		private String deviceOS;

		private String deviceName;

		private Integer enableModifyPassword;

		private String displayResolution;

		private String displayScaleRatio;

		private String displayLayout;

		private List<EndUserDTO> endUserList;

		private List<LabelDTO> labelList;

		private List<ConnectConfigsItem> connectConfigs;

		private PeripheralConfig peripheralConfig;

		private CustomResourcePackage customResourcePackage;

		public String getActiveTime() {
			return this.activeTime;
		}

		public void setActiveTime(String activeTime) {
			this.activeTime = activeTime;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getAutoType() {
			return this.autoType;
		}

		public void setAutoType(String autoType) {
			this.autoType = autoType;
		}

		public String getBuildId() {
			return this.buildId;
		}

		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIsActive() {
			return this.isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getSerialNo() {
			return this.serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getBluetooth() {
			return this.bluetooth;
		}

		public void setBluetooth(String bluetooth) {
			this.bluetooth = bluetooth;
		}

		public String getWlan() {
			return this.wlan;
		}

		public void setWlan(String wlan) {
			this.wlan = wlan;
		}

		public String getEtherMac() {
			return this.etherMac;
		}

		public void setEtherMac(String etherMac) {
			this.etherMac = etherMac;
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

		public String getGmtSync() {
			return this.gmtSync;
		}

		public void setGmtSync(String gmtSync) {
			this.gmtSync = gmtSync;
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

		public Integer getSleepTime() {
			return this.sleepTime;
		}

		public void setSleepTime(Integer sleepTime) {
			this.sleepTime = sleepTime;
		}

		public Integer getAutoLockScreenTime() {
			return this.autoLockScreenTime;
		}

		public void setAutoLockScreenTime(Integer autoLockScreenTime) {
			this.autoLockScreenTime = autoLockScreenTime;
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

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDeviceIpV4() {
			return this.deviceIpV4;
		}

		public void setDeviceIpV4(String deviceIpV4) {
			this.deviceIpV4 = deviceIpV4;
		}

		public Integer getDeviceMqttConnectionStatus() {
			return this.deviceMqttConnectionStatus;
		}

		public void setDeviceMqttConnectionStatus(Integer deviceMqttConnectionStatus) {
			this.deviceMqttConnectionStatus = deviceMqttConnectionStatus;
		}

		public String getLockPassword() {
			return this.lockPassword;
		}

		public void setLockPassword(String lockPassword) {
			this.lockPassword = lockPassword;
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

		public String getCustomProperty() {
			return this.customProperty;
		}

		public void setCustomProperty(String customProperty) {
			this.customProperty = customProperty;
		}

		public String getLocationInfo() {
			return this.locationInfo;
		}

		public void setLocationInfo(String locationInfo) {
			this.locationInfo = locationInfo;
		}

		public String getLastLoginUser() {
			return this.lastLoginUser;
		}

		public void setLastLoginUser(String lastLoginUser) {
			this.lastLoginUser = lastLoginUser;
		}

		public String getDevicePlatform() {
			return this.devicePlatform;
		}

		public void setDevicePlatform(String devicePlatform) {
			this.devicePlatform = devicePlatform;
		}

		public String getDeviceOS() {
			return this.deviceOS;
		}

		public void setDeviceOS(String deviceOS) {
			this.deviceOS = deviceOS;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
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

		public List<EndUserDTO> getEndUserList() {
			return this.endUserList;
		}

		public void setEndUserList(List<EndUserDTO> endUserList) {
			this.endUserList = endUserList;
		}

		public List<LabelDTO> getLabelList() {
			return this.labelList;
		}

		public void setLabelList(List<LabelDTO> labelList) {
			this.labelList = labelList;
		}

		public List<ConnectConfigsItem> getConnectConfigs() {
			return this.connectConfigs;
		}

		public void setConnectConfigs(List<ConnectConfigsItem> connectConfigs) {
			this.connectConfigs = connectConfigs;
		}

		public PeripheralConfig getPeripheralConfig() {
			return this.peripheralConfig;
		}

		public void setPeripheralConfig(PeripheralConfig peripheralConfig) {
			this.peripheralConfig = peripheralConfig;
		}

		public CustomResourcePackage getCustomResourcePackage() {
			return this.customResourcePackage;
		}

		public void setCustomResourcePackage(CustomResourcePackage customResourcePackage) {
			this.customResourcePackage = customResourcePackage;
		}

		public static class EndUserDTO {

			private String endUserId;

			private Long id;

			private String serialNo;

			private String tenantId;

			private String bindTime;

			private String adDomain;

			private String userType;

			private String directoryId;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getSerialNo() {
				return this.serialNo;
			}

			public void setSerialNo(String serialNo) {
				this.serialNo = serialNo;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getBindTime() {
				return this.bindTime;
			}

			public void setBindTime(String bindTime) {
				this.bindTime = bindTime;
			}

			public String getAdDomain() {
				return this.adDomain;
			}

			public void setAdDomain(String adDomain) {
				this.adDomain = adDomain;
			}

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

			public String getDirectoryId() {
				return this.directoryId;
			}

			public void setDirectoryId(String directoryId) {
				this.directoryId = directoryId;
			}
		}

		public static class LabelDTO {

			private String content;

			private Long gmtCreate;

			private Long gmtModified;

			private String labelId;

			private String tenantId;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getLabelId() {
				return this.labelId;
			}

			public void setLabelId(String labelId) {
				this.labelId = labelId;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}
		}

		public static class ConnectConfigsItem {

			private String peripheralVid;

			private String peripheralPid;

			private Integer redirectPolicy;

			private String connectScript;

			public String getPeripheralVid() {
				return this.peripheralVid;
			}

			public void setPeripheralVid(String peripheralVid) {
				this.peripheralVid = peripheralVid;
			}

			public String getPeripheralPid() {
				return this.peripheralPid;
			}

			public void setPeripheralPid(String peripheralPid) {
				this.peripheralPid = peripheralPid;
			}

			public Integer getRedirectPolicy() {
				return this.redirectPolicy;
			}

			public void setRedirectPolicy(Integer redirectPolicy) {
				this.redirectPolicy = redirectPolicy;
			}

			public String getConnectScript() {
				return this.connectScript;
			}

			public void setConnectScript(String connectScript) {
				this.connectScript = connectScript;
			}
		}

		public static class PeripheralConfig {

			private Integer policyStrategy;

			private Integer usbStorage;

			private Integer usbPrinter;

			private Integer usbAndInternalCamera;

			private Integer defaultPolicy;

			public Integer getPolicyStrategy() {
				return this.policyStrategy;
			}

			public void setPolicyStrategy(Integer policyStrategy) {
				this.policyStrategy = policyStrategy;
			}

			public Integer getUsbStorage() {
				return this.usbStorage;
			}

			public void setUsbStorage(Integer usbStorage) {
				this.usbStorage = usbStorage;
			}

			public Integer getUsbPrinter() {
				return this.usbPrinter;
			}

			public void setUsbPrinter(Integer usbPrinter) {
				this.usbPrinter = usbPrinter;
			}

			public Integer getUsbAndInternalCamera() {
				return this.usbAndInternalCamera;
			}

			public void setUsbAndInternalCamera(Integer usbAndInternalCamera) {
				this.usbAndInternalCamera = usbAndInternalCamera;
			}

			public Integer getDefaultPolicy() {
				return this.defaultPolicy;
			}

			public void setDefaultPolicy(Integer defaultPolicy) {
				this.defaultPolicy = defaultPolicy;
			}
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
	public ListDevicesResponse getInstance(UnmarshallerContext context) {
		return	ListDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

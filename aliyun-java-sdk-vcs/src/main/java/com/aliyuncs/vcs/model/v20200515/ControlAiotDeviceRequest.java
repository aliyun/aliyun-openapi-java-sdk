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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ControlAiotDeviceRequest extends RpcAcsRequest<ControlAiotDeviceResponse> {
	   

	private String checkEnabled;

	private String superPassword;

	private String identityNumber;

	private String associatedVerificationEnable;

	private MiFareCard miFareCard;

	private Long associatedPort;

	private String id;

	private String doubleVerificationGroupEnabled;

	private String upgradeFileURL;

	private Long gateCtlStatus;

	private Long commandType;

	private String associatedDeviceId;

	private String associatedIPAddr;

	private String name;

	private String rebootDevice;

	private Long barrierCommand;

	private Long singleInterval;
	public ControlAiotDeviceRequest() {
		super("Vcs", "2020-05-15", "ControlAiotDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCheckEnabled() {
		return this.checkEnabled;
	}

	public void setCheckEnabled(String checkEnabled) {
		this.checkEnabled = checkEnabled;
		if(checkEnabled != null){
			putBodyParameter("CheckEnabled", checkEnabled);
		}
	}

	public String getSuperPassword() {
		return this.superPassword;
	}

	public void setSuperPassword(String superPassword) {
		this.superPassword = superPassword;
		if(superPassword != null){
			putBodyParameter("SuperPassword", superPassword);
		}
	}

	public String getIdentityNumber() {
		return this.identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
		if(identityNumber != null){
			putBodyParameter("IdentityNumber", identityNumber);
		}
	}

	public String getAssociatedVerificationEnable() {
		return this.associatedVerificationEnable;
	}

	public void setAssociatedVerificationEnable(String associatedVerificationEnable) {
		this.associatedVerificationEnable = associatedVerificationEnable;
		if(associatedVerificationEnable != null){
			putBodyParameter("AssociatedVerificationEnable", associatedVerificationEnable);
		}
	}

	public MiFareCard getMiFareCard() {
		return this.miFareCard;
	}

	public void setMiFareCard(MiFareCard miFareCard) {
		this.miFareCard = miFareCard;	
		if (miFareCard != null) {
			
				putBodyParameter("MiFareCard.SecretKey" , miFareCard.getSecretKey());
				putBodyParameter("MiFareCard.AreaDeviate" , miFareCard.getAreaDeviate());
				putBodyParameter("MiFareCard.AreaLen" , miFareCard.getAreaLen());
				putBodyParameter("MiFareCard.KeyType" , miFareCard.getKeyType());
				putBodyParameter("MiFareCard.LastChange" , miFareCard.getLastChange());
				putBodyParameter("MiFareCard.AreaCode" , miFareCard.getAreaCode());
				putBodyParameter("MiFareCard.Enabled" , miFareCard.getEnabled());
		}	
	}

	public Long getAssociatedPort() {
		return this.associatedPort;
	}

	public void setAssociatedPort(Long associatedPort) {
		this.associatedPort = associatedPort;
		if(associatedPort != null){
			putBodyParameter("AssociatedPort", associatedPort.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getDoubleVerificationGroupEnabled() {
		return this.doubleVerificationGroupEnabled;
	}

	public void setDoubleVerificationGroupEnabled(String doubleVerificationGroupEnabled) {
		this.doubleVerificationGroupEnabled = doubleVerificationGroupEnabled;
		if(doubleVerificationGroupEnabled != null){
			putBodyParameter("DoubleVerificationGroupEnabled", doubleVerificationGroupEnabled);
		}
	}

	public String getUpgradeFileURL() {
		return this.upgradeFileURL;
	}

	public void setUpgradeFileURL(String upgradeFileURL) {
		this.upgradeFileURL = upgradeFileURL;
		if(upgradeFileURL != null){
			putBodyParameter("UpgradeFileURL", upgradeFileURL);
		}
	}

	public Long getGateCtlStatus() {
		return this.gateCtlStatus;
	}

	public void setGateCtlStatus(Long gateCtlStatus) {
		this.gateCtlStatus = gateCtlStatus;
		if(gateCtlStatus != null){
			putBodyParameter("GateCtlStatus", gateCtlStatus.toString());
		}
	}

	public Long getCommandType() {
		return this.commandType;
	}

	public void setCommandType(Long commandType) {
		this.commandType = commandType;
		if(commandType != null){
			putBodyParameter("CommandType", commandType.toString());
		}
	}

	public String getAssociatedDeviceId() {
		return this.associatedDeviceId;
	}

	public void setAssociatedDeviceId(String associatedDeviceId) {
		this.associatedDeviceId = associatedDeviceId;
		if(associatedDeviceId != null){
			putBodyParameter("AssociatedDeviceId", associatedDeviceId);
		}
	}

	public String getAssociatedIPAddr() {
		return this.associatedIPAddr;
	}

	public void setAssociatedIPAddr(String associatedIPAddr) {
		this.associatedIPAddr = associatedIPAddr;
		if(associatedIPAddr != null){
			putBodyParameter("AssociatedIPAddr", associatedIPAddr);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getRebootDevice() {
		return this.rebootDevice;
	}

	public void setRebootDevice(String rebootDevice) {
		this.rebootDevice = rebootDevice;
		if(rebootDevice != null){
			putBodyParameter("RebootDevice", rebootDevice);
		}
	}

	public Long getBarrierCommand() {
		return this.barrierCommand;
	}

	public void setBarrierCommand(Long barrierCommand) {
		this.barrierCommand = barrierCommand;
		if(barrierCommand != null){
			putBodyParameter("BarrierCommand", barrierCommand.toString());
		}
	}

	public Long getSingleInterval() {
		return this.singleInterval;
	}

	public void setSingleInterval(Long singleInterval) {
		this.singleInterval = singleInterval;
		if(singleInterval != null){
			putBodyParameter("SingleInterval", singleInterval.toString());
		}
	}

	public static class MiFareCard {

		private String secretKey;

		private Long areaDeviate;

		private Long areaLen;

		private Long keyType;

		private String lastChange;

		private Long areaCode;

		private String enabled;

		public String getSecretKey() {
			return this.secretKey;
		}

		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}

		public Long getAreaDeviate() {
			return this.areaDeviate;
		}

		public void setAreaDeviate(Long areaDeviate) {
			this.areaDeviate = areaDeviate;
		}

		public Long getAreaLen() {
			return this.areaLen;
		}

		public void setAreaLen(Long areaLen) {
			this.areaLen = areaLen;
		}

		public Long getKeyType() {
			return this.keyType;
		}

		public void setKeyType(Long keyType) {
			this.keyType = keyType;
		}

		public String getLastChange() {
			return this.lastChange;
		}

		public void setLastChange(String lastChange) {
			this.lastChange = lastChange;
		}

		public Long getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(Long areaCode) {
			this.areaCode = areaCode;
		}

		public String getEnabled() {
			return this.enabled;
		}

		public void setEnabled(String enabled) {
			this.enabled = enabled;
		}
	}

	@Override
	public Class<ControlAiotDeviceResponse> getResponseClass() {
		return ControlAiotDeviceResponse.class;
	}

}

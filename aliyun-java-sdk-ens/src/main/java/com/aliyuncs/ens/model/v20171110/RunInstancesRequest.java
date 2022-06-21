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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RunInstancesRequest extends RpcAcsRequest<RunInstancesResponse> {
	   

	private String scheduleAreaLevel;

	private Boolean uniqueSuffix;

	private String securityId;

	private String keyPairName;

	private String password;

	private String hostName;

	@SerializedName("systemDisk")
	private SystemDisk systemDisk;

	private String netDistrictCode;

	private String ensRegionId;

	private Long period;

	private Boolean publicIpIdentification;

	private String vSwitchId;

	private String privateIpAddress;

	private String periodUnit;

	private String instanceName;

	private Boolean autoRenew;

	private String internetChargeType;

	private String netWorkId;

	private String schedulingPriceStrategy;

	private String imageId;

	private Long internetMaxBandwidthOut;

	private String userData;

	private String instanceType;

	private String instanceChargeType;

	private Long amount;

	@SerializedName("dataDisk")
	private List<DataDisk> dataDisk;

	private String schedulingStrategy;

	private String carrier;
	public RunInstancesRequest() {
		super("Ens", "2017-11-10", "RunInstances", "ens");
		setMethod(MethodType.POST);
	}

	public String getScheduleAreaLevel() {
		return this.scheduleAreaLevel;
	}

	public void setScheduleAreaLevel(String scheduleAreaLevel) {
		this.scheduleAreaLevel = scheduleAreaLevel;
		if(scheduleAreaLevel != null){
			putQueryParameter("ScheduleAreaLevel", scheduleAreaLevel);
		}
	}

	public Boolean getUniqueSuffix() {
		return this.uniqueSuffix;
	}

	public void setUniqueSuffix(Boolean uniqueSuffix) {
		this.uniqueSuffix = uniqueSuffix;
		if(uniqueSuffix != null){
			putQueryParameter("UniqueSuffix", uniqueSuffix.toString());
		}
	}

	public String getSecurityId() {
		return this.securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
		if(securityId != null){
			putQueryParameter("SecurityId", securityId);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public SystemDisk getSystemDisk() {
		return this.systemDisk;
	}

	public void setSystemDisk(SystemDisk systemDisk) {
		this.systemDisk = systemDisk;	
		if (systemDisk != null) {
			putQueryParameter("SystemDisk" , new Gson().toJson(systemDisk));
		}	
	}

	public String getNetDistrictCode() {
		return this.netDistrictCode;
	}

	public void setNetDistrictCode(String netDistrictCode) {
		this.netDistrictCode = netDistrictCode;
		if(netDistrictCode != null){
			putQueryParameter("NetDistrictCode", netDistrictCode);
		}
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public Long getPeriod() {
		return this.period;
	}

	public void setPeriod(Long period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getPublicIpIdentification() {
		return this.publicIpIdentification;
	}

	public void setPublicIpIdentification(Boolean publicIpIdentification) {
		this.publicIpIdentification = publicIpIdentification;
		if(publicIpIdentification != null){
			putQueryParameter("PublicIpIdentification", publicIpIdentification.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getNetWorkId() {
		return this.netWorkId;
	}

	public void setNetWorkId(String netWorkId) {
		this.netWorkId = netWorkId;
		if(netWorkId != null){
			putQueryParameter("NetWorkId", netWorkId);
		}
	}

	public String getSchedulingPriceStrategy() {
		return this.schedulingPriceStrategy;
	}

	public void setSchedulingPriceStrategy(String schedulingPriceStrategy) {
		this.schedulingPriceStrategy = schedulingPriceStrategy;
		if(schedulingPriceStrategy != null){
			putQueryParameter("SchedulingPriceStrategy", schedulingPriceStrategy);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public Long getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public List<DataDisk> getDataDisk() {
		return this.dataDisk;
	}

	public void setDataDisk(List<DataDisk> dataDisk) {
		this.dataDisk = dataDisk;	
		if (dataDisk != null) {
			putQueryParameter("DataDisk" , new Gson().toJson(dataDisk));
		}	
	}

	public String getSchedulingStrategy() {
		return this.schedulingStrategy;
	}

	public void setSchedulingStrategy(String schedulingStrategy) {
		this.schedulingStrategy = schedulingStrategy;
		if(schedulingStrategy != null){
			putQueryParameter("SchedulingStrategy", schedulingStrategy);
		}
	}

	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
		if(carrier != null){
			putQueryParameter("Carrier", carrier);
		}
	}

	public static class SystemDisk {

		@SerializedName("Size")
		private Long size;

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}
	}

	public static class DataDisk {

		@SerializedName("Size")
		private Long size;

		@SerializedName("Category")
		private String category;

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public Class<RunInstancesResponse> getResponseClass() {
		return RunInstancesResponse.class;
	}

}

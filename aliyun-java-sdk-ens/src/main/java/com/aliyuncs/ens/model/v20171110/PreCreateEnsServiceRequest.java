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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PreCreateEnsServiceRequest extends RpcAcsRequest<PreCreateEnsServiceResponse> {
	   

	private String bandwidthType;

	private String keyPairName;

	private String password;

	private String buyResourcesDetail;

	private String systemDiskSize;

	private String instanceBandwithdLimit;

	private String ensServiceName;

	private String netLevel;

	private String dataDiskSize;

	private String schedulingPriceStrategy;

	private String imageId;

	private String instanceSpec;

	private String userData;

	private String schedulingStrategy;
	public PreCreateEnsServiceRequest() {
		super("Ens", "2017-11-10", "PreCreateEnsService");
		setMethod(MethodType.POST);
	}

	public String getBandwidthType() {
		return this.bandwidthType;
	}

	public void setBandwidthType(String bandwidthType) {
		this.bandwidthType = bandwidthType;
		if(bandwidthType != null){
			putQueryParameter("BandwidthType", bandwidthType);
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

	public String getBuyResourcesDetail() {
		return this.buyResourcesDetail;
	}

	public void setBuyResourcesDetail(String buyResourcesDetail) {
		this.buyResourcesDetail = buyResourcesDetail;
		if(buyResourcesDetail != null){
			putQueryParameter("BuyResourcesDetail", buyResourcesDetail);
		}
	}

	public String getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(String systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize);
		}
	}

	public String getInstanceBandwithdLimit() {
		return this.instanceBandwithdLimit;
	}

	public void setInstanceBandwithdLimit(String instanceBandwithdLimit) {
		this.instanceBandwithdLimit = instanceBandwithdLimit;
		if(instanceBandwithdLimit != null){
			putQueryParameter("InstanceBandwithdLimit", instanceBandwithdLimit);
		}
	}

	public String getEnsServiceName() {
		return this.ensServiceName;
	}

	public void setEnsServiceName(String ensServiceName) {
		this.ensServiceName = ensServiceName;
		if(ensServiceName != null){
			putQueryParameter("EnsServiceName", ensServiceName);
		}
	}

	public String getNetLevel() {
		return this.netLevel;
	}

	public void setNetLevel(String netLevel) {
		this.netLevel = netLevel;
		if(netLevel != null){
			putQueryParameter("NetLevel", netLevel);
		}
	}

	public String getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(String dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
		if(dataDiskSize != null){
			putQueryParameter("DataDiskSize", dataDiskSize);
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

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
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

	public String getSchedulingStrategy() {
		return this.schedulingStrategy;
	}

	public void setSchedulingStrategy(String schedulingStrategy) {
		this.schedulingStrategy = schedulingStrategy;
		if(schedulingStrategy != null){
			putQueryParameter("SchedulingStrategy", schedulingStrategy);
		}
	}

	@Override
	public Class<PreCreateEnsServiceResponse> getResponseClass() {
		return PreCreateEnsServiceResponse.class;
	}

}

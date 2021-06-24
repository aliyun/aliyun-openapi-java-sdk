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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateCloudBoxSkuRequest extends RpcAcsRequest<OpsCreateCloudBoxSkuResponse> {
	   

	private String clientToken;

	private Float maxBlockStorage;

	private String description;

	private List<InstanceType> instanceTypes;

	private Float height;

	private String cloudBoxSkuId;

	private String bandwidth;

	private Float length;

	private Float weight;

	private Float minBlockStorage;

	private String bizType;

	private Float width;

	private Float powerConsumption;

	private String skuType;

	private String auditParamStr;
	public OpsCreateCloudBoxSkuRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateCloudBoxSku", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Float getMaxBlockStorage() {
		return this.maxBlockStorage;
	}

	public void setMaxBlockStorage(Float maxBlockStorage) {
		this.maxBlockStorage = maxBlockStorage;
		if(maxBlockStorage != null){
			putQueryParameter("MaxBlockStorage", maxBlockStorage.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;	
		if (instanceTypes != null) {
			for (int depth1 = 0; depth1 < instanceTypes.size(); depth1++) {
				putQueryParameter("InstanceType." + (depth1 + 1) + ".Name" , instanceTypes.get(depth1).getName());
				putQueryParameter("InstanceType." + (depth1 + 1) + ".Count" , instanceTypes.get(depth1).getCount());
				putQueryParameter("InstanceType." + (depth1 + 1) + ".Family" , instanceTypes.get(depth1).getFamily());
			}
		}	
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height.toString());
		}
	}

	public String getCloudBoxSkuId() {
		return this.cloudBoxSkuId;
	}

	public void setCloudBoxSkuId(String cloudBoxSkuId) {
		this.cloudBoxSkuId = cloudBoxSkuId;
		if(cloudBoxSkuId != null){
			putQueryParameter("CloudBoxSkuId", cloudBoxSkuId);
		}
	}

	public String getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth);
		}
	}

	public Float getLength() {
		return this.length;
	}

	public void setLength(Float length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length.toString());
		}
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
		if(weight != null){
			putQueryParameter("Weight", weight.toString());
		}
	}

	public Float getMinBlockStorage() {
		return this.minBlockStorage;
	}

	public void setMinBlockStorage(Float minBlockStorage) {
		this.minBlockStorage = minBlockStorage;
		if(minBlockStorage != null){
			putQueryParameter("MinBlockStorage", minBlockStorage.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Float getWidth() {
		return this.width;
	}

	public void setWidth(Float width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width.toString());
		}
	}

	public Float getPowerConsumption() {
		return this.powerConsumption;
	}

	public void setPowerConsumption(Float powerConsumption) {
		this.powerConsumption = powerConsumption;
		if(powerConsumption != null){
			putQueryParameter("PowerConsumption", powerConsumption.toString());
		}
	}

	public String getSkuType() {
		return this.skuType;
	}

	public void setSkuType(String skuType) {
		this.skuType = skuType;
		if(skuType != null){
			putQueryParameter("SkuType", skuType);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class InstanceType {

		private String name;

		private Integer count;

		private String family;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getFamily() {
			return this.family;
		}

		public void setFamily(String family) {
			this.family = family;
		}
	}

	@Override
	public Class<OpsCreateCloudBoxSkuResponse> getResponseClass() {
		return OpsCreateCloudBoxSkuResponse.class;
	}

}

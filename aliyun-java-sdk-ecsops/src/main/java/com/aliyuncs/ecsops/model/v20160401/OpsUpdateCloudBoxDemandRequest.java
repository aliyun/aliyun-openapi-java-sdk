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
public class OpsUpdateCloudBoxDemandRequest extends RpcAcsRequest<OpsUpdateCloudBoxDemandResponse> {
	   

	private Integer duration;

	private Long aliUid;

	private String cloudBoxDemandId;

	private List<CloudBoxSku> cloudBoxSkus;

	private Float blockStorageCapacity;

	private String auditParamStr;

	private String status;
	public OpsUpdateCloudBoxDemandRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateCloudBoxDemand", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getCloudBoxDemandId() {
		return this.cloudBoxDemandId;
	}

	public void setCloudBoxDemandId(String cloudBoxDemandId) {
		this.cloudBoxDemandId = cloudBoxDemandId;
		if(cloudBoxDemandId != null){
			putQueryParameter("CloudBoxDemandId", cloudBoxDemandId);
		}
	}

	public List<CloudBoxSku> getCloudBoxSkus() {
		return this.cloudBoxSkus;
	}

	public void setCloudBoxSkus(List<CloudBoxSku> cloudBoxSkus) {
		this.cloudBoxSkus = cloudBoxSkus;	
		if (cloudBoxSkus != null) {
			for (int depth1 = 0; depth1 < cloudBoxSkus.size(); depth1++) {
				putQueryParameter("CloudBoxSku." + (depth1 + 1) + ".SkuId" , cloudBoxSkus.get(depth1).getSkuId());
				putQueryParameter("CloudBoxSku." + (depth1 + 1) + ".Count" , cloudBoxSkus.get(depth1).getCount());
			}
		}	
	}

	public Float getBlockStorageCapacity() {
		return this.blockStorageCapacity;
	}

	public void setBlockStorageCapacity(Float blockStorageCapacity) {
		this.blockStorageCapacity = blockStorageCapacity;
		if(blockStorageCapacity != null){
			putQueryParameter("BlockStorageCapacity", blockStorageCapacity.toString());
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public static class CloudBoxSku {

		private String skuId;

		private Integer count;

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public Class<OpsUpdateCloudBoxDemandResponse> getResponseClass() {
		return OpsUpdateCloudBoxDemandResponse.class;
	}

}

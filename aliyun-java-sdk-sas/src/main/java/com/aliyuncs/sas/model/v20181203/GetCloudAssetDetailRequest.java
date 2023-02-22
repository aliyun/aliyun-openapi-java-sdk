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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCloudAssetDetailRequest extends RpcAcsRequest<GetCloudAssetDetailResponse> {
	   

	private List<CloudAssetInstances> cloudAssetInstancess;

	private Integer assetSubType;

	private Integer vendor;

	private Integer assetType;
	public GetCloudAssetDetailRequest() {
		super("Sas", "2018-12-03", "GetCloudAssetDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<CloudAssetInstances> getCloudAssetInstancess() {
		return this.cloudAssetInstancess;
	}

	public void setCloudAssetInstancess(List<CloudAssetInstances> cloudAssetInstancess) {
		this.cloudAssetInstancess = cloudAssetInstancess;	
		if (cloudAssetInstancess != null) {
			for (int depth1 = 0; depth1 < cloudAssetInstancess.size(); depth1++) {
				putQueryParameter("CloudAssetInstances." + (depth1 + 1) + ".InstanceId" , cloudAssetInstancess.get(depth1).getInstanceId());
				putQueryParameter("CloudAssetInstances." + (depth1 + 1) + ".RegionId" , cloudAssetInstancess.get(depth1).getRegionId());
			}
		}	
	}

	public Integer getAssetSubType() {
		return this.assetSubType;
	}

	public void setAssetSubType(Integer assetSubType) {
		this.assetSubType = assetSubType;
		if(assetSubType != null){
			putQueryParameter("AssetSubType", assetSubType.toString());
		}
	}

	public Integer getVendor() {
		return this.vendor;
	}

	public void setVendor(Integer vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putQueryParameter("Vendor", vendor.toString());
		}
	}

	public Integer getAssetType() {
		return this.assetType;
	}

	public void setAssetType(Integer assetType) {
		this.assetType = assetType;
		if(assetType != null){
			putQueryParameter("AssetType", assetType.toString());
		}
	}

	public static class CloudAssetInstances {

		private String instanceId;

		private String regionId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public Class<GetCloudAssetDetailResponse> getResponseClass() {
		return GetCloudAssetDetailResponse.class;
	}

}

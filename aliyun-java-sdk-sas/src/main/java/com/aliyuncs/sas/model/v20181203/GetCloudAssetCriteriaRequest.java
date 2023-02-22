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
public class GetCloudAssetCriteriaRequest extends RpcAcsRequest<GetCloudAssetCriteriaResponse> {
	   

	private List<CloudAssetTypes> cloudAssetTypess;

	private String value;
	public GetCloudAssetCriteriaRequest() {
		super("Sas", "2018-12-03", "GetCloudAssetCriteria");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<CloudAssetTypes> getCloudAssetTypess() {
		return this.cloudAssetTypess;
	}

	public void setCloudAssetTypess(List<CloudAssetTypes> cloudAssetTypess) {
		this.cloudAssetTypess = cloudAssetTypess;	
		if (cloudAssetTypess != null) {
			for (int depth1 = 0; depth1 < cloudAssetTypess.size(); depth1++) {
				putQueryParameter("CloudAssetTypes." + (depth1 + 1) + ".AssetSubType" , cloudAssetTypess.get(depth1).getAssetSubType());
				putQueryParameter("CloudAssetTypes." + (depth1 + 1) + ".AssetType" , cloudAssetTypess.get(depth1).getAssetType());
			}
		}	
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	public static class CloudAssetTypes {

		private Integer assetSubType;

		private Integer assetType;

		public Integer getAssetSubType() {
			return this.assetSubType;
		}

		public void setAssetSubType(Integer assetSubType) {
			this.assetSubType = assetSubType;
		}

		public Integer getAssetType() {
			return this.assetType;
		}

		public void setAssetType(Integer assetType) {
			this.assetType = assetType;
		}
	}

	@Override
	public Class<GetCloudAssetCriteriaResponse> getResponseClass() {
		return GetCloudAssetCriteriaResponse.class;
	}

}

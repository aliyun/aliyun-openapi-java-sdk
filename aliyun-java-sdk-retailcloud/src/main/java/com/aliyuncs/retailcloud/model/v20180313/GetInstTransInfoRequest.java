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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetInstTransInfoRequest extends RpcAcsRequest<GetInstTransInfoResponse> {
	   

	private String aliyunUid;

	private String aliyunEquipId;

	private String aliyunCommodityCode;
	public GetInstTransInfoRequest() {
		super("retailcloud", "2018-03-13", "GetInstTransInfo", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(String aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putBodyParameter("aliyunUid", aliyunUid);
		}
	}

	public String getAliyunEquipId() {
		return this.aliyunEquipId;
	}

	public void setAliyunEquipId(String aliyunEquipId) {
		this.aliyunEquipId = aliyunEquipId;
		if(aliyunEquipId != null){
			putBodyParameter("aliyunEquipId", aliyunEquipId);
		}
	}

	public String getAliyunCommodityCode() {
		return this.aliyunCommodityCode;
	}

	public void setAliyunCommodityCode(String aliyunCommodityCode) {
		this.aliyunCommodityCode = aliyunCommodityCode;
		if(aliyunCommodityCode != null){
			putBodyParameter("aliyunCommodityCode", aliyunCommodityCode);
		}
	}

	@Override
	public Class<GetInstTransInfoResponse> getResponseClass() {
		return GetInstTransInfoResponse.class;
	}

}

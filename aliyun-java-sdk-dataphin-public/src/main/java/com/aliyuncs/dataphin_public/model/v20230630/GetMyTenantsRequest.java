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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetMyTenantsRequest extends RpcAcsRequest<GetMyTenantsResponse> {
	   

	private Long opTenantId;

	@SerializedName("featureCodeList")
	private List<String> featureCodeList;
	public GetMyTenantsRequest() {
		super("dataphin-public", "2023-06-30", "GetMyTenants");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public List<String> getFeatureCodeList() {
		return this.featureCodeList;
	}

	public void setFeatureCodeList(List<String> featureCodeList) {
		this.featureCodeList = featureCodeList;	
		if (featureCodeList != null) {
			putBodyParameter("FeatureCodeList" , new Gson().toJson(featureCodeList));
		}	
	}

	@Override
	public Class<GetMyTenantsResponse> getResponseClass() {
		return GetMyTenantsResponse.class;
	}

}

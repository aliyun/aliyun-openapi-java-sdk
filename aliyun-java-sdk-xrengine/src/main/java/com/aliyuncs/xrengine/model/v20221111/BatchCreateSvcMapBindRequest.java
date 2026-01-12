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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateSvcMapBindRequest extends RpcAcsRequest<BatchCreateSvcMapBindResponse> {
	   

	private Long svcId;

	@SerializedName("mapIds")
	private List<Long> mapIds;

	private String jwtToken;
	public BatchCreateSvcMapBindRequest() {
		super("xrEngine", "2022-11-11", "BatchCreateSvcMapBind");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSvcId() {
		return this.svcId;
	}

	public void setSvcId(Long svcId) {
		this.svcId = svcId;
		if(svcId != null){
			putBodyParameter("SvcId", svcId.toString());
		}
	}

	public List<Long> getMapIds() {
		return this.mapIds;
	}

	public void setMapIds(List<Long> mapIds) {
		this.mapIds = mapIds;	
		if (mapIds != null) {
			putBodyParameter("MapIds" , new Gson().toJson(mapIds));
		}	
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putBodyParameter("JwtToken", jwtToken);
		}
	}

	@Override
	public Class<BatchCreateSvcMapBindResponse> getResponseClass() {
		return BatchCreateSvcMapBindResponse.class;
	}

}

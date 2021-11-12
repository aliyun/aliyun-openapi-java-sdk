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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.uisplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVnetRequest extends RpcAcsRequest<CreateVnetResponse> {
	   

	private String clientToken;

	private Integer kppsQuota;

	private String uisId;

	private String name;

	private String cidrs;

	private Integer mbpsQuota;

	private Integer flowQuota;
	public CreateVnetRequest() {
		super("Uisplus", "2020-07-07", "CreateVnet", "uisplus");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getKppsQuota() {
		return this.kppsQuota;
	}

	public void setKppsQuota(Integer kppsQuota) {
		this.kppsQuota = kppsQuota;
		if(kppsQuota != null){
			putQueryParameter("KppsQuota", kppsQuota.toString());
		}
	}

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
		if(uisId != null){
			putQueryParameter("UisId", uisId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCidrs() {
		return this.cidrs;
	}

	public void setCidrs(String cidrs) {
		this.cidrs = cidrs;
		if(cidrs != null){
			putQueryParameter("Cidrs", cidrs);
		}
	}

	public Integer getMbpsQuota() {
		return this.mbpsQuota;
	}

	public void setMbpsQuota(Integer mbpsQuota) {
		this.mbpsQuota = mbpsQuota;
		if(mbpsQuota != null){
			putQueryParameter("MbpsQuota", mbpsQuota.toString());
		}
	}

	public Integer getFlowQuota() {
		return this.flowQuota;
	}

	public void setFlowQuota(Integer flowQuota) {
		this.flowQuota = flowQuota;
		if(flowQuota != null){
			putQueryParameter("FlowQuota", flowQuota.toString());
		}
	}

	@Override
	public Class<CreateVnetResponse> getResponseClass() {
		return CreateVnetResponse.class;
	}

}

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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLocationServiceRequest extends RpcAcsRequest<UpdateLocationServiceResponse> {
	   

	private String note;

	private String svcName;

	private String svcState;

	private Integer qps;

	private String jwtToken;

	private Long id;
	public UpdateLocationServiceRequest() {
		super("xrEngine", "2022-11-11", "UpdateLocationService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putBodyParameter("Note", note);
		}
	}

	public String getSvcName() {
		return this.svcName;
	}

	public void setSvcName(String svcName) {
		this.svcName = svcName;
		if(svcName != null){
			putBodyParameter("SvcName", svcName);
		}
	}

	public String getSvcState() {
		return this.svcState;
	}

	public void setSvcState(String svcState) {
		this.svcState = svcState;
		if(svcState != null){
			putBodyParameter("SvcState", svcState);
		}
	}

	public Integer getQps() {
		return this.qps;
	}

	public void setQps(Integer qps) {
		this.qps = qps;
		if(qps != null){
			putBodyParameter("Qps", qps.toString());
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	@Override
	public Class<UpdateLocationServiceResponse> getResponseClass() {
		return UpdateLocationServiceResponse.class;
	}

}

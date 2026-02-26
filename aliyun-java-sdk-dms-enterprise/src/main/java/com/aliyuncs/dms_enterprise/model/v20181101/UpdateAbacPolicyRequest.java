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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAbacPolicyRequest extends RpcAcsRequest<UpdateAbacPolicyResponse> {
	   

	private String abacPolicyContent;

	private Long tid;

	private Long abacPolicyId;

	private String abacPolicyDesc;

	private String abacPolicyName;
	public UpdateAbacPolicyRequest() {
		super("dms-enterprise", "2018-11-01", "UpdateAbacPolicy", "dms-enterprise");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAbacPolicyContent() {
		return this.abacPolicyContent;
	}

	public void setAbacPolicyContent(String abacPolicyContent) {
		this.abacPolicyContent = abacPolicyContent;
		if(abacPolicyContent != null){
			putQueryParameter("AbacPolicyContent", abacPolicyContent);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Long getAbacPolicyId() {
		return this.abacPolicyId;
	}

	public void setAbacPolicyId(Long abacPolicyId) {
		this.abacPolicyId = abacPolicyId;
		if(abacPolicyId != null){
			putQueryParameter("AbacPolicyId", abacPolicyId.toString());
		}
	}

	public String getAbacPolicyDesc() {
		return this.abacPolicyDesc;
	}

	public void setAbacPolicyDesc(String abacPolicyDesc) {
		this.abacPolicyDesc = abacPolicyDesc;
		if(abacPolicyDesc != null){
			putQueryParameter("AbacPolicyDesc", abacPolicyDesc);
		}
	}

	public String getAbacPolicyName() {
		return this.abacPolicyName;
	}

	public void setAbacPolicyName(String abacPolicyName) {
		this.abacPolicyName = abacPolicyName;
		if(abacPolicyName != null){
			putQueryParameter("AbacPolicyName", abacPolicyName);
		}
	}

	@Override
	public Class<UpdateAbacPolicyResponse> getResponseClass() {
		return UpdateAbacPolicyResponse.class;
	}

}

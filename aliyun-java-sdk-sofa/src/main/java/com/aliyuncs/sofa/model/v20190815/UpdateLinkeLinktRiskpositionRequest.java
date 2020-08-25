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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeLinktRiskpositionRequest extends RpcAcsRequest<UpdateLinkeLinktRiskpositionResponse> {
	   

	private String targetId;

	private String afterId;

	private String beforeId;
	public UpdateLinkeLinktRiskpositionRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktRiskposition", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
		if(targetId != null){
			putBodyParameter("TargetId", targetId);
		}
	}

	public String getAfterId() {
		return this.afterId;
	}

	public void setAfterId(String afterId) {
		this.afterId = afterId;
		if(afterId != null){
			putBodyParameter("AfterId", afterId);
		}
	}

	public String getBeforeId() {
		return this.beforeId;
	}

	public void setBeforeId(String beforeId) {
		this.beforeId = beforeId;
		if(beforeId != null){
			putBodyParameter("BeforeId", beforeId);
		}
	}

	@Override
	public Class<UpdateLinkeLinktRiskpositionResponse> getResponseClass() {
		return UpdateLinkeLinktRiskpositionResponse.class;
	}

}

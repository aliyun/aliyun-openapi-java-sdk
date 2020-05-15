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
	   

	private Long targetId;

	private Long afterId;

	private Long beforeId;
	public UpdateLinkeLinktRiskpositionRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktRiskposition", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Long targetId) {
		this.targetId = targetId;
		if(targetId != null){
			putBodyParameter("TargetId", targetId.toString());
		}
	}

	public Long getAfterId() {
		return this.afterId;
	}

	public void setAfterId(Long afterId) {
		this.afterId = afterId;
		if(afterId != null){
			putBodyParameter("AfterId", afterId.toString());
		}
	}

	public Long getBeforeId() {
		return this.beforeId;
	}

	public void setBeforeId(Long beforeId) {
		this.beforeId = beforeId;
		if(beforeId != null){
			putBodyParameter("BeforeId", beforeId.toString());
		}
	}

	@Override
	public Class<UpdateLinkeLinktRiskpositionResponse> getResponseClass() {
		return UpdateLinkeLinktRiskpositionResponse.class;
	}

}

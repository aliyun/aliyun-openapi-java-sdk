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

package com.aliyuncs.idsp.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateSubjectRequest extends RpcAcsRequest<UpdateSubjectResponse> {
	   

	private String assKeywords;

	private Long id;

	private String posKeywords;

	private String excludeKeywords;
	public UpdateSubjectRequest() {
		super("idsp", "2020-07-10", "UpdateSubject", "idsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAssKeywords() {
		return this.assKeywords;
	}

	public void setAssKeywords(String assKeywords) {
		this.assKeywords = assKeywords;
		if(assKeywords != null){
			putBodyParameter("AssKeywords", assKeywords);
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

	public String getPosKeywords() {
		return this.posKeywords;
	}

	public void setPosKeywords(String posKeywords) {
		this.posKeywords = posKeywords;
		if(posKeywords != null){
			putBodyParameter("PosKeywords", posKeywords);
		}
	}

	public String getExcludeKeywords() {
		return this.excludeKeywords;
	}

	public void setExcludeKeywords(String excludeKeywords) {
		this.excludeKeywords = excludeKeywords;
		if(excludeKeywords != null){
			putBodyParameter("ExcludeKeywords", excludeKeywords);
		}
	}

	@Override
	public Class<UpdateSubjectResponse> getResponseClass() {
		return UpdateSubjectResponse.class;
	}

}

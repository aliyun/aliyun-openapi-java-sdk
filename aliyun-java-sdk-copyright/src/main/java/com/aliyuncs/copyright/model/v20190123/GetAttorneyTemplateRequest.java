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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetAttorneyTemplateRequest extends RpcAcsRequest<GetAttorneyTemplateResponse> {
	   

	private String patentName;

	private String bizId;

	private String representative;
	public GetAttorneyTemplateRequest() {
		super("Copyright", "2019-01-23", "GetAttorneyTemplate", "swcopyright");
		setMethod(MethodType.POST);
	}

	public String getPatentName() {
		return this.patentName;
	}

	public void setPatentName(String patentName) {
		this.patentName = patentName;
		if(patentName != null){
			putQueryParameter("PatentName", patentName);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getRepresentative() {
		return this.representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
		if(representative != null){
			putQueryParameter("Representative", representative);
		}
	}

	@Override
	public Class<GetAttorneyTemplateResponse> getResponseClass() {
		return GetAttorneyTemplateResponse.class;
	}

}

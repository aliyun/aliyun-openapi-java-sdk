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

package com.aliyuncs.workbench_inner.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InnerPreRegisterPartnerRequest extends RpcAcsRequest<InnerPreRegisterPartnerResponse> {
	   

	private String partnerId;

	private String source;
	public InnerPreRegisterPartnerRequest() {
		super("Workbench-inner", "2021-01-21", "InnerPreRegisterPartner");
		setMethod(MethodType.POST);
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
		if(partnerId != null){
			putQueryParameter("PartnerId", partnerId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	@Override
	public Class<InnerPreRegisterPartnerResponse> getResponseClass() {
		return InnerPreRegisterPartnerResponse.class;
	}

}

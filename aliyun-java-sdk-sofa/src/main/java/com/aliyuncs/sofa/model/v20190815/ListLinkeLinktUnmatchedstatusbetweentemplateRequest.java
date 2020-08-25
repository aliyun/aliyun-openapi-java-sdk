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
public class ListLinkeLinktUnmatchedstatusbetweentemplateRequest extends RpcAcsRequest<ListLinkeLinktUnmatchedstatusbetweentemplateResponse> {
	   

	private String originTemplateId;

	private String convertTemplateId;
	public ListLinkeLinktUnmatchedstatusbetweentemplateRequest() {
		super("SOFA", "2019-08-15", "ListLinkeLinktUnmatchedstatusbetweentemplate", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOriginTemplateId() {
		return this.originTemplateId;
	}

	public void setOriginTemplateId(String originTemplateId) {
		this.originTemplateId = originTemplateId;
		if(originTemplateId != null){
			putBodyParameter("OriginTemplateId", originTemplateId);
		}
	}

	public String getConvertTemplateId() {
		return this.convertTemplateId;
	}

	public void setConvertTemplateId(String convertTemplateId) {
		this.convertTemplateId = convertTemplateId;
		if(convertTemplateId != null){
			putBodyParameter("ConvertTemplateId", convertTemplateId);
		}
	}

	@Override
	public Class<ListLinkeLinktUnmatchedstatusbetweentemplateResponse> getResponseClass() {
		return ListLinkeLinktUnmatchedstatusbetweentemplateResponse.class;
	}

}

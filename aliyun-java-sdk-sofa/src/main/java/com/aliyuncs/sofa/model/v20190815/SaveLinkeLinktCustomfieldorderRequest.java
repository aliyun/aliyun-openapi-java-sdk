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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveLinkeLinktCustomfieldorderRequest extends RpcAcsRequest<SaveLinkeLinktCustomfieldorderResponse> {
	   

	private List<Long> customFieldVOListRepeatLists;

	private Long templateId;
	public SaveLinkeLinktCustomfieldorderRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeLinktCustomfieldorder", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getCustomFieldVOListRepeatLists() {
		return this.customFieldVOListRepeatLists;
	}

	public void setCustomFieldVOListRepeatLists(List<Long> customFieldVOListRepeatLists) {
		this.customFieldVOListRepeatLists = customFieldVOListRepeatLists;	
		if (customFieldVOListRepeatLists != null) {
			for (int i = 0; i < customFieldVOListRepeatLists.size(); i++) {
				putBodyParameter("CustomFieldVOListRepeatList." + (i + 1) , customFieldVOListRepeatLists.get(i));
			}
		}	
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	@Override
	public Class<SaveLinkeLinktCustomfieldorderResponse> getResponseClass() {
		return SaveLinkeLinktCustomfieldorderResponse.class;
	}

}

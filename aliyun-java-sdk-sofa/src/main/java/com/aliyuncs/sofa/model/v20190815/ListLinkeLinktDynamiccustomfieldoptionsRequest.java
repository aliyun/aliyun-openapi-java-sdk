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
public class ListLinkeLinktDynamiccustomfieldoptionsRequest extends RpcAcsRequest<ListLinkeLinktDynamiccustomfieldoptionsResponse> {
	   

	private String dependentParamMap;

	private String keyword;

	private String value;

	private Long fieldId;
	public ListLinkeLinktDynamiccustomfieldoptionsRequest() {
		super("SOFA", "2019-08-15", "ListLinkeLinktDynamiccustomfieldoptions", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDependentParamMap() {
		return this.dependentParamMap;
	}

	public void setDependentParamMap(String dependentParamMap) {
		this.dependentParamMap = dependentParamMap;
		if(dependentParamMap != null){
			putBodyParameter("DependentParamMap", dependentParamMap);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putBodyParameter("Value", value);
		}
	}

	public Long getFieldId() {
		return this.fieldId;
	}

	public void setFieldId(Long fieldId) {
		this.fieldId = fieldId;
		if(fieldId != null){
			putBodyParameter("FieldId", fieldId.toString());
		}
	}

	@Override
	public Class<ListLinkeLinktDynamiccustomfieldoptionsResponse> getResponseClass() {
		return ListLinkeLinktDynamiccustomfieldoptionsResponse.class;
	}

}

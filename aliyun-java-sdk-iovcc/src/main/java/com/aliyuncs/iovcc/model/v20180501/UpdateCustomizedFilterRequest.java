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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomizedFilterRequest extends RpcAcsRequest<UpdateCustomizedFilterResponse> {
	   

	private String valueType;

	private String blackWhiteType;

	private Long id;

	private String projectId;

	private String value;

	private String valueCompareType;

	private String name;
	public UpdateCustomizedFilterRequest() {
		super("iovcc", "2018-05-01", "UpdateCustomizedFilter", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
		if(valueType != null){
			putQueryParameter("ValueType", valueType);
		}
	}

	public String getBlackWhiteType() {
		return this.blackWhiteType;
	}

	public void setBlackWhiteType(String blackWhiteType) {
		this.blackWhiteType = blackWhiteType;
		if(blackWhiteType != null){
			putQueryParameter("BlackWhiteType", blackWhiteType);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	public String getValueCompareType() {
		return this.valueCompareType;
	}

	public void setValueCompareType(String valueCompareType) {
		this.valueCompareType = valueCompareType;
		if(valueCompareType != null){
			putQueryParameter("ValueCompareType", valueCompareType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<UpdateCustomizedFilterResponse> getResponseClass() {
		return UpdateCustomizedFilterResponse.class;
	}

}

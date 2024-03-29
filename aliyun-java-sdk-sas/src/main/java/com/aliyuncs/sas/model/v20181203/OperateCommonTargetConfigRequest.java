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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OperateCommonTargetConfigRequest extends RpcAcsRequest<OperateCommonTargetConfigResponse> {
	   

	private String targetType;

	private String type;

	private String targetOperations;

	private String sourceIp;

	private String fieldValue;

	private String fieldName;
	public OperateCommonTargetConfigRequest() {
		super("Sas", "2018-12-03", "OperateCommonTargetConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getTargetOperations() {
		return this.targetOperations;
	}

	public void setTargetOperations(String targetOperations) {
		this.targetOperations = targetOperations;
		if(targetOperations != null){
			putQueryParameter("TargetOperations", targetOperations);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
		if(fieldValue != null){
			putQueryParameter("FieldValue", fieldValue);
		}
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
		if(fieldName != null){
			putQueryParameter("FieldName", fieldName);
		}
	}

	@Override
	public Class<OperateCommonTargetConfigResponse> getResponseClass() {
		return OperateCommonTargetConfigResponse.class;
	}

}

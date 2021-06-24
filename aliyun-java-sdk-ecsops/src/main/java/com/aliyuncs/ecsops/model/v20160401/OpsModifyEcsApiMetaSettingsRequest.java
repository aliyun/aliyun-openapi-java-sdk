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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyEcsApiMetaSettingsRequest extends RpcAcsRequest<OpsModifyEcsApiMetaSettingsResponse> {
	   

	private String attributeValue;

	private String proApiName;

	private String attributeName;

	private String productName;

	private String apiVersion;

	private String auditParamStr;
	public OpsModifyEcsApiMetaSettingsRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyEcsApiMetaSettings", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
		if(attributeValue != null){
			putQueryParameter("AttributeValue", attributeValue);
		}
	}

	public String getProApiName() {
		return this.proApiName;
	}

	public void setProApiName(String proApiName) {
		this.proApiName = proApiName;
		if(proApiName != null){
			putQueryParameter("ProApiName", proApiName);
		}
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
		if(attributeName != null){
			putQueryParameter("AttributeName", attributeName);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		if(apiVersion != null){
			putQueryParameter("ApiVersion", apiVersion);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsModifyEcsApiMetaSettingsResponse> getResponseClass() {
		return OpsModifyEcsApiMetaSettingsResponse.class;
	}

}

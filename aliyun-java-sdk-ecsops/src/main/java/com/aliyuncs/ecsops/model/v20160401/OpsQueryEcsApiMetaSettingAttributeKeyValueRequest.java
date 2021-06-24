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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsApiMetaSettingAttributeKeyValueRequest extends RpcAcsRequest<OpsQueryEcsApiMetaSettingAttributeKeyValueResponse> {
	   

	private List<String> attributeKeyss;

	private String auditParamStr;
	public OpsQueryEcsApiMetaSettingAttributeKeyValueRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryEcsApiMetaSettingAttributeKeyValue", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getAttributeKeyss() {
		return this.attributeKeyss;
	}

	public void setAttributeKeyss(List<String> attributeKeyss) {
		this.attributeKeyss = attributeKeyss;	
		if (attributeKeyss != null) {
			for (int i = 0; i < attributeKeyss.size(); i++) {
				putQueryParameter("AttributeKeys." + (i + 1) , attributeKeyss.get(i));
			}
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
	public Class<OpsQueryEcsApiMetaSettingAttributeKeyValueResponse> getResponseClass() {
		return OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.class;
	}

}

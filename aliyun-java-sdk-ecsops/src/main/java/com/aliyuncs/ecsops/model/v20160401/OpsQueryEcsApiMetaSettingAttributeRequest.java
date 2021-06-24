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
public class OpsQueryEcsApiMetaSettingAttributeRequest extends RpcAcsRequest<OpsQueryEcsApiMetaSettingAttributeResponse> {
	   

	private List<String> attributeNamess;

	private String auditParamStr;
	public OpsQueryEcsApiMetaSettingAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryEcsApiMetaSettingAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getAttributeNamess() {
		return this.attributeNamess;
	}

	public void setAttributeNamess(List<String> attributeNamess) {
		this.attributeNamess = attributeNamess;	
		if (attributeNamess != null) {
			for (int i = 0; i < attributeNamess.size(); i++) {
				putQueryParameter("AttributeNames." + (i + 1) , attributeNamess.get(i));
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
	public Class<OpsQueryEcsApiMetaSettingAttributeResponse> getResponseClass() {
		return OpsQueryEcsApiMetaSettingAttributeResponse.class;
	}

}

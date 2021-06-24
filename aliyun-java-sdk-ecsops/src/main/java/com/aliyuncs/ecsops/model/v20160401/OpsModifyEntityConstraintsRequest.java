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
public class OpsModifyEntityConstraintsRequest extends RpcAcsRequest<OpsModifyEntityConstraintsResponse> {
	   

	private String entityKey;

	private String entityProperties;

	private Boolean replaceAll;

	private String entityType;

	private String auditParamStr;
	public OpsModifyEntityConstraintsRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyEntityConstraints", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getEntityKey() {
		return this.entityKey;
	}

	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
		if(entityKey != null){
			putQueryParameter("EntityKey", entityKey);
		}
	}

	public String getEntityProperties() {
		return this.entityProperties;
	}

	public void setEntityProperties(String entityProperties) {
		this.entityProperties = entityProperties;
		if(entityProperties != null){
			putQueryParameter("EntityProperties", entityProperties);
		}
	}

	public Boolean getReplaceAll() {
		return this.replaceAll;
	}

	public void setReplaceAll(Boolean replaceAll) {
		this.replaceAll = replaceAll;
		if(replaceAll != null){
			putQueryParameter("ReplaceAll", replaceAll.toString());
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putQueryParameter("EntityType", entityType);
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
	public Class<OpsModifyEntityConstraintsResponse> getResponseClass() {
		return OpsModifyEntityConstraintsResponse.class;
	}

}

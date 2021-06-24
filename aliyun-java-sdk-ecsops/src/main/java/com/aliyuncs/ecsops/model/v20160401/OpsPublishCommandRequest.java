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
public class OpsPublishCommandRequest extends RpcAcsRequest<OpsPublishCommandResponse> {
	   

	private List<String> modifiers;

	private String commandId;

	private Long aliyunUid;

	private String shareStatus;

	private String auditParamStr;
	public OpsPublishCommandRequest() {
		super("Ecsops", "2016-04-01", "OpsPublishCommand", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getModifiers() {
		return this.modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;	
		if (modifiers != null) {
			for (int i = 0; i < modifiers.size(); i++) {
				putQueryParameter("Modifier." + (i + 1) , modifiers.get(i));
			}
		}	
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
		if(commandId != null){
			putQueryParameter("CommandId", commandId);
		}
	}

	public Long getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(Long aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putQueryParameter("AliyunUid", aliyunUid.toString());
		}
	}

	public String getShareStatus() {
		return this.shareStatus;
	}

	public void setShareStatus(String shareStatus) {
		this.shareStatus = shareStatus;
		if(shareStatus != null){
			putQueryParameter("ShareStatus", shareStatus);
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
	public Class<OpsPublishCommandResponse> getResponseClass() {
		return OpsPublishCommandResponse.class;
	}

}

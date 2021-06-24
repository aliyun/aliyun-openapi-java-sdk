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
public class OpsShowVportsRequest extends RpcAcsRequest<OpsShowVportsResponse> {
	   

	private Boolean onlyAbormal;

	private List<String> instanceIds;

	private List<String> eniIds;

	private String auditParamStr;
	public OpsShowVportsRequest() {
		super("Ecsops", "2016-04-01", "OpsShowVports", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getOnlyAbormal() {
		return this.onlyAbormal;
	}

	public void setOnlyAbormal(Boolean onlyAbormal) {
		this.onlyAbormal = onlyAbormal;
		if(onlyAbormal != null){
			putQueryParameter("OnlyAbormal", onlyAbormal.toString());
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public List<String> getEniIds() {
		return this.eniIds;
	}

	public void setEniIds(List<String> eniIds) {
		this.eniIds = eniIds;	
		if (eniIds != null) {
			for (int i = 0; i < eniIds.size(); i++) {
				putQueryParameter("EniId." + (i + 1) , eniIds.get(i));
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
	public Class<OpsShowVportsResponse> getResponseClass() {
		return OpsShowVportsResponse.class;
	}

}

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
public class OpsAbortTaskInstanceRequest extends RpcAcsRequest<OpsAbortTaskInstanceResponse> {
	   

	private Long aliUid;

	private List<Long> ids;

	private String auditParamStr;
	public OpsAbortTaskInstanceRequest() {
		super("Ecsops", "2016-04-01", "OpsAbortTaskInstance", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public List<Long> getIds() {
		return this.ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;	
		if (ids != null) {
			for (int i = 0; i < ids.size(); i++) {
				putQueryParameter("Id." + (i + 1) , ids.get(i));
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
	public Class<OpsAbortTaskInstanceResponse> getResponseClass() {
		return OpsAbortTaskInstanceResponse.class;
	}

}

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
public class OpsSubmitNcOfflineTaskRequest extends RpcAcsRequest<OpsSubmitNcOfflineTaskResponse> {
	   

	private String snList;

	private String dstGroup;

	private String auditParamStr;
	public OpsSubmitNcOfflineTaskRequest() {
		super("Ecsops", "2016-04-01", "OpsSubmitNcOfflineTask", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSnList() {
		return this.snList;
	}

	public void setSnList(String snList) {
		this.snList = snList;
		if(snList != null){
			putQueryParameter("SnList", snList);
		}
	}

	public String getDstGroup() {
		return this.dstGroup;
	}

	public void setDstGroup(String dstGroup) {
		this.dstGroup = dstGroup;
		if(dstGroup != null){
			putQueryParameter("DstGroup", dstGroup);
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
	public Class<OpsSubmitNcOfflineTaskResponse> getResponseClass() {
		return OpsSubmitNcOfflineTaskResponse.class;
	}

}

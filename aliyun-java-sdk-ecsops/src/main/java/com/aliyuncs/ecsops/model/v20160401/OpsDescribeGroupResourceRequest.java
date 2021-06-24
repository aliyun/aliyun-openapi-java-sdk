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
public class OpsDescribeGroupResourceRequest extends RpcAcsRequest<OpsDescribeGroupResourceResponse> {
	   

	private Boolean includeDirtyVm;

	private String groupNo;

	private String auditParamStr;
	public OpsDescribeGroupResourceRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeGroupResource", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getIncludeDirtyVm() {
		return this.includeDirtyVm;
	}

	public void setIncludeDirtyVm(Boolean includeDirtyVm) {
		this.includeDirtyVm = includeDirtyVm;
		if(includeDirtyVm != null){
			putQueryParameter("IncludeDirtyVm", includeDirtyVm.toString());
		}
	}

	public String getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
		if(groupNo != null){
			putQueryParameter("GroupNo", groupNo);
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
	public Class<OpsDescribeGroupResourceResponse> getResponseClass() {
		return OpsDescribeGroupResourceResponse.class;
	}

}

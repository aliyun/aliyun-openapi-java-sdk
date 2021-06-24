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
public class OpsSreDescribeOwnerTeamRequest extends RpcAcsRequest<OpsSreDescribeOwnerTeamResponse> {
	   

	private Integer pageNumber;

	private Integer pageSize;

	private String ownerTeamTagName;

	private String auditParamStr;
	public OpsSreDescribeOwnerTeamRequest() {
		super("Ecsops", "2016-04-01", "OpsSreDescribeOwnerTeam", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getOwnerTeamTagName() {
		return this.ownerTeamTagName;
	}

	public void setOwnerTeamTagName(String ownerTeamTagName) {
		this.ownerTeamTagName = ownerTeamTagName;
		if(ownerTeamTagName != null){
			putQueryParameter("OwnerTeamTagName", ownerTeamTagName);
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
	public Class<OpsSreDescribeOwnerTeamResponse> getResponseClass() {
		return OpsSreDescribeOwnerTeamResponse.class;
	}

}

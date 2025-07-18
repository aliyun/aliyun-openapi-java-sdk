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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceDiagnosisSummaryRequest extends RpcAcsRequest<DescribeDBInstanceDiagnosisSummaryResponse> {
	   

	private String startStatus;

	private Integer pageNumber;

	private Integer pageSize;

	private String dBInstanceId;

	private String syncMode;

	private String rolePreferd;
	public DescribeDBInstanceDiagnosisSummaryRequest() {
		super("gpdb", "2016-05-03", "DescribeDBInstanceDiagnosisSummary", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartStatus() {
		return this.startStatus;
	}

	public void setStartStatus(String startStatus) {
		this.startStatus = startStatus;
		if(startStatus != null){
			putQueryParameter("StartStatus", startStatus);
		}
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getSyncMode() {
		return this.syncMode;
	}

	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
		if(syncMode != null){
			putQueryParameter("SyncMode", syncMode);
		}
	}

	public String getRolePreferd() {
		return this.rolePreferd;
	}

	public void setRolePreferd(String rolePreferd) {
		this.rolePreferd = rolePreferd;
		if(rolePreferd != null){
			putQueryParameter("RolePreferd", rolePreferd);
		}
	}

	@Override
	public Class<DescribeDBInstanceDiagnosisSummaryResponse> getResponseClass() {
		return DescribeDBInstanceDiagnosisSummaryResponse.class;
	}

}

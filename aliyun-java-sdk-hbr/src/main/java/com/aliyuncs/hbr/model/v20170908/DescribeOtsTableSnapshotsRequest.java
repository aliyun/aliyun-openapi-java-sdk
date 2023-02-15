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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeOtsTableSnapshotsRequest extends RpcAcsRequest<DescribeOtsTableSnapshotsResponse> {
	   

	private String crossAccountType;

	private List<String> snapshotIds;

	private Long endTime;

	private String crossAccountRoleName;

	private Long startTime;

	private List<OtsInstances> otsInstances;

	private String nextToken;

	private Integer limit;

	private Long crossAccountUserId;
	public DescribeOtsTableSnapshotsRequest() {
		super("hbr", "2017-09-08", "DescribeOtsTableSnapshots", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCrossAccountType() {
		return this.crossAccountType;
	}

	public void setCrossAccountType(String crossAccountType) {
		this.crossAccountType = crossAccountType;
		if(crossAccountType != null){
			putQueryParameter("CrossAccountType", crossAccountType);
		}
	}

	public List<String> getSnapshotIds() {
		return this.snapshotIds;
	}

	public void setSnapshotIds(List<String> snapshotIds) {
		this.snapshotIds = snapshotIds;	
		if (snapshotIds != null) {
			for (int depth1 = 0; depth1 < snapshotIds.size(); depth1++) {
				putBodyParameter("SnapshotIds." + (depth1 + 1) , snapshotIds.get(depth1));
			}
		}	
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public String getCrossAccountRoleName() {
		return this.crossAccountRoleName;
	}

	public void setCrossAccountRoleName(String crossAccountRoleName) {
		this.crossAccountRoleName = crossAccountRoleName;
		if(crossAccountRoleName != null){
			putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public List<OtsInstances> getOtsInstances() {
		return this.otsInstances;
	}

	public void setOtsInstances(List<OtsInstances> otsInstances) {
		this.otsInstances = otsInstances;	
		if (otsInstances != null) {
			for (int depth1 = 0; depth1 < otsInstances.size(); depth1++) {
				if (otsInstances.get(depth1) != null) {
					
						putBodyParameter("OtsInstances." + (depth1 + 1) + ".InstanceName" , otsInstances.get(depth1).getInstanceName());
						if (otsInstances.get(depth1).getTableNames() != null) {
							for (int depth2 = 0; depth2 < otsInstances.get(depth1).getTableNames().size(); depth2++) {
								putBodyParameter("OtsInstances." + (depth1 + 1) + ".TableNames." + (depth2 + 1) , otsInstances.get(depth1).getTableNames().get(depth2));
							}
						}
				}
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public Long getCrossAccountUserId() {
		return this.crossAccountUserId;
	}

	public void setCrossAccountUserId(Long crossAccountUserId) {
		this.crossAccountUserId = crossAccountUserId;
		if(crossAccountUserId != null){
			putQueryParameter("CrossAccountUserId", crossAccountUserId.toString());
		}
	}

	public static class OtsInstances {

		private String instanceName;

		private List<String> tableNames;

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public List<String> getTableNames() {
			return this.tableNames;
		}

		public void setTableNames(List<String> tableNames) {
			this.tableNames = tableNames;
		}
	}

	@Override
	public Class<DescribeOtsTableSnapshotsResponse> getResponseClass() {
		return DescribeOtsTableSnapshotsResponse.class;
	}

}

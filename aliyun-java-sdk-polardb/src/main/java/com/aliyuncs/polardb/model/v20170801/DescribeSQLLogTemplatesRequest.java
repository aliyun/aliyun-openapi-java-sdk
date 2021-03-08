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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogTemplatesRequest extends RpcAcsRequest<DescribeSQLLogTemplatesResponse> {
	   

	private Long resourceOwnerId;

	private String startTime;

	private String jobId;

	private String sortKey;

	private Float minAvgScanRows;

	private String securityToken;

	private Integer pageNumbers;

	private String pagingId;

	private String dBInstanceId;

	private Float maxAvgScanRows;

	private String sqlType;

	private String resourceOwnerAccount;

	private Float minAvgConsume;

	private String ownerAccount;

	private Integer maxRecordsPerPage;

	private String endTime;

	private Long ownerId;

	private Float maxAvgConsume;

	private String childDBInstanceIDs;

	private String sortMethod;
	public DescribeSQLLogTemplatesRequest() {
		super("polardb", "2017-08-01", "DescribeSQLLogTemplates", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getSortKey() {
		return this.sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
		if(sortKey != null){
			putQueryParameter("SortKey", sortKey);
		}
	}

	public Float getMinAvgScanRows() {
		return this.minAvgScanRows;
	}

	public void setMinAvgScanRows(Float minAvgScanRows) {
		this.minAvgScanRows = minAvgScanRows;
		if(minAvgScanRows != null){
			putQueryParameter("MinAvgScanRows", minAvgScanRows.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Integer getPageNumbers() {
		return this.pageNumbers;
	}

	public void setPageNumbers(Integer pageNumbers) {
		this.pageNumbers = pageNumbers;
		if(pageNumbers != null){
			putQueryParameter("PageNumbers", pageNumbers.toString());
		}
	}

	public String getPagingId() {
		return this.pagingId;
	}

	public void setPagingId(String pagingId) {
		this.pagingId = pagingId;
		if(pagingId != null){
			putQueryParameter("PagingId", pagingId);
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

	public Float getMaxAvgScanRows() {
		return this.maxAvgScanRows;
	}

	public void setMaxAvgScanRows(Float maxAvgScanRows) {
		this.maxAvgScanRows = maxAvgScanRows;
		if(maxAvgScanRows != null){
			putQueryParameter("MaxAvgScanRows", maxAvgScanRows.toString());
		}
	}

	public String getSqlType() {
		return this.sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
		if(sqlType != null){
			putQueryParameter("SqlType", sqlType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Float getMinAvgConsume() {
		return this.minAvgConsume;
	}

	public void setMinAvgConsume(Float minAvgConsume) {
		this.minAvgConsume = minAvgConsume;
		if(minAvgConsume != null){
			putQueryParameter("MinAvgConsume", minAvgConsume.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Integer getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
		this.maxRecordsPerPage = maxRecordsPerPage;
		if(maxRecordsPerPage != null){
			putQueryParameter("MaxRecordsPerPage", maxRecordsPerPage.toString());
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Float getMaxAvgConsume() {
		return this.maxAvgConsume;
	}

	public void setMaxAvgConsume(Float maxAvgConsume) {
		this.maxAvgConsume = maxAvgConsume;
		if(maxAvgConsume != null){
			putQueryParameter("MaxAvgConsume", maxAvgConsume.toString());
		}
	}

	public String getChildDBInstanceIDs() {
		return this.childDBInstanceIDs;
	}

	public void setChildDBInstanceIDs(String childDBInstanceIDs) {
		this.childDBInstanceIDs = childDBInstanceIDs;
		if(childDBInstanceIDs != null){
			putQueryParameter("ChildDBInstanceIDs", childDBInstanceIDs);
		}
	}

	public String getSortMethod() {
		return this.sortMethod;
	}

	public void setSortMethod(String sortMethod) {
		this.sortMethod = sortMethod;
		if(sortMethod != null){
			putQueryParameter("SortMethod", sortMethod);
		}
	}

	@Override
	public Class<DescribeSQLLogTemplatesResponse> getResponseClass() {
		return DescribeSQLLogTemplatesResponse.class;
	}

}

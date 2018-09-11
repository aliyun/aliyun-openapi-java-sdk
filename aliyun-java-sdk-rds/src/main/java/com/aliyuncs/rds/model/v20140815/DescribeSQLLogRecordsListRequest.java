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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogRecordsListRequest extends RpcAcsRequest<DescribeSQLLogRecordsListResponse> {
	
	public DescribeSQLLogRecordsListRequest() {
		super("Rds", "2014-08-15", "DescribeSQLLogRecordsList", "rds");
	}

	private Long resourceOwnerId;

	private Long minScanRows;

	private String startTime;

	private String hostAddress;

	private String sortKey;

	private String accountName;

	private String securityToken;

	private Integer pageNumbers;

	private String pagingID;

	private String dBInstanceId;

	private String state;

	private String tableName;

	private String sqlType;

	private Long minConsume;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer maxRecordsPerPage;

	private String queryKeyword;

	private String endTime;

	private Long ownerId;

	private Long maxConsume;

	private Integer threadID;

	private String dBName;

	private String sortMethod;

	private Long maxScanRows;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getMinScanRows() {
		return this.minScanRows;
	}

	public void setMinScanRows(Long minScanRows) {
		this.minScanRows = minScanRows;
		if(minScanRows != null){
			putQueryParameter("MinScanRows", minScanRows.toString());
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

	public String getHostAddress() {
		return this.hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
		if(hostAddress != null){
			putQueryParameter("HostAddress", hostAddress);
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

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
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

	public String getPagingID() {
		return this.pagingID;
	}

	public void setPagingID(String pagingID) {
		this.pagingID = pagingID;
		if(pagingID != null){
			putQueryParameter("PagingID", pagingID);
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
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

	public Long getMinConsume() {
		return this.minConsume;
	}

	public void setMinConsume(Long minConsume) {
		this.minConsume = minConsume;
		if(minConsume != null){
			putQueryParameter("MinConsume", minConsume.toString());
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

	public String getQueryKeyword() {
		return this.queryKeyword;
	}

	public void setQueryKeyword(String queryKeyword) {
		this.queryKeyword = queryKeyword;
		if(queryKeyword != null){
			putQueryParameter("QueryKeyword", queryKeyword);
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

	public Long getMaxConsume() {
		return this.maxConsume;
	}

	public void setMaxConsume(Long maxConsume) {
		this.maxConsume = maxConsume;
		if(maxConsume != null){
			putQueryParameter("MaxConsume", maxConsume.toString());
		}
	}

	public Integer getThreadID() {
		return this.threadID;
	}

	public void setThreadID(Integer threadID) {
		this.threadID = threadID;
		if(threadID != null){
			putQueryParameter("ThreadID", threadID.toString());
		}
	}

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
		if(dBName != null){
			putQueryParameter("DBName", dBName);
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

	public Long getMaxScanRows() {
		return this.maxScanRows;
	}

	public void setMaxScanRows(Long maxScanRows) {
		this.maxScanRows = maxScanRows;
		if(maxScanRows != null){
			putQueryParameter("MaxScanRows", maxScanRows.toString());
		}
	}

	@Override
	public Class<DescribeSQLLogRecordsListResponse> getResponseClass() {
		return DescribeSQLLogRecordsListResponse.class;
	}

}

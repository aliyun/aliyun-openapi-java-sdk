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
public class DescribeTemplatesListRequest extends RpcAcsRequest<DescribeTemplatesListResponse> {
	
	public DescribeTemplatesListRequest() {
		super("Rds", "2014-08-15", "DescribeTemplatesList", "Rds");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Integer minAvgConsume;

	private String ownerAccount;

	private Integer maxRecordsPerPage;

	private String endTime;

	private String startTime;

	private Long ownerId;

	private Integer maxAvgConsume;

	private String sortKey;

	private Integer minAvgScanRows;

	private String sqType;

	private String securityToken;

	private String sortMethod;

	private Integer pageNumbers;

	private String pagingId;

	private String dBInstanceId;

	private Integer maxAvgScanRows;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Integer getMinAvgConsume() {
		return this.minAvgConsume;
	}

	public void setMinAvgConsume(Integer minAvgConsume) {
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public Integer getMaxAvgConsume() {
		return this.maxAvgConsume;
	}

	public void setMaxAvgConsume(Integer maxAvgConsume) {
		this.maxAvgConsume = maxAvgConsume;
		if(maxAvgConsume != null){
			putQueryParameter("MaxAvgConsume", maxAvgConsume.toString());
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

	public Integer getMinAvgScanRows() {
		return this.minAvgScanRows;
	}

	public void setMinAvgScanRows(Integer minAvgScanRows) {
		this.minAvgScanRows = minAvgScanRows;
		if(minAvgScanRows != null){
			putQueryParameter("MinAvgScanRows", minAvgScanRows.toString());
		}
	}

	public String getSqType() {
		return this.sqType;
	}

	public void setSqType(String sqType) {
		this.sqType = sqType;
		if(sqType != null){
			putQueryParameter("SqType", sqType);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public Integer getMaxAvgScanRows() {
		return this.maxAvgScanRows;
	}

	public void setMaxAvgScanRows(Integer maxAvgScanRows) {
		this.maxAvgScanRows = maxAvgScanRows;
		if(maxAvgScanRows != null){
			putQueryParameter("MaxAvgScanRows", maxAvgScanRows.toString());
		}
	}

	@Override
	public Class<DescribeTemplatesListResponse> getResponseClass() {
		return DescribeTemplatesListResponse.class;
	}

}

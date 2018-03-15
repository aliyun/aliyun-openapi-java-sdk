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
public class DescribeDBInstancesByPerformanceRequest extends RpcAcsRequest<DescribeDBInstancesByPerformanceResponse> {
	
	public DescribeDBInstancesByPerformanceRequest() {
		super("Rds", "2014-08-15", "DescribeDBInstancesByPerformance", "rds");
	}

	private String tag4value;

	private Long resourceOwnerId;

	private String tag2key;

	private String tag5key;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String tag3key;

	private Long ownerId;

	private String tag5value;

	private Integer pageNumber;

	private String tags;

	private String tag1key;

	private String tag1value;

	private String sortKey;

	private String sortMethod;

	private String tag2value;

	private Integer pageSize;

	private String tag4key;

	private String dBInstanceId;

	private String tag3value;

	private String proxyId;

	public String getTag4value() {
		return this.tag4value;
	}

	public void setTag4value(String tag4value) {
		this.tag4value = tag4value;
		if(tag4value != null){
			putQueryParameter("Tag.4.value", tag4value);
		}
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

	public String getTag2key() {
		return this.tag2key;
	}

	public void setTag2key(String tag2key) {
		this.tag2key = tag2key;
		if(tag2key != null){
			putQueryParameter("Tag.2.key", tag2key);
		}
	}

	public String getTag5key() {
		return this.tag5key;
	}

	public void setTag5key(String tag5key) {
		this.tag5key = tag5key;
		if(tag5key != null){
			putQueryParameter("Tag.5.key", tag5key);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getTag3key() {
		return this.tag3key;
	}

	public void setTag3key(String tag3key) {
		this.tag3key = tag3key;
		if(tag3key != null){
			putQueryParameter("Tag.3.key", tag3key);
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

	public String getTag5value() {
		return this.tag5value;
	}

	public void setTag5value(String tag5value) {
		this.tag5value = tag5value;
		if(tag5value != null){
			putQueryParameter("Tag.5.value", tag5value);
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

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getTag1key() {
		return this.tag1key;
	}

	public void setTag1key(String tag1key) {
		this.tag1key = tag1key;
		if(tag1key != null){
			putQueryParameter("Tag.1.key", tag1key);
		}
	}

	public String getTag1value() {
		return this.tag1value;
	}

	public void setTag1value(String tag1value) {
		this.tag1value = tag1value;
		if(tag1value != null){
			putQueryParameter("Tag.1.value", tag1value);
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

	public String getSortMethod() {
		return this.sortMethod;
	}

	public void setSortMethod(String sortMethod) {
		this.sortMethod = sortMethod;
		if(sortMethod != null){
			putQueryParameter("SortMethod", sortMethod);
		}
	}

	public String getTag2value() {
		return this.tag2value;
	}

	public void setTag2value(String tag2value) {
		this.tag2value = tag2value;
		if(tag2value != null){
			putQueryParameter("Tag.2.value", tag2value);
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

	public String getTag4key() {
		return this.tag4key;
	}

	public void setTag4key(String tag4key) {
		this.tag4key = tag4key;
		if(tag4key != null){
			putQueryParameter("Tag.4.key", tag4key);
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

	public String getTag3value() {
		return this.tag3value;
	}

	public void setTag3value(String tag3value) {
		this.tag3value = tag3value;
		if(tag3value != null){
			putQueryParameter("Tag.3.value", tag3value);
		}
	}

	public String getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
		if(proxyId != null){
			putQueryParameter("proxyId", proxyId);
		}
	}

	@Override
	public Class<DescribeDBInstancesByPerformanceResponse> getResponseClass() {
		return DescribeDBInstancesByPerformanceResponse.class;
	}

}

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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class QueryResourceTransitRequest extends RpcAcsRequest<QueryResourceTransitResponse> {
	
	public QueryResourceTransitRequest() {
		super("EcsInc", "2016-03-14", "QueryResourceTransit", "ecs", "innerAPI");
	}

	private String resourceId;

	private Long resourceOwnerId;

	private List<Integer> resourceStatusLists;

	private String resourceOwnerAccount;

	private List<String> resourceTypeLists;

	private String ownerAccount;

	private String fromRegionNo;

	private Long ownerId;

	private String resourceTransitId;

	private Integer pageNo;

	private Long dbId;

	private Integer pageSize;

	private Long aliUid;

	private String resourceName;

	private List<Tag> tags;

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
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

	public List<Integer> getResourceStatusLists() {
		return this.resourceStatusLists;
	}

	public void setResourceStatusLists(List<Integer> resourceStatusLists) {
		this.resourceStatusLists = resourceStatusLists;	
		if (resourceStatusLists != null) {
			for (int i = 0; i < resourceStatusLists.size(); i++) {
				putQueryParameter("ResourceStatusList." + (i + 1) , resourceStatusLists.get(i));
			}
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

	public List<String> getResourceTypeLists() {
		return this.resourceTypeLists;
	}

	public void setResourceTypeLists(List<String> resourceTypeLists) {
		this.resourceTypeLists = resourceTypeLists;	
		if (resourceTypeLists != null) {
			for (int i = 0; i < resourceTypeLists.size(); i++) {
				putQueryParameter("ResourceTypeList." + (i + 1) , resourceTypeLists.get(i));
			}
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

	public String getFromRegionNo() {
		return this.fromRegionNo;
	}

	public void setFromRegionNo(String fromRegionNo) {
		this.fromRegionNo = fromRegionNo;
		if(fromRegionNo != null){
			putQueryParameter("FromRegionNo", fromRegionNo);
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

	public String getResourceTransitId() {
		return this.resourceTransitId;
	}

	public void setResourceTransitId(String resourceTransitId) {
		this.resourceTransitId = resourceTransitId;
		if(resourceTransitId != null){
			putQueryParameter("ResourceTransitId", resourceTransitId);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Long getDbId() {
		return this.dbId;
	}

	public void setDbId(Long dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putQueryParameter("DbId", dbId.toString());
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

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<QueryResourceTransitResponse> getResponseClass() {
		return QueryResourceTransitResponse.class;
	}

}

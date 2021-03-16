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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourcesRequest extends RpcAcsRequest<OpsDescribeResourcesResponse> {
	   

	private Long resourceOwnerId;

	private String searchProduct;

	private String global;

	private List<TemplateTag> templateTags;

	private Integer from;

	private Long aliUid;

	private String keyword;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<TagFilter> tagFilters;

	private String resourceType;

	private String regionNo;

	private List<Filter> filters;

	private String marker;

	private String bid;

	private Integer maxItems;

	private String auditParamStr;
	public OpsDescribeResourcesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeResources", "ecs");
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

	public String getSearchProduct() {
		return this.searchProduct;
	}

	public void setSearchProduct(String searchProduct) {
		this.searchProduct = searchProduct;
		if(searchProduct != null){
			putQueryParameter("SearchProduct", searchProduct);
		}
	}

	public String getGlobal() {
		return this.global;
	}

	public void setGlobal(String global) {
		this.global = global;
		if(global != null){
			putQueryParameter("Global", global);
		}
	}

	public List<TemplateTag> getTemplateTags() {
		return this.templateTags;
	}

	public void setTemplateTags(List<TemplateTag> templateTags) {
		this.templateTags = templateTags;	
		if (templateTags != null) {
			for (int depth1 = 0; depth1 < templateTags.size(); depth1++) {
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Key" , templateTags.get(depth1).getKey());
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Value" , templateTags.get(depth1).getValue());
			}
		}	
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<TagFilter> getTagFilters() {
		return this.tagFilters;
	}

	public void setTagFilters(List<TagFilter> tagFilters) {
		this.tagFilters = tagFilters;	
		if (tagFilters != null) {
			for (int depth1 = 0; depth1 < tagFilters.size(); depth1++) {
				putQueryParameter("TagFilter." + (depth1 + 1) + ".TagKey" , tagFilters.get(depth1).getTagKey());
				putQueryParameter("TagFilter." + (depth1 + 1) + ".Operation" , tagFilters.get(depth1).getOperation());
				if (tagFilters.get(depth1).getTagValuess() != null) {
					for (int i = 0; i < tagFilters.get(depth1).getTagValuess().size(); i++) {
						putQueryParameter("TagFilter." + (depth1 + 1) + ".TagValues." + (i + 1) , tagFilters.get(depth1).getTagValuess().get(i));
					}
				}
			}
		}	
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;	
		if (filters != null) {
			for (int depth1 = 0; depth1 < filters.size(); depth1++) {
				putQueryParameter("Filter." + (depth1 + 1) + ".AttributeName" , filters.get(depth1).getAttributeName());
				putQueryParameter("Filter." + (depth1 + 1) + ".Operation" , filters.get(depth1).getOperation());
				putQueryParameter("Filter." + (depth1 + 1) + ".AttributeValue" , filters.get(depth1).getAttributeValue());
			}
		}	
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public Integer getMaxItems() {
		return this.maxItems;
	}

	public void setMaxItems(Integer maxItems) {
		this.maxItems = maxItems;
		if(maxItems != null){
			putQueryParameter("MaxItems", maxItems.toString());
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

	public static class TemplateTag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class TagFilter {

		private String tagKey;

		private String operation;

		private List<String> tagValuess;

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public List<String> getTagValuess() {
			return this.tagValuess;
		}

		public void setTagValuess(List<String> tagValuess) {
			this.tagValuess = tagValuess;
		}
	}

	public static class Filter {

		private String attributeName;

		private String operation;

		private String attributeValue;

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public String getAttributeValue() {
			return this.attributeValue;
		}

		public void setAttributeValue(String attributeValue) {
			this.attributeValue = attributeValue;
		}
	}

	@Override
	public Class<OpsDescribeResourcesResponse> getResponseClass() {
		return OpsDescribeResourcesResponse.class;
	}

}

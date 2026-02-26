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

package com.aliyuncs.pvtz.model.v20180101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pvtz.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeZonesRequest extends RpcAcsRequest<DescribeZonesResponse> {
	   

	private String queryVpcId;

	private Integer pageNumber;

	private String resourceGroupId;

	private Integer pageSize;

	private List<ResourceTag> resourceTags;

	private String lang;

	private String keyword;

	private List<String> zoneTags;

	private String searchMode;

	private String zoneType;

	private String queryRegionId;
	public DescribeZonesRequest() {
		super("pvtz", "2018-01-01", "DescribeZones", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueryVpcId() {
		return this.queryVpcId;
	}

	public void setQueryVpcId(String queryVpcId) {
		this.queryVpcId = queryVpcId;
		if(queryVpcId != null){
			putQueryParameter("QueryVpcId", queryVpcId);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public List<ResourceTag> getResourceTags() {
		return this.resourceTags;
	}

	public void setResourceTags(List<ResourceTag> resourceTags) {
		this.resourceTags = resourceTags;	
		if (resourceTags != null) {
			for (int depth1 = 0; depth1 < resourceTags.size(); depth1++) {
				putQueryParameter("ResourceTag." + (depth1 + 1) + ".Value" , resourceTags.get(depth1).getValue());
				putQueryParameter("ResourceTag." + (depth1 + 1) + ".Key" , resourceTags.get(depth1).getKey());
			}
		}	
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public List<String> getZoneTags() {
		return this.zoneTags;
	}

	public void setZoneTags(List<String> zoneTags) {
		this.zoneTags = zoneTags;	
		if (zoneTags != null) {
			for (int i = 0; i < zoneTags.size(); i++) {
				putQueryParameter("ZoneTag." + (i + 1) , zoneTags.get(i));
			}
		}	
	}

	public String getSearchMode() {
		return this.searchMode;
	}

	public void setSearchMode(String searchMode) {
		this.searchMode = searchMode;
		if(searchMode != null){
			putQueryParameter("SearchMode", searchMode);
		}
	}

	public String getZoneType() {
		return this.zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
		if(zoneType != null){
			putQueryParameter("ZoneType", zoneType);
		}
	}

	public String getQueryRegionId() {
		return this.queryRegionId;
	}

	public void setQueryRegionId(String queryRegionId) {
		this.queryRegionId = queryRegionId;
		if(queryRegionId != null){
			putQueryParameter("QueryRegionId", queryRegionId);
		}
	}

	public static class ResourceTag {

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
	public Class<DescribeZonesResponse> getResponseClass() {
		return DescribeZonesResponse.class;
	}

}

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

/**
 * @author auto create
 * @version 
 */
public class DescribeZonesRequest extends RpcAcsRequest<DescribeZonesResponse> {
	
	public DescribeZonesRequest() {
		super("pvtz", "2018-01-01", "DescribeZones", "pvtz");
	}

	private String queryVpcId;

	private Integer pageSize;

	private String searchMode;

	private String lang;

	private String keyword;

	private Integer pageNumber;

	private String queryRegionId;

	public String getQueryVpcId() {
		return this.queryVpcId;
	}

	public void setQueryVpcId(String queryVpcId) {
		this.queryVpcId = queryVpcId;
		if(queryVpcId != null){
			putQueryParameter("QueryVpcId", queryVpcId);
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

	public String getSearchMode() {
		return this.searchMode;
	}

	public void setSearchMode(String searchMode) {
		this.searchMode = searchMode;
		if(searchMode != null){
			putQueryParameter("SearchMode", searchMode);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	@Override
	public Class<DescribeZonesResponse> getResponseClass() {
		return DescribeZonesResponse.class;
	}

}

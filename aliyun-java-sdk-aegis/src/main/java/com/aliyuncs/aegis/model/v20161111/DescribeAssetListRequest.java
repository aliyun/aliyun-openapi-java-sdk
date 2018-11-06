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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssetListRequest extends RpcAcsRequest<DescribeAssetListResponse> {
	
	public DescribeAssetListRequest() {
		super("aegis", "2016-11-11", "DescribeAssetList", "vipaegis");
	}

	private String sourceIp;

	private Integer pageSize;

	private Integer currentPage;

	private String lang;

	private String filterConditions;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
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

	public String getFilterConditions() {
		return this.filterConditions;
	}

	public void setFilterConditions(String filterConditions) {
		this.filterConditions = filterConditions;
		if(filterConditions != null){
			putQueryParameter("FilterConditions", filterConditions);
		}
	}

	@Override
	public Class<DescribeAssetListResponse> getResponseClass() {
		return DescribeAssetListResponse.class;
	}

}

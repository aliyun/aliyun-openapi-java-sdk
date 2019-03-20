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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListMonitoringTemplatesRequest extends RpcAcsRequest<ListMonitoringTemplatesResponse> {
	
	public ListMonitoringTemplatesRequest() {
		super("Cms", "2018-03-08", "ListMonitoringTemplates", "cms");
	}

	private Boolean total;

	private String name;

	private Long pageSize;

	private Long id;

	private Boolean history;

	private String keyword;

	private Long pageNumber;

	public Boolean getTotal() {
		return this.total;
	}

	public void setTotal(Boolean total) {
		this.total = total;
		if(total != null){
			putQueryParameter("Total", total.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Boolean getHistory() {
		return this.history;
	}

	public void setHistory(Boolean history) {
		this.history = history;
		if(history != null){
			putQueryParameter("History", history.toString());
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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListMonitoringTemplatesResponse> getResponseClass() {
		return ListMonitoringTemplatesResponse.class;
	}

}

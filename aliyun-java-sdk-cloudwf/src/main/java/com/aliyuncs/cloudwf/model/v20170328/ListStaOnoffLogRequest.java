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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListStaOnoffLogRequest extends RpcAcsRequest<ListStaOnoffLogResponse> {
	
	public ListStaOnoffLogRequest() {
		super("cloudwf", "2017-03-28", "ListStaOnoffLog", "cloudwf");
	}

	private String orderCol;

	private String searchSsid;

	private String searchApName;

	private Integer length;

	private String searchUsername;

	private Integer pageIndex;

	private Long id;

	private String orderDir;

	public String getOrderCol() {
		return this.orderCol;
	}

	public void setOrderCol(String orderCol) {
		this.orderCol = orderCol;
		if(orderCol != null){
			putQueryParameter("OrderCol", orderCol);
		}
	}

	public String getSearchSsid() {
		return this.searchSsid;
	}

	public void setSearchSsid(String searchSsid) {
		this.searchSsid = searchSsid;
		if(searchSsid != null){
			putQueryParameter("SearchSsid", searchSsid);
		}
	}

	public String getSearchApName() {
		return this.searchApName;
	}

	public void setSearchApName(String searchApName) {
		this.searchApName = searchApName;
		if(searchApName != null){
			putQueryParameter("SearchApName", searchApName);
		}
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length.toString());
		}
	}

	public String getSearchUsername() {
		return this.searchUsername;
	}

	public void setSearchUsername(String searchUsername) {
		this.searchUsername = searchUsername;
		if(searchUsername != null){
			putQueryParameter("SearchUsername", searchUsername);
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
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

	public String getOrderDir() {
		return this.orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
		if(orderDir != null){
			putQueryParameter("OrderDir", orderDir);
		}
	}

	@Override
	public Class<ListStaOnoffLogResponse> getResponseClass() {
		return ListStaOnoffLogResponse.class;
	}

}

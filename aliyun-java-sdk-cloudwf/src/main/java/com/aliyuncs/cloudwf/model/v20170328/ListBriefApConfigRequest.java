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
public class ListBriefApConfigRequest extends RpcAcsRequest<ListBriefApConfigResponse> {
	
	public ListBriefApConfigRequest() {
		super("cloudwf", "2017-03-28", "ListBriefApConfig", "cloudwf");
	}

	private Integer searchScan;

	private String orderCol;

	private String searchName;

	private Integer length;

	private String searchMac;

	private Integer pageIndex;

	private String orderDir;

	private String searchModel;

	public Integer getSearchScan() {
		return this.searchScan;
	}

	public void setSearchScan(Integer searchScan) {
		this.searchScan = searchScan;
		if(searchScan != null){
			putQueryParameter("SearchScan", searchScan.toString());
		}
	}

	public String getOrderCol() {
		return this.orderCol;
	}

	public void setOrderCol(String orderCol) {
		this.orderCol = orderCol;
		if(orderCol != null){
			putQueryParameter("OrderCol", orderCol);
		}
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
		if(searchName != null){
			putQueryParameter("SearchName", searchName);
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

	public String getSearchMac() {
		return this.searchMac;
	}

	public void setSearchMac(String searchMac) {
		this.searchMac = searchMac;
		if(searchMac != null){
			putQueryParameter("SearchMac", searchMac);
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

	public String getOrderDir() {
		return this.orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
		if(orderDir != null){
			putQueryParameter("OrderDir", orderDir);
		}
	}

	public String getSearchModel() {
		return this.searchModel;
	}

	public void setSearchModel(String searchModel) {
		this.searchModel = searchModel;
		if(searchModel != null){
			putQueryParameter("SearchModel", searchModel);
		}
	}

	@Override
	public Class<ListBriefApConfigResponse> getResponseClass() {
		return ListBriefApConfigResponse.class;
	}

}

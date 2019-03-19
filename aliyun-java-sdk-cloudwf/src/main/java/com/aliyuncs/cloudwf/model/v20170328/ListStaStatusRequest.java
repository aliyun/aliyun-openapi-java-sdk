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
public class ListStaStatusRequest extends RpcAcsRequest<ListStaStatusResponse> {
	
	public ListStaStatusRequest() {
		super("cloudwf", "2017-03-28", "ListStaStatus", "cloudwf");
	}

	private String orderCol;

	private String searchGroupName;

	private Integer searchStatus;

	private Integer length;

	private String searchUsername;

	private String orderDir;

	private String searchProtocal;

	private String searchSsid;

	private String searchApName;

	private String searchIp;

	private Integer pageIndex;

	private String searchMac;

	private String searchDescription;

	public String getOrderCol() {
		return this.orderCol;
	}

	public void setOrderCol(String orderCol) {
		this.orderCol = orderCol;
		if(orderCol != null){
			putQueryParameter("OrderCol", orderCol);
		}
	}

	public String getSearchGroupName() {
		return this.searchGroupName;
	}

	public void setSearchGroupName(String searchGroupName) {
		this.searchGroupName = searchGroupName;
		if(searchGroupName != null){
			putQueryParameter("SearchGroupName", searchGroupName);
		}
	}

	public Integer getSearchStatus() {
		return this.searchStatus;
	}

	public void setSearchStatus(Integer searchStatus) {
		this.searchStatus = searchStatus;
		if(searchStatus != null){
			putQueryParameter("SearchStatus", searchStatus.toString());
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

	public String getOrderDir() {
		return this.orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
		if(orderDir != null){
			putQueryParameter("OrderDir", orderDir);
		}
	}

	public String getSearchProtocal() {
		return this.searchProtocal;
	}

	public void setSearchProtocal(String searchProtocal) {
		this.searchProtocal = searchProtocal;
		if(searchProtocal != null){
			putQueryParameter("SearchProtocal", searchProtocal);
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

	public String getSearchIp() {
		return this.searchIp;
	}

	public void setSearchIp(String searchIp) {
		this.searchIp = searchIp;
		if(searchIp != null){
			putQueryParameter("SearchIp", searchIp);
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

	public String getSearchMac() {
		return this.searchMac;
	}

	public void setSearchMac(String searchMac) {
		this.searchMac = searchMac;
		if(searchMac != null){
			putQueryParameter("SearchMac", searchMac);
		}
	}

	public String getSearchDescription() {
		return this.searchDescription;
	}

	public void setSearchDescription(String searchDescription) {
		this.searchDescription = searchDescription;
		if(searchDescription != null){
			putQueryParameter("SearchDescription", searchDescription);
		}
	}

	@Override
	public Class<ListStaStatusResponse> getResponseClass() {
		return ListStaStatusResponse.class;
	}

}

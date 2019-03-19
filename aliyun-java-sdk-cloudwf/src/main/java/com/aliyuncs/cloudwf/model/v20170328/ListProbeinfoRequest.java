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
public class ListProbeinfoRequest extends RpcAcsRequest<ListProbeinfoResponse> {
	
	public ListProbeinfoRequest() {
		super("cloudwf", "2017-03-28", "ListProbeinfo", "cloudwf");
	}

	private String orderCol;

	private String searchUserMac;

	private String searchSensorMac;

	private Integer length;

	private String searchSensorName;

	private Integer pageIndex;

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

	public String getSearchUserMac() {
		return this.searchUserMac;
	}

	public void setSearchUserMac(String searchUserMac) {
		this.searchUserMac = searchUserMac;
		if(searchUserMac != null){
			putQueryParameter("SearchUserMac", searchUserMac);
		}
	}

	public String getSearchSensorMac() {
		return this.searchSensorMac;
	}

	public void setSearchSensorMac(String searchSensorMac) {
		this.searchSensorMac = searchSensorMac;
		if(searchSensorMac != null){
			putQueryParameter("SearchSensorMac", searchSensorMac);
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

	public String getSearchSensorName() {
		return this.searchSensorName;
	}

	public void setSearchSensorName(String searchSensorName) {
		this.searchSensorName = searchSensorName;
		if(searchSensorName != null){
			putQueryParameter("SearchSensorName", searchSensorName);
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

	@Override
	public Class<ListProbeinfoResponse> getResponseClass() {
		return ListProbeinfoResponse.class;
	}

}

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
public class ListApRadioStatusRequest extends RpcAcsRequest<ListApRadioStatusResponse> {
	
	public ListApRadioStatusRequest() {
		super("cloudwf", "2017-03-28", "ListApRadioStatus", "cloudwf");
	}

	private Integer searchDisabled;

	private String orderCol;

	private String searchName;

	private Integer searchChannelEquals;

	private Integer length;

	private String searchMac;

	private String searchApgroupName;

	private Integer pageIndex;

	private String orderDir;

	private Integer searchApStatus;

	public Integer getSearchDisabled() {
		return this.searchDisabled;
	}

	public void setSearchDisabled(Integer searchDisabled) {
		this.searchDisabled = searchDisabled;
		if(searchDisabled != null){
			putQueryParameter("SearchDisabled", searchDisabled.toString());
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

	public Integer getSearchChannelEquals() {
		return this.searchChannelEquals;
	}

	public void setSearchChannelEquals(Integer searchChannelEquals) {
		this.searchChannelEquals = searchChannelEquals;
		if(searchChannelEquals != null){
			putQueryParameter("SearchChannelEquals", searchChannelEquals.toString());
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

	public String getSearchApgroupName() {
		return this.searchApgroupName;
	}

	public void setSearchApgroupName(String searchApgroupName) {
		this.searchApgroupName = searchApgroupName;
		if(searchApgroupName != null){
			putQueryParameter("SearchApgroupName", searchApgroupName);
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

	public Integer getSearchApStatus() {
		return this.searchApStatus;
	}

	public void setSearchApStatus(Integer searchApStatus) {
		this.searchApStatus = searchApStatus;
		if(searchApStatus != null){
			putQueryParameter("SearchApStatus", searchApStatus.toString());
		}
	}

	@Override
	public Class<ListApRadioStatusResponse> getResponseClass() {
		return ListApRadioStatusResponse.class;
	}

}

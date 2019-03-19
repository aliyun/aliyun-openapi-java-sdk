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
public class ListApPositionMapRequest extends RpcAcsRequest<ListApPositionMapResponse> {
	
	public ListApPositionMapRequest() {
		super("cloudwf", "2017-03-28", "ListApPositionMap", "cloudwf");
	}

	private String orderCol;

	private String searchName;

	private Integer totalItem;

	private Integer length;

	private Integer mapType;

	private Integer pageIndex;

	private String searchApgroupName;

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

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
		if(searchName != null){
			putQueryParameter("SearchName", searchName);
		}
	}

	public Integer getTotalItem() {
		return this.totalItem;
	}

	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
		if(totalItem != null){
			putQueryParameter("TotalItem", totalItem.toString());
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

	public Integer getMapType() {
		return this.mapType;
	}

	public void setMapType(Integer mapType) {
		this.mapType = mapType;
		if(mapType != null){
			putQueryParameter("MapType", mapType.toString());
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

	public String getSearchApgroupName() {
		return this.searchApgroupName;
	}

	public void setSearchApgroupName(String searchApgroupName) {
		this.searchApgroupName = searchApgroupName;
		if(searchApgroupName != null){
			putQueryParameter("SearchApgroupName", searchApgroupName);
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
	public Class<ListApPositionMapResponse> getResponseClass() {
		return ListApPositionMapResponse.class;
	}

}

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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapCameraStatisticsRequest extends RpcAcsRequest<ListCityMapCameraStatisticsResponse> {
	   

	private String endTime;

	private String startTime;

	private Long pageNumber;

	private String dataSourceIdList;

	private Long pageSize;
	public ListCityMapCameraStatisticsRequest() {
		super("CDRS", "2020-11-01", "ListCityMapCameraStatistics");
		setMethod(MethodType.POST);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getDataSourceIdList() {
		return this.dataSourceIdList;
	}

	public void setDataSourceIdList(String dataSourceIdList) {
		this.dataSourceIdList = dataSourceIdList;
		if(dataSourceIdList != null){
			putBodyParameter("DataSourceIdList", dataSourceIdList);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<ListCityMapCameraStatisticsResponse> getResponseClass() {
		return ListCityMapCameraStatisticsResponse.class;
	}

}

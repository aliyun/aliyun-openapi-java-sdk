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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapPersonFlowRequest extends RpcAcsRequest<ListCityMapPersonFlowResponse> {
	   

	private String endTime;

	private String range;

	private String startTime;

	private List<Object> originDataSourceIdList;

	private Long pageNumber;

	private String targetDataSourceIdList;

	private Long pageSize;
	public ListCityMapPersonFlowRequest() {
		super("CDRS", "2020-11-01", "ListCityMapPersonFlow");
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

	public String getRange() {
		return this.range;
	}

	public void setRange(String range) {
		this.range = range;
		if(range != null){
			putBodyParameter("Range", range);
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

	public List<Object> getOriginDataSourceIdList() {
		return this.originDataSourceIdList;
	}

	public void setOriginDataSourceIdList(List<Object> originDataSourceIdList) {
		this.originDataSourceIdList = originDataSourceIdList;
		if(originDataSourceIdList != null){
			putBodyParameter("OriginDataSourceIdList", new Gson().toJson(originDataSourceIdList));
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

	public String getTargetDataSourceIdList() {
		return this.targetDataSourceIdList;
	}

	public void setTargetDataSourceIdList(String targetDataSourceIdList) {
		this.targetDataSourceIdList = targetDataSourceIdList;
		if(targetDataSourceIdList != null){
			putBodyParameter("TargetDataSourceIdList", targetDataSourceIdList);
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
	public Class<ListCityMapPersonFlowResponse> getResponseClass() {
		return ListCityMapPersonFlowResponse.class;
	}

}

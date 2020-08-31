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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPersonVisitCountRequest extends RpcAcsRequest<ListPersonVisitCountResponse> {
	   

	private String corpId;

	private String endTime;

	private String countType;

	private String startTime;

	private Integer pageNumber;

	private String timeAggregateType;

	private String maxVal;

	private String tagCode;

	private String minVal;

	private Integer pageSize;

	private String aggregateType;
	public ListPersonVisitCountRequest() {
		super("Vcs", "2020-05-15", "ListPersonVisitCount");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
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

	public String getCountType() {
		return this.countType;
	}

	public void setCountType(String countType) {
		this.countType = countType;
		if(countType != null){
			putBodyParameter("CountType", countType);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getTimeAggregateType() {
		return this.timeAggregateType;
	}

	public void setTimeAggregateType(String timeAggregateType) {
		this.timeAggregateType = timeAggregateType;
		if(timeAggregateType != null){
			putBodyParameter("TimeAggregateType", timeAggregateType);
		}
	}

	public String getMaxVal() {
		return this.maxVal;
	}

	public void setMaxVal(String maxVal) {
		this.maxVal = maxVal;
		if(maxVal != null){
			putBodyParameter("MaxVal", maxVal);
		}
	}

	public String getTagCode() {
		return this.tagCode;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
		if(tagCode != null){
			putBodyParameter("TagCode", tagCode);
		}
	}

	public String getMinVal() {
		return this.minVal;
	}

	public void setMinVal(String minVal) {
		this.minVal = minVal;
		if(minVal != null){
			putBodyParameter("MinVal", minVal);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getAggregateType() {
		return this.aggregateType;
	}

	public void setAggregateType(String aggregateType) {
		this.aggregateType = aggregateType;
		if(aggregateType != null){
			putBodyParameter("AggregateType", aggregateType);
		}
	}

	@Override
	public Class<ListPersonVisitCountResponse> getResponseClass() {
		return ListPersonVisitCountResponse.class;
	}

}

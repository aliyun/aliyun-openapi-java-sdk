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
public class ListEventAlgorithmDetailsRequest extends RpcAcsRequest<ListEventAlgorithmDetailsResponse> {
	   

	private String sourceId;

	private String corpId;

	private String extendValue;

	private String endTime;

	private String startTime;

	private Integer pageNumber;

	private String recordId;

	private String eventValue;

	private String dataSourceId;

	private Integer pageSize;

	private String eventType;
	public ListEventAlgorithmDetailsRequest() {
		super("Vcs", "2020-05-15", "ListEventAlgorithmDetails");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putBodyParameter("SourceId", sourceId);
		}
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

	public String getExtendValue() {
		return this.extendValue;
	}

	public void setExtendValue(String extendValue) {
		this.extendValue = extendValue;
		if(extendValue != null){
			putBodyParameter("ExtendValue", extendValue);
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

	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
		if(recordId != null){
			putBodyParameter("RecordId", recordId);
		}
	}

	public String getEventValue() {
		return this.eventValue;
	}

	public void setEventValue(String eventValue) {
		this.eventValue = eventValue;
		if(eventValue != null){
			putBodyParameter("EventValue", eventValue);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
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

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putBodyParameter("EventType", eventType);
		}
	}

	@Override
	public Class<ListEventAlgorithmDetailsResponse> getResponseClass() {
		return ListEventAlgorithmDetailsResponse.class;
	}

}

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
public class ListDevicePersonStatisticsRequest extends RpcAcsRequest<ListDevicePersonStatisticsResponse> {
	   

	private String statisticsType;

	private String corpId;

	private String endTime;

	private String startTime;

	private String dataSourceId;
	public ListDevicePersonStatisticsRequest() {
		super("CDRS", "2020-11-01", "ListDevicePersonStatistics");
		setMethod(MethodType.POST);
	}

	public String getStatisticsType() {
		return this.statisticsType;
	}

	public void setStatisticsType(String statisticsType) {
		this.statisticsType = statisticsType;
		if(statisticsType != null){
			putBodyParameter("StatisticsType", statisticsType);
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

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	@Override
	public Class<ListDevicePersonStatisticsResponse> getResponseClass() {
		return ListDevicePersonStatisticsResponse.class;
	}

}

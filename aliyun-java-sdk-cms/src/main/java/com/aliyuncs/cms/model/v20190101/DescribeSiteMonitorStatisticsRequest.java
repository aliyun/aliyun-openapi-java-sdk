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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorStatisticsRequest extends RpcAcsRequest<DescribeSiteMonitorStatisticsResponse> {
	
	public DescribeSiteMonitorStatisticsRequest() {
		super("Cms", "2019-01-01", "DescribeSiteMonitorStatistics", "cms");
	}

	private String timeRange;

	private String startTime;

	private String metricName;

	private String taskId;

	public String getTimeRange() {
		return this.timeRange;
	}

	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
		if(timeRange != null){
			putQueryParameter("TimeRange", timeRange);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<DescribeSiteMonitorStatisticsResponse> getResponseClass() {
		return DescribeSiteMonitorStatisticsResponse.class;
	}

}

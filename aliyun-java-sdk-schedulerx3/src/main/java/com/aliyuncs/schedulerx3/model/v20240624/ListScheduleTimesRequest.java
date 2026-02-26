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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListScheduleTimesRequest extends RpcAcsRequest<ListScheduleTimesResponse> {
	   

	private String timeZone;

	private String appName;

	private String calendar;

	private String clusterId;

	private String timeExpression;

	private Integer timeType;
	public ListScheduleTimesRequest() {
		super("SchedulerX3", "2024-06-24", "ListScheduleTimes");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putQueryParameter("TimeZone", timeZone);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getCalendar() {
		return this.calendar;
	}

	public void setCalendar(String calendar) {
		this.calendar = calendar;
		if(calendar != null){
			putQueryParameter("Calendar", calendar);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getTimeExpression() {
		return this.timeExpression;
	}

	public void setTimeExpression(String timeExpression) {
		this.timeExpression = timeExpression;
		if(timeExpression != null){
			putQueryParameter("TimeExpression", timeExpression);
		}
	}

	public Integer getTimeType() {
		return this.timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
		if(timeType != null){
			putQueryParameter("TimeType", timeType.toString());
		}
	}

	@Override
	public Class<ListScheduleTimesResponse> getResponseClass() {
		return ListScheduleTimesResponse.class;
	}

}

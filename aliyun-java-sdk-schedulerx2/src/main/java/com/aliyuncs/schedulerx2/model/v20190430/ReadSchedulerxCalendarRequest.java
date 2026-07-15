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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReadSchedulerxCalendarRequest extends RpcAcsRequest<ReadSchedulerxCalendarResponse> {
	   

	private Integer year;

	private Boolean fetchSystemCalendar;

	private String calendarName;

	private Boolean fetchCalendarDetail;

	private String nextToken;

	private Integer maxResults;
	public ReadSchedulerxCalendarRequest() {
		super("schedulerx2", "2019-04-30", "ReadSchedulerxCalendar", "schedulerx2");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
		if(year != null){
			putQueryParameter("Year", year.toString());
		}
	}

	public Boolean getFetchSystemCalendar() {
		return this.fetchSystemCalendar;
	}

	public void setFetchSystemCalendar(Boolean fetchSystemCalendar) {
		this.fetchSystemCalendar = fetchSystemCalendar;
		if(fetchSystemCalendar != null){
			putQueryParameter("FetchSystemCalendar", fetchSystemCalendar.toString());
		}
	}

	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
		if(calendarName != null){
			putQueryParameter("CalendarName", calendarName);
		}
	}

	public Boolean getFetchCalendarDetail() {
		return this.fetchCalendarDetail;
	}

	public void setFetchCalendarDetail(Boolean fetchCalendarDetail) {
		this.fetchCalendarDetail = fetchCalendarDetail;
		if(fetchCalendarDetail != null){
			putQueryParameter("FetchCalendarDetail", fetchCalendarDetail.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ReadSchedulerxCalendarResponse> getResponseClass() {
		return ReadSchedulerxCalendarResponse.class;
	}

}

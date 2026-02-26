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
public class ImportCalendarRequest extends RpcAcsRequest<ImportCalendarResponse> {
	   

	private Integer year;

	private String months;

	private String clusterId;

	private String name;
	public ImportCalendarRequest() {
		super("SchedulerX3", "2024-06-24", "ImportCalendar");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
		if(year != null){
			putBodyParameter("Year", year.toString());
		}
	}

	public String getMonths() {
		return this.months;
	}

	public void setMonths(String months) {
		this.months = months;
		if(months != null){
			putBodyParameter("Months", months);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<ImportCalendarResponse> getResponseClass() {
		return ImportCalendarResponse.class;
	}

}

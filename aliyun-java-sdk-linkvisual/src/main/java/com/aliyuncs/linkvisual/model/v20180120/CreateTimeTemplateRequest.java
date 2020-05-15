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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTimeTemplateRequest extends RpcAcsRequest<CreateTimeTemplateResponse> {
	   

	private List<TimeSections> timeSectionss;

	private Integer allDay;

	private String name;
	public CreateTimeTemplateRequest() {
		super("Linkvisual", "2018-01-20", "CreateTimeTemplate", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<TimeSections> getTimeSectionss() {
		return this.timeSectionss;
	}

	public void setTimeSectionss(List<TimeSections> timeSectionss) {
		this.timeSectionss = timeSectionss;	
		if (timeSectionss != null) {
			for (int depth1 = 0; depth1 < timeSectionss.size(); depth1++) {
				putQueryParameter("TimeSections." + (depth1 + 1) + ".DayOfWeek" , timeSectionss.get(depth1).getDayOfWeek());
				putQueryParameter("TimeSections." + (depth1 + 1) + ".Begin" , timeSectionss.get(depth1).getBegin());
				putQueryParameter("TimeSections." + (depth1 + 1) + ".End" , timeSectionss.get(depth1).getEnd());
			}
		}	
	}

	public Integer getAllDay() {
		return this.allDay;
	}

	public void setAllDay(Integer allDay) {
		this.allDay = allDay;
		if(allDay != null){
			putQueryParameter("AllDay", allDay.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class TimeSections {

		private Integer dayOfWeek;

		private Integer begin;

		private Integer end;

		public Integer getDayOfWeek() {
			return this.dayOfWeek;
		}

		public void setDayOfWeek(Integer dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
		}

		public Integer getBegin() {
			return this.begin;
		}

		public void setBegin(Integer begin) {
			this.begin = begin;
		}

		public Integer getEnd() {
			return this.end;
		}

		public void setEnd(Integer end) {
			this.end = end;
		}
	}

	@Override
	public Class<CreateTimeTemplateResponse> getResponseClass() {
		return CreateTimeTemplateResponse.class;
	}

}

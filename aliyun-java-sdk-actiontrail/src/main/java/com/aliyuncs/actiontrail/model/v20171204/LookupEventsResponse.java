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

package com.aliyuncs.actiontrail.model.v20171204;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20171204.LookupEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;
import com.google.gson.annotations.SerializedName;

/**
 * @author auto create
 * @version 
 */
@XmlRootElement
public class LookupEventsResponse extends AcsResponse {

    @SerializedName("RequestId")
	private String requestId;

    @SerializedName("NextToken")
	private String nextToken;

    @SerializedName("StartTime")
	private String startTime;

    @SerializedName("EndTime")
	private String endTime;

    @SerializedName("Events")
	private List<Map<Object, Object>> events;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<Map<Object, Object>> getEvents() {
		return this.events;
	}

	public void setEvents(List<Map<Object, Object>> events) {
		this.events = events;
	}

	@Override
	public LookupEventsResponse getInstance(UnmarshallerContext context) {
		return	LookupEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

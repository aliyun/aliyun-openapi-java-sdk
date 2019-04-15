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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeSuspEventTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventTypesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Data> eventTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Data> getEventTypes() {
		return this.eventTypes;
	}

	public void setEventTypes(List<Data> eventTypes) {
		this.eventTypes = eventTypes;
	}

	public static class Data {

		private String aliseEventType;

		private String eventType;

		public String getAliseEventType() {
			return this.aliseEventType;
		}

		public void setAliseEventType(String aliseEventType) {
			this.aliseEventType = aliseEventType;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}
	}

	@Override
	public DescribeSuspEventTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspEventTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

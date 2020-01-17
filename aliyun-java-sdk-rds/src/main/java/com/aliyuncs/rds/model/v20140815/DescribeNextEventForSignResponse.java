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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeNextEventForSignResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNextEventForSignResponse extends AcsResponse {

	private String requestId;

	private List<EventItemsItem> eventItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventItemsItem> getEventItems() {
		return this.eventItems;
	}

	public void setEventItems(List<EventItemsItem> eventItems) {
		this.eventItems = eventItems;
	}

	public static class EventItemsItem {

		private Integer eventId;

		private String eventContent;

		public Integer getEventId() {
			return this.eventId;
		}

		public void setEventId(Integer eventId) {
			this.eventId = eventId;
		}

		public String getEventContent() {
			return this.eventContent;
		}

		public void setEventContent(String eventContent) {
			this.eventContent = eventContent;
		}
	}

	@Override
	public DescribeNextEventForSignResponse getInstance(UnmarshallerContext context) {
		return	DescribeNextEventForSignResponseUnmarshaller.unmarshall(this, context);
	}
}

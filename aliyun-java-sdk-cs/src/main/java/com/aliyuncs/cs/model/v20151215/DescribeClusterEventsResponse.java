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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeClusterEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterEventsResponse extends AcsResponse {

	private List<Event> events;

	private Page_info page_info;

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Page_info getPage_info() {
		return this.page_info;
	}

	public void setPage_info(Page_info page_info) {
		this.page_info = page_info;
	}

	public static class Event {

		private String event_id;

		private String type;

		private String source;

		private String subject;

		private String time;

		private String cluster_id;

		private Data data;

		public String getEvent_id() {
			return this.event_id;
		}

		public void setEvent_id(String event_id) {
			this.event_id = event_id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getCluster_id() {
			return this.cluster_id;
		}

		public void setCluster_id(String cluster_id) {
			this.cluster_id = cluster_id;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String level;

			private String reason;

			private String message;

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	public static class Page_info {

		private Long page_size;

		private Long page_number;

		private Long total_count;

		public Long getPage_size() {
			return this.page_size;
		}

		public void setPage_size(Long page_size) {
			this.page_size = page_size;
		}

		public Long getPage_number() {
			return this.page_number;
		}

		public void setPage_number(Long page_number) {
			this.page_number = page_number;
		}

		public Long getTotal_count() {
			return this.total_count;
		}

		public void setTotal_count(Long total_count) {
			this.total_count = total_count;
		}
	}

	@Override
	public DescribeClusterEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

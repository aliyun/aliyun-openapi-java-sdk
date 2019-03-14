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

package com.aliyuncs.sas_api.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas_api.transform.v20170705.DescribeHitRateColumnResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHitRateColumnResponse extends AcsResponse {

	private String requestId;

	private List<Item> items;

	private TimeScope timeScope;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public TimeScope getTimeScope() {
		return this.timeScope;
	}

	public void setTimeScope(TimeScope timeScope) {
		this.timeScope = timeScope;
	}

	public static class Item {

		private Long data;

		private String id;

		private String name;

		public Long getData() {
			return this.data;
		}

		public void setData(Long data) {
			this.data = data;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class TimeScope {

		private Long interval;

		private Long start;

		public Long getInterval() {
			return this.interval;
		}

		public void setInterval(Long interval) {
			this.interval = interval;
		}

		public Long getStart() {
			return this.start;
		}

		public void setStart(Long start) {
			this.start = start;
		}
	}

	@Override
	public DescribeHitRateColumnResponse getInstance(UnmarshallerContext context) {
		return	DescribeHitRateColumnResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

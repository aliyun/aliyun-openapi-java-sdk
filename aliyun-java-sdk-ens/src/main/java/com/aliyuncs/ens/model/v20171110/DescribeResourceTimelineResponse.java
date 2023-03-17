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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeResourceTimelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceTimelineResponse extends AcsResponse {

	private String requestId;

	private String msg;

	private String desc;

	private List<AvailableEventsItem> availableEvents;

	private List<BizEventsItem> bizEvents;

	private List<InventoryEventsItem> inventoryEvents;

	private List<ReserveEventsItem> reserveEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<AvailableEventsItem> getAvailableEvents() {
		return this.availableEvents;
	}

	public void setAvailableEvents(List<AvailableEventsItem> availableEvents) {
		this.availableEvents = availableEvents;
	}

	public List<BizEventsItem> getBizEvents() {
		return this.bizEvents;
	}

	public void setBizEvents(List<BizEventsItem> bizEvents) {
		this.bizEvents = bizEvents;
	}

	public List<InventoryEventsItem> getInventoryEvents() {
		return this.inventoryEvents;
	}

	public void setInventoryEvents(List<InventoryEventsItem> inventoryEvents) {
		this.inventoryEvents = inventoryEvents;
	}

	public List<ReserveEventsItem> getReserveEvents() {
		return this.reserveEvents;
	}

	public void setReserveEvents(List<ReserveEventsItem> reserveEvents) {
		this.reserveEvents = reserveEvents;
	}

	public static class AvailableEventsItem {

		private String name;

		private String occurrenceTime;

		private String reason;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class BizEventsItem {

		private String name;

		private String occurrenceTime;

		private String reason;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class InventoryEventsItem {

		private String name;

		private String occurrenceTime;

		private String reason;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class ReserveEventsItem {

		private String name;

		private String occurrenceTime;

		private String reason;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeResourceTimelineResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceTimelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

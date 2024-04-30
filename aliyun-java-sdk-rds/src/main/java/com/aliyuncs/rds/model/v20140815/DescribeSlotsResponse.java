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
import com.aliyuncs.rds.transform.v20140815.DescribeSlotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlotsResponse extends AcsResponse {

	private String requestId;

	private List<Slot> slots;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Slot> getSlots() {
		return this.slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}

	public static class Slot {

		private String slotName;

		private String plugin;

		private String slotType;

		private String database;

		private String temporary;

		private String slotStatus;

		private String walDelay;

		private String subReplayLag;

		public String getSlotName() {
			return this.slotName;
		}

		public void setSlotName(String slotName) {
			this.slotName = slotName;
		}

		public String getPlugin() {
			return this.plugin;
		}

		public void setPlugin(String plugin) {
			this.plugin = plugin;
		}

		public String getSlotType() {
			return this.slotType;
		}

		public void setSlotType(String slotType) {
			this.slotType = slotType;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public String getTemporary() {
			return this.temporary;
		}

		public void setTemporary(String temporary) {
			this.temporary = temporary;
		}

		public String getSlotStatus() {
			return this.slotStatus;
		}

		public void setSlotStatus(String slotStatus) {
			this.slotStatus = slotStatus;
		}

		public String getWalDelay() {
			return this.walDelay;
		}

		public void setWalDelay(String walDelay) {
			this.walDelay = walDelay;
		}

		public String getSubReplayLag() {
			return this.subReplayLag;
		}

		public void setSubReplayLag(String subReplayLag) {
			this.subReplayLag = subReplayLag;
		}
	}

	@Override
	public DescribeSlotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

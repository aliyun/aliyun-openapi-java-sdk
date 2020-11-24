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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDDosAllEventListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDDosAllEventListResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private List<AttackEvent> attackEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<AttackEvent> getAttackEvents() {
		return this.attackEvents;
	}

	public void setAttackEvents(List<AttackEvent> attackEvents) {
		this.attackEvents = attackEvents;
	}

	public static class AttackEvent {

		private Long pps;

		private String eventType;

		private String port;

		private String ip;

		private Long startTime;

		private Long endTime;

		private Long mbps;

		public Long getPps() {
			return this.pps;
		}

		public void setPps(Long pps) {
			this.pps = pps;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getMbps() {
			return this.mbps;
		}

		public void setMbps(Long mbps) {
			this.mbps = mbps;
		}
	}

	@Override
	public DescribeDDosAllEventListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDDosAllEventListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

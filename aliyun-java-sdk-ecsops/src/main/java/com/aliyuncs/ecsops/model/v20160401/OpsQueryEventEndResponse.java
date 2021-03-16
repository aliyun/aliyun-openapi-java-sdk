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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryEventEndResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEventEndResponse extends AcsResponse {

	private String requestId;

	private List<InstanceEvent> instanceEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceEvent> getInstanceEvents() {
		return this.instanceEvents;
	}

	public void setInstanceEvents(List<InstanceEvent> instanceEvents) {
		this.instanceEvents = instanceEvents;
	}

	public static class InstanceEvent {

		private String instanceId;

		private String eventStartTime;

		private String ncIp;

		private String exceptionName;

		private String eventEndTime;

		private String aliUid;

		private String cluster;

		private String reason;

		private String extraData;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEventStartTime() {
			return this.eventStartTime;
		}

		public void setEventStartTime(String eventStartTime) {
			this.eventStartTime = eventStartTime;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getExceptionName() {
			return this.exceptionName;
		}

		public void setExceptionName(String exceptionName) {
			this.exceptionName = exceptionName;
		}

		public String getEventEndTime() {
			return this.eventEndTime;
		}

		public void setEventEndTime(String eventEndTime) {
			this.eventEndTime = eventEndTime;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getExtraData() {
			return this.extraData;
		}

		public void setExtraData(String extraData) {
			this.extraData = extraData;
		}
	}

	@Override
	public OpsQueryEventEndResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryEventEndResponseUnmarshaller.unmarshall(this, context);
	}
}

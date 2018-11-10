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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.ListFCTriggerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFCTriggerResponse extends AcsResponse {

	private String requestId;

	private List<FCTrigger> fCTriggers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FCTrigger> getFCTriggers() {
		return this.fCTriggers;
	}

	public void setFCTriggers(List<FCTrigger> fCTriggers) {
		this.fCTriggers = fCTriggers;
	}

	public static class FCTrigger {

		private String eventMetaName;

		private String eventMetaVersion;

		private String triggerARN;

		private String roleARN;

		private String sourceArn;

		private String notes;

		public String getEventMetaName() {
			return this.eventMetaName;
		}

		public void setEventMetaName(String eventMetaName) {
			this.eventMetaName = eventMetaName;
		}

		public String getEventMetaVersion() {
			return this.eventMetaVersion;
		}

		public void setEventMetaVersion(String eventMetaVersion) {
			this.eventMetaVersion = eventMetaVersion;
		}

		public String getTriggerARN() {
			return this.triggerARN;
		}

		public void setTriggerARN(String triggerARN) {
			this.triggerARN = triggerARN;
		}

		public String getRoleARN() {
			return this.roleARN;
		}

		public void setRoleARN(String roleARN) {
			this.roleARN = roleARN;
		}

		public String getSourceArn() {
			return this.sourceArn;
		}

		public void setSourceArn(String sourceArn) {
			this.sourceArn = sourceArn;
		}

		public String getNotes() {
			return this.notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}
	}

	@Override
	public ListFCTriggerResponse getInstance(UnmarshallerContext context) {
		return	ListFCTriggerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

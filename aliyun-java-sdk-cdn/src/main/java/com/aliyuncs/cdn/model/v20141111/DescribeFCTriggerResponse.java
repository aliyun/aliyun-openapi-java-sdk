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

package com.aliyuncs.cdn.model.v20141111;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeFCTriggerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFCTriggerResponse extends AcsResponse {

	private String requestId;

	private FCTrigger fCTrigger;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FCTrigger getFCTrigger() {
		return this.fCTrigger;
	}

	public void setFCTrigger(FCTrigger fCTrigger) {
		this.fCTrigger = fCTrigger;
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
	public DescribeFCTriggerResponse getInstance(UnmarshallerContext context) {
		return	DescribeFCTriggerResponseUnmarshaller.unmarshall(this, context);
	}
}

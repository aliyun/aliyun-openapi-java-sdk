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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListLiveRealtimeLogDeliveryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveRealtimeLogDeliveryResponse extends AcsResponse {

	private String requestId;

	private List<RealtimeLogDeliveryInfo> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RealtimeLogDeliveryInfo> getContent() {
		return this.content;
	}

	public void setContent(List<RealtimeLogDeliveryInfo> content) {
		this.content = content;
	}

	public static class RealtimeLogDeliveryInfo {

		private String project;

		private String logstore;

		private String region;

		private String domainName;

		private Integer dmId;

		private String status;

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getLogstore() {
			return this.logstore;
		}

		public void setLogstore(String logstore) {
			this.logstore = logstore;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getDmId() {
			return this.dmId;
		}

		public void setDmId(Integer dmId) {
			this.dmId = dmId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListLiveRealtimeLogDeliveryResponse getInstance(UnmarshallerContext context) {
		return	ListLiveRealtimeLogDeliveryResponseUnmarshaller.unmarshall(this, context);
	}
}

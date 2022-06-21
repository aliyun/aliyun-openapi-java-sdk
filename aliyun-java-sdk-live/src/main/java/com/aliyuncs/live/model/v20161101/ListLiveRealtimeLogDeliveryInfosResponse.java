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
import com.aliyuncs.live.transform.v20161101.ListLiveRealtimeLogDeliveryInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveRealtimeLogDeliveryInfosResponse extends AcsResponse {

	private String requestId;

	private List<RealtimeLogDeliveryInfos> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RealtimeLogDeliveryInfos> getContent() {
		return this.content;
	}

	public void setContent(List<RealtimeLogDeliveryInfos> content) {
		this.content = content;
	}

	public static class RealtimeLogDeliveryInfos {

		private String project;

		private String logstore;

		private String region;

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
	}

	@Override
	public ListLiveRealtimeLogDeliveryInfosResponse getInstance(UnmarshallerContext context) {
		return	ListLiveRealtimeLogDeliveryInfosResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.live.transform.v20161101.DescribeCasterSyncGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterSyncGroupResponse extends AcsResponse {

	private String requestId;

	private String casterId;

	private List<SyncGroup> syncGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public List<SyncGroup> getSyncGroups() {
		return this.syncGroups;
	}

	public void setSyncGroups(List<SyncGroup> syncGroups) {
		this.syncGroups = syncGroups;
	}

	public static class SyncGroup {

		private Integer mode;

		private String hostResourceId;

		private List<String> resourceIds;

		public Integer getMode() {
			return this.mode;
		}

		public void setMode(Integer mode) {
			this.mode = mode;
		}

		public String getHostResourceId() {
			return this.hostResourceId;
		}

		public void setHostResourceId(String hostResourceId) {
			this.hostResourceId = hostResourceId;
		}

		public List<String> getResourceIds() {
			return this.resourceIds;
		}

		public void setResourceIds(List<String> resourceIds) {
			this.resourceIds = resourceIds;
		}
	}

	@Override
	public DescribeCasterSyncGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterSyncGroupResponseUnmarshaller.unmarshall(this, context);
	}
}

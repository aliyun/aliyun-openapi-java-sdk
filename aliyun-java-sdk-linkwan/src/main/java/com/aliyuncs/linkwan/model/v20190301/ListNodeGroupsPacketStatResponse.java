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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListNodeGroupsPacketStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodeGroupsPacketStatResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<NodeGroupPacketStat> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<NodeGroupPacketStat> getData() {
		return this.data;
	}

	public void setData(List<NodeGroupPacketStat> data) {
		this.data = data;
	}

	public static class NodeGroupPacketStat {

		private String nodeGroupId;

		private Integer uplinkCount;

		private Integer downlinkCount;

		public String getNodeGroupId() {
			return this.nodeGroupId;
		}

		public void setNodeGroupId(String nodeGroupId) {
			this.nodeGroupId = nodeGroupId;
		}

		public Integer getUplinkCount() {
			return this.uplinkCount;
		}

		public void setUplinkCount(Integer uplinkCount) {
			this.uplinkCount = uplinkCount;
		}

		public Integer getDownlinkCount() {
			return this.downlinkCount;
		}

		public void setDownlinkCount(Integer downlinkCount) {
			this.downlinkCount = downlinkCount;
		}
	}

	@Override
	public ListNodeGroupsPacketStatResponse getInstance(UnmarshallerContext context) {
		return	ListNodeGroupsPacketStatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

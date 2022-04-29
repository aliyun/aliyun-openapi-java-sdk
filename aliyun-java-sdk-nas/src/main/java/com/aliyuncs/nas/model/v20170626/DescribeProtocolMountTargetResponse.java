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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeProtocolMountTargetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProtocolMountTargetResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<ProtocolMountTarget> protocolMountTargets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ProtocolMountTarget> getProtocolMountTargets() {
		return this.protocolMountTargets;
	}

	public void setProtocolMountTargets(List<ProtocolMountTarget> protocolMountTargets) {
		this.protocolMountTargets = protocolMountTargets;
	}

	public static class ProtocolMountTarget {

		private String exportId;

		private String protocolMountTargetDomain;

		private String protocolType;

		private String vpcId;

		private String vSwitchId;

		private String fsetId;

		private String path;

		private String accessGroupName;

		private String createTime;

		private String status;

		private String protocolServiceId;

		private String description;

		public String getExportId() {
			return this.exportId;
		}

		public void setExportId(String exportId) {
			this.exportId = exportId;
		}

		public String getProtocolMountTargetDomain() {
			return this.protocolMountTargetDomain;
		}

		public void setProtocolMountTargetDomain(String protocolMountTargetDomain) {
			this.protocolMountTargetDomain = protocolMountTargetDomain;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getFsetId() {
			return this.fsetId;
		}

		public void setFsetId(String fsetId) {
			this.fsetId = fsetId;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getAccessGroupName() {
			return this.accessGroupName;
		}

		public void setAccessGroupName(String accessGroupName) {
			this.accessGroupName = accessGroupName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProtocolServiceId() {
			return this.protocolServiceId;
		}

		public void setProtocolServiceId(String protocolServiceId) {
			this.protocolServiceId = protocolServiceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeProtocolMountTargetResponse getInstance(UnmarshallerContext context) {
		return	DescribeProtocolMountTargetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

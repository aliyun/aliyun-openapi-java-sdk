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
import com.aliyuncs.nas.transform.v20170626.DescribeProtocolServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProtocolServiceResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<ProtocolService> protocolServices;

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

	public List<ProtocolService> getProtocolServices() {
		return this.protocolServices;
	}

	public void setProtocolServices(List<ProtocolService> protocolServices) {
		this.protocolServices = protocolServices;
	}

	public static class ProtocolService {

		private String fileSystemId;

		private String protocolServiceId;

		private String protocolSpec;

		private Integer protocolThroughput;

		private Integer instanceRAM;

		private Integer instanceBaseThroughput;

		private Integer instanceBurstThroughput;

		private Integer mountTargetCount;

		private String protocolType;

		private String status;

		private String description;

		private String createTime;

		private String modifyTime;

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getProtocolServiceId() {
			return this.protocolServiceId;
		}

		public void setProtocolServiceId(String protocolServiceId) {
			this.protocolServiceId = protocolServiceId;
		}

		public String getProtocolSpec() {
			return this.protocolSpec;
		}

		public void setProtocolSpec(String protocolSpec) {
			this.protocolSpec = protocolSpec;
		}

		public Integer getProtocolThroughput() {
			return this.protocolThroughput;
		}

		public void setProtocolThroughput(Integer protocolThroughput) {
			this.protocolThroughput = protocolThroughput;
		}

		public Integer getInstanceRAM() {
			return this.instanceRAM;
		}

		public void setInstanceRAM(Integer instanceRAM) {
			this.instanceRAM = instanceRAM;
		}

		public Integer getInstanceBaseThroughput() {
			return this.instanceBaseThroughput;
		}

		public void setInstanceBaseThroughput(Integer instanceBaseThroughput) {
			this.instanceBaseThroughput = instanceBaseThroughput;
		}

		public Integer getInstanceBurstThroughput() {
			return this.instanceBurstThroughput;
		}

		public void setInstanceBurstThroughput(Integer instanceBurstThroughput) {
			this.instanceBurstThroughput = instanceBurstThroughput;
		}

		public Integer getMountTargetCount() {
			return this.mountTargetCount;
		}

		public void setMountTargetCount(Integer mountTargetCount) {
			this.mountTargetCount = mountTargetCount;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public DescribeProtocolServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeProtocolServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

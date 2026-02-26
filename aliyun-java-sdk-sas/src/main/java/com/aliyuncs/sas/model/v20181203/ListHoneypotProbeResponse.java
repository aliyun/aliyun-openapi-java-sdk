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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListHoneypotProbeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHoneypotProbeResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private List<ListItem> list;

	private PageInfo pageInfo;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ListItem {

		private String probeId;

		private String probeType;

		private String probeVersion;

		private String displayName;

		private String osType;

		private String hostIp;

		private Long deployTime;

		private String status;

		private String uuid;

		private String vpcId;

		private ControlNode controlNode;

		public String getProbeId() {
			return this.probeId;
		}

		public void setProbeId(String probeId) {
			this.probeId = probeId;
		}

		public String getProbeType() {
			return this.probeType;
		}

		public void setProbeType(String probeType) {
			this.probeType = probeType;
		}

		public String getProbeVersion() {
			return this.probeVersion;
		}

		public void setProbeVersion(String probeVersion) {
			this.probeVersion = probeVersion;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public Long getDeployTime() {
			return this.deployTime;
		}

		public void setDeployTime(Long deployTime) {
			this.deployTime = deployTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public ControlNode getControlNode() {
			return this.controlNode;
		}

		public void setControlNode(ControlNode controlNode) {
			this.controlNode = controlNode;
		}

		public static class ControlNode {

			private String nodeId;

			private String nodeName;

			private String ecsInstanceId;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getEcsInstanceId() {
				return this.ecsInstanceId;
			}

			public void setEcsInstanceId(String ecsInstanceId) {
				this.ecsInstanceId = ecsInstanceId;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public ListHoneypotProbeResponse getInstance(UnmarshallerContext context) {
		return	ListHoneypotProbeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

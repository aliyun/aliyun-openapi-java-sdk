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
import com.aliyuncs.nas.transform.v20170626.DescribeMountTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMountTargetsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<MountTarget> mountTargets;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<MountTarget> getMountTargets() {
		return this.mountTargets;
	}

	public void setMountTargets(List<MountTarget> mountTargets) {
		this.mountTargets = mountTargets;
	}

	public static class MountTarget {

		private String vpcId;

		private String status;

		private String mountTargetDomain;

		private String accessGroup;

		private String dualStackMountTargetDomain;

		private String vswId;

		private String networkType;

		private String iPVersion;

		private String mountTargetIp;

		private List<ClientMasterNode> clientMasterNodes;

		private List<Tag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMountTargetDomain() {
			return this.mountTargetDomain;
		}

		public void setMountTargetDomain(String mountTargetDomain) {
			this.mountTargetDomain = mountTargetDomain;
		}

		public String getAccessGroup() {
			return this.accessGroup;
		}

		public void setAccessGroup(String accessGroup) {
			this.accessGroup = accessGroup;
		}

		public String getDualStackMountTargetDomain() {
			return this.dualStackMountTargetDomain;
		}

		public void setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
			this.dualStackMountTargetDomain = dualStackMountTargetDomain;
		}

		public String getVswId() {
			return this.vswId;
		}

		public void setVswId(String vswId) {
			this.vswId = vswId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getIPVersion() {
			return this.iPVersion;
		}

		public void setIPVersion(String iPVersion) {
			this.iPVersion = iPVersion;
		}

		public String getMountTargetIp() {
			return this.mountTargetIp;
		}

		public void setMountTargetIp(String mountTargetIp) {
			this.mountTargetIp = mountTargetIp;
		}

		public List<ClientMasterNode> getClientMasterNodes() {
			return this.clientMasterNodes;
		}

		public void setClientMasterNodes(List<ClientMasterNode> clientMasterNodes) {
			this.clientMasterNodes = clientMasterNodes;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class ClientMasterNode {

			private String ecsId;

			private String defaultPasswd;

			private String ecsIp;

			public String getEcsId() {
				return this.ecsId;
			}

			public void setEcsId(String ecsId) {
				this.ecsId = ecsId;
			}

			public String getDefaultPasswd() {
				return this.defaultPasswd;
			}

			public void setDefaultPasswd(String defaultPasswd) {
				this.defaultPasswd = defaultPasswd;
			}

			public String getEcsIp() {
				return this.ecsIp;
			}

			public void setEcsIp(String ecsIp) {
				this.ecsIp = ecsIp;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeMountTargetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMountTargetsResponseUnmarshaller.unmarshall(this, context);
	}
}

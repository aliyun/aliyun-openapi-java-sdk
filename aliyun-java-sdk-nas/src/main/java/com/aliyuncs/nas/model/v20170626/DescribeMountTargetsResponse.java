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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeMountTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMountTargetsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<MountTarget> mountTargets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

		private String mountTargetDomain;

		private String networkType;

		private String vpcId;

		private String vswId;

		private String accessGroup;

		private String status;

		public String getMountTargetDomain() {
			return this.mountTargetDomain;
		}

		public void setMountTargetDomain(String mountTargetDomain) {
			this.mountTargetDomain = mountTargetDomain;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswId() {
			return this.vswId;
		}

		public void setVswId(String vswId) {
			this.vswId = vswId;
		}

		public String getAccessGroup() {
			return this.accessGroup;
		}

		public void setAccessGroup(String accessGroup) {
			this.accessGroup = accessGroup;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeMountTargetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMountTargetsResponseUnmarshaller.unmarshall(this, context);
	}
}

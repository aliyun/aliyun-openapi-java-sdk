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
import com.aliyuncs.sas.transform.v20181203.DescribeVpcListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcListResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<Vpc> vpcList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Vpc> getVpcList() {
		return this.vpcList;
	}

	public void setVpcList(List<Vpc> vpcList) {
		this.vpcList = vpcList;
	}

	public static class Vpc {

		private String instanceId;

		private Integer middleStatus;

		private String instanceName;

		private String regionId;

		private String instanceDesc;

		private Integer ecsCount;

		private Integer status;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getMiddleStatus() {
			return this.middleStatus;
		}

		public void setMiddleStatus(Integer middleStatus) {
			this.middleStatus = middleStatus;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceDesc() {
			return this.instanceDesc;
		}

		public void setInstanceDesc(String instanceDesc) {
			this.instanceDesc = instanceDesc;
		}

		public Integer getEcsCount() {
			return this.ecsCount;
		}

		public void setEcsCount(Integer ecsCount) {
			this.ecsCount = ecsCount;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeVpcListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

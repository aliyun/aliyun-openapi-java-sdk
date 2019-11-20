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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceRamRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceRamRoleResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private Integer totalCount;

	private List<InstanceRamRoleSet> instanceRamRoleSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceRamRoleSet> getInstanceRamRoleSets() {
		return this.instanceRamRoleSets;
	}

	public void setInstanceRamRoleSets(List<InstanceRamRoleSet> instanceRamRoleSets) {
		this.instanceRamRoleSets = instanceRamRoleSets;
	}

	public static class InstanceRamRoleSet {

		private String instanceId;

		private String ramRoleName;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}
	}

	@Override
	public DescribeInstanceRamRoleResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceRamRoleResponseUnmarshaller.unmarshall(this, context);
	}
}

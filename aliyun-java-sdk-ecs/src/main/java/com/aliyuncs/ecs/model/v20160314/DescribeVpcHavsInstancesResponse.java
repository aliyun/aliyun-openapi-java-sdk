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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeVpcHavsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcHavsInstancesResponse extends AcsResponse {

	private String requestId;

	private List<VpcHavsInstance> vpcHavsInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VpcHavsInstance> getVpcHavsInstances() {
		return this.vpcHavsInstances;
	}

	public void setVpcHavsInstances(List<VpcHavsInstance> vpcHavsInstances) {
		this.vpcHavsInstances = vpcHavsInstances;
	}

	public static class VpcHavsInstance {

		private String vpcId;

		private List<HavsInstance> havsInstances;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<HavsInstance> getHavsInstances() {
			return this.havsInstances;
		}

		public void setHavsInstances(List<HavsInstance> havsInstances) {
			this.havsInstances = havsInstances;
		}

		public static class HavsInstance {

			private String ecsInstanceId;

			private String reason;

			public String getEcsInstanceId() {
				return this.ecsInstanceId;
			}

			public void setEcsInstanceId(String ecsInstanceId) {
				this.ecsInstanceId = ecsInstanceId;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}
		}
	}

	@Override
	public DescribeVpcHavsInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcHavsInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}

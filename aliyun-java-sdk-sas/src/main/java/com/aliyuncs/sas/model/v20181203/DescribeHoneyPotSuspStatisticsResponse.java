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
import com.aliyuncs.sas.transform.v20181203.DescribeHoneyPotSuspStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHoneyPotSuspStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<SuspHoneyPotStatisticsResponseItem> suspHoneyPotStatisticsResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SuspHoneyPotStatisticsResponseItem> getSuspHoneyPotStatisticsResponse() {
		return this.suspHoneyPotStatisticsResponse;
	}

	public void setSuspHoneyPotStatisticsResponse(List<SuspHoneyPotStatisticsResponseItem> suspHoneyPotStatisticsResponse) {
		this.suspHoneyPotStatisticsResponse = suspHoneyPotStatisticsResponse;
	}

	public static class SuspHoneyPotStatisticsResponseItem {

		private Integer count;

		private String name;

		private String type;

		private String instanceId;

		private String instanceName;

		private String vpcId;

		private String vpcName;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}
	}

	@Override
	public DescribeHoneyPotSuspStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHoneyPotSuspStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.ecs.transform.v20160314.DescribeInstanceAutoRebootTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAutoRebootTimeResponse extends AcsResponse {

	private String requestId;

	private List<AutoRebootInfo> autoRebootInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AutoRebootInfo> getAutoRebootInfos() {
		return this.autoRebootInfos;
	}

	public void setAutoRebootInfos(List<AutoRebootInfo> autoRebootInfos) {
		this.autoRebootInfos = autoRebootInfos;
	}

	public static class AutoRebootInfo {

		private String limitRebootTime;

		private String instanceId;

		private String orderType;

		private String rebootTime;

		public String getLimitRebootTime() {
			return this.limitRebootTime;
		}

		public void setLimitRebootTime(String limitRebootTime) {
			this.limitRebootTime = limitRebootTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getRebootTime() {
			return this.rebootTime;
		}

		public void setRebootTime(String rebootTime) {
			this.rebootTime = rebootTime;
		}
	}

	@Override
	public DescribeInstanceAutoRebootTimeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAutoRebootTimeResponseUnmarshaller.unmarshall(this, context);
	}
}

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

package com.aliyuncs.antiddos_public.model.v20170518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.antiddos_public.transform.v20170518.DescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceResponse extends AcsResponse {

	private Integer total;

	private String requestId;

	private List<Instance> instanceList;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<Instance> instanceList) {
		this.instanceList = instanceList;
	}

	public static class Instance {

		private String instanceIp;

		private Boolean isBgppack;

		private String ipVersion;

		private Integer elasticThreshold;

		private Integer blackholeThreshold;

		private Integer defenseBpsThreshold;

		private String instanceName;

		private String instanceStatus;

		private Integer defensePpsThreshold;

		private String instanceId;

		private String instanceType;

		public String getInstanceIp() {
			return this.instanceIp;
		}

		public void setInstanceIp(String instanceIp) {
			this.instanceIp = instanceIp;
		}

		public Boolean getIsBgppack() {
			return this.isBgppack;
		}

		public void setIsBgppack(Boolean isBgppack) {
			this.isBgppack = isBgppack;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public Integer getElasticThreshold() {
			return this.elasticThreshold;
		}

		public void setElasticThreshold(Integer elasticThreshold) {
			this.elasticThreshold = elasticThreshold;
		}

		public Integer getBlackholeThreshold() {
			return this.blackholeThreshold;
		}

		public void setBlackholeThreshold(Integer blackholeThreshold) {
			this.blackholeThreshold = blackholeThreshold;
		}

		public Integer getDefenseBpsThreshold() {
			return this.defenseBpsThreshold;
		}

		public void setDefenseBpsThreshold(Integer defenseBpsThreshold) {
			this.defenseBpsThreshold = defenseBpsThreshold;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public Integer getDefensePpsThreshold() {
			return this.defensePpsThreshold;
		}

		public void setDefensePpsThreshold(Integer defensePpsThreshold) {
			this.defensePpsThreshold = defensePpsThreshold;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public DescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}

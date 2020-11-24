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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeInstanceStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<InstanceStatistic> instanceStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceStatistic> getInstanceStatistics() {
		return this.instanceStatistics;
	}

	public void setInstanceStatistics(List<InstanceStatistic> instanceStatistics) {
		this.instanceStatistics = instanceStatistics;
	}

	public static class InstanceStatistic {

		private String instanceId;

		private Integer portUsage;

		private Integer domainUsage;

		private Integer siteUsage;

		private Integer defenseCountUsage;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getPortUsage() {
			return this.portUsage;
		}

		public void setPortUsage(Integer portUsage) {
			this.portUsage = portUsage;
		}

		public Integer getDomainUsage() {
			return this.domainUsage;
		}

		public void setDomainUsage(Integer domainUsage) {
			this.domainUsage = domainUsage;
		}

		public Integer getSiteUsage() {
			return this.siteUsage;
		}

		public void setSiteUsage(Integer siteUsage) {
			this.siteUsage = siteUsage;
		}

		public Integer getDefenseCountUsage() {
			return this.defenseCountUsage;
		}

		public void setDefenseCountUsage(Integer defenseCountUsage) {
			this.defenseCountUsage = defenseCountUsage;
		}
	}

	@Override
	public DescribeInstanceStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

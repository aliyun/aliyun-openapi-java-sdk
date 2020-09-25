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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeFieldStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFieldStatisticsResponse extends AcsResponse {

	private String requestId;

	private GroupedFields groupedFields;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GroupedFields getGroupedFields() {
		return this.groupedFields;
	}

	public void setGroupedFields(GroupedFields groupedFields) {
		this.groupedFields = groupedFields;
	}

	public static class GroupedFields {

		private Integer riskInstanceCount;

		private Integer instanceCount;

		private Integer newInstanceCount;

		private Integer regionCount;

		private Integer unprotectedInstanceCount;

		private Integer vpcCount;

		private Integer groupCount;

		private Integer notRunningStatusCount;

		private Integer offlineInstanceCount;

		private Integer importantAssetCount;

		private Integer generalAssetCount;

		private Integer testAssetCount;

		public Integer getRiskInstanceCount() {
			return this.riskInstanceCount;
		}

		public void setRiskInstanceCount(Integer riskInstanceCount) {
			this.riskInstanceCount = riskInstanceCount;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getNewInstanceCount() {
			return this.newInstanceCount;
		}

		public void setNewInstanceCount(Integer newInstanceCount) {
			this.newInstanceCount = newInstanceCount;
		}

		public Integer getRegionCount() {
			return this.regionCount;
		}

		public void setRegionCount(Integer regionCount) {
			this.regionCount = regionCount;
		}

		public Integer getUnprotectedInstanceCount() {
			return this.unprotectedInstanceCount;
		}

		public void setUnprotectedInstanceCount(Integer unprotectedInstanceCount) {
			this.unprotectedInstanceCount = unprotectedInstanceCount;
		}

		public Integer getVpcCount() {
			return this.vpcCount;
		}

		public void setVpcCount(Integer vpcCount) {
			this.vpcCount = vpcCount;
		}

		public Integer getGroupCount() {
			return this.groupCount;
		}

		public void setGroupCount(Integer groupCount) {
			this.groupCount = groupCount;
		}

		public Integer getNotRunningStatusCount() {
			return this.notRunningStatusCount;
		}

		public void setNotRunningStatusCount(Integer notRunningStatusCount) {
			this.notRunningStatusCount = notRunningStatusCount;
		}

		public Integer getOfflineInstanceCount() {
			return this.offlineInstanceCount;
		}

		public void setOfflineInstanceCount(Integer offlineInstanceCount) {
			this.offlineInstanceCount = offlineInstanceCount;
		}

		public Integer getImportantAssetCount() {
			return this.importantAssetCount;
		}

		public void setImportantAssetCount(Integer importantAssetCount) {
			this.importantAssetCount = importantAssetCount;
		}

		public Integer getGeneralAssetCount() {
			return this.generalAssetCount;
		}

		public void setGeneralAssetCount(Integer generalAssetCount) {
			this.generalAssetCount = generalAssetCount;
		}

		public Integer getTestAssetCount() {
			return this.testAssetCount;
		}

		public void setTestAssetCount(Integer testAssetCount) {
			this.testAssetCount = testAssetCount;
		}
	}

	@Override
	public DescribeFieldStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFieldStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

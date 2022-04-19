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

		private Integer offlineInstanceCount;

		private Integer regionCount;

		private Integer newInstanceCount;

		private Integer exposedInstanceCount;

		private Integer groupCount;

		private Integer tencentInstanceCount;

		private Integer generalAssetCount;

		private Integer instanceSyncTaskCount;

		private Integer unprotectedInstanceCount;

		private Integer importantAssetCount;

		private Integer testAssetCount;

		private Integer vpcCount;

		private Integer instanceCount;

		private Integer pauseInstanceCount;

		private Integer idcInstanceCount;

		private Integer notRunningStatusCount;

		private Integer aliYunInstanceCount;

		private Integer riskInstanceCount;

		private Integer huaweiInstanceCount;

		private Integer awsInstanceCount;

		public Integer getOfflineInstanceCount() {
			return this.offlineInstanceCount;
		}

		public void setOfflineInstanceCount(Integer offlineInstanceCount) {
			this.offlineInstanceCount = offlineInstanceCount;
		}

		public Integer getRegionCount() {
			return this.regionCount;
		}

		public void setRegionCount(Integer regionCount) {
			this.regionCount = regionCount;
		}

		public Integer getNewInstanceCount() {
			return this.newInstanceCount;
		}

		public void setNewInstanceCount(Integer newInstanceCount) {
			this.newInstanceCount = newInstanceCount;
		}

		public Integer getExposedInstanceCount() {
			return this.exposedInstanceCount;
		}

		public void setExposedInstanceCount(Integer exposedInstanceCount) {
			this.exposedInstanceCount = exposedInstanceCount;
		}

		public Integer getGroupCount() {
			return this.groupCount;
		}

		public void setGroupCount(Integer groupCount) {
			this.groupCount = groupCount;
		}

		public Integer getTencentInstanceCount() {
			return this.tencentInstanceCount;
		}

		public void setTencentInstanceCount(Integer tencentInstanceCount) {
			this.tencentInstanceCount = tencentInstanceCount;
		}

		public Integer getGeneralAssetCount() {
			return this.generalAssetCount;
		}

		public void setGeneralAssetCount(Integer generalAssetCount) {
			this.generalAssetCount = generalAssetCount;
		}

		public Integer getInstanceSyncTaskCount() {
			return this.instanceSyncTaskCount;
		}

		public void setInstanceSyncTaskCount(Integer instanceSyncTaskCount) {
			this.instanceSyncTaskCount = instanceSyncTaskCount;
		}

		public Integer getUnprotectedInstanceCount() {
			return this.unprotectedInstanceCount;
		}

		public void setUnprotectedInstanceCount(Integer unprotectedInstanceCount) {
			this.unprotectedInstanceCount = unprotectedInstanceCount;
		}

		public Integer getImportantAssetCount() {
			return this.importantAssetCount;
		}

		public void setImportantAssetCount(Integer importantAssetCount) {
			this.importantAssetCount = importantAssetCount;
		}

		public Integer getTestAssetCount() {
			return this.testAssetCount;
		}

		public void setTestAssetCount(Integer testAssetCount) {
			this.testAssetCount = testAssetCount;
		}

		public Integer getVpcCount() {
			return this.vpcCount;
		}

		public void setVpcCount(Integer vpcCount) {
			this.vpcCount = vpcCount;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getPauseInstanceCount() {
			return this.pauseInstanceCount;
		}

		public void setPauseInstanceCount(Integer pauseInstanceCount) {
			this.pauseInstanceCount = pauseInstanceCount;
		}

		public Integer getIdcInstanceCount() {
			return this.idcInstanceCount;
		}

		public void setIdcInstanceCount(Integer idcInstanceCount) {
			this.idcInstanceCount = idcInstanceCount;
		}

		public Integer getNotRunningStatusCount() {
			return this.notRunningStatusCount;
		}

		public void setNotRunningStatusCount(Integer notRunningStatusCount) {
			this.notRunningStatusCount = notRunningStatusCount;
		}

		public Integer getAliYunInstanceCount() {
			return this.aliYunInstanceCount;
		}

		public void setAliYunInstanceCount(Integer aliYunInstanceCount) {
			this.aliYunInstanceCount = aliYunInstanceCount;
		}

		public Integer getRiskInstanceCount() {
			return this.riskInstanceCount;
		}

		public void setRiskInstanceCount(Integer riskInstanceCount) {
			this.riskInstanceCount = riskInstanceCount;
		}

		public Integer getHuaweiInstanceCount() {
			return this.huaweiInstanceCount;
		}

		public void setHuaweiInstanceCount(Integer huaweiInstanceCount) {
			this.huaweiInstanceCount = huaweiInstanceCount;
		}

		public Integer getAwsInstanceCount() {
			return this.awsInstanceCount;
		}

		public void setAwsInstanceCount(Integer awsInstanceCount) {
			this.awsInstanceCount = awsInstanceCount;
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

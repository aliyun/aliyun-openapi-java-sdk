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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeColdDataBasicInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeColdDataBasicInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean enableStatus;

		private String cloudProduct;

		private String volumeName;

		private Double backupSetSpaceSize;

		private Integer backupSetCount;

		private Double currentSpaceSize;

		private String dataRedundancyType;

		private Double writeAccessNum;

		private Long readAccessNum;

		private String regionId;

		public Boolean getEnableStatus() {
			return this.enableStatus;
		}

		public void setEnableStatus(Boolean enableStatus) {
			this.enableStatus = enableStatus;
		}

		public String getCloudProduct() {
			return this.cloudProduct;
		}

		public void setCloudProduct(String cloudProduct) {
			this.cloudProduct = cloudProduct;
		}

		public String getVolumeName() {
			return this.volumeName;
		}

		public void setVolumeName(String volumeName) {
			this.volumeName = volumeName;
		}

		public Double getBackupSetSpaceSize() {
			return this.backupSetSpaceSize;
		}

		public void setBackupSetSpaceSize(Double backupSetSpaceSize) {
			this.backupSetSpaceSize = backupSetSpaceSize;
		}

		public Integer getBackupSetCount() {
			return this.backupSetCount;
		}

		public void setBackupSetCount(Integer backupSetCount) {
			this.backupSetCount = backupSetCount;
		}

		public Double getCurrentSpaceSize() {
			return this.currentSpaceSize;
		}

		public void setCurrentSpaceSize(Double currentSpaceSize) {
			this.currentSpaceSize = currentSpaceSize;
		}

		public String getDataRedundancyType() {
			return this.dataRedundancyType;
		}

		public void setDataRedundancyType(String dataRedundancyType) {
			this.dataRedundancyType = dataRedundancyType;
		}

		public Double getWriteAccessNum() {
			return this.writeAccessNum;
		}

		public void setWriteAccessNum(Double writeAccessNum) {
			this.writeAccessNum = writeAccessNum;
		}

		public Long getReadAccessNum() {
			return this.readAccessNum;
		}

		public void setReadAccessNum(Long readAccessNum) {
			this.readAccessNum = readAccessNum;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeColdDataBasicInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeColdDataBasicInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

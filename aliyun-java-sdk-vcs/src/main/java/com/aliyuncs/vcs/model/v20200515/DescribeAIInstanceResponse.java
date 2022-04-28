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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribeAIInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIInstanceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long pageSize;

		private Long pageNumber;

		private List<RecordsItem> records;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String instanceId;

			private String instanceName;

			private String algorithmId;

			private String algorithmName;

			private String computeType;

			private String dataSource;

			private String dataType;

			private String scheduleType;

			private String scheduleCycleDates;

			private String scheduleTimes;

			private Long spf;

			private String status;

			private String createDateTime;

			private Long acuUsed;

			private Long cameraNumber;

			private Double storage;

			private String instanceType;

			private String dataSourceTimes;

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

			public String getAlgorithmId() {
				return this.algorithmId;
			}

			public void setAlgorithmId(String algorithmId) {
				this.algorithmId = algorithmId;
			}

			public String getAlgorithmName() {
				return this.algorithmName;
			}

			public void setAlgorithmName(String algorithmName) {
				this.algorithmName = algorithmName;
			}

			public String getComputeType() {
				return this.computeType;
			}

			public void setComputeType(String computeType) {
				this.computeType = computeType;
			}

			public String getDataSource() {
				return this.dataSource;
			}

			public void setDataSource(String dataSource) {
				this.dataSource = dataSource;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getScheduleType() {
				return this.scheduleType;
			}

			public void setScheduleType(String scheduleType) {
				this.scheduleType = scheduleType;
			}

			public String getScheduleCycleDates() {
				return this.scheduleCycleDates;
			}

			public void setScheduleCycleDates(String scheduleCycleDates) {
				this.scheduleCycleDates = scheduleCycleDates;
			}

			public String getScheduleTimes() {
				return this.scheduleTimes;
			}

			public void setScheduleTimes(String scheduleTimes) {
				this.scheduleTimes = scheduleTimes;
			}

			public Long getSpf() {
				return this.spf;
			}

			public void setSpf(Long spf) {
				this.spf = spf;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreateDateTime() {
				return this.createDateTime;
			}

			public void setCreateDateTime(String createDateTime) {
				this.createDateTime = createDateTime;
			}

			public Long getAcuUsed() {
				return this.acuUsed;
			}

			public void setAcuUsed(Long acuUsed) {
				this.acuUsed = acuUsed;
			}

			public Long getCameraNumber() {
				return this.cameraNumber;
			}

			public void setCameraNumber(Long cameraNumber) {
				this.cameraNumber = cameraNumber;
			}

			public Double getStorage() {
				return this.storage;
			}

			public void setStorage(Double storage) {
				this.storage = storage;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getDataSourceTimes() {
				return this.dataSourceTimes;
			}

			public void setDataSourceTimes(String dataSourceTimes) {
				this.dataSourceTimes = dataSourceTimes;
			}
		}
	}

	@Override
	public DescribeAIInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAIInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

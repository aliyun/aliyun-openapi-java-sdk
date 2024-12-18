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

package com.aliyuncs.selectdb.model.v20230522;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.DescribeAllDBInstanceClassResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAllDBInstanceClassResponse extends AcsResponse {

	private String requestId;

	private List<ClassCodeListItem> classCodeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClassCodeListItem> getClassCodeList() {
		return this.classCodeList;
	}

	public void setClassCodeList(List<ClassCodeListItem> classCodeList) {
		this.classCodeList = classCodeList;
	}

	public static class ClassCodeListItem {

		private String classCode;

		private Long cpuCores;

		private Long memoryInGB;

		private Long defaultStorageInGB;

		private Long minStorageInGB;

		private Long maxStorageInGB;

		private Long stepStorageInGB;

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public Long getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(Long cpuCores) {
			this.cpuCores = cpuCores;
		}

		public Long getMemoryInGB() {
			return this.memoryInGB;
		}

		public void setMemoryInGB(Long memoryInGB) {
			this.memoryInGB = memoryInGB;
		}

		public Long getDefaultStorageInGB() {
			return this.defaultStorageInGB;
		}

		public void setDefaultStorageInGB(Long defaultStorageInGB) {
			this.defaultStorageInGB = defaultStorageInGB;
		}

		public Long getMinStorageInGB() {
			return this.minStorageInGB;
		}

		public void setMinStorageInGB(Long minStorageInGB) {
			this.minStorageInGB = minStorageInGB;
		}

		public Long getMaxStorageInGB() {
			return this.maxStorageInGB;
		}

		public void setMaxStorageInGB(Long maxStorageInGB) {
			this.maxStorageInGB = maxStorageInGB;
		}

		public Long getStepStorageInGB() {
			return this.stepStorageInGB;
		}

		public void setStepStorageInGB(Long stepStorageInGB) {
			this.stepStorageInGB = stepStorageInGB;
		}
	}

	@Override
	public DescribeAllDBInstanceClassResponse getInstance(UnmarshallerContext context) {
		return	DescribeAllDBInstanceClassResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

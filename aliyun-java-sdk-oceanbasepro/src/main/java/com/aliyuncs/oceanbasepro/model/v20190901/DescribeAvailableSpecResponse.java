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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeAvailableSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableSpecResponse extends AcsResponse {

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

		private List<AvailableSpecificationsItem> availableSpecifications;

		public List<AvailableSpecificationsItem> getAvailableSpecifications() {
			return this.availableSpecifications;
		}

		public void setAvailableSpecifications(List<AvailableSpecificationsItem> availableSpecifications) {
			this.availableSpecifications = availableSpecifications;
		}

		public static class AvailableSpecificationsItem {

			private String spec;

			private String instanceClass;

			private List<DiskSizeRangeItem> diskSizeRange;

			private List<LogDiskSizeRangeItem> logDiskSizeRange;

			private List<Integer> nodeNum;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getInstanceClass() {
				return this.instanceClass;
			}

			public void setInstanceClass(String instanceClass) {
				this.instanceClass = instanceClass;
			}

			public List<DiskSizeRangeItem> getDiskSizeRange() {
				return this.diskSizeRange;
			}

			public void setDiskSizeRange(List<DiskSizeRangeItem> diskSizeRange) {
				this.diskSizeRange = diskSizeRange;
			}

			public List<LogDiskSizeRangeItem> getLogDiskSizeRange() {
				return this.logDiskSizeRange;
			}

			public void setLogDiskSizeRange(List<LogDiskSizeRangeItem> logDiskSizeRange) {
				this.logDiskSizeRange = logDiskSizeRange;
			}

			public List<Integer> getNodeNum() {
				return this.nodeNum;
			}

			public void setNodeNum(List<Integer> nodeNum) {
				this.nodeNum = nodeNum;
			}

			public static class DiskSizeRangeItem {

				private Long step;

				private Long max;

				private Long min;

				public Long getStep() {
					return this.step;
				}

				public void setStep(Long step) {
					this.step = step;
				}

				public Long getMax() {
					return this.max;
				}

				public void setMax(Long max) {
					this.max = max;
				}

				public Long getMin() {
					return this.min;
				}

				public void setMin(Long min) {
					this.min = min;
				}
			}

			public static class LogDiskSizeRangeItem {

				private String step;

				private String max;

				private String min;

				public String getStep() {
					return this.step;
				}

				public void setStep(String step) {
					this.step = step;
				}

				public String getMax() {
					return this.max;
				}

				public void setMax(String max) {
					this.max = max;
				}

				public String getMin() {
					return this.min;
				}

				public void setMin(String min) {
					this.min = min;
				}
			}
		}
	}

	@Override
	public DescribeAvailableSpecResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableSpecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

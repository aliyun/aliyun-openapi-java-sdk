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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAvailableClassesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableClassesResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceClass> dBInstanceClasses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceClass> getDBInstanceClasses() {
		return this.dBInstanceClasses;
	}

	public void setDBInstanceClasses(List<DBInstanceClass> dBInstanceClasses) {
		this.dBInstanceClasses = dBInstanceClasses;
	}

	public static class DBInstanceClass {

		private String dBInstanceClass;

		private String storageRange;

		private DBInstanceStorageRange dBInstanceStorageRange;

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public String getStorageRange() {
			return this.storageRange;
		}

		public void setStorageRange(String storageRange) {
			this.storageRange = storageRange;
		}

		public DBInstanceStorageRange getDBInstanceStorageRange() {
			return this.dBInstanceStorageRange;
		}

		public void setDBInstanceStorageRange(DBInstanceStorageRange dBInstanceStorageRange) {
			this.dBInstanceStorageRange = dBInstanceStorageRange;
		}

		public static class DBInstanceStorageRange {

			private Integer maxValue;

			private Integer minValue;

			private Integer step;

			public Integer getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Integer maxValue) {
				this.maxValue = maxValue;
			}

			public Integer getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Integer minValue) {
				this.minValue = minValue;
			}

			public Integer getStep() {
				return this.step;
			}

			public void setStep(Integer step) {
				this.step = step;
			}
		}
	}

	@Override
	public DescribeAvailableClassesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableClassesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

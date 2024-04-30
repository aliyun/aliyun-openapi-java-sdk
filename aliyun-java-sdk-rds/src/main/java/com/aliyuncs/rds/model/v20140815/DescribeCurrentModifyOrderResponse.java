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
import com.aliyuncs.rds.transform.v20140815.DescribeCurrentModifyOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCurrentModifyOrderResponse extends AcsResponse {

	private String requestId;

	private List<ModifyOrderItem> modifyOrder;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ModifyOrderItem> getModifyOrder() {
		return this.modifyOrder;
	}

	public void setModifyOrder(List<ModifyOrderItem> modifyOrder) {
		this.modifyOrder = modifyOrder;
	}

	public static class ModifyOrderItem {

		private String dbInstanceId;

		private String targetDBInstanceClass;

		private String storage;

		private String memoryClass;

		private String cpu;

		private String classGroup;

		private String effectiveTime;

		private String status;

		private String mark;

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getTargetDBInstanceClass() {
			return this.targetDBInstanceClass;
		}

		public void setTargetDBInstanceClass(String targetDBInstanceClass) {
			this.targetDBInstanceClass = targetDBInstanceClass;
		}

		public String getStorage() {
			return this.storage;
		}

		public void setStorage(String storage) {
			this.storage = storage;
		}

		public String getMemoryClass() {
			return this.memoryClass;
		}

		public void setMemoryClass(String memoryClass) {
			this.memoryClass = memoryClass;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getClassGroup() {
			return this.classGroup;
		}

		public void setClassGroup(String classGroup) {
			this.classGroup = classGroup;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMark() {
			return this.mark;
		}

		public void setMark(String mark) {
			this.mark = mark;
		}
	}

	@Override
	public DescribeCurrentModifyOrderResponse getInstance(UnmarshallerContext context) {
		return	DescribeCurrentModifyOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

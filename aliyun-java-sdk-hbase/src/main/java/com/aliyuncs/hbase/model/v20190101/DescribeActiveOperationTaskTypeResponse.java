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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeActiveOperationTaskTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationTaskTypeResponse extends AcsResponse {

	private String requestId;

	private List<Items> typeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Items> getTypeList() {
		return this.typeList;
	}

	public void setTypeList(List<Items> typeList) {
		this.typeList = typeList;
	}

	public static class Items {

		private String taskType;

		private String taskTypeInfoEn;

		private String taskTypeInfoZh;

		private Integer count;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskTypeInfoEn() {
			return this.taskTypeInfoEn;
		}

		public void setTaskTypeInfoEn(String taskTypeInfoEn) {
			this.taskTypeInfoEn = taskTypeInfoEn;
		}

		public String getTaskTypeInfoZh() {
			return this.taskTypeInfoZh;
		}

		public void setTaskTypeInfoZh(String taskTypeInfoZh) {
			this.taskTypeInfoZh = taskTypeInfoZh;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeActiveOperationTaskTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveOperationTaskTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

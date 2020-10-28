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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeModifyParameterLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModifyParameterLogResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ChangeLog> changeLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<ChangeLog> getChangeLogs() {
		return this.changeLogs;
	}

	public void setChangeLogs(List<ChangeLog> changeLogs) {
		this.changeLogs = changeLogs;
	}

	public static class ChangeLog {

		private String parameterName;

		private String oldParameterValue;

		private String newParameterValue;

		private Integer synced;

		private String changeTime;

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getOldParameterValue() {
			return this.oldParameterValue;
		}

		public void setOldParameterValue(String oldParameterValue) {
			this.oldParameterValue = oldParameterValue;
		}

		public String getNewParameterValue() {
			return this.newParameterValue;
		}

		public void setNewParameterValue(String newParameterValue) {
			this.newParameterValue = newParameterValue;
		}

		public Integer getSynced() {
			return this.synced;
		}

		public void setSynced(Integer synced) {
			this.synced = synced;
		}

		public String getChangeTime() {
			return this.changeTime;
		}

		public void setChangeTime(String changeTime) {
			this.changeTime = changeTime;
		}
	}

	@Override
	public DescribeModifyParameterLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeModifyParameterLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

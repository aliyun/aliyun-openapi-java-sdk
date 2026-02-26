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

package com.aliyuncs.account_crm.model.v20160606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryDeleteTaskCheckDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeleteTaskCheckDataResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<TaskCheckDataDto> taskCheckDataDtoList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<TaskCheckDataDto> getTaskCheckDataDtoList() {
		return this.taskCheckDataDtoList;
	}

	public void setTaskCheckDataDtoList(List<TaskCheckDataDto> taskCheckDataDtoList) {
		this.taskCheckDataDtoList = taskCheckDataDtoList;
	}

	public static class TaskCheckDataDto {

		private String checkerName;

		private String checkerDesc;

		private String checkerUniKey;

		private String dependencyLevel;

		public String getCheckerName() {
			return this.checkerName;
		}

		public void setCheckerName(String checkerName) {
			this.checkerName = checkerName;
		}

		public String getCheckerDesc() {
			return this.checkerDesc;
		}

		public void setCheckerDesc(String checkerDesc) {
			this.checkerDesc = checkerDesc;
		}

		public String getCheckerUniKey() {
			return this.checkerUniKey;
		}

		public void setCheckerUniKey(String checkerUniKey) {
			this.checkerUniKey = checkerUniKey;
		}

		public String getDependencyLevel() {
			return this.dependencyLevel;
		}

		public void setDependencyLevel(String dependencyLevel) {
			this.dependencyLevel = dependencyLevel;
		}
	}

	@Override
	public QueryDeleteTaskCheckDataResponse getInstance(UnmarshallerContext context) {
		return	QueryDeleteTaskCheckDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

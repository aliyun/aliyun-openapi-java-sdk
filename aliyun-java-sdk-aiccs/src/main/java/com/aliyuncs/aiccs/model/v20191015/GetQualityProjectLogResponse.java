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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetQualityProjectLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityProjectLogResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<DataItem> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long projectId;

		private String projectCreateTime;

		private String actionTime;

		private String actionType;

		private String actionData;

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getProjectCreateTime() {
			return this.projectCreateTime;
		}

		public void setProjectCreateTime(String projectCreateTime) {
			this.projectCreateTime = projectCreateTime;
		}

		public String getActionTime() {
			return this.actionTime;
		}

		public void setActionTime(String actionTime) {
			this.actionTime = actionTime;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getActionData() {
			return this.actionData;
		}

		public void setActionData(String actionData) {
			this.actionData = actionData;
		}
	}

	@Override
	public GetQualityProjectLogResponse getInstance(UnmarshallerContext context) {
		return	GetQualityProjectLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

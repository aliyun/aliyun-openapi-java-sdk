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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.CreateSiteMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateSiteMonitorResponse extends AcsResponse {

	private String code;

	private String message;

	private String success;

	private String requestId;

	private List<CreateResultListItem> createResultList;

	private Data data;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CreateResultListItem> getCreateResultList() {
		return this.createResultList;
	}

	public void setCreateResultList(List<CreateResultListItem> createResultList) {
		this.createResultList = createResultList;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class CreateResultListItem {

		private String taskName;

		private String taskId;

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	public static class Data {

		private List<Contact> attachAlertResult;

		public List<Contact> getAttachAlertResult() {
			return this.attachAlertResult;
		}

		public void setAttachAlertResult(List<Contact> attachAlertResult) {
			this.attachAlertResult = attachAlertResult;
		}

		public static class Contact {

			private String message;

			private String requestId;

			private String code;

			private String success;

			private String ruleId;

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

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getSuccess() {
				return this.success;
			}

			public void setSuccess(String success) {
				this.success = success;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}
		}
	}

	@Override
	public CreateSiteMonitorResponse getInstance(UnmarshallerContext context) {
		return	CreateSiteMonitorResponseUnmarshaller.unmarshall(this, context);
	}
}

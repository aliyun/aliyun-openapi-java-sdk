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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.InitDWSTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InitDWSTaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dstCategory;

		private String gmtCreate;

		private String id;

		private String linkman;

		private String name;

		private String scenarios;

		private String srcCategory;

		private String status;

		private String taskParamJson;

		public String getDstCategory() {
			return this.dstCategory;
		}

		public void setDstCategory(String dstCategory) {
			this.dstCategory = dstCategory;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLinkman() {
			return this.linkman;
		}

		public void setLinkman(String linkman) {
			this.linkman = linkman;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getScenarios() {
			return this.scenarios;
		}

		public void setScenarios(String scenarios) {
			this.scenarios = scenarios;
		}

		public String getSrcCategory() {
			return this.srcCategory;
		}

		public void setSrcCategory(String srcCategory) {
			this.srcCategory = srcCategory;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskParamJson() {
			return this.taskParamJson;
		}

		public void setTaskParamJson(String taskParamJson) {
			this.taskParamJson = taskParamJson;
		}
	}

	@Override
	public InitDWSTaskResponse getInstance(UnmarshallerContext context) {
		return	InitDWSTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

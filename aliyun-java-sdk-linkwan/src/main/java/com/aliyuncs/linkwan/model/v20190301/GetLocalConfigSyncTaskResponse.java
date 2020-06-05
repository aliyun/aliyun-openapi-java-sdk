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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.GetLocalConfigSyncTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLocalConfigSyncTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long createMillis;

		private Long modifiedMillis;

		private String devType;

		private String taskTYpe;

		private String eui;

		private String state;

		private String d2dAddr;

		private String d2dKey;

		private Integer freq;

		private Integer datr;

		private Long processingMillis;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCreateMillis() {
			return this.createMillis;
		}

		public void setCreateMillis(Long createMillis) {
			this.createMillis = createMillis;
		}

		public Long getModifiedMillis() {
			return this.modifiedMillis;
		}

		public void setModifiedMillis(Long modifiedMillis) {
			this.modifiedMillis = modifiedMillis;
		}

		public String getDevType() {
			return this.devType;
		}

		public void setDevType(String devType) {
			this.devType = devType;
		}

		public String getTaskTYpe() {
			return this.taskTYpe;
		}

		public void setTaskTYpe(String taskTYpe) {
			this.taskTYpe = taskTYpe;
		}

		public String getEui() {
			return this.eui;
		}

		public void setEui(String eui) {
			this.eui = eui;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getD2dAddr() {
			return this.d2dAddr;
		}

		public void setD2dAddr(String d2dAddr) {
			this.d2dAddr = d2dAddr;
		}

		public String getD2dKey() {
			return this.d2dKey;
		}

		public void setD2dKey(String d2dKey) {
			this.d2dKey = d2dKey;
		}

		public Integer getFreq() {
			return this.freq;
		}

		public void setFreq(Integer freq) {
			this.freq = freq;
		}

		public Integer getDatr() {
			return this.datr;
		}

		public void setDatr(Integer datr) {
			this.datr = datr;
		}

		public Long getProcessingMillis() {
			return this.processingMillis;
		}

		public void setProcessingMillis(Long processingMillis) {
			this.processingMillis = processingMillis;
		}
	}

	@Override
	public GetLocalConfigSyncTaskResponse getInstance(UnmarshallerContext context) {
		return	GetLocalConfigSyncTaskResponseUnmarshaller.unmarshall(this, context);
	}
}

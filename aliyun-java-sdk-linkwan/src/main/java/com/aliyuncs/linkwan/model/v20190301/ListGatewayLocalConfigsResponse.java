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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListGatewayLocalConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayLocalConfigsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<D2dConfig> data;

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

	public List<D2dConfig> getData() {
		return this.data;
	}

	public void setData(List<D2dConfig> data) {
		this.data = data;
	}

	public static class D2dConfig {

		private String devType;

		private String eui;

		private String d2dAddr;

		private String d2dKey;

		private Integer freq;

		private Integer datr;

		private Long taskId;

		private Long createMillis;

		private Long modifiedMillis;

		public String getDevType() {
			return this.devType;
		}

		public void setDevType(String devType) {
			this.devType = devType;
		}

		public String getEui() {
			return this.eui;
		}

		public void setEui(String eui) {
			this.eui = eui;
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

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
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
	}

	@Override
	public ListGatewayLocalConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayLocalConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

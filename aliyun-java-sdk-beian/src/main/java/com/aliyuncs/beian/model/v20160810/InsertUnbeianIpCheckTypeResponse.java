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

package com.aliyuncs.beian.model.v20160810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.beian.transform.v20160810.InsertUnbeianIpCheckTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InsertUnbeianIpCheckTypeResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public HuntressIpCheckTypeResultDO getHuntressIpCheckTypeResultDO() {
		return this.huntressIpCheckTypeResultDO;
	}

	public void setHuntressIpCheckTypeResultDO(HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO) {
		this.huntressIpCheckTypeResultDO = huntressIpCheckTypeResultDO;
	}

	public static class HuntressIpCheckTypeResultDO {

		private String msg;

		private Boolean success;

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}

	@Override
	public InsertUnbeianIpCheckTypeResponse getInstance(UnmarshallerContext context) {
		return	InsertUnbeianIpCheckTypeResponseUnmarshaller.unmarshall(this, context);
	}
}

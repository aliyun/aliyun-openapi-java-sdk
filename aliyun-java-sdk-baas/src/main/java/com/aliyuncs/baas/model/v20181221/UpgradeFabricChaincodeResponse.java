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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.UpgradeFabricChaincodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpgradeFabricChaincodeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer type;

		private String endorsePolicy;

		private String state;

		private String createTime;

		private String chaincodeId;

		private String providerName;

		private String message;

		private String chaincodeName;

		private String input;

		private Boolean install;

		private String providerId;

		private String deployTime;

		private String chaincodeVersion;

		private String consortiumId;

		private String channelName;

		private String path;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getEndorsePolicy() {
			return this.endorsePolicy;
		}

		public void setEndorsePolicy(String endorsePolicy) {
			this.endorsePolicy = endorsePolicy;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChaincodeId() {
			return this.chaincodeId;
		}

		public void setChaincodeId(String chaincodeId) {
			this.chaincodeId = chaincodeId;
		}

		public String getProviderName() {
			return this.providerName;
		}

		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getChaincodeName() {
			return this.chaincodeName;
		}

		public void setChaincodeName(String chaincodeName) {
			this.chaincodeName = chaincodeName;
		}

		public String getInput() {
			return this.input;
		}

		public void setInput(String input) {
			this.input = input;
		}

		public Boolean getInstall() {
			return this.install;
		}

		public void setInstall(Boolean install) {
			this.install = install;
		}

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getDeployTime() {
			return this.deployTime;
		}

		public void setDeployTime(String deployTime) {
			this.deployTime = deployTime;
		}

		public String getChaincodeVersion() {
			return this.chaincodeVersion;
		}

		public void setChaincodeVersion(String chaincodeVersion) {
			this.chaincodeVersion = chaincodeVersion;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}

	@Override
	public UpgradeFabricChaincodeResponse getInstance(UnmarshallerContext context) {
		return	UpgradeFabricChaincodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

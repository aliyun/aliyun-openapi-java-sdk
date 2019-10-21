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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeFabricOrganizationChaincodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricOrganizationChaincodesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private List<OrganizationChaincode> result;

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

	public List<OrganizationChaincode> getResult() {
		return this.result;
	}

	public void setResult(List<OrganizationChaincode> result) {
		this.result = result;
	}

	public static class OrganizationChaincode {

		private String chaincodeName;

		private String chaincodeVersion;

		private String creator;

		private String channelId;

		private String channelName;

		private String createTime;

		private String deployTime;

		private String chaincodeId;

		private String endorsePolicy;

		private String state;

		private String installed;

		private String message;

		private String consortiumId;

		public String getChaincodeName() {
			return this.chaincodeName;
		}

		public void setChaincodeName(String chaincodeName) {
			this.chaincodeName = chaincodeName;
		}

		public String getChaincodeVersion() {
			return this.chaincodeVersion;
		}

		public void setChaincodeVersion(String chaincodeVersion) {
			this.chaincodeVersion = chaincodeVersion;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeployTime() {
			return this.deployTime;
		}

		public void setDeployTime(String deployTime) {
			this.deployTime = deployTime;
		}

		public String getChaincodeId() {
			return this.chaincodeId;
		}

		public void setChaincodeId(String chaincodeId) {
			this.chaincodeId = chaincodeId;
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

		public String getInstalled() {
			return this.installed;
		}

		public void setInstalled(String installed) {
			this.installed = installed;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}
	}

	@Override
	public DescribeFabricOrganizationChaincodesResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricOrganizationChaincodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

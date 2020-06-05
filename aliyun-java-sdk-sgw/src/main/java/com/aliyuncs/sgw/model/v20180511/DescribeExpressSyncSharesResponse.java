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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeExpressSyncSharesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressSyncSharesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Share> shares;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Share> getShares() {
		return this.shares;
	}

	public void setShares(List<Share> shares) {
		this.shares = shares;
	}

	public static class Share {

		private String gatewayId;

		private String storageBundleId;

		private String gatewayName;

		private String gatewayRegion;

		private String shareName;

		private String expressSyncState;

		private String expressSyncId;

		private String mnsQueue;

		private Integer syncProgress;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getStorageBundleId() {
			return this.storageBundleId;
		}

		public void setStorageBundleId(String storageBundleId) {
			this.storageBundleId = storageBundleId;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getGatewayRegion() {
			return this.gatewayRegion;
		}

		public void setGatewayRegion(String gatewayRegion) {
			this.gatewayRegion = gatewayRegion;
		}

		public String getShareName() {
			return this.shareName;
		}

		public void setShareName(String shareName) {
			this.shareName = shareName;
		}

		public String getExpressSyncState() {
			return this.expressSyncState;
		}

		public void setExpressSyncState(String expressSyncState) {
			this.expressSyncState = expressSyncState;
		}

		public String getExpressSyncId() {
			return this.expressSyncId;
		}

		public void setExpressSyncId(String expressSyncId) {
			this.expressSyncId = expressSyncId;
		}

		public String getMnsQueue() {
			return this.mnsQueue;
		}

		public void setMnsQueue(String mnsQueue) {
			this.mnsQueue = mnsQueue;
		}

		public Integer getSyncProgress() {
			return this.syncProgress;
		}

		public void setSyncProgress(Integer syncProgress) {
			this.syncProgress = syncProgress;
		}
	}

	@Override
	public DescribeExpressSyncSharesResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressSyncSharesResponseUnmarshaller.unmarshall(this, context);
	}
}

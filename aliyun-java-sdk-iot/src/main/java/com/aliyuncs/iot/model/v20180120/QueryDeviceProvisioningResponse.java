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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryDeviceProvisioningResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceProvisioningResponse extends AcsResponse {

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

		private Long gmtCreate;

		private Long gmtModified;

		private String aliyunUid;

		private String productKey;

		private String deviceName;

		private String sourceIotInstanceId;

		private String targetIotInstanceId;

		private String sourceRegion;

		private String targetRegion;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(String aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getSourceIotInstanceId() {
			return this.sourceIotInstanceId;
		}

		public void setSourceIotInstanceId(String sourceIotInstanceId) {
			this.sourceIotInstanceId = sourceIotInstanceId;
		}

		public String getTargetIotInstanceId() {
			return this.targetIotInstanceId;
		}

		public void setTargetIotInstanceId(String targetIotInstanceId) {
			this.targetIotInstanceId = targetIotInstanceId;
		}

		public String getSourceRegion() {
			return this.sourceRegion;
		}

		public void setSourceRegion(String sourceRegion) {
			this.sourceRegion = sourceRegion;
		}

		public String getTargetRegion() {
			return this.targetRegion;
		}

		public void setTargetRegion(String targetRegion) {
			this.targetRegion = targetRegion;
		}
	}

	@Override
	public QueryDeviceProvisioningResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceProvisioningResponseUnmarshaller.unmarshall(this, context);
	}
}

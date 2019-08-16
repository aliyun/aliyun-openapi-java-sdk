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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryEdgeInstanceGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEdgeInstanceGatewayResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<Gateway> gatewayList;

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

	public List<Gateway> getGatewayList() {
		return this.gatewayList;
	}

	public void setGatewayList(List<Gateway> gatewayList) {
		this.gatewayList = gatewayList;
	}

	public static class Gateway {

		private String productKey;

		private String deviceName;

		private String iotId;

		private String edgeVersion;

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

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public String getEdgeVersion() {
			return this.edgeVersion;
		}

		public void setEdgeVersion(String edgeVersion) {
			this.edgeVersion = edgeVersion;
		}
	}

	@Override
	public QueryEdgeInstanceGatewayResponse getInstance(UnmarshallerContext context) {
		return	QueryEdgeInstanceGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

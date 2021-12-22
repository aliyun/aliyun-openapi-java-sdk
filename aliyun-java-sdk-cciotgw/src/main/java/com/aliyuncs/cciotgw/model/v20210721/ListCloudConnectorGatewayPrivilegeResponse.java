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

package com.aliyuncs.cciotgw.model.v20210721;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cciotgw.transform.v20210721.ListCloudConnectorGatewayPrivilegeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCloudConnectorGatewayPrivilegeResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private String ioTCloudConnectorGatewayId;

	private List<IoTCloudConnectorGatewayPrivilege> ioTCloudConnectorGatewayPrivileges;

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

	public String getIoTCloudConnectorGatewayId() {
		return this.ioTCloudConnectorGatewayId;
	}

	public void setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
		this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
	}

	public List<IoTCloudConnectorGatewayPrivilege> getIoTCloudConnectorGatewayPrivileges() {
		return this.ioTCloudConnectorGatewayPrivileges;
	}

	public void setIoTCloudConnectorGatewayPrivileges(List<IoTCloudConnectorGatewayPrivilege> ioTCloudConnectorGatewayPrivileges) {
		this.ioTCloudConnectorGatewayPrivileges = ioTCloudConnectorGatewayPrivileges;
	}

	public static class IoTCloudConnectorGatewayPrivilege {

		private String type;

		private String aliuid;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAliuid() {
			return this.aliuid;
		}

		public void setAliuid(String aliuid) {
			this.aliuid = aliuid;
		}
	}

	@Override
	public ListCloudConnectorGatewayPrivilegeResponse getInstance(UnmarshallerContext context) {
		return	ListCloudConnectorGatewayPrivilegeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

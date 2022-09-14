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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListGatewaySlbResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewaySlbResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private List<Sources> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Sources> getData() {
		return this.data;
	}

	public void setData(List<Sources> data) {
		this.data = data;
	}

	public static class Sources {

		private String id;

		private String slbId;

		private String slbIp;

		private String slbPort;

		private String type;

		private String gatewayId;

		private String gmtCreate;

		private String gatewaySlbMode;

		private String gatewaySlbStatus;

		private String statusDesc;

		private String vServerGroupId;

		private Integer httpPort;

		private Integer httpsPort;

		private Integer serviceWeight;

		private Boolean editEnable;

		private String httpsVServerGroupId;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public String getSlbPort() {
			return this.slbPort;
		}

		public void setSlbPort(String slbPort) {
			this.slbPort = slbPort;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGatewaySlbMode() {
			return this.gatewaySlbMode;
		}

		public void setGatewaySlbMode(String gatewaySlbMode) {
			this.gatewaySlbMode = gatewaySlbMode;
		}

		public String getGatewaySlbStatus() {
			return this.gatewaySlbStatus;
		}

		public void setGatewaySlbStatus(String gatewaySlbStatus) {
			this.gatewaySlbStatus = gatewaySlbStatus;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public Integer getHttpPort() {
			return this.httpPort;
		}

		public void setHttpPort(Integer httpPort) {
			this.httpPort = httpPort;
		}

		public Integer getHttpsPort() {
			return this.httpsPort;
		}

		public void setHttpsPort(Integer httpsPort) {
			this.httpsPort = httpsPort;
		}

		public Integer getServiceWeight() {
			return this.serviceWeight;
		}

		public void setServiceWeight(Integer serviceWeight) {
			this.serviceWeight = serviceWeight;
		}

		public Boolean getEditEnable() {
			return this.editEnable;
		}

		public void setEditEnable(Boolean editEnable) {
			this.editEnable = editEnable;
		}

		public String getHttpsVServerGroupId() {
			return this.httpsVServerGroupId;
		}

		public void setHttpsVServerGroupId(String httpsVServerGroupId) {
			this.httpsVServerGroupId = httpsVServerGroupId;
		}
	}

	@Override
	public ListGatewaySlbResponse getInstance(UnmarshallerContext context) {
		return	ListGatewaySlbResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

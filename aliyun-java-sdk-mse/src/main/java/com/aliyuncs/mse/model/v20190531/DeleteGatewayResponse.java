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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.DeleteGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteGatewayResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private String gatewayUniqueId;

		private String region;

		private String primaryUser;

		private Integer status;

		private String vpc;

		private String vswitch;

		private String securityGroup;

		private String spec;

		private Integer replica;

		private String gmtCreate;

		private String gmtModified;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getPrimaryUser() {
			return this.primaryUser;
		}

		public void setPrimaryUser(String primaryUser) {
			this.primaryUser = primaryUser;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getVpc() {
			return this.vpc;
		}

		public void setVpc(String vpc) {
			this.vpc = vpc;
		}

		public String getVswitch() {
			return this.vswitch;
		}

		public void setVswitch(String vswitch) {
			this.vswitch = vswitch;
		}

		public String getSecurityGroup() {
			return this.securityGroup;
		}

		public void setSecurityGroup(String securityGroup) {
			this.securityGroup = securityGroup;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public Integer getReplica() {
			return this.replica;
		}

		public void setReplica(Integer replica) {
			this.replica = replica;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DeleteGatewayResponse getInstance(UnmarshallerContext context) {
		return	DeleteGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

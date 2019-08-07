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

package com.aliyuncs.hdr.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.UpgradeSitePairResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpgradeSitePairResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Boolean result;

	private List<Gateway> gateways;

	private List<Server> servers;

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

	public Boolean getResult() {
		return this.result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public List<Gateway> getGateways() {
		return this.gateways;
	}

	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

	public List<Server> getServers() {
		return this.servers;
	}

	public void setServers(List<Server> servers) {
		this.servers = servers;
	}

	public static class Gateway {

		private String gatewayId;

		private String errno;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getErrno() {
			return this.errno;
		}

		public void setErrno(String errno) {
			this.errno = errno;
		}
	}

	public static class Server {

		private String serverId;

		private String errno;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getErrno() {
			return this.errno;
		}

		public void setErrno(String errno) {
			this.errno = errno;
		}
	}

	@Override
	public UpgradeSitePairResponse getInstance(UnmarshallerContext context) {
		return	UpgradeSitePairResponseUnmarshaller.unmarshall(this, context);
	}
}

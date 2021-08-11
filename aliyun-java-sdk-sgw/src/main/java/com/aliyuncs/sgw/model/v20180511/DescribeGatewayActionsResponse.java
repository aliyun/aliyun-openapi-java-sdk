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
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayActionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayActionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Action> actions;

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

	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public static class Action {

		private String gatewayId;

		private String self;

		private String monitor;

		private String disk;

		private String cache;

		private String smbUser;

		private String adLdap;

		private String target;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getSelf() {
			return this.self;
		}

		public void setSelf(String self) {
			this.self = self;
		}

		public String getMonitor() {
			return this.monitor;
		}

		public void setMonitor(String monitor) {
			this.monitor = monitor;
		}

		public String getDisk() {
			return this.disk;
		}

		public void setDisk(String disk) {
			this.disk = disk;
		}

		public String getCache() {
			return this.cache;
		}

		public void setCache(String cache) {
			this.cache = cache;
		}

		public String getSmbUser() {
			return this.smbUser;
		}

		public void setSmbUser(String smbUser) {
			this.smbUser = smbUser;
		}

		public String getAdLdap() {
			return this.adLdap;
		}

		public void setAdLdap(String adLdap) {
			this.adLdap = adLdap;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}
	}

	@Override
	public DescribeGatewayActionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayActionsResponseUnmarshaller.unmarshall(this, context);
	}
}

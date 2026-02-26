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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetEngineDefaultAuthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEngineDefaultAuthResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<AuthInfo> authInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<AuthInfo> getAuthInfos() {
		return this.authInfos;
	}

	public void setAuthInfos(List<AuthInfo> authInfos) {
		this.authInfos = authInfos;
	}

	public static class AuthInfo {

		private String engine;

		private String username;

		private String password;

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}

	@Override
	public GetEngineDefaultAuthResponse getInstance(UnmarshallerContext context) {
		return	GetEngineDefaultAuthResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

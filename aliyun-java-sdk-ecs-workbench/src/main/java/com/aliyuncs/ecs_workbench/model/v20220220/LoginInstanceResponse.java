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

package com.aliyuncs.ecs_workbench.model.v20220220;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs_workbench.transform.v20220220.LoginInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LoginInstanceResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String message;

	private Root root;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
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

	public Root getRoot() {
		return this.root;
	}

	public void setRoot(Root root) {
		this.root = root;
	}

	public static class Root {

		private List<InstanceLoginInfoListItem> instanceLoginInfoList;

		private DisposableAccount disposableAccount;

		private SessionControl sessionControl;

		public List<InstanceLoginInfoListItem> getInstanceLoginInfoList() {
			return this.instanceLoginInfoList;
		}

		public void setInstanceLoginInfoList(List<InstanceLoginInfoListItem> instanceLoginInfoList) {
			this.instanceLoginInfoList = instanceLoginInfoList;
		}

		public DisposableAccount getDisposableAccount() {
			return this.disposableAccount;
		}

		public void setDisposableAccount(DisposableAccount disposableAccount) {
			this.disposableAccount = disposableAccount;
		}

		public SessionControl getSessionControl() {
			return this.sessionControl;
		}

		public void setSessionControl(SessionControl sessionControl) {
			this.sessionControl = sessionControl;
		}

		public static class InstanceLoginInfoListItem {

			private String instanceId;

			private String instanceLoginToken;

			private Boolean loginSuccess;

			private InstanceLoginView instanceLoginView;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceLoginToken() {
				return this.instanceLoginToken;
			}

			public void setInstanceLoginToken(String instanceLoginToken) {
				this.instanceLoginToken = instanceLoginToken;
			}

			public Boolean getLoginSuccess() {
				return this.loginSuccess;
			}

			public void setLoginSuccess(Boolean loginSuccess) {
				this.loginSuccess = loginSuccess;
			}

			public InstanceLoginView getInstanceLoginView() {
				return this.instanceLoginView;
			}

			public void setInstanceLoginView(InstanceLoginView instanceLoginView) {
				this.instanceLoginView = instanceLoginView;
			}

			public static class InstanceLoginView {

				private String defaultViewUrl;

				public String getDefaultViewUrl() {
					return this.defaultViewUrl;
				}

				public void setDefaultViewUrl(String defaultViewUrl) {
					this.defaultViewUrl = defaultViewUrl;
				}
			}
		}

		public static class DisposableAccount {

			private String loginUrl;

			private String loginFormActionUrl;

			public String getLoginUrl() {
				return this.loginUrl;
			}

			public void setLoginUrl(String loginUrl) {
				this.loginUrl = loginUrl;
			}

			public String getLoginFormActionUrl() {
				return this.loginFormActionUrl;
			}

			public void setLoginFormActionUrl(String loginFormActionUrl) {
				this.loginFormActionUrl = loginFormActionUrl;
			}
		}

		public static class SessionControl {

			private String baseUrl;

			public String getBaseUrl() {
				return this.baseUrl;
			}

			public void setBaseUrl(String baseUrl) {
				this.baseUrl = baseUrl;
			}
		}
	}

	@Override
	public LoginInstanceResponse getInstance(UnmarshallerContext context) {
		return	LoginInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

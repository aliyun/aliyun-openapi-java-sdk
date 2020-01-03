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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.GetWorkbenchTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkbenchTokenResponse extends AcsResponse {

	private String requestId;

	private Root root;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Root getRoot() {
		return this.root;
	}

	public void setRoot(Root root) {
		this.root = root;
	}

	public static class Root {

		private InstanceLoginView instanceLoginView;

		public InstanceLoginView getInstanceLoginView() {
			return this.instanceLoginView;
		}

		public void setInstanceLoginView(InstanceLoginView instanceLoginView) {
			this.instanceLoginView = instanceLoginView;
		}

		public static class InstanceLoginView {

			private String viewName;

			private String defaultViewUrl;

			private String baseViewUrl;

			private String terminalViewUrl;

			private String fileTreeViewUrl;

			private String rdpViewUrl;

			public String getViewName() {
				return this.viewName;
			}

			public void setViewName(String viewName) {
				this.viewName = viewName;
			}

			public String getDefaultViewUrl() {
				return this.defaultViewUrl;
			}

			public void setDefaultViewUrl(String defaultViewUrl) {
				this.defaultViewUrl = defaultViewUrl;
			}

			public String getBaseViewUrl() {
				return this.baseViewUrl;
			}

			public void setBaseViewUrl(String baseViewUrl) {
				this.baseViewUrl = baseViewUrl;
			}

			public String getTerminalViewUrl() {
				return this.terminalViewUrl;
			}

			public void setTerminalViewUrl(String terminalViewUrl) {
				this.terminalViewUrl = terminalViewUrl;
			}

			public String getFileTreeViewUrl() {
				return this.fileTreeViewUrl;
			}

			public void setFileTreeViewUrl(String fileTreeViewUrl) {
				this.fileTreeViewUrl = fileTreeViewUrl;
			}

			public String getRdpViewUrl() {
				return this.rdpViewUrl;
			}

			public void setRdpViewUrl(String rdpViewUrl) {
				this.rdpViewUrl = rdpViewUrl;
			}
		}
	}

	@Override
	public GetWorkbenchTokenResponse getInstance(UnmarshallerContext context) {
		return	GetWorkbenchTokenResponseUnmarshaller.unmarshall(this, context);
	}
}

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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListAKSAcrNamespaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAKSAcrNamespaceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<NamespacesItem> namespaces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<NamespacesItem> getNamespaces() {
		return this.namespaces;
	}

	public void setNamespaces(List<NamespacesItem> namespaces) {
		this.namespaces = namespaces;
	}

	public static class NamespacesItem {

		private String authorizeType;

		private String autoCreate;

		private String defaultVisibility;

		private String namespace;

		private String namespaceId;

		private String namespaceStatus;

		public String getAuthorizeType() {
			return this.authorizeType;
		}

		public void setAuthorizeType(String authorizeType) {
			this.authorizeType = authorizeType;
		}

		public String getAutoCreate() {
			return this.autoCreate;
		}

		public void setAutoCreate(String autoCreate) {
			this.autoCreate = autoCreate;
		}

		public String getDefaultVisibility() {
			return this.defaultVisibility;
		}

		public void setDefaultVisibility(String defaultVisibility) {
			this.defaultVisibility = defaultVisibility;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getNamespaceStatus() {
			return this.namespaceStatus;
		}

		public void setNamespaceStatus(String namespaceStatus) {
			this.namespaceStatus = namespaceStatus;
		}
	}

	@Override
	public ListAKSAcrNamespaceResponse getInstance(UnmarshallerContext context) {
		return	ListAKSAcrNamespaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

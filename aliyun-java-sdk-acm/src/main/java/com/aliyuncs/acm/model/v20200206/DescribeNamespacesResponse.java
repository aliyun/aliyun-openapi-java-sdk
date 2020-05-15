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

package com.aliyuncs.acm.model.v20200206;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.acm.transform.v20200206.DescribeNamespacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNamespacesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<Namespace> namespaces;

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

	public List<Namespace> getNamespaces() {
		return this.namespaces;
	}

	public void setNamespaces(List<Namespace> namespaces) {
		this.namespaces = namespaces;
	}

	public static class Namespace {

		private Integer configCount;

		private String namespaceId;

		private String namespaceName;

		private Integer quota;

		private Integer type;

		public Integer getConfigCount() {
			return this.configCount;
		}

		public void setConfigCount(Integer configCount) {
			this.configCount = configCount;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getNamespaceName() {
			return this.namespaceName;
		}

		public void setNamespaceName(String namespaceName) {
			this.namespaceName = namespaceName;
		}

		public Integer getQuota() {
			return this.quota;
		}

		public void setQuota(Integer quota) {
			this.quota = quota;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}
	}

	@Override
	public DescribeNamespacesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNamespacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListDomainProxyTokensResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDomainProxyTokensResponse extends AcsResponse {

	private String requestId;

	private List<DomainProxyToken> domainProxyTokens;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainProxyToken> getDomainProxyTokens() {
		return this.domainProxyTokens;
	}

	public void setDomainProxyTokens(List<DomainProxyToken> domainProxyTokens) {
		this.domainProxyTokens = domainProxyTokens;
	}

	public static class DomainProxyToken {

		private String instanceId;

		private String domainProxyTokenId;

		private String domainProxyToken;

		private String domainId;

		private String status;

		private Long createTime;

		private Long updateTime;

		private Long lastUsedTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainProxyTokenId() {
			return this.domainProxyTokenId;
		}

		public void setDomainProxyTokenId(String domainProxyTokenId) {
			this.domainProxyTokenId = domainProxyTokenId;
		}

		public String getDomainProxyToken() {
			return this.domainProxyToken;
		}

		public void setDomainProxyToken(String domainProxyToken) {
			this.domainProxyToken = domainProxyToken;
		}

		public String getDomainId() {
			return this.domainId;
		}

		public void setDomainId(String domainId) {
			this.domainId = domainId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getLastUsedTime() {
			return this.lastUsedTime;
		}

		public void setLastUsedTime(Long lastUsedTime) {
			this.lastUsedTime = lastUsedTime;
		}
	}

	@Override
	public ListDomainProxyTokensResponse getInstance(UnmarshallerContext context) {
		return	ListDomainProxyTokensResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

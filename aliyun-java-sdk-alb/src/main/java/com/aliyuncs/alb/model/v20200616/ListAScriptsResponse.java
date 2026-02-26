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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.ListAScriptsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAScriptsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<AScript> aScripts;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<AScript> getAScripts() {
		return this.aScripts;
	}

	public void setAScripts(List<AScript> aScripts) {
		this.aScripts = aScripts;
	}

	public static class AScript {

		private String aScriptId;

		private String aScriptName;

		private Long priority;

		private String position;

		private Boolean enabled;

		private String scriptContent;

		private String aScriptStatus;

		private String listenerId;

		private String loadBalancerId;

		private Boolean extAttributeEnabled;

		private List<ExtAttribute> extAttributes;

		public String getAScriptId() {
			return this.aScriptId;
		}

		public void setAScriptId(String aScriptId) {
			this.aScriptId = aScriptId;
		}

		public String getAScriptName() {
			return this.aScriptName;
		}

		public void setAScriptName(String aScriptName) {
			this.aScriptName = aScriptName;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getScriptContent() {
			return this.scriptContent;
		}

		public void setScriptContent(String scriptContent) {
			this.scriptContent = scriptContent;
		}

		public String getAScriptStatus() {
			return this.aScriptStatus;
		}

		public void setAScriptStatus(String aScriptStatus) {
			this.aScriptStatus = aScriptStatus;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Boolean getExtAttributeEnabled() {
			return this.extAttributeEnabled;
		}

		public void setExtAttributeEnabled(Boolean extAttributeEnabled) {
			this.extAttributeEnabled = extAttributeEnabled;
		}

		public List<ExtAttribute> getExtAttributes() {
			return this.extAttributes;
		}

		public void setExtAttributes(List<ExtAttribute> extAttributes) {
			this.extAttributes = extAttributes;
		}

		public static class ExtAttribute {

			private String attributeKey;

			private String attributeValue;

			public String getAttributeKey() {
				return this.attributeKey;
			}

			public void setAttributeKey(String attributeKey) {
				this.attributeKey = attributeKey;
			}

			public String getAttributeValue() {
				return this.attributeValue;
			}

			public void setAttributeValue(String attributeValue) {
				this.attributeValue = attributeValue;
			}
		}
	}

	@Override
	public ListAScriptsResponse getInstance(UnmarshallerContext context) {
		return	ListAScriptsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

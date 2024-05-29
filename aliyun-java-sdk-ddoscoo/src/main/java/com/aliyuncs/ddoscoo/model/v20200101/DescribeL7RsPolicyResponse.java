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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeL7RsPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeL7RsPolicyResponse extends AcsResponse {

	private String proxyMode;

	private Integer upstreamRetry;

	private String requestId;

	private List<AttributeItem> attributes;

	public String getProxyMode() {
		return this.proxyMode;
	}

	public void setProxyMode(String proxyMode) {
		this.proxyMode = proxyMode;
	}

	public Integer getUpstreamRetry() {
		return this.upstreamRetry;
	}

	public void setUpstreamRetry(Integer upstreamRetry) {
		this.upstreamRetry = upstreamRetry;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AttributeItem> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<AttributeItem> attributes) {
		this.attributes = attributes;
	}

	public static class AttributeItem {

		private Integer rsType;

		private String realServer;

		private Attribute attribute;

		public Integer getRsType() {
			return this.rsType;
		}

		public void setRsType(Integer rsType) {
			this.rsType = rsType;
		}

		public String getRealServer() {
			return this.realServer;
		}

		public void setRealServer(String realServer) {
			this.realServer = realServer;
		}

		public Attribute getAttribute() {
			return this.attribute;
		}

		public void setAttribute(Attribute attribute) {
			this.attribute = attribute;
		}

		public static class Attribute {

			private Integer weight;

			private Integer connectTimeout;

			private Integer failTimeout;

			private Integer maxFails;

			private String mode;

			private Integer readTimeout;

			private Integer sendTimeout;

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public Integer getConnectTimeout() {
				return this.connectTimeout;
			}

			public void setConnectTimeout(Integer connectTimeout) {
				this.connectTimeout = connectTimeout;
			}

			public Integer getFailTimeout() {
				return this.failTimeout;
			}

			public void setFailTimeout(Integer failTimeout) {
				this.failTimeout = failTimeout;
			}

			public Integer getMaxFails() {
				return this.maxFails;
			}

			public void setMaxFails(Integer maxFails) {
				this.maxFails = maxFails;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public Integer getReadTimeout() {
				return this.readTimeout;
			}

			public void setReadTimeout(Integer readTimeout) {
				this.readTimeout = readTimeout;
			}

			public Integer getSendTimeout() {
				return this.sendTimeout;
			}

			public void setSendTimeout(Integer sendTimeout) {
				this.sendTimeout = sendTimeout;
			}
		}
	}

	@Override
	public DescribeL7RsPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeL7RsPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

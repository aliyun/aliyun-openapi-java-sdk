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

	private String requestId;

	private String proxyMode;

	private List<AttributeItem> attributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProxyMode() {
		return this.proxyMode;
	}

	public void setProxyMode(String proxyMode) {
		this.proxyMode = proxyMode;
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

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
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

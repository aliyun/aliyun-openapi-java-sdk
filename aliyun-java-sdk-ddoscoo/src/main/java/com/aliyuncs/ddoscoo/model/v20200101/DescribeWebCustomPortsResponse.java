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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebCustomPortsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebCustomPortsResponse extends AcsResponse {

	private String requestId;

	private List<WebCustomPort> webCustomPorts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WebCustomPort> getWebCustomPorts() {
		return this.webCustomPorts;
	}

	public void setWebCustomPorts(List<WebCustomPort> webCustomPorts) {
		this.webCustomPorts = webCustomPorts;
	}

	public static class WebCustomPort {

		private String proxyType;

		private List<String> proxyPorts;

		public String getProxyType() {
			return this.proxyType;
		}

		public void setProxyType(String proxyType) {
			this.proxyType = proxyType;
		}

		public List<String> getProxyPorts() {
			return this.proxyPorts;
		}

		public void setProxyPorts(List<String> proxyPorts) {
			this.proxyPorts = proxyPorts;
		}
	}

	@Override
	public DescribeWebCustomPortsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebCustomPortsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

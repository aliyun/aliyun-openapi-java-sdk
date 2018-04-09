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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceQuickLinkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceQuickLinkResponse extends AcsResponse {

	private String requestId;

	private List<QuickLink> quickLinkList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QuickLink> getQuickLinkList() {
		return this.quickLinkList;
	}

	public void setQuickLinkList(List<QuickLink> quickLinkList) {
		this.quickLinkList = quickLinkList;
	}

	public static class QuickLink {

		private String serviceName;

		private String serviceDisplayName;

		private String quickLinkAddress;

		private String protocol;

		private String port;

		private String type;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDisplayName() {
			return this.serviceDisplayName;
		}

		public void setServiceDisplayName(String serviceDisplayName) {
			this.serviceDisplayName = serviceDisplayName;
		}

		public String getQuickLinkAddress() {
			return this.quickLinkAddress;
		}

		public void setQuickLinkAddress(String quickLinkAddress) {
			this.quickLinkAddress = quickLinkAddress;
		}

		public String getProtocol() {
			return this.protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public ListClusterServiceQuickLinkResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceQuickLinkResponseUnmarshaller.unmarshall(this, context);
	}
}

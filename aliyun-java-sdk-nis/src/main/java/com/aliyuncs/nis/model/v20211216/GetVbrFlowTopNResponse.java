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

package com.aliyuncs.nis.model.v20211216;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nis.transform.v20211216.GetVbrFlowTopNResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVbrFlowTopNResponse extends AcsResponse {

	private String requestId;

	private List<VbrFlowlogTopN> virtualBorderRouterFlowlogTopN;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VbrFlowlogTopN> getVirtualBorderRouterFlowlogTopN() {
		return this.virtualBorderRouterFlowlogTopN;
	}

	public void setVirtualBorderRouterFlowlogTopN(List<VbrFlowlogTopN> virtualBorderRouterFlowlogTopN) {
		this.virtualBorderRouterFlowlogTopN = virtualBorderRouterFlowlogTopN;
	}

	public static class VbrFlowlogTopN {

		private String cloudRegion;

		private String cloudIp;

		private String otherIp;

		private String cloudPort;

		private String otherPort;

		private String protocol;

		private String attachmentId;

		private String virtualBorderRouterId;

		private Double bytes;

		private Double packets;

		private String accountId;

		public String getCloudRegion() {
			return this.cloudRegion;
		}

		public void setCloudRegion(String cloudRegion) {
			this.cloudRegion = cloudRegion;
		}

		public String getCloudIp() {
			return this.cloudIp;
		}

		public void setCloudIp(String cloudIp) {
			this.cloudIp = cloudIp;
		}

		public String getOtherIp() {
			return this.otherIp;
		}

		public void setOtherIp(String otherIp) {
			this.otherIp = otherIp;
		}

		public String getCloudPort() {
			return this.cloudPort;
		}

		public void setCloudPort(String cloudPort) {
			this.cloudPort = cloudPort;
		}

		public String getOtherPort() {
			return this.otherPort;
		}

		public void setOtherPort(String otherPort) {
			this.otherPort = otherPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getAttachmentId() {
			return this.attachmentId;
		}

		public void setAttachmentId(String attachmentId) {
			this.attachmentId = attachmentId;
		}

		public String getVirtualBorderRouterId() {
			return this.virtualBorderRouterId;
		}

		public void setVirtualBorderRouterId(String virtualBorderRouterId) {
			this.virtualBorderRouterId = virtualBorderRouterId;
		}

		public Double getBytes() {
			return this.bytes;
		}

		public void setBytes(Double bytes) {
			this.bytes = bytes;
		}

		public Double getPackets() {
			return this.packets;
		}

		public void setPackets(Double packets) {
			this.packets = packets;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
	}

	@Override
	public GetVbrFlowTopNResponse getInstance(UnmarshallerContext context) {
		return	GetVbrFlowTopNResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

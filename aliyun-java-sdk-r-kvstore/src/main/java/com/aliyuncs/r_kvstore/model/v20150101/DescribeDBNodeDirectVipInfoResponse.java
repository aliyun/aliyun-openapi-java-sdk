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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeDBNodeDirectVipInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBNodeDirectVipInfoResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<VipInfo> directVipInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<VipInfo> getDirectVipInfo() {
		return this.directVipInfo;
	}

	public void setDirectVipInfo(List<VipInfo> directVipInfo) {
		this.directVipInfo = directVipInfo;
	}

	public static class VipInfo {

		private String nodeId;

		private String vip;

		private String port;

		private String netType;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getVip() {
			return this.vip;
		}

		public void setVip(String vip) {
			this.vip = vip;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}
	}

	@Override
	public DescribeDBNodeDirectVipInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBNodeDirectVipInfoResponseUnmarshaller.unmarshall(this, context);
	}
}

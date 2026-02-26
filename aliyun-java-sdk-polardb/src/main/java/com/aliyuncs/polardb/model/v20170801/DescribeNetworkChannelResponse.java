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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeNetworkChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkChannelResponse extends AcsResponse {

	private String requestId;

	private List<ChannelInfosItem> channelInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ChannelInfosItem> getChannelInfos() {
		return this.channelInfos;
	}

	public void setChannelInfos(List<ChannelInfosItem> channelInfos) {
		this.channelInfos = channelInfos;
	}

	public static class ChannelInfosItem {

		private String channelName;

		private String dBClusterId;

		private String notes;

		private String regionId;

		private String targetDBClusterId;

		private String targetIp;

		private String targetPort;

		private String targetType;

		private String vpcId;

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getNotes() {
			return this.notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTargetDBClusterId() {
			return this.targetDBClusterId;
		}

		public void setTargetDBClusterId(String targetDBClusterId) {
			this.targetDBClusterId = targetDBClusterId;
		}

		public String getTargetIp() {
			return this.targetIp;
		}

		public void setTargetIp(String targetIp) {
			this.targetIp = targetIp;
		}

		public String getTargetPort() {
			return this.targetPort;
		}

		public void setTargetPort(String targetPort) {
			this.targetPort = targetPort;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}
	}

	@Override
	public DescribeNetworkChannelResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkChannelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

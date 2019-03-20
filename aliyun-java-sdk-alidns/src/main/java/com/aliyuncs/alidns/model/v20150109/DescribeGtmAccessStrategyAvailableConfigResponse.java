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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmAccessStrategyAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmAccessStrategyAvailableConfigResponse extends AcsResponse {

	private String requestId;

	private List<AddrPool> addrPools;

	private List<Line> lines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AddrPool> getAddrPools() {
		return this.addrPools;
	}

	public void setAddrPools(List<AddrPool> addrPools) {
		this.addrPools = addrPools;
	}

	public List<Line> getLines() {
		return this.lines;
	}

	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	public static class AddrPool {

		private String addrPoolId;

		private String addrPoolName;

		public String getAddrPoolId() {
			return this.addrPoolId;
		}

		public void setAddrPoolId(String addrPoolId) {
			this.addrPoolId = addrPoolId;
		}

		public String getAddrPoolName() {
			return this.addrPoolName;
		}

		public void setAddrPoolName(String addrPoolName) {
			this.addrPoolName = addrPoolName;
		}
	}

	public static class Line {

		private String lineCode;

		private String lineName;

		private String groupCode;

		private String groupName;

		private String status;

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getLineName() {
			return this.lineName;
		}

		public void setLineName(String lineName) {
			this.lineName = lineName;
		}

		public String getGroupCode() {
			return this.groupCode;
		}

		public void setGroupCode(String groupCode) {
			this.groupCode = groupCode;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeGtmAccessStrategyAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmAccessStrategyAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}

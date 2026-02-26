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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRouteEntriesResponse extends AcsResponse {

	private Integer successCount;

	private Integer failedCount;

	private String requestId;

	private List<FailedRouteEntriesItem> failedRouteEntries;

	private List<String> routeEntryIds;

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFailedCount() {
		return this.failedCount;
	}

	public void setFailedCount(Integer failedCount) {
		this.failedCount = failedCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailedRouteEntriesItem> getFailedRouteEntries() {
		return this.failedRouteEntries;
	}

	public void setFailedRouteEntries(List<FailedRouteEntriesItem> failedRouteEntries) {
		this.failedRouteEntries = failedRouteEntries;
	}

	public List<String> getRouteEntryIds() {
		return this.routeEntryIds;
	}

	public void setRouteEntryIds(List<String> routeEntryIds) {
		this.routeEntryIds = routeEntryIds;
	}

	public static class FailedRouteEntriesItem {

		private String dstCidrBlock;

		private String nextHop;

		private String failedCode;

		private String failedMessage;

		public String getDstCidrBlock() {
			return this.dstCidrBlock;
		}

		public void setDstCidrBlock(String dstCidrBlock) {
			this.dstCidrBlock = dstCidrBlock;
		}

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public String getFailedCode() {
			return this.failedCode;
		}

		public void setFailedCode(String failedCode) {
			this.failedCode = failedCode;
		}

		public String getFailedMessage() {
			return this.failedMessage;
		}

		public void setFailedMessage(String failedMessage) {
			this.failedMessage = failedMessage;
		}
	}

	@Override
	public CreateRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	CreateRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

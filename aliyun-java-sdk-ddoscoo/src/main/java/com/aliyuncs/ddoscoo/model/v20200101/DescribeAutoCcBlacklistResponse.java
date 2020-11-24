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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeAutoCcBlacklistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoCcBlacklistResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<AutoCcBlacklistItem> autoCcBlacklist;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<AutoCcBlacklistItem> getAutoCcBlacklist() {
		return this.autoCcBlacklist;
	}

	public void setAutoCcBlacklist(List<AutoCcBlacklistItem> autoCcBlacklist) {
		this.autoCcBlacklist = autoCcBlacklist;
	}

	public static class AutoCcBlacklistItem {

		private String destIp;

		private String sourceIp;

		private Long endTime;

		private String type;

		public String getDestIp() {
			return this.destIp;
		}

		public void setDestIp(String destIp) {
			this.destIp = destIp;
		}

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeAutoCcBlacklistResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoCcBlacklistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

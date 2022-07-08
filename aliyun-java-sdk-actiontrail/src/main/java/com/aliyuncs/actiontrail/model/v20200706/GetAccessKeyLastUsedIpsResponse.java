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

package com.aliyuncs.actiontrail.model.v20200706;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20200706.GetAccessKeyLastUsedIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccessKeyLastUsedIpsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<IpsItem> ips;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<IpsItem> getIps() {
		return this.ips;
	}

	public void setIps(List<IpsItem> ips) {
		this.ips = ips;
	}

	public static class IpsItem {

		private Long usedTimestamp;

		private String detail;

		private String source;

		private String ip;

		public Long getUsedTimestamp() {
			return this.usedTimestamp;
		}

		public void setUsedTimestamp(Long usedTimestamp) {
			this.usedTimestamp = usedTimestamp;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}
	}

	@Override
	public GetAccessKeyLastUsedIpsResponse getInstance(UnmarshallerContext context) {
		return	GetAccessKeyLastUsedIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

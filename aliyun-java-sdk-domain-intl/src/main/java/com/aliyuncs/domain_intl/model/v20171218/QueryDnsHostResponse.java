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

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryDnsHostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDnsHostResponse extends AcsResponse {

	private String requestId;

	private List<DnsHost> dnsHostList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DnsHost> getDnsHostList() {
		return this.dnsHostList;
	}

	public void setDnsHostList(List<DnsHost> dnsHostList) {
		this.dnsHostList = dnsHostList;
	}

	public static class DnsHost {

		private String dnsName;

		private List<String> ipList;

		public String getDnsName() {
			return this.dnsName;
		}

		public void setDnsName(String dnsName) {
			this.dnsName = dnsName;
		}

		public List<String> getIpList() {
			return this.ipList;
		}

		public void setIpList(List<String> ipList) {
			this.ipList = ipList;
		}
	}

	@Override
	public QueryDnsHostResponse getInstance(UnmarshallerContext context) {
		return	QueryDnsHostResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

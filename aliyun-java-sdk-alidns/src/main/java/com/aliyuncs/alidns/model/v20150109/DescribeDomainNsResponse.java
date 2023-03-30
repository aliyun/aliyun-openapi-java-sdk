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
import com.aliyuncs.alidns.transform.v20150109.DescribeDomainNsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainNsResponse extends AcsResponse {

	private Boolean allAliDns;

	private String requestId;

	private Boolean includeAliDns;

	private String detectFailedReasonCode;

	private List<String> expectDnsServers;

	private List<String> dnsServers;

	public Boolean getAllAliDns() {
		return this.allAliDns;
	}

	public void setAllAliDns(Boolean allAliDns) {
		this.allAliDns = allAliDns;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIncludeAliDns() {
		return this.includeAliDns;
	}

	public void setIncludeAliDns(Boolean includeAliDns) {
		this.includeAliDns = includeAliDns;
	}

	public String getDetectFailedReasonCode() {
		return this.detectFailedReasonCode;
	}

	public void setDetectFailedReasonCode(String detectFailedReasonCode) {
		this.detectFailedReasonCode = detectFailedReasonCode;
	}

	public List<String> getExpectDnsServers() {
		return this.expectDnsServers;
	}

	public void setExpectDnsServers(List<String> expectDnsServers) {
		this.expectDnsServers = expectDnsServers;
	}

	public List<String> getDnsServers() {
		return this.dnsServers;
	}

	public void setDnsServers(List<String> dnsServers) {
		this.dnsServers = dnsServers;
	}

	@Override
	public DescribeDomainNsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainNsResponseUnmarshaller.unmarshall(this, context);
	}
}

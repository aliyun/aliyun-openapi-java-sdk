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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetDomainDnsChallengeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDomainDnsChallengeResponse extends AcsResponse {

	private String requestId;

	private DomainDnsChallenge domainDnsChallenge;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DomainDnsChallenge getDomainDnsChallenge() {
		return this.domainDnsChallenge;
	}

	public void setDomainDnsChallenge(DomainDnsChallenge domainDnsChallenge) {
		this.domainDnsChallenge = domainDnsChallenge;
	}

	public static class DomainDnsChallenge {

		private String dnsChallengeName;

		private String dnsType;

		private String dnsChallengeValue;

		public String getDnsChallengeName() {
			return this.dnsChallengeName;
		}

		public void setDnsChallengeName(String dnsChallengeName) {
			this.dnsChallengeName = dnsChallengeName;
		}

		public String getDnsType() {
			return this.dnsType;
		}

		public void setDnsType(String dnsType) {
			this.dnsType = dnsType;
		}

		public String getDnsChallengeValue() {
			return this.dnsChallengeValue;
		}

		public void setDnsChallengeValue(String dnsChallengeValue) {
			this.dnsChallengeValue = dnsChallengeValue;
		}
	}

	@Override
	public GetDomainDnsChallengeResponse getInstance(UnmarshallerContext context) {
		return	GetDomainDnsChallengeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

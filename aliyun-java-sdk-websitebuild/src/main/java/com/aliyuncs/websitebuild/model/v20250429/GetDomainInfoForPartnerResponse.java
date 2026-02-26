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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.GetDomainInfoForPartnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDomainInfoForPartnerResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String domainName;

		private String registrar;

		private String nameServers;

		private Ownership ownership;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getRegistrar() {
			return this.registrar;
		}

		public void setRegistrar(String registrar) {
			this.registrar = registrar;
		}

		public String getNameServers() {
			return this.nameServers;
		}

		public void setNameServers(String nameServers) {
			this.nameServers = nameServers;
		}

		public Ownership getOwnership() {
			return this.ownership;
		}

		public void setOwnership(Ownership ownership) {
			this.ownership = ownership;
		}

		public static class Ownership {

			private String account;

			private String provider;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getProvider() {
				return this.provider;
			}

			public void setProvider(String provider) {
				this.provider = provider;
			}
		}
	}

	@Override
	public GetDomainInfoForPartnerResponse getInstance(UnmarshallerContext context) {
		return	GetDomainInfoForPartnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

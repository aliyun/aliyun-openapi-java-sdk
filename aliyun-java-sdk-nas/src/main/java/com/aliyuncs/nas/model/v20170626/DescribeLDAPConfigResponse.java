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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeLDAPConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLDAPConfigResponse extends AcsResponse {

	private String requestId;

	private Ldap ldap;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Ldap getLdap() {
		return this.ldap;
	}

	public void setLdap(Ldap ldap) {
		this.ldap = ldap;
	}

	public static class Ldap {

		private String bindDN;

		private String uRI;

		private String searchBase;

		public String getBindDN() {
			return this.bindDN;
		}

		public void setBindDN(String bindDN) {
			this.bindDN = bindDN;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public String getSearchBase() {
			return this.searchBase;
		}

		public void setSearchBase(String searchBase) {
			this.searchBase = searchBase;
		}
	}

	@Override
	public DescribeLDAPConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLDAPConfigResponseUnmarshaller.unmarshall(this, context);
	}
}

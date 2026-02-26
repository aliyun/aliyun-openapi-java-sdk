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
import com.aliyuncs.vpc.transform.v20160428.CreateNatIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNatIpResponse extends AcsResponse {

	private String natIp;

	private String requestId;

	private String natIpId;

	private String ipv4Prefix;

	private List<NatIp> natIps;

	public String getNatIp() {
		return this.natIp;
	}

	public void setNatIp(String natIp) {
		this.natIp = natIp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNatIpId() {
		return this.natIpId;
	}

	public void setNatIpId(String natIpId) {
		this.natIpId = natIpId;
	}

	public String getIpv4Prefix() {
		return this.ipv4Prefix;
	}

	public void setIpv4Prefix(String ipv4Prefix) {
		this.ipv4Prefix = ipv4Prefix;
	}

	public List<NatIp> getNatIps() {
		return this.natIps;
	}

	public void setNatIps(List<NatIp> natIps) {
		this.natIps = natIps;
	}

	public static class NatIp {

		private String natIp;

		private String natIpId;

		private String ipv4Prefix;

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getNatIpId() {
			return this.natIpId;
		}

		public void setNatIpId(String natIpId) {
			this.natIpId = natIpId;
		}

		public String getIpv4Prefix() {
			return this.ipv4Prefix;
		}

		public void setIpv4Prefix(String ipv4Prefix) {
			this.ipv4Prefix = ipv4Prefix;
		}
	}

	@Override
	public CreateNatIpResponse getInstance(UnmarshallerContext context) {
		return	CreateNatIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

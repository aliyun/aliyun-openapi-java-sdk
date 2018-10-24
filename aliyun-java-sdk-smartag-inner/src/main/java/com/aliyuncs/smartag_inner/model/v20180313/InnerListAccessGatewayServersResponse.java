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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListAccessGatewayServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListAccessGatewayServersResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AccessGatewayServer> accessGatewayServers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<AccessGatewayServer> getAccessGatewayServers() {
		return this.accessGatewayServers;
	}

	public void setAccessGatewayServers(List<AccessGatewayServer> accessGatewayServers) {
		this.accessGatewayServers = accessGatewayServers;
	}

	public static class AccessGatewayServer {

		private String instanceId;

		private String locationId;

		private String intranetIpPri;

		private String intranetIpSec;

		private String internetIpPri;

		private String internetIpSec;

		private String loopbackInternalIp;

		private String loopbackExternalIp;

		private String managementIp;

		private String businessState;

		private String state;

		private List<String> staticIps;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLocationId() {
			return this.locationId;
		}

		public void setLocationId(String locationId) {
			this.locationId = locationId;
		}

		public String getIntranetIpPri() {
			return this.intranetIpPri;
		}

		public void setIntranetIpPri(String intranetIpPri) {
			this.intranetIpPri = intranetIpPri;
		}

		public String getIntranetIpSec() {
			return this.intranetIpSec;
		}

		public void setIntranetIpSec(String intranetIpSec) {
			this.intranetIpSec = intranetIpSec;
		}

		public String getInternetIpPri() {
			return this.internetIpPri;
		}

		public void setInternetIpPri(String internetIpPri) {
			this.internetIpPri = internetIpPri;
		}

		public String getInternetIpSec() {
			return this.internetIpSec;
		}

		public void setInternetIpSec(String internetIpSec) {
			this.internetIpSec = internetIpSec;
		}

		public String getLoopbackInternalIp() {
			return this.loopbackInternalIp;
		}

		public void setLoopbackInternalIp(String loopbackInternalIp) {
			this.loopbackInternalIp = loopbackInternalIp;
		}

		public String getLoopbackExternalIp() {
			return this.loopbackExternalIp;
		}

		public void setLoopbackExternalIp(String loopbackExternalIp) {
			this.loopbackExternalIp = loopbackExternalIp;
		}

		public String getManagementIp() {
			return this.managementIp;
		}

		public void setManagementIp(String managementIp) {
			this.managementIp = managementIp;
		}

		public String getBusinessState() {
			return this.businessState;
		}

		public void setBusinessState(String businessState) {
			this.businessState = businessState;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<String> getStaticIps() {
			return this.staticIps;
		}

		public void setStaticIps(List<String> staticIps) {
			this.staticIps = staticIps;
		}
	}

	@Override
	public InnerListAccessGatewayServersResponse getInstance(UnmarshallerContext context) {
		return	InnerListAccessGatewayServersResponseUnmarshaller.unmarshall(this, context);
	}
}

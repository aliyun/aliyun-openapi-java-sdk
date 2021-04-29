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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagECRouteBackupAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagECRouteBackupAttributeResponse extends AcsResponse {

	private String hcIp;

	private String status;

	private String requestId;

	private String expressConnectionInterface;

	private Boolean routeBackup;

	private String expressConnectionNexthop;

	private String sagId;

	private List<Cidr> cidrs;

	public String getHcIp() {
		return this.hcIp;
	}

	public void setHcIp(String hcIp) {
		this.hcIp = hcIp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExpressConnectionInterface() {
		return this.expressConnectionInterface;
	}

	public void setExpressConnectionInterface(String expressConnectionInterface) {
		this.expressConnectionInterface = expressConnectionInterface;
	}

	public Boolean getRouteBackup() {
		return this.routeBackup;
	}

	public void setRouteBackup(Boolean routeBackup) {
		this.routeBackup = routeBackup;
	}

	public String getExpressConnectionNexthop() {
		return this.expressConnectionNexthop;
	}

	public void setExpressConnectionNexthop(String expressConnectionNexthop) {
		this.expressConnectionNexthop = expressConnectionNexthop;
	}

	public String getSagId() {
		return this.sagId;
	}

	public void setSagId(String sagId) {
		this.sagId = sagId;
	}

	public List<Cidr> getCidrs() {
		return this.cidrs;
	}

	public void setCidrs(List<Cidr> cidrs) {
		this.cidrs = cidrs;
	}

	public static class Cidr {

		private Boolean enableBackup;

		private String cidr;

		public Boolean getEnableBackup() {
			return this.enableBackup;
		}

		public void setEnableBackup(Boolean enableBackup) {
			this.enableBackup = enableBackup;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}
	}

	@Override
	public DescribeSagECRouteBackupAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagECRouteBackupAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}

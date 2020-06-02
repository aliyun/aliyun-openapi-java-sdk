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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetInstanceVpcEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceVpcEndpointResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Boolean enable;

	private List<LinkedVpcsItem> linkedVpcs;

	private List<String> domains;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public List<LinkedVpcsItem> getLinkedVpcs() {
		return this.linkedVpcs;
	}

	public void setLinkedVpcs(List<LinkedVpcsItem> linkedVpcs) {
		this.linkedVpcs = linkedVpcs;
	}

	public List<String> getDomains() {
		return this.domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public static class LinkedVpcsItem {

		private String vpcId;

		private String vswitchId;

		private String ip;

		private Boolean defaultAccess;

		private String status;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Boolean getDefaultAccess() {
			return this.defaultAccess;
		}

		public void setDefaultAccess(Boolean defaultAccess) {
			this.defaultAccess = defaultAccess;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetInstanceVpcEndpointResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceVpcEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

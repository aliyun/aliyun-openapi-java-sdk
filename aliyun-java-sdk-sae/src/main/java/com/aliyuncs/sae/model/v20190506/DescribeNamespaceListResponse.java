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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeNamespaceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNamespaceListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String errorCode;

	private String traceId;

	private List<RegionList> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public List<RegionList> getData() {
		return this.data;
	}

	public void setData(List<RegionList> data) {
		this.data = data;
	}

	public static class RegionList {

		private String namespaceName;

		private String namespaceId;

		private String agentInstall;

		private Boolean current;

		private Boolean custom;

		private String regionId;

		private Boolean hybridCloudEnable;

		private String vpcId;

		private String vSwitchId;

		private String securityGroupId;

		public String getNamespaceName() {
			return this.namespaceName;
		}

		public void setNamespaceName(String namespaceName) {
			this.namespaceName = namespaceName;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getAgentInstall() {
			return this.agentInstall;
		}

		public void setAgentInstall(String agentInstall) {
			this.agentInstall = agentInstall;
		}

		public Boolean getCurrent() {
			return this.current;
		}

		public void setCurrent(Boolean current) {
			this.current = current;
		}

		public Boolean getCustom() {
			return this.custom;
		}

		public void setCustom(Boolean custom) {
			this.custom = custom;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getHybridCloudEnable() {
			return this.hybridCloudEnable;
		}

		public void setHybridCloudEnable(Boolean hybridCloudEnable) {
			this.hybridCloudEnable = hybridCloudEnable;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}
	}

	@Override
	public DescribeNamespaceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeNamespaceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

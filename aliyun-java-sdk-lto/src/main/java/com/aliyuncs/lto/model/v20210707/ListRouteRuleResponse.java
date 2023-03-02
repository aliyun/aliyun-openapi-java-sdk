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

package com.aliyuncs.lto.model.v20210707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.ListRouteRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRouteRuleResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer num;

		private Integer total;

		private Integer size;

		private List<RouteRuleInfo> pageData;

		public Integer getNum() {
			return this.num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public List<RouteRuleInfo> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<RouteRuleInfo> pageData) {
			this.pageData = pageData;
		}

		public static class RouteRuleInfo {

			private String contractName;

			private String deviceGroupId;

			private String remark;

			private String deviceGroupName;

			private String privacyRuleId;

			private Long bizChainId;

			private String privacyRuleName;

			private String invokeType;

			private String routeRuleId;

			private String bizChainName;

			private String contractTemplateId;

			private String blockChainType;

			private String chainUpMode;

			public String getContractName() {
				return this.contractName;
			}

			public void setContractName(String contractName) {
				this.contractName = contractName;
			}

			public String getDeviceGroupId() {
				return this.deviceGroupId;
			}

			public void setDeviceGroupId(String deviceGroupId) {
				this.deviceGroupId = deviceGroupId;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getDeviceGroupName() {
				return this.deviceGroupName;
			}

			public void setDeviceGroupName(String deviceGroupName) {
				this.deviceGroupName = deviceGroupName;
			}

			public String getPrivacyRuleId() {
				return this.privacyRuleId;
			}

			public void setPrivacyRuleId(String privacyRuleId) {
				this.privacyRuleId = privacyRuleId;
			}

			public Long getBizChainId() {
				return this.bizChainId;
			}

			public void setBizChainId(Long bizChainId) {
				this.bizChainId = bizChainId;
			}

			public String getPrivacyRuleName() {
				return this.privacyRuleName;
			}

			public void setPrivacyRuleName(String privacyRuleName) {
				this.privacyRuleName = privacyRuleName;
			}

			public String getInvokeType() {
				return this.invokeType;
			}

			public void setInvokeType(String invokeType) {
				this.invokeType = invokeType;
			}

			public String getRouteRuleId() {
				return this.routeRuleId;
			}

			public void setRouteRuleId(String routeRuleId) {
				this.routeRuleId = routeRuleId;
			}

			public String getBizChainName() {
				return this.bizChainName;
			}

			public void setBizChainName(String bizChainName) {
				this.bizChainName = bizChainName;
			}

			public String getContractTemplateId() {
				return this.contractTemplateId;
			}

			public void setContractTemplateId(String contractTemplateId) {
				this.contractTemplateId = contractTemplateId;
			}

			public String getBlockChainType() {
				return this.blockChainType;
			}

			public void setBlockChainType(String blockChainType) {
				this.blockChainType = blockChainType;
			}

			public String getChainUpMode() {
				return this.chainUpMode;
			}

			public void setChainUpMode(String chainUpMode) {
				this.chainUpMode = chainUpMode;
			}
		}
	}

	@Override
	public ListRouteRuleResponse getInstance(UnmarshallerContext context) {
		return	ListRouteRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

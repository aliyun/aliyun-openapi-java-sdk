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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetGatewayAuthConsumerDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGatewayAuthConsumerDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String errorCode;

	private Integer httpStatusCode;

	private String message;

	private String dynamicCode;

	private String dynamicMessage;

	private Data data;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private Boolean consumerStatus;

		private String primaryUser;

		private String gatewayUniqueId;

		private String type;

		private String gmtCreate;

		private String gmtModified;

		private String description;

		private String encodeType;

		private String jwks;

		private String tokenName;

		private Boolean tokenPass;

		private String tokenPosition;

		private String tokenPrefix;

		private String keyName;

		private String keyValue;

		private List<Resource> resourceList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getConsumerStatus() {
			return this.consumerStatus;
		}

		public void setConsumerStatus(Boolean consumerStatus) {
			this.consumerStatus = consumerStatus;
		}

		public String getPrimaryUser() {
			return this.primaryUser;
		}

		public void setPrimaryUser(String primaryUser) {
			this.primaryUser = primaryUser;
		}

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEncodeType() {
			return this.encodeType;
		}

		public void setEncodeType(String encodeType) {
			this.encodeType = encodeType;
		}

		public String getJwks() {
			return this.jwks;
		}

		public void setJwks(String jwks) {
			this.jwks = jwks;
		}

		public String getTokenName() {
			return this.tokenName;
		}

		public void setTokenName(String tokenName) {
			this.tokenName = tokenName;
		}

		public Boolean getTokenPass() {
			return this.tokenPass;
		}

		public void setTokenPass(Boolean tokenPass) {
			this.tokenPass = tokenPass;
		}

		public String getTokenPosition() {
			return this.tokenPosition;
		}

		public void setTokenPosition(String tokenPosition) {
			this.tokenPosition = tokenPosition;
		}

		public String getTokenPrefix() {
			return this.tokenPrefix;
		}

		public void setTokenPrefix(String tokenPrefix) {
			this.tokenPrefix = tokenPrefix;
		}

		public String getKeyName() {
			return this.keyName;
		}

		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

		public String getKeyValue() {
			return this.keyValue;
		}

		public void setKeyValue(String keyValue) {
			this.keyValue = keyValue;
		}

		public List<Resource> getResourceList() {
			return this.resourceList;
		}

		public void setResourceList(List<Resource> resourceList) {
			this.resourceList = resourceList;
		}

		public static class Resource {

			private Long id;

			private Long consumerId;

			private Long routeId;

			private String routeName;

			private Boolean resourceStatus;

			private String gatewayUniqueId;

			private String gmtCreate;

			private String gmtModified;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getConsumerId() {
				return this.consumerId;
			}

			public void setConsumerId(Long consumerId) {
				this.consumerId = consumerId;
			}

			public Long getRouteId() {
				return this.routeId;
			}

			public void setRouteId(Long routeId) {
				this.routeId = routeId;
			}

			public String getRouteName() {
				return this.routeName;
			}

			public void setRouteName(String routeName) {
				this.routeName = routeName;
			}

			public Boolean getResourceStatus() {
				return this.resourceStatus;
			}

			public void setResourceStatus(Boolean resourceStatus) {
				this.resourceStatus = resourceStatus;
			}

			public String getGatewayUniqueId() {
				return this.gatewayUniqueId;
			}

			public void setGatewayUniqueId(String gatewayUniqueId) {
				this.gatewayUniqueId = gatewayUniqueId;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public GetGatewayAuthConsumerDetailResponse getInstance(UnmarshallerContext context) {
		return	GetGatewayAuthConsumerDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

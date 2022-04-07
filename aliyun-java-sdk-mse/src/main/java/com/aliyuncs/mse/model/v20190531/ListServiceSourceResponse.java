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
import com.aliyuncs.mse.transform.v20190531.ListServiceSourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceSourceResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private List<Sources> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Sources> getData() {
		return this.data;
	}

	public void setData(List<Sources> data) {
		this.data = data;
	}

	public static class Sources {

		private Long id;

		private String name;

		private String address;

		private String type;

		private String source;

		private Integer bindingWithGateway;

		private Long gatewayId;

		private String gmtCreate;

		private String gmtModified;

		private String sourceUniqueId;

		private IngressOptions ingressOptions;

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

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Integer getBindingWithGateway() {
			return this.bindingWithGateway;
		}

		public void setBindingWithGateway(Integer bindingWithGateway) {
			this.bindingWithGateway = bindingWithGateway;
		}

		public Long getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(Long gatewayId) {
			this.gatewayId = gatewayId;
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

		public String getSourceUniqueId() {
			return this.sourceUniqueId;
		}

		public void setSourceUniqueId(String sourceUniqueId) {
			this.sourceUniqueId = sourceUniqueId;
		}

		public IngressOptions getIngressOptions() {
			return this.ingressOptions;
		}

		public void setIngressOptions(IngressOptions ingressOptions) {
			this.ingressOptions = ingressOptions;
		}

		public static class IngressOptions {

			private Boolean enableIngress;

			private String ingressClass;

			private String watchNamespace;

			public Boolean getEnableIngress() {
				return this.enableIngress;
			}

			public void setEnableIngress(Boolean enableIngress) {
				this.enableIngress = enableIngress;
			}

			public String getIngressClass() {
				return this.ingressClass;
			}

			public void setIngressClass(String ingressClass) {
				this.ingressClass = ingressClass;
			}

			public String getWatchNamespace() {
				return this.watchNamespace;
			}

			public void setWatchNamespace(String watchNamespace) {
				this.watchNamespace = watchNamespace;
			}
		}
	}

	@Override
	public ListServiceSourceResponse getInstance(UnmarshallerContext context) {
		return	ListServiceSourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

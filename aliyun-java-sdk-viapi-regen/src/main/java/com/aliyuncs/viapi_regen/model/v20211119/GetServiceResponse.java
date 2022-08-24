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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.viapi_regen.transform.v20211119.GetServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long gmtCreate;

		private String serviceName;

		private String serviceDescription;

		private String status;

		private String serviceId;

		private String inputParams;

		private String outputParams;

		private String errorcodes;

		private String inputExample;

		private String outputExample;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDescription() {
			return this.serviceDescription;
		}

		public void setServiceDescription(String serviceDescription) {
			this.serviceDescription = serviceDescription;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(String inputParams) {
			this.inputParams = inputParams;
		}

		public String getOutputParams() {
			return this.outputParams;
		}

		public void setOutputParams(String outputParams) {
			this.outputParams = outputParams;
		}

		public String getErrorcodes() {
			return this.errorcodes;
		}

		public void setErrorcodes(String errorcodes) {
			this.errorcodes = errorcodes;
		}

		public String getInputExample() {
			return this.inputExample;
		}

		public void setInputExample(String inputExample) {
			this.inputExample = inputExample;
		}

		public String getOutputExample() {
			return this.outputExample;
		}

		public void setOutputExample(String outputExample) {
			this.outputExample = outputExample;
		}
	}

	@Override
	public GetServiceResponse getInstance(UnmarshallerContext context) {
		return	GetServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListMethodsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMethodsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<ServiceMethod> serviceMethodList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<ServiceMethod> getServiceMethodList() {
		return this.serviceMethodList;
	}

	public void setServiceMethodList(List<ServiceMethod> serviceMethodList) {
		this.serviceMethodList = serviceMethodList;
	}

	public static class ServiceMethod {

		private String appName;

		private String serviceName;

		private String methodName;

		private String output;

		private List<String> inputParams;

		private List<String> paramTypes;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public List<String> getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(List<String> inputParams) {
			this.inputParams = inputParams;
		}

		public List<String> getParamTypes() {
			return this.paramTypes;
		}

		public void setParamTypes(List<String> paramTypes) {
			this.paramTypes = paramTypes;
		}
	}

	@Override
	public ListMethodsResponse getInstance(UnmarshallerContext context) {
		return	ListMethodsResponseUnmarshaller.unmarshall(this, context);
	}
}

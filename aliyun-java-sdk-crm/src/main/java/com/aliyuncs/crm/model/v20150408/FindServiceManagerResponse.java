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

package com.aliyuncs.crm.model.v20150408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.crm.transform.v20150408.FindServiceManagerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindServiceManagerResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private ServiceManager serviceManager;

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

	public ServiceManager getServiceManager() {
		return this.serviceManager;
	}

	public void setServiceManager(ServiceManager serviceManager) {
		this.serviceManager = serviceManager;
	}

	public static class ServiceManager {

		private String serviceManager;

		private String serviceManagerEmpId;

		private String businessManager;

		private String businessManagerEmpId;

		public String getServiceManager() {
			return this.serviceManager;
		}

		public void setServiceManager(String serviceManager) {
			this.serviceManager = serviceManager;
		}

		public String getServiceManagerEmpId() {
			return this.serviceManagerEmpId;
		}

		public void setServiceManagerEmpId(String serviceManagerEmpId) {
			this.serviceManagerEmpId = serviceManagerEmpId;
		}

		public String getBusinessManager() {
			return this.businessManager;
		}

		public void setBusinessManager(String businessManager) {
			this.businessManager = businessManager;
		}

		public String getBusinessManagerEmpId() {
			return this.businessManagerEmpId;
		}

		public void setBusinessManagerEmpId(String businessManagerEmpId) {
			this.businessManagerEmpId = businessManagerEmpId;
		}
	}

	@Override
	public FindServiceManagerResponse getInstance(UnmarshallerContext context) {
		return	FindServiceManagerResponseUnmarshaller.unmarshall(this, context);
	}
}

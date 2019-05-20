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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListRegionsOfFunctionServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRegionsOfFunctionServiceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<ServiceRegion> serviceRegions;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<ServiceRegion> getServiceRegions() {
		return this.serviceRegions;
	}

	public void setServiceRegions(List<ServiceRegion> serviceRegions) {
		this.serviceRegions = serviceRegions;
	}

	public static class ServiceRegion {

		private String service;

		private String region;

		private String regionCode;

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegionCode() {
			return this.regionCode;
		}

		public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}
	}

	@Override
	public ListRegionsOfFunctionServiceResponse getInstance(UnmarshallerContext context) {
		return	ListRegionsOfFunctionServiceResponseUnmarshaller.unmarshall(this, context);
	}
}

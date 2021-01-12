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
import com.aliyuncs.edas.transform.v20170801.GetServiceListPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceListPageResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

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

		private Integer size;

		private Integer totalElements;

		private Integer totalPages;

		private List<MseServiceResponse> content;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public Integer getTotalElements() {
			return this.totalElements;
		}

		public void setTotalElements(Integer totalElements) {
			this.totalElements = totalElements;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public List<MseServiceResponse> getContent() {
			return this.content;
		}

		public void setContent(List<MseServiceResponse> content) {
			this.content = content;
		}

		public static class MseServiceResponse {

			private String serviceId;

			private String serviceName;

			private String version;

			private String group;

			private String edasAppId;

			private String edasAppName;

			private Integer instanceNum;

			private String registerType;

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getGroup() {
				return this.group;
			}

			public void setGroup(String group) {
				this.group = group;
			}

			public String getEdasAppId() {
				return this.edasAppId;
			}

			public void setEdasAppId(String edasAppId) {
				this.edasAppId = edasAppId;
			}

			public String getEdasAppName() {
				return this.edasAppName;
			}

			public void setEdasAppName(String edasAppName) {
				this.edasAppName = edasAppName;
			}

			public Integer getInstanceNum() {
				return this.instanceNum;
			}

			public void setInstanceNum(Integer instanceNum) {
				this.instanceNum = instanceNum;
			}

			public String getRegisterType() {
				return this.registerType;
			}

			public void setRegisterType(String registerType) {
				this.registerType = registerType;
			}
		}
	}

	@Override
	public GetServiceListPageResponse getInstance(UnmarshallerContext context) {
		return	GetServiceListPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

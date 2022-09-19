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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListAvailableHoneypotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableHoneypotResponse extends AcsResponse {

	private Integer count;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private List<DataItem> data;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String honeypotImageName;

		private String honeypotImageDisplayName;

		private String honeypotImageId;

		private String honeypotImageVersion;

		private String honeypotImageType;

		private String proto;

		private String servicePort;

		private String multiports;

		private String template;

		public String getHoneypotImageName() {
			return this.honeypotImageName;
		}

		public void setHoneypotImageName(String honeypotImageName) {
			this.honeypotImageName = honeypotImageName;
		}

		public String getHoneypotImageDisplayName() {
			return this.honeypotImageDisplayName;
		}

		public void setHoneypotImageDisplayName(String honeypotImageDisplayName) {
			this.honeypotImageDisplayName = honeypotImageDisplayName;
		}

		public String getHoneypotImageId() {
			return this.honeypotImageId;
		}

		public void setHoneypotImageId(String honeypotImageId) {
			this.honeypotImageId = honeypotImageId;
		}

		public String getHoneypotImageVersion() {
			return this.honeypotImageVersion;
		}

		public void setHoneypotImageVersion(String honeypotImageVersion) {
			this.honeypotImageVersion = honeypotImageVersion;
		}

		public String getHoneypotImageType() {
			return this.honeypotImageType;
		}

		public void setHoneypotImageType(String honeypotImageType) {
			this.honeypotImageType = honeypotImageType;
		}

		public String getProto() {
			return this.proto;
		}

		public void setProto(String proto) {
			this.proto = proto;
		}

		public String getServicePort() {
			return this.servicePort;
		}

		public void setServicePort(String servicePort) {
			this.servicePort = servicePort;
		}

		public String getMultiports() {
			return this.multiports;
		}

		public void setMultiports(String multiports) {
			this.multiports = multiports;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}
	}

	@Override
	public ListAvailableHoneypotResponse getInstance(UnmarshallerContext context) {
		return	ListAvailableHoneypotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

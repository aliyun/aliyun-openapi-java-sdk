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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.GetLeniPrivateIpAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLeniPrivateIpAddressResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

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

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private String elasticNetworkInterfaceId;

		private String regionId;

		private String gmtCreate;

		private String gmtModified;

		private String ipName;

		private String privateIpAddress;

		private String status;

		private String description;

		private String message;

		public String getElasticNetworkInterfaceId() {
			return this.elasticNetworkInterfaceId;
		}

		public void setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
			this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
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

		public String getIpName() {
			return this.ipName;
		}

		public void setIpName(String ipName) {
			this.ipName = ipName;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public GetLeniPrivateIpAddressResponse getInstance(UnmarshallerContext context) {
		return	GetLeniPrivateIpAddressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.eflo.transform.v20220530.GetVpdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpdResponse extends AcsResponse {

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

		private String regionId;

		private String vpdId;

		private String name;

		private String cidr;

		private String serviceCidr;

		private String status;

		private String description;

		private String message;

		private Integer route;

		private Long ncCount;

		private Long subnetCount;

		private Long lbCount;

		private Long vccCount;

		private String gmtCreate;

		private String gmtModified;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpdId() {
			return this.vpdId;
		}

		public void setVpdId(String vpdId) {
			this.vpdId = vpdId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public String getServiceCidr() {
			return this.serviceCidr;
		}

		public void setServiceCidr(String serviceCidr) {
			this.serviceCidr = serviceCidr;
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

		public Integer getRoute() {
			return this.route;
		}

		public void setRoute(Integer route) {
			this.route = route;
		}

		public Long getNcCount() {
			return this.ncCount;
		}

		public void setNcCount(Long ncCount) {
			this.ncCount = ncCount;
		}

		public Long getSubnetCount() {
			return this.subnetCount;
		}

		public void setSubnetCount(Long subnetCount) {
			this.subnetCount = subnetCount;
		}

		public Long getLbCount() {
			return this.lbCount;
		}

		public void setLbCount(Long lbCount) {
			this.lbCount = lbCount;
		}

		public Long getVccCount() {
			return this.vccCount;
		}

		public void setVccCount(Long vccCount) {
			this.vccCount = vccCount;
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

	@Override
	public GetVpdResponse getInstance(UnmarshallerContext context) {
		return	GetVpdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

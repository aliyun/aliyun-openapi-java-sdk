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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801.ListEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEndpointsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<EndpointsItem> endpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<EndpointsItem> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<EndpointsItem> endpoints) {
		this.endpoints = endpoints;
	}

	public static class EndpointsItem {

		private String userId;

		private String ownerId;

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String uuid;

		private String name;

		private String type;

		private String vpcId;

		private String vswitchId;

		private Status status;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public static class Status {

			private String phase;

			private String code;

			private String message;

			private Detail detail;

			public String getPhase() {
				return this.phase;
			}

			public void setPhase(String phase) {
				this.phase = phase;
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

			public Detail getDetail() {
				return this.detail;
			}

			public void setDetail(Detail detail) {
				this.detail = detail;
			}

			public static class Detail {

				private Map<Object,Object> ipPortMapping;

				public Map<Object,Object> getIpPortMapping() {
					return this.ipPortMapping;
				}

				public void setIpPortMapping(Map<Object,Object> ipPortMapping) {
					this.ipPortMapping = ipPortMapping;
				}
			}
		}
	}

	@Override
	public ListEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

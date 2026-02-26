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
import com.aliyuncs.mse.transform.v20190531.ListGatewayRouteOnAuthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayRouteOnAuthResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Integer id;

		private String name;

		private String gatewayUniqueId;

		private String gatewayId;

		private Long domainId;

		private String domainName;

		private List<Long> domainIdList;

		private List<String> domainNameList;

		private RoutePredicates routePredicates;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public Long getDomainId() {
			return this.domainId;
		}

		public void setDomainId(Long domainId) {
			this.domainId = domainId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public List<Long> getDomainIdList() {
			return this.domainIdList;
		}

		public void setDomainIdList(List<Long> domainIdList) {
			this.domainIdList = domainIdList;
		}

		public List<String> getDomainNameList() {
			return this.domainNameList;
		}

		public void setDomainNameList(List<String> domainNameList) {
			this.domainNameList = domainNameList;
		}

		public RoutePredicates getRoutePredicates() {
			return this.routePredicates;
		}

		public void setRoutePredicates(RoutePredicates routePredicates) {
			this.routePredicates = routePredicates;
		}

		public static class RoutePredicates {

			private PathPredicates pathPredicates;

			public PathPredicates getPathPredicates() {
				return this.pathPredicates;
			}

			public void setPathPredicates(PathPredicates pathPredicates) {
				this.pathPredicates = pathPredicates;
			}

			public static class PathPredicates {

				private String path;

				private String type;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public ListGatewayRouteOnAuthResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayRouteOnAuthResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

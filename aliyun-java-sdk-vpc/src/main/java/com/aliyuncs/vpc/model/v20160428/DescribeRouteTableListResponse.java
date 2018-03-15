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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeRouteTableListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteTableListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<RouterTableListType> routerTableList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<RouterTableListType> getRouterTableList() {
		return this.routerTableList;
	}

	public void setRouterTableList(List<RouterTableListType> routerTableList) {
		this.routerTableList = routerTableList;
	}

	public static class RouterTableListType {

		private String vpcId;

		private String routerType;

		private String routerId;

		private String routeTableId;

		private String routeTableName;

		private String routeTableType;

		private String description;

		private String creationTime;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getRouterType() {
			return this.routerType;
		}

		public void setRouterType(String routerType) {
			this.routerType = routerType;
		}

		public String getRouterId() {
			return this.routerId;
		}

		public void setRouterId(String routerId) {
			this.routerId = routerId;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getRouteTableName() {
			return this.routeTableName;
		}

		public void setRouteTableName(String routeTableName) {
			this.routeTableName = routeTableName;
		}

		public String getRouteTableType() {
			return this.routeTableType;
		}

		public void setRouteTableType(String routeTableType) {
			this.routeTableType = routeTableType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DescribeRouteTableListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouteTableListResponseUnmarshaller.unmarshall(this, context);
	}
}

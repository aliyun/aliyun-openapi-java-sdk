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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeNetworkInterfacePermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInterfacePermissionsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<NetworkInterfacePermission> networkInterfacePermissions;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<NetworkInterfacePermission> getNetworkInterfacePermissions() {
		return this.networkInterfacePermissions;
	}

	public void setNetworkInterfacePermissions(List<NetworkInterfacePermission> networkInterfacePermissions) {
		this.networkInterfacePermissions = networkInterfacePermissions;
	}

	public static class NetworkInterfacePermission {

		private Long accountId;

		private String serviceName;

		private String networkInterfaceId;

		private String networkInterfacePermissionId;

		private String permission;

		private String permissionState;

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getNetworkInterfacePermissionId() {
			return this.networkInterfacePermissionId;
		}

		public void setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
			this.networkInterfacePermissionId = networkInterfacePermissionId;
		}

		public String getPermission() {
			return this.permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		public String getPermissionState() {
			return this.permissionState;
		}

		public void setPermissionState(String permissionState) {
			this.permissionState = permissionState;
		}
	}

	@Override
	public DescribeNetworkInterfacePermissionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInterfacePermissionsResponseUnmarshaller.unmarshall(this, context);
	}
}

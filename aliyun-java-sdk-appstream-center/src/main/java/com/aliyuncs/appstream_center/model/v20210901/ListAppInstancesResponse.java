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

package com.aliyuncs.appstream_center.model.v20210901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.ListAppInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Data> appInstanceModels;

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

	public List<Data> getAppInstanceModels() {
		return this.appInstanceModels;
	}

	public void setAppInstanceModels(List<Data> appInstanceModels) {
		this.appInstanceModels = appInstanceModels;
	}

	public static class Data {

		private String appInstanceId;

		private String appInstanceGroupId;

		private String status;

		private String mainEthPublicIp;

		private String gmtCreate;

		private String gmtModified;

		private String sessionStatus;

		public String getAppInstanceId() {
			return this.appInstanceId;
		}

		public void setAppInstanceId(String appInstanceId) {
			this.appInstanceId = appInstanceId;
		}

		public String getAppInstanceGroupId() {
			return this.appInstanceGroupId;
		}

		public void setAppInstanceGroupId(String appInstanceGroupId) {
			this.appInstanceGroupId = appInstanceGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMainEthPublicIp() {
			return this.mainEthPublicIp;
		}

		public void setMainEthPublicIp(String mainEthPublicIp) {
			this.mainEthPublicIp = mainEthPublicIp;
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

		public String getSessionStatus() {
			return this.sessionStatus;
		}

		public void setSessionStatus(String sessionStatus) {
			this.sessionStatus = sessionStatus;
		}
	}

	@Override
	public ListAppInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListAppInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

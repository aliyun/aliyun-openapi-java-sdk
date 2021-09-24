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
import com.aliyuncs.mse.transform.v20190531.ListClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClustersResponse extends AcsResponse {

	private String httpCode;

	private Integer totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private String errorCode;

	private Boolean success;

	private List<ClusterForListModel> data;

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ClusterForListModel> getData() {
		return this.data;
	}

	public void setData(List<ClusterForListModel> data) {
		this.data = data;
	}

	public static class ClusterForListModel {

		private String endDate;

		private String intranetDomain;

		private String internetDomain;

		private String createTime;

		private String chargeType;

		private String intranetAddress;

		private String instanceId;

		private String internetAddress;

		private String clusterAliasName;

		private String clusterType;

		private String initStatus;

		private String appVersion;

		private String clusterId;

		private Boolean canUpdate;

		private String versionCode;

		private Long instanceCount;

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getIntranetDomain() {
			return this.intranetDomain;
		}

		public void setIntranetDomain(String intranetDomain) {
			this.intranetDomain = intranetDomain;
		}

		public String getInternetDomain() {
			return this.internetDomain;
		}

		public void setInternetDomain(String internetDomain) {
			this.internetDomain = internetDomain;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getIntranetAddress() {
			return this.intranetAddress;
		}

		public void setIntranetAddress(String intranetAddress) {
			this.intranetAddress = intranetAddress;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInternetAddress() {
			return this.internetAddress;
		}

		public void setInternetAddress(String internetAddress) {
			this.internetAddress = internetAddress;
		}

		public String getClusterAliasName() {
			return this.clusterAliasName;
		}

		public void setClusterAliasName(String clusterAliasName) {
			this.clusterAliasName = clusterAliasName;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getInitStatus() {
			return this.initStatus;
		}

		public void setInitStatus(String initStatus) {
			this.initStatus = initStatus;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Boolean getCanUpdate() {
			return this.canUpdate;
		}

		public void setCanUpdate(Boolean canUpdate) {
			this.canUpdate = canUpdate;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public Long getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Long instanceCount) {
			this.instanceCount = instanceCount;
		}
	}

	@Override
	public ListClustersResponse getInstance(UnmarshallerContext context) {
		return	ListClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.mse.transform.v20190531.ListUserInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private List<Clusters> data;

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

	public List<Clusters> getData() {
		return this.data;
	}

	public void setData(List<Clusters> data) {
		this.data = data;
	}

	public static class Clusters {

		private String appClusterId;

		private String appVersion;

		private String dbPassword;

		private String dbUrl;

		private String dbUserName;

		private String endDate;

		private Long environmentId;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String imageVersion;

		private String instanceId;

		private Boolean isCreatedRedis;

		private Long k8sResourceId;

		private String name;

		private String nameServer;

		private String orderId;

		private String podCidr;

		private String primaryUser;

		private String region;

		private Long replica;

		private String seataServerUniqueId;

		private String securityGroup;

		private String spec;

		private String startDate;

		private Long status;

		private String statusDesc;

		private String storeMode;

		private String vpc;

		private String zoneId;

		private String vswitch;

		public String getAppClusterId() {
			return this.appClusterId;
		}

		public void setAppClusterId(String appClusterId) {
			this.appClusterId = appClusterId;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getDbPassword() {
			return this.dbPassword;
		}

		public void setDbPassword(String dbPassword) {
			this.dbPassword = dbPassword;
		}

		public String getDbUrl() {
			return this.dbUrl;
		}

		public void setDbUrl(String dbUrl) {
			this.dbUrl = dbUrl;
		}

		public String getDbUserName() {
			return this.dbUserName;
		}

		public void setDbUserName(String dbUserName) {
			this.dbUserName = dbUserName;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public Long getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(Long environmentId) {
			this.environmentId = environmentId;
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getIsCreatedRedis() {
			return this.isCreatedRedis;
		}

		public void setIsCreatedRedis(Boolean isCreatedRedis) {
			this.isCreatedRedis = isCreatedRedis;
		}

		public Long getK8sResourceId() {
			return this.k8sResourceId;
		}

		public void setK8sResourceId(Long k8sResourceId) {
			this.k8sResourceId = k8sResourceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameServer() {
			return this.nameServer;
		}

		public void setNameServer(String nameServer) {
			this.nameServer = nameServer;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getPodCidr() {
			return this.podCidr;
		}

		public void setPodCidr(String podCidr) {
			this.podCidr = podCidr;
		}

		public String getPrimaryUser() {
			return this.primaryUser;
		}

		public void setPrimaryUser(String primaryUser) {
			this.primaryUser = primaryUser;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getReplica() {
			return this.replica;
		}

		public void setReplica(Long replica) {
			this.replica = replica;
		}

		public String getSeataServerUniqueId() {
			return this.seataServerUniqueId;
		}

		public void setSeataServerUniqueId(String seataServerUniqueId) {
			this.seataServerUniqueId = seataServerUniqueId;
		}

		public String getSecurityGroup() {
			return this.securityGroup;
		}

		public void setSecurityGroup(String securityGroup) {
			this.securityGroup = securityGroup;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getStoreMode() {
			return this.storeMode;
		}

		public void setStoreMode(String storeMode) {
			this.storeMode = storeMode;
		}

		public String getVpc() {
			return this.vpc;
		}

		public void setVpc(String vpc) {
			this.vpc = vpc;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVswitch() {
			return this.vswitch;
		}

		public void setVswitch(String vswitch) {
			this.vswitch = vswitch;
		}
	}

	@Override
	public ListUserInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListUserInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCloudOpsMaintenancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCloudOpsMaintenancesResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private String bizMessage;

	private Integer count;

	private Integer page;

	private Integer pageSize;

	private Integer totalCount;

	private List<MaintenanceInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<MaintenanceInfo> getData() {
		return this.data;
	}

	public void setData(List<MaintenanceInfo> data) {
		this.data = data;
	}

	public static class MaintenanceInfo {

		private String domainType;

		private String ncIp;

		private String ncId;

		private String hostname;

		private String opsUser;

		private String opsType;

		private String maintenanceReason;

		private String maintenanceTime;

		private String maintenanceStatus;

		private String updateTime;

		private String notifyTime;

		private String notifyStatus;

		private String comment;

		private String bizStatus;

		private String vmNum;

		private String extraData;

		private String sn;

		public String getDomainType() {
			return this.domainType;
		}

		public void setDomainType(String domainType) {
			this.domainType = domainType;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getOpsUser() {
			return this.opsUser;
		}

		public void setOpsUser(String opsUser) {
			this.opsUser = opsUser;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getMaintenanceReason() {
			return this.maintenanceReason;
		}

		public void setMaintenanceReason(String maintenanceReason) {
			this.maintenanceReason = maintenanceReason;
		}

		public String getMaintenanceTime() {
			return this.maintenanceTime;
		}

		public void setMaintenanceTime(String maintenanceTime) {
			this.maintenanceTime = maintenanceTime;
		}

		public String getMaintenanceStatus() {
			return this.maintenanceStatus;
		}

		public void setMaintenanceStatus(String maintenanceStatus) {
			this.maintenanceStatus = maintenanceStatus;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getNotifyTime() {
			return this.notifyTime;
		}

		public void setNotifyTime(String notifyTime) {
			this.notifyTime = notifyTime;
		}

		public String getNotifyStatus() {
			return this.notifyStatus;
		}

		public void setNotifyStatus(String notifyStatus) {
			this.notifyStatus = notifyStatus;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(String bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getVmNum() {
			return this.vmNum;
		}

		public void setVmNum(String vmNum) {
			this.vmNum = vmNum;
		}

		public String getExtraData() {
			return this.extraData;
		}

		public void setExtraData(String extraData) {
			this.extraData = extraData;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}
	}

	@Override
	public OpsDescribeCloudOpsMaintenancesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsMaintenancesResponseUnmarshaller.unmarshall(this, context);
	}
}

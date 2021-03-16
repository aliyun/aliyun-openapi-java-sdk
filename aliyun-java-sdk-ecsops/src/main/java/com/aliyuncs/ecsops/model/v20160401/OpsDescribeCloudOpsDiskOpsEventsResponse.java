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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCloudOpsDiskOpsEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCloudOpsDiskOpsEventsResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private String bizMessage;

	private Integer count;

	private Integer page;

	private Integer pageSize;

	private Integer totalCount;

	private List<DiskOpsEventInfo> data;

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

	public List<DiskOpsEventInfo> getData() {
		return this.data;
	}

	public void setData(List<DiskOpsEventInfo> data) {
		this.data = data;
	}

	public static class DiskOpsEventInfo {

		private String deployMode;

		private String device;

		private String diskStatus;

		private String diskType;

		private String eventStatus;

		private String eventType;

		private String houyiDiskId;

		private Integer id;

		private String idcOrderId;

		private String ioType;

		private Integer isHotSwap;

		private Integer maintenanceId;

		private String storageDeviceId;

		private String tef;

		private String tes;

		private String tnb;

		private String tp;

		private String vmName;

		private String yaochiDiskId;

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getDiskStatus() {
			return this.diskStatus;
		}

		public void setDiskStatus(String diskStatus) {
			this.diskStatus = diskStatus;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getHouyiDiskId() {
			return this.houyiDiskId;
		}

		public void setHouyiDiskId(String houyiDiskId) {
			this.houyiDiskId = houyiDiskId;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getIdcOrderId() {
			return this.idcOrderId;
		}

		public void setIdcOrderId(String idcOrderId) {
			this.idcOrderId = idcOrderId;
		}

		public String getIoType() {
			return this.ioType;
		}

		public void setIoType(String ioType) {
			this.ioType = ioType;
		}

		public Integer getIsHotSwap() {
			return this.isHotSwap;
		}

		public void setIsHotSwap(Integer isHotSwap) {
			this.isHotSwap = isHotSwap;
		}

		public Integer getMaintenanceId() {
			return this.maintenanceId;
		}

		public void setMaintenanceId(Integer maintenanceId) {
			this.maintenanceId = maintenanceId;
		}

		public String getStorageDeviceId() {
			return this.storageDeviceId;
		}

		public void setStorageDeviceId(String storageDeviceId) {
			this.storageDeviceId = storageDeviceId;
		}

		public String getTef() {
			return this.tef;
		}

		public void setTef(String tef) {
			this.tef = tef;
		}

		public String getTes() {
			return this.tes;
		}

		public void setTes(String tes) {
			this.tes = tes;
		}

		public String getTnb() {
			return this.tnb;
		}

		public void setTnb(String tnb) {
			this.tnb = tnb;
		}

		public String getTp() {
			return this.tp;
		}

		public void setTp(String tp) {
			this.tp = tp;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getYaochiDiskId() {
			return this.yaochiDiskId;
		}

		public void setYaochiDiskId(String yaochiDiskId) {
			this.yaochiDiskId = yaochiDiskId;
		}
	}

	@Override
	public OpsDescribeCloudOpsDiskOpsEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsDiskOpsEventsResponseUnmarshaller.unmarshall(this, context);
	}
}

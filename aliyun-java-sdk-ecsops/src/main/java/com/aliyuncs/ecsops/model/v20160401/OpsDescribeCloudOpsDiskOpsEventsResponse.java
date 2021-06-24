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

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private String bizMessage;

	private Integer page;

	private Integer count;

	private String bizCode;

	private List<DiskOpsEventInfo> data;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<DiskOpsEventInfo> getData() {
		return this.data;
	}

	public void setData(List<DiskOpsEventInfo> data) {
		this.data = data;
	}

	public static class DiskOpsEventInfo {

		private String yaochiDiskId;

		private String houyiDiskId;

		private String deployMode;

		private Integer maintenanceId;

		private String tes;

		private String diskType;

		private String vmName;

		private String diskStatus;

		private String idcOrderId;

		private String tp;

		private String tnb;

		private String eventType;

		private String tef;

		private String storageDeviceId;

		private String device;

		private String eventStatus;

		private Integer isHotSwap;

		private String ioType;

		private Integer id;

		public String getYaochiDiskId() {
			return this.yaochiDiskId;
		}

		public void setYaochiDiskId(String yaochiDiskId) {
			this.yaochiDiskId = yaochiDiskId;
		}

		public String getHouyiDiskId() {
			return this.houyiDiskId;
		}

		public void setHouyiDiskId(String houyiDiskId) {
			this.houyiDiskId = houyiDiskId;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public Integer getMaintenanceId() {
			return this.maintenanceId;
		}

		public void setMaintenanceId(Integer maintenanceId) {
			this.maintenanceId = maintenanceId;
		}

		public String getTes() {
			return this.tes;
		}

		public void setTes(String tes) {
			this.tes = tes;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getDiskStatus() {
			return this.diskStatus;
		}

		public void setDiskStatus(String diskStatus) {
			this.diskStatus = diskStatus;
		}

		public String getIdcOrderId() {
			return this.idcOrderId;
		}

		public void setIdcOrderId(String idcOrderId) {
			this.idcOrderId = idcOrderId;
		}

		public String getTp() {
			return this.tp;
		}

		public void setTp(String tp) {
			this.tp = tp;
		}

		public String getTnb() {
			return this.tnb;
		}

		public void setTnb(String tnb) {
			this.tnb = tnb;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getTef() {
			return this.tef;
		}

		public void setTef(String tef) {
			this.tef = tef;
		}

		public String getStorageDeviceId() {
			return this.storageDeviceId;
		}

		public void setStorageDeviceId(String storageDeviceId) {
			this.storageDeviceId = storageDeviceId;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
		}

		public Integer getIsHotSwap() {
			return this.isHotSwap;
		}

		public void setIsHotSwap(Integer isHotSwap) {
			this.isHotSwap = isHotSwap;
		}

		public String getIoType() {
			return this.ioType;
		}

		public void setIoType(String ioType) {
			this.ioType = ioType;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	}

	@Override
	public OpsDescribeCloudOpsDiskOpsEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsDiskOpsEventsResponseUnmarshaller.unmarshall(this, context);
	}
}

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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeApplianceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplianceListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Appliance> applianceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public List<Appliance> getApplianceList() {
		return this.applianceList;
	}

	public void setApplianceList(List<Appliance> applianceList) {
		this.applianceList = applianceList;
	}

	public static class Appliance {

		private String applianceId;

		private String applianceType;

		private String uuid;

		private String applianceName;

		private String ipAddress;

		private String macAddress;

		private String version;

		private String hostname;

		private Long heartbeatedTime;

		private Long createdTime;

		private Long updatedTime;

		private String hardwareModel;

		private String applianceRegionId;

		public String getApplianceId() {
			return this.applianceId;
		}

		public void setApplianceId(String applianceId) {
			this.applianceId = applianceId;
		}

		public String getApplianceType() {
			return this.applianceType;
		}

		public void setApplianceType(String applianceType) {
			this.applianceType = applianceType;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getApplianceName() {
			return this.applianceName;
		}

		public void setApplianceName(String applianceName) {
			this.applianceName = applianceName;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Long getHeartbeatedTime() {
			return this.heartbeatedTime;
		}

		public void setHeartbeatedTime(Long heartbeatedTime) {
			this.heartbeatedTime = heartbeatedTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getHardwareModel() {
			return this.hardwareModel;
		}

		public void setHardwareModel(String hardwareModel) {
			this.hardwareModel = hardwareModel;
		}

		public String getApplianceRegionId() {
			return this.applianceRegionId;
		}

		public void setApplianceRegionId(String applianceRegionId) {
			this.applianceRegionId = applianceRegionId;
		}
	}

	@Override
	public DescribeApplianceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplianceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

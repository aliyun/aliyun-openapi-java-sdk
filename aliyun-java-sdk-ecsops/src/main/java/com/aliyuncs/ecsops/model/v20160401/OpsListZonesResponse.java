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
import com.aliyuncs.ecsops.transform.v20160401.OpsListZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListZonesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String total;

	private String code;

	private String success;

	private List<HouyiZoneInfo> houyiZoneInfos;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<HouyiZoneInfo> getHouyiZoneInfos() {
		return this.houyiZoneInfos;
	}

	public void setHouyiZoneInfos(List<HouyiZoneInfo> houyiZoneInfos) {
		this.houyiZoneInfos = houyiZoneInfos;
	}

	public static class HouyiZoneInfo {

		private Boolean visibility;

		private String houyiZoneNo;

		private String houyiAvailableZoneNo;

		private String houyiClusterNumericId;

		private String houyiClusterNo;

		private String houyiClusterName;

		private List<String> networkTechnologys;

		private List<String> virtTypes;

		private List<String> storageNetworkTypes;

		private List<String> instanceTypes;

		private List<String> networkTypes;

		private List<String> diskTypes;

		public Boolean getVisibility() {
			return this.visibility;
		}

		public void setVisibility(Boolean visibility) {
			this.visibility = visibility;
		}

		public String getHouyiZoneNo() {
			return this.houyiZoneNo;
		}

		public void setHouyiZoneNo(String houyiZoneNo) {
			this.houyiZoneNo = houyiZoneNo;
		}

		public String getHouyiAvailableZoneNo() {
			return this.houyiAvailableZoneNo;
		}

		public void setHouyiAvailableZoneNo(String houyiAvailableZoneNo) {
			this.houyiAvailableZoneNo = houyiAvailableZoneNo;
		}

		public String getHouyiClusterNumericId() {
			return this.houyiClusterNumericId;
		}

		public void setHouyiClusterNumericId(String houyiClusterNumericId) {
			this.houyiClusterNumericId = houyiClusterNumericId;
		}

		public String getHouyiClusterNo() {
			return this.houyiClusterNo;
		}

		public void setHouyiClusterNo(String houyiClusterNo) {
			this.houyiClusterNo = houyiClusterNo;
		}

		public String getHouyiClusterName() {
			return this.houyiClusterName;
		}

		public void setHouyiClusterName(String houyiClusterName) {
			this.houyiClusterName = houyiClusterName;
		}

		public List<String> getNetworkTechnologys() {
			return this.networkTechnologys;
		}

		public void setNetworkTechnologys(List<String> networkTechnologys) {
			this.networkTechnologys = networkTechnologys;
		}

		public List<String> getVirtTypes() {
			return this.virtTypes;
		}

		public void setVirtTypes(List<String> virtTypes) {
			this.virtTypes = virtTypes;
		}

		public List<String> getStorageNetworkTypes() {
			return this.storageNetworkTypes;
		}

		public void setStorageNetworkTypes(List<String> storageNetworkTypes) {
			this.storageNetworkTypes = storageNetworkTypes;
		}

		public List<String> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<String> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public List<String> getNetworkTypes() {
			return this.networkTypes;
		}

		public void setNetworkTypes(List<String> networkTypes) {
			this.networkTypes = networkTypes;
		}

		public List<String> getDiskTypes() {
			return this.diskTypes;
		}

		public void setDiskTypes(List<String> diskTypes) {
			this.diskTypes = diskTypes;
		}
	}

	@Override
	public OpsListZonesResponse getInstance(UnmarshallerContext context) {
		return	OpsListZonesResponseUnmarshaller.unmarshall(this, context);
	}
}

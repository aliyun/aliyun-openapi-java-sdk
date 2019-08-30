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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeHiStoreInstanceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHiStoreInstanceInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private HiStoreInstanceInfo hiStoreInstanceInfo;

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

	public HiStoreInstanceInfo getHiStoreInstanceInfo() {
		return this.hiStoreInstanceInfo;
	}

	public void setHiStoreInstanceInfo(HiStoreInstanceInfo hiStoreInstanceInfo) {
		this.hiStoreInstanceInfo = hiStoreInstanceInfo;
	}

	public static class HiStoreInstanceInfo {

		private String historeInstanceId;

		private Long gmtCreate;

		private String rpmVersion;

		private Integer diskSize;

		private String machineSpec;

		public String getHistoreInstanceId() {
			return this.historeInstanceId;
		}

		public void setHistoreInstanceId(String historeInstanceId) {
			this.historeInstanceId = historeInstanceId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getRpmVersion() {
			return this.rpmVersion;
		}

		public void setRpmVersion(String rpmVersion) {
			this.rpmVersion = rpmVersion;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public String getMachineSpec() {
			return this.machineSpec;
		}

		public void setMachineSpec(String machineSpec) {
			this.machineSpec = machineSpec;
		}
	}

	@Override
	public DescribeHiStoreInstanceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeHiStoreInstanceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}

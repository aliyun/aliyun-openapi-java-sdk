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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListSoftwareForUserDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSoftwareForUserDeviceResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private List<DataList> software;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public List<DataList> getSoftware() {
		return this.software;
	}

	public void setSoftware(List<DataList> software) {
		this.software = software;
	}

	public static class DataList {

		private String name;

		private String inc;

		private String installTime;

		private List<String> versions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInc() {
			return this.inc;
		}

		public void setInc(String inc) {
			this.inc = inc;
		}

		public String getInstallTime() {
			return this.installTime;
		}

		public void setInstallTime(String installTime) {
			this.installTime = installTime;
		}

		public List<String> getVersions() {
			return this.versions;
		}

		public void setVersions(List<String> versions) {
			this.versions = versions;
		}
	}

	@Override
	public ListSoftwareForUserDeviceResponse getInstance(UnmarshallerContext context) {
		return	ListSoftwareForUserDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

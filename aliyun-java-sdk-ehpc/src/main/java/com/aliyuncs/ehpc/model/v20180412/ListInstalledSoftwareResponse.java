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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListInstalledSoftwareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstalledSoftwareResponse extends AcsResponse {

	private String requestId;

	private List<SoftwareListItem> softwareList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SoftwareListItem> getSoftwareList() {
		return this.softwareList;
	}

	public void setSoftwareList(List<SoftwareListItem> softwareList) {
		this.softwareList = softwareList;
	}

	public static class SoftwareListItem {

		private String softwareId;

		private String softwareName;

		private String softwareVersion;

		private String softwareStatus;

		public String getSoftwareId() {
			return this.softwareId;
		}

		public void setSoftwareId(String softwareId) {
			this.softwareId = softwareId;
		}

		public String getSoftwareName() {
			return this.softwareName;
		}

		public void setSoftwareName(String softwareName) {
			this.softwareName = softwareName;
		}

		public String getSoftwareVersion() {
			return this.softwareVersion;
		}

		public void setSoftwareVersion(String softwareVersion) {
			this.softwareVersion = softwareVersion;
		}

		public String getSoftwareStatus() {
			return this.softwareStatus;
		}

		public void setSoftwareStatus(String softwareStatus) {
			this.softwareStatus = softwareStatus;
		}
	}

	@Override
	public ListInstalledSoftwareResponse getInstance(UnmarshallerContext context) {
		return	ListInstalledSoftwareResponseUnmarshaller.unmarshall(this, context);
	}
}

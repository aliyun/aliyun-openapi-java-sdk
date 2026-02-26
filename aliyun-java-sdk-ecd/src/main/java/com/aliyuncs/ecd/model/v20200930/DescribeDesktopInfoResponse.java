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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopInfoResponse extends AcsResponse {

	private String requestId;

	private List<Desktop> desktops;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Desktop> getDesktops() {
		return this.desktops;
	}

	public void setDesktops(List<Desktop> desktops) {
		this.desktops = desktops;
	}

	public static class Desktop {

		private String currentAppVersion;

		private String startTime;

		private String connectionStatus;

		private String desktopId;

		private String desktopStatus;

		private String newAppVersion;

		private String releaseNote;

		private Long newAppSize;

		private String desktopGroupId;

		private List<String> managementFlag;

		public String getCurrentAppVersion() {
			return this.currentAppVersion;
		}

		public void setCurrentAppVersion(String currentAppVersion) {
			this.currentAppVersion = currentAppVersion;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopStatus() {
			return this.desktopStatus;
		}

		public void setDesktopStatus(String desktopStatus) {
			this.desktopStatus = desktopStatus;
		}

		public String getNewAppVersion() {
			return this.newAppVersion;
		}

		public void setNewAppVersion(String newAppVersion) {
			this.newAppVersion = newAppVersion;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public Long getNewAppSize() {
			return this.newAppSize;
		}

		public void setNewAppSize(Long newAppSize) {
			this.newAppSize = newAppSize;
		}

		public String getDesktopGroupId() {
			return this.desktopGroupId;
		}

		public void setDesktopGroupId(String desktopGroupId) {
			this.desktopGroupId = desktopGroupId;
		}

		public List<String> getManagementFlag() {
			return this.managementFlag;
		}

		public void setManagementFlag(List<String> managementFlag) {
			this.managementFlag = managementFlag;
		}
	}

	@Override
	public DescribeDesktopInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

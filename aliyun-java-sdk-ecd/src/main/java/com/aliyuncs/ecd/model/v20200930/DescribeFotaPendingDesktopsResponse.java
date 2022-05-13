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
import com.aliyuncs.ecd.transform.v20200930.DescribeFotaPendingDesktopsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFotaPendingDesktopsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<FotaPendingDesktop> fotaPendingDesktops;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FotaPendingDesktop> getFotaPendingDesktops() {
		return this.fotaPendingDesktops;
	}

	public void setFotaPendingDesktops(List<FotaPendingDesktop> fotaPendingDesktops) {
		this.fotaPendingDesktops = fotaPendingDesktops;
	}

	public static class FotaPendingDesktop {

		private String desktopId;

		private String desktopName;

		private String officeSiteId;

		private String fotaProject;

		private String currentAppVersion;

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getFotaProject() {
			return this.fotaProject;
		}

		public void setFotaProject(String fotaProject) {
			this.fotaProject = fotaProject;
		}

		public String getCurrentAppVersion() {
			return this.currentAppVersion;
		}

		public void setCurrentAppVersion(String currentAppVersion) {
			this.currentAppVersion = currentAppVersion;
		}
	}

	@Override
	public DescribeFotaPendingDesktopsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFotaPendingDesktopsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

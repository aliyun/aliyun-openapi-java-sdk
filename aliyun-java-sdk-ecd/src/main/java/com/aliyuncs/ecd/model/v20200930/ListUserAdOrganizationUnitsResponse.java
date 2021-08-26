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
import com.aliyuncs.ecd.transform.v20200930.ListUserAdOrganizationUnitsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserAdOrganizationUnitsResponse extends AcsResponse {

	private String requestId;

	private List<OuName> oUNames;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OuName> getOUNames() {
		return this.oUNames;
	}

	public void setOUNames(List<OuName> oUNames) {
		this.oUNames = oUNames;
	}

	public static class OuName {

		private String officeSiteId;

		private String oUName;

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getOUName() {
			return this.oUName;
		}

		public void setOUName(String oUName) {
			this.oUName = oUName;
		}
	}

	@Override
	public ListUserAdOrganizationUnitsResponse getInstance(UnmarshallerContext context) {
		return	ListUserAdOrganizationUnitsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

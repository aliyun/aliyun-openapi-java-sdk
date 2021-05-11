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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListTableGranteesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTableGranteesResponse extends AcsResponse {

	private String requestId;

	private List<GranteeItem> grantee;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GranteeItem> getGrantee() {
		return this.grantee;
	}

	public void setGrantee(List<GranteeItem> grantee) {
		this.grantee = grantee;
	}

	public static class GranteeItem {

		private String granteeTypeDescription;

		private String granteeName;

		private String granteeId;

		private List<String> actions;

		public String getGranteeTypeDescription() {
			return this.granteeTypeDescription;
		}

		public void setGranteeTypeDescription(String granteeTypeDescription) {
			this.granteeTypeDescription = granteeTypeDescription;
		}

		public String getGranteeName() {
			return this.granteeName;
		}

		public void setGranteeName(String granteeName) {
			this.granteeName = granteeName;
		}

		public String getGranteeId() {
			return this.granteeId;
		}

		public void setGranteeId(String granteeId) {
			this.granteeId = granteeId;
		}

		public List<String> getActions() {
			return this.actions;
		}

		public void setActions(List<String> actions) {
			this.actions = actions;
		}
	}

	@Override
	public ListTableGranteesResponse getInstance(UnmarshallerContext context) {
		return	ListTableGranteesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.xtrace.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xtrace.transform.v20190808.CheckServiceLinkedRoleForDeletingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingResponse extends AcsResponse {

	private String requestId;

	private Boolean deletable;

	private List<RoleUsagesItem> roleUsages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getDeletable() {
		return this.deletable;
	}

	public void setDeletable(Boolean deletable) {
		this.deletable = deletable;
	}

	public List<RoleUsagesItem> getRoleUsages() {
		return this.roleUsages;
	}

	public void setRoleUsages(List<RoleUsagesItem> roleUsages) {
		this.roleUsages = roleUsages;
	}

	public static class RoleUsagesItem {

		private String region;

		private List<String> resources;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public List<String> getResources() {
			return this.resources;
		}

		public void setResources(List<String> resources) {
			this.resources = resources;
		}
	}

	@Override
	public CheckServiceLinkedRoleForDeletingResponse getInstance(UnmarshallerContext context) {
		return	CheckServiceLinkedRoleForDeletingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

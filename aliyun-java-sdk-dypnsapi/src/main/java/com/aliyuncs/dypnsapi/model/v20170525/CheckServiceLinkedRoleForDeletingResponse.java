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

package com.aliyuncs.dypnsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.CheckServiceLinkedRoleForDeletingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingResponse extends AcsResponse {

	private String deletable;

	private String requestId;

	private List<RoleUsage> roleUsages;

	public String getDeletable() {
		return this.deletable;
	}

	public void setDeletable(String deletable) {
		this.deletable = deletable;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RoleUsage> getRoleUsages() {
		return this.roleUsages;
	}

	public void setRoleUsages(List<RoleUsage> roleUsages) {
		this.roleUsages = roleUsages;
	}

	public static class RoleUsage {

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

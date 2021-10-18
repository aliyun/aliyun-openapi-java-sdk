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

package com.aliyuncs.oos.model.v20190601;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.UpdateApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicationResponse extends AcsResponse {

	private String requestId;

	private Application application;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public static class Application {

		private String description;

		private String updatedDate;

		private String resourceGroupId;

		private String createdDate;

		private Map<Object,Object> tags;

		private String name;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUpdatedDate() {
			return this.updatedDate;
		}

		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCreatedDate() {
			return this.createdDate;
		}

		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public UpdateApplicationResponse getInstance(UnmarshallerContext context) {
		return	UpdateApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

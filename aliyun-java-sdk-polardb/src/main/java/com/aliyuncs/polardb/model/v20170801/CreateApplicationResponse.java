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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.CreateApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationResponse extends AcsResponse {

	private Boolean resourceAvailable;

	private String applicationId;

	private String description;

	private String orderId;

	private String requestId;

	private String resourceGroupId;

	private List<Component> components;

	public Boolean getResourceAvailable() {
		return this.resourceAvailable;
	}

	public void setResourceAvailable(Boolean resourceAvailable) {
		this.resourceAvailable = resourceAvailable;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<Component> getComponents() {
		return this.components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public static class Component {

		private String componentId;

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}
	}

	@Override
	public CreateApplicationResponse getInstance(UnmarshallerContext context) {
		return	CreateApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

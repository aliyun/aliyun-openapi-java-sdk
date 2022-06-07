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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.CreateAppInstanceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAppInstanceGroupResponse extends AcsResponse {

	private String requestId;

	private AppInstanceGroupModel appInstanceGroupModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppInstanceGroupModel getAppInstanceGroupModel() {
		return this.appInstanceGroupModel;
	}

	public void setAppInstanceGroupModel(AppInstanceGroupModel appInstanceGroupModel) {
		this.appInstanceGroupModel = appInstanceGroupModel;
	}

	public static class AppInstanceGroupModel {

		private String appInstanceGroupId;

		private String orderId;

		private String specId;

		private String nodePoolId;

		public String getAppInstanceGroupId() {
			return this.appInstanceGroupId;
		}

		public void setAppInstanceGroupId(String appInstanceGroupId) {
			this.appInstanceGroupId = appInstanceGroupId;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getSpecId() {
			return this.specId;
		}

		public void setSpecId(String specId) {
			this.specId = specId;
		}

		public String getNodePoolId() {
			return this.nodePoolId;
		}

		public void setNodePoolId(String nodePoolId) {
			this.nodePoolId = nodePoolId;
		}
	}

	@Override
	public CreateAppInstanceGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateAppInstanceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

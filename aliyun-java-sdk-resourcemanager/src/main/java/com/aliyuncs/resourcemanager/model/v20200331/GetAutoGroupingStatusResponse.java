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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.GetAutoGroupingStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutoGroupingStatusResponse extends AcsResponse {

	private Boolean enableExistedResourcesTransfer;

	private String enableStatus;

	private String requestId;

	public Boolean getEnableExistedResourcesTransfer() {
		return this.enableExistedResourcesTransfer;
	}

	public void setEnableExistedResourcesTransfer(Boolean enableExistedResourcesTransfer) {
		this.enableExistedResourcesTransfer = enableExistedResourcesTransfer;
	}

	public String getEnableStatus() {
		return this.enableStatus;
	}

	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public GetAutoGroupingStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAutoGroupingStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

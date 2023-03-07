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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.GetMultiAccountResourceCenterServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMultiAccountResourceCenterServiceStatusResponse extends AcsResponse {

	private String requestId;

	private String serviceStatus;

	private String initialStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getInitialStatus() {
		return this.initialStatus;
	}

	public void setInitialStatus(String initialStatus) {
		this.initialStatus = initialStatus;
	}

	@Override
	public GetMultiAccountResourceCenterServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	GetMultiAccountResourceCenterServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

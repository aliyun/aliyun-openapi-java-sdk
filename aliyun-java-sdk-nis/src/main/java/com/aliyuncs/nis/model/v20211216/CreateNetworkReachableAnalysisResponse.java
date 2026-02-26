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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nis.transform.v20211216.CreateNetworkReachableAnalysisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkReachableAnalysisResponse extends AcsResponse {

	private String networkReachableAnalysisId;

	private String requestId;

	public String getNetworkReachableAnalysisId() {
		return this.networkReachableAnalysisId;
	}

	public void setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
		this.networkReachableAnalysisId = networkReachableAnalysisId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateNetworkReachableAnalysisResponse getInstance(UnmarshallerContext context) {
		return	CreateNetworkReachableAnalysisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

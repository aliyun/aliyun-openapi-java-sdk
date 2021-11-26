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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.CreateTrafficMarkingPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTrafficMarkingPolicyResponse extends AcsResponse {

	private String trafficMarkingPolicyId;

	private String requestId;

	public String getTrafficMarkingPolicyId() {
		return this.trafficMarkingPolicyId;
	}

	public void setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
		this.trafficMarkingPolicyId = trafficMarkingPolicyId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateTrafficMarkingPolicyResponse getInstance(UnmarshallerContext context) {
		return	CreateTrafficMarkingPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

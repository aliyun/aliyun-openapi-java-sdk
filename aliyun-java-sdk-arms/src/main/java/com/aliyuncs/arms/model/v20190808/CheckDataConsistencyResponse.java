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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CheckDataConsistencyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckDataConsistencyResponse extends AcsResponse {

	private String requestId;

	private Boolean isDataConsistency;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsDataConsistency() {
		return this.isDataConsistency;
	}

	public void setIsDataConsistency(Boolean isDataConsistency) {
		this.isDataConsistency = isDataConsistency;
	}

	@Override
	public CheckDataConsistencyResponse getInstance(UnmarshallerContext context) {
		return	CheckDataConsistencyResponseUnmarshaller.unmarshall(this, context);
	}
}

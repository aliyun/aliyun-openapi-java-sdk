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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.CheckProcessingServerLockApplyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckProcessingServerLockApplyResponse extends AcsResponse {

	private String requestId;

	private Boolean exists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getExists() {
		return this.exists;
	}

	public void setExists(Boolean exists) {
		this.exists = exists;
	}

	@Override
	public CheckProcessingServerLockApplyResponse getInstance(UnmarshallerContext context) {
		return	CheckProcessingServerLockApplyResponseUnmarshaller.unmarshall(this, context);
	}
}

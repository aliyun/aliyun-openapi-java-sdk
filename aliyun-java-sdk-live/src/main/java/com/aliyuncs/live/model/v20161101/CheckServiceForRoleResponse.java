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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.CheckServiceForRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceForRoleResponse extends AcsResponse {

	private String requestId;

	private Boolean deletable;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getDeletable() {
		return this.deletable;
	}

	public void setDeletable(Boolean deletable) {
		this.deletable = deletable;
	}

	@Override
	public CheckServiceForRoleResponse getInstance(UnmarshallerContext context) {
		return	CheckServiceForRoleResponseUnmarshaller.unmarshall(this, context);
	}
}

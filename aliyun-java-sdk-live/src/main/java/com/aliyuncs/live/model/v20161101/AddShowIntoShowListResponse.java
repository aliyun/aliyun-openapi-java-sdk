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
import com.aliyuncs.live.transform.v20161101.AddShowIntoShowListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddShowIntoShowListResponse extends AcsResponse {

	private String requestId;

	private String showId;

	private String failedList;

	private String successfulShowIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShowId() {
		return this.showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public String getFailedList() {
		return this.failedList;
	}

	public void setFailedList(String failedList) {
		this.failedList = failedList;
	}

	public String getSuccessfulShowIds() {
		return this.successfulShowIds;
	}

	public void setSuccessfulShowIds(String successfulShowIds) {
		this.successfulShowIds = successfulShowIds;
	}

	@Override
	public AddShowIntoShowListResponse getInstance(UnmarshallerContext context) {
		return	AddShowIntoShowListResponseUnmarshaller.unmarshall(this, context);
	}
}

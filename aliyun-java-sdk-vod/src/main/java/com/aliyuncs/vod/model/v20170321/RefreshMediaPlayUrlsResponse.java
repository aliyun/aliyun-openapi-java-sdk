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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.RefreshMediaPlayUrlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefreshMediaPlayUrlsResponse extends AcsResponse {

	private String mediaRefreshJobId;

	private String nonExistMediaIds;

	private String forbiddenMediaIds;

	private String requestId;

	public String getMediaRefreshJobId() {
		return this.mediaRefreshJobId;
	}

	public void setMediaRefreshJobId(String mediaRefreshJobId) {
		this.mediaRefreshJobId = mediaRefreshJobId;
	}

	public String getNonExistMediaIds() {
		return this.nonExistMediaIds;
	}

	public void setNonExistMediaIds(String nonExistMediaIds) {
		this.nonExistMediaIds = nonExistMediaIds;
	}

	public String getForbiddenMediaIds() {
		return this.forbiddenMediaIds;
	}

	public void setForbiddenMediaIds(String forbiddenMediaIds) {
		this.forbiddenMediaIds = forbiddenMediaIds;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public RefreshMediaPlayUrlsResponse getInstance(UnmarshallerContext context) {
		return	RefreshMediaPlayUrlsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

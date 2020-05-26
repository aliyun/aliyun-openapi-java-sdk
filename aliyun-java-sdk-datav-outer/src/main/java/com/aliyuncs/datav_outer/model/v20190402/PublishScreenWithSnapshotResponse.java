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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.PublishScreenWithSnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PublishScreenWithSnapshotResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Screen screen;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public static class Screen {

		private String token;

		private Integer screenId;

		private Integer snapshotId;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getScreenId() {
			return this.screenId;
		}

		public void setScreenId(Integer screenId) {
			this.screenId = screenId;
		}

		public Integer getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(Integer snapshotId) {
			this.snapshotId = snapshotId;
		}
	}

	@Override
	public PublishScreenWithSnapshotResponse getInstance(UnmarshallerContext context) {
		return	PublishScreenWithSnapshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

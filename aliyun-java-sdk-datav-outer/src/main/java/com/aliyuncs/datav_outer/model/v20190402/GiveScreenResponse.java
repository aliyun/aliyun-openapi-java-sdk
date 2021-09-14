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
import com.aliyuncs.datav_outer.transform.v20190402.GiveScreenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GiveScreenResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Screen screen;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public static class Screen {

		private Long iD;

		private String name;

		public Long getID() {
			return this.iD;
		}

		public void setID(Long iD) {
			this.iD = iD;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public GiveScreenResponse getInstance(UnmarshallerContext context) {
		return	GiveScreenResponseUnmarshaller.unmarshall(this, context);
	}
}

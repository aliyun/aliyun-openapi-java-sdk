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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.BatchCreateScreensByTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateScreensByTemplatesResponse extends AcsResponse {

	private String requestId;

	private List<ScreensItem> screens;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScreensItem> getScreens() {
		return this.screens;
	}

	public void setScreens(List<ScreensItem> screens) {
		this.screens = screens;
	}

	public static class ScreensItem {

		private Integer screenId;

		private String name;

		private String thumbnail;

		public Integer getScreenId() {
			return this.screenId;
		}

		public void setScreenId(Integer screenId) {
			this.screenId = screenId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}
	}

	@Override
	public BatchCreateScreensByTemplatesResponse getInstance(UnmarshallerContext context) {
		return	BatchCreateScreensByTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

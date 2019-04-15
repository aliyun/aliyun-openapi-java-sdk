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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeScreenSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScreenSettingResponse extends AcsResponse {

	private String requestId;

	private SasScreenSetting sasScreenSetting;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SasScreenSetting getSasScreenSetting() {
		return this.sasScreenSetting;
	}

	public void setSasScreenSetting(SasScreenSetting sasScreenSetting) {
		this.sasScreenSetting = sasScreenSetting;
	}

	public static class SasScreenSetting {

		private String screenSettingTitle;

		private String screenSettingIdMap;

		public String getScreenSettingTitle() {
			return this.screenSettingTitle;
		}

		public void setScreenSettingTitle(String screenSettingTitle) {
			this.screenSettingTitle = screenSettingTitle;
		}

		public String getScreenSettingIdMap() {
			return this.screenSettingIdMap;
		}

		public void setScreenSettingIdMap(String screenSettingIdMap) {
			this.screenSettingIdMap = screenSettingIdMap;
		}
	}

	@Override
	public DescribeScreenSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeScreenSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

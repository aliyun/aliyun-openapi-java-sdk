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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRdsResourceSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsResourceSettingsResponse extends AcsResponse {

	private String requestId;

	private List<RdsInstanceResourceSetting> rdsInstanceResourceSettings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RdsInstanceResourceSetting> getRdsInstanceResourceSettings() {
		return this.rdsInstanceResourceSettings;
	}

	public void setRdsInstanceResourceSettings(List<RdsInstanceResourceSetting> rdsInstanceResourceSettings) {
		this.rdsInstanceResourceSettings = rdsInstanceResourceSettings;
	}

	public static class RdsInstanceResourceSetting {

		private String startDate;

		private String endDate;

		private String resourceNiche;

		private String noticeBarContent;

		private String poppedUpButtonText;

		private String poppedUpButtonType;

		private String poppedUpButtonUrl;

		private String poppedUpContent;

		private String isTop;

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getResourceNiche() {
			return this.resourceNiche;
		}

		public void setResourceNiche(String resourceNiche) {
			this.resourceNiche = resourceNiche;
		}

		public String getNoticeBarContent() {
			return this.noticeBarContent;
		}

		public void setNoticeBarContent(String noticeBarContent) {
			this.noticeBarContent = noticeBarContent;
		}

		public String getPoppedUpButtonText() {
			return this.poppedUpButtonText;
		}

		public void setPoppedUpButtonText(String poppedUpButtonText) {
			this.poppedUpButtonText = poppedUpButtonText;
		}

		public String getPoppedUpButtonType() {
			return this.poppedUpButtonType;
		}

		public void setPoppedUpButtonType(String poppedUpButtonType) {
			this.poppedUpButtonType = poppedUpButtonType;
		}

		public String getPoppedUpButtonUrl() {
			return this.poppedUpButtonUrl;
		}

		public void setPoppedUpButtonUrl(String poppedUpButtonUrl) {
			this.poppedUpButtonUrl = poppedUpButtonUrl;
		}

		public String getPoppedUpContent() {
			return this.poppedUpContent;
		}

		public void setPoppedUpContent(String poppedUpContent) {
			this.poppedUpContent = poppedUpContent;
		}

		public String getIsTop() {
			return this.isTop;
		}

		public void setIsTop(String isTop) {
			this.isTop = isTop;
		}
	}

	@Override
	public DescribeRdsResourceSettingsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsResourceSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}

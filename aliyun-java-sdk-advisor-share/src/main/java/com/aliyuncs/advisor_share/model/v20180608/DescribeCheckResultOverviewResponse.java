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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeCheckResultOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCheckResultOverviewResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String resourceTotalCount;

		private String activeCheckItemCount;

		private List<CheckResultCount> checkResultCountList;

		public String getResourceTotalCount() {
			return this.resourceTotalCount;
		}

		public void setResourceTotalCount(String resourceTotalCount) {
			this.resourceTotalCount = resourceTotalCount;
		}

		public String getActiveCheckItemCount() {
			return this.activeCheckItemCount;
		}

		public void setActiveCheckItemCount(String activeCheckItemCount) {
			this.activeCheckItemCount = activeCheckItemCount;
		}

		public List<CheckResultCount> getCheckResultCountList() {
			return this.checkResultCountList;
		}

		public void setCheckResultCountList(List<CheckResultCount> checkResultCountList) {
			this.checkResultCountList = checkResultCountList;
		}

		public static class CheckResultCount {

			private String category;

			private String warningCount;

			private String criticalCount;

			private String normalCount;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getWarningCount() {
				return this.warningCount;
			}

			public void setWarningCount(String warningCount) {
				this.warningCount = warningCount;
			}

			public String getCriticalCount() {
				return this.criticalCount;
			}

			public void setCriticalCount(String criticalCount) {
				this.criticalCount = criticalCount;
			}

			public String getNormalCount() {
				return this.normalCount;
			}

			public void setNormalCount(String normalCount) {
				this.normalCount = normalCount;
			}
		}
	}

	@Override
	public DescribeCheckResultOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeCheckResultOverviewResponseUnmarshaller.unmarshall(this, context);
	}
}

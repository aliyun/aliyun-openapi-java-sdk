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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListCheckStandardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCheckStandardResponse extends AcsResponse {

	private String requestId;

	private List<StandardsItem> standards;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StandardsItem> getStandards() {
		return this.standards;
	}

	public void setStandards(List<StandardsItem> standards) {
		this.standards = standards;
	}

	public static class StandardsItem {

		private Long id;

		private String showName;

		private String type;

		private List<RequirementsItem> requirements;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<RequirementsItem> getRequirements() {
			return this.requirements;
		}

		public void setRequirements(List<RequirementsItem> requirements) {
			this.requirements = requirements;
		}

		public static class RequirementsItem {

			private Long id;

			private String showName;

			private Long riskCheckCount;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public Long getRiskCheckCount() {
				return this.riskCheckCount;
			}

			public void setRiskCheckCount(Long riskCheckCount) {
				this.riskCheckCount = riskCheckCount;
			}
		}
	}

	@Override
	public ListCheckStandardResponse getInstance(UnmarshallerContext context) {
		return	ListCheckStandardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

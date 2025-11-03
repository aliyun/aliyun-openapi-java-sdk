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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.VerifyPlaybookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyPlaybookResponse extends AcsResponse {

	private String requestId;

	private List<CheckTaskInfosItem> checkTaskInfos;

	private List<PrerequisitesItem> prerequisites;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CheckTaskInfosItem> getCheckTaskInfos() {
		return this.checkTaskInfos;
	}

	public void setCheckTaskInfos(List<CheckTaskInfosItem> checkTaskInfos) {
		this.checkTaskInfos = checkTaskInfos;
	}

	public List<PrerequisitesItem> getPrerequisites() {
		return this.prerequisites;
	}

	public void setPrerequisites(List<PrerequisitesItem> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public static class CheckTaskInfosItem {

		private String riskLevel;

		private String nodeName;

		private String detail;

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	public static class PrerequisitesItem {

		private String prerequisiteType;

		private String prerequisiteValue;

		public String getPrerequisiteType() {
			return this.prerequisiteType;
		}

		public void setPrerequisiteType(String prerequisiteType) {
			this.prerequisiteType = prerequisiteType;
		}

		public String getPrerequisiteValue() {
			return this.prerequisiteValue;
		}

		public void setPrerequisiteValue(String prerequisiteValue) {
			this.prerequisiteValue = prerequisiteValue;
		}
	}

	@Override
	public VerifyPlaybookResponse getInstance(UnmarshallerContext context) {
		return	VerifyPlaybookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

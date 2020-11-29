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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeModifyParameterLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModifyParameterLogResponse extends AcsResponse {

	private String requestId;

	private List<ChangelogsItem> changelogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ChangelogsItem> getChangelogs() {
		return this.changelogs;
	}

	public void setChangelogs(List<ChangelogsItem> changelogs) {
		this.changelogs = changelogs;
	}

	public static class ChangelogsItem {

		private String parameterName;

		private String parameterValueBefore;

		private String parameterValueAfter;

		private String parameterValid;

		private String effectTime;

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getParameterValueBefore() {
			return this.parameterValueBefore;
		}

		public void setParameterValueBefore(String parameterValueBefore) {
			this.parameterValueBefore = parameterValueBefore;
		}

		public String getParameterValueAfter() {
			return this.parameterValueAfter;
		}

		public void setParameterValueAfter(String parameterValueAfter) {
			this.parameterValueAfter = parameterValueAfter;
		}

		public String getParameterValid() {
			return this.parameterValid;
		}

		public void setParameterValid(String parameterValid) {
			this.parameterValid = parameterValid;
		}

		public String getEffectTime() {
			return this.effectTime;
		}

		public void setEffectTime(String effectTime) {
			this.effectTime = effectTime;
		}
	}

	@Override
	public DescribeModifyParameterLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeModifyParameterLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

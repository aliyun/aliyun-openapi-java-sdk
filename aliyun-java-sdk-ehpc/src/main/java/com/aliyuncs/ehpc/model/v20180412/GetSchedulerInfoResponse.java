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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.GetSchedulerInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSchedulerInfoResponse extends AcsResponse {

	private String requestId;

	private List<SchedInfoItem> schedInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SchedInfoItem> getSchedInfo() {
		return this.schedInfo;
	}

	public void setSchedInfo(List<SchedInfoItem> schedInfo) {
		this.schedInfo = schedInfo;
	}

	public static class SchedInfoItem {

		private String schedName;

		private String configuration;

		public String getSchedName() {
			return this.schedName;
		}

		public void setSchedName(String schedName) {
			this.schedName = schedName;
		}

		public String getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}
	}

	@Override
	public GetSchedulerInfoResponse getInstance(UnmarshallerContext context) {
		return	GetSchedulerInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

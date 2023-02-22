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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetClusterSuspEventStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterSuspEventStatisticsResponse extends AcsResponse {

	private String requestId;

	private SuspStatistics suspStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SuspStatistics getSuspStatistics() {
		return this.suspStatistics;
	}

	public void setSuspStatistics(SuspStatistics suspStatistics) {
		this.suspStatistics = suspStatistics;
	}

	public static class SuspStatistics {

		private Integer serious;

		private Integer suspicious;

		private Integer remind;

		public Integer getSerious() {
			return this.serious;
		}

		public void setSerious(Integer serious) {
			this.serious = serious;
		}

		public Integer getSuspicious() {
			return this.suspicious;
		}

		public void setSuspicious(Integer suspicious) {
			this.suspicious = suspicious;
		}

		public Integer getRemind() {
			return this.remind;
		}

		public void setRemind(Integer remind) {
			this.remind = remind;
		}
	}

	@Override
	public GetClusterSuspEventStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetClusterSuspEventStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListExecutionPlanInstanceTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionPlanInstanceTrendResponse extends AcsResponse {

	private String requestId;

	private List<Trend> trends;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Trend> getTrends() {
		return this.trends;
	}

	public void setTrends(List<Trend> trends) {
		this.trends = trends;
	}

	public static class Trend {

		private String day;

		private Integer count;

		private String status;

		public String getDay() {
			return this.day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListExecutionPlanInstanceTrendResponse getInstance(UnmarshallerContext context) {
		return	ListExecutionPlanInstanceTrendResponseUnmarshaller.unmarshall(this, context);
	}
}

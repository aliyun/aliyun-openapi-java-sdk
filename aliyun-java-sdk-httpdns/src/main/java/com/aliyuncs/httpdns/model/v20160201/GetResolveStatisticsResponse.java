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
package com.aliyuncs.httpdns.model.v20160201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.httpdns.transform.v20160201.GetResolveStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResolveStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<DataPoint> dataPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataPoint> getDataPoints() {
		return this.dataPoints;
	}

	public void setDataPoints(List<DataPoint> dataPoints) {
		this.dataPoints = dataPoints;
	}

	public static class DataPoint {

		private Integer time;

		private Integer count;

		public Integer getTime() {
			return this.time;
		}

		public void setTime(Integer time) {
			this.time = time;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public GetResolveStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetResolveStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}

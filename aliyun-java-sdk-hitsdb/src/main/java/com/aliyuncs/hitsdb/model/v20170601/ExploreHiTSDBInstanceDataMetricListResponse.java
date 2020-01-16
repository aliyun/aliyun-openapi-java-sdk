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

package com.aliyuncs.hitsdb.model.v20170601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20170601.ExploreHiTSDBInstanceDataMetricListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExploreHiTSDBInstanceDataMetricListResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<Data> metricList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<Data> getMetricList() {
		return this.metricList;
	}

	public void setMetricList(List<Data> metricList) {
		this.metricList = metricList;
	}

	public static class Data {

		private String metric;

		public String getMetric() {
			return this.metric;
		}

		public void setMetric(String metric) {
			this.metric = metric;
		}
	}

	@Override
	public ExploreHiTSDBInstanceDataMetricListResponse getInstance(UnmarshallerContext context) {
		return	ExploreHiTSDBInstanceDataMetricListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

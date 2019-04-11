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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class PutCustomMetricRequest extends RpcAcsRequest<PutCustomMetricResponse> {
	
	public PutCustomMetricRequest() {
		super("Cms", "2019-01-01", "PutCustomMetric", "cms");
	}

	private List<MetricList> metricLists;

	public List<MetricList> getMetricLists() {
		return this.metricLists;
	}

	public void setMetricLists(List<MetricList> metricLists) {
		this.metricLists = metricLists;	
		if (metricLists != null) {
			for (int depth1 = 0; depth1 < metricLists.size(); depth1++) {
				putQueryParameter("MetricList." + (depth1 + 1) + ".Period" , metricLists.get(depth1).getPeriod());
				putQueryParameter("MetricList." + (depth1 + 1) + ".GroupId" , metricLists.get(depth1).getGroupId());
				putQueryParameter("MetricList." + (depth1 + 1) + ".Values" , metricLists.get(depth1).getValues());
				putQueryParameter("MetricList." + (depth1 + 1) + ".Time" , metricLists.get(depth1).getTime());
				putQueryParameter("MetricList." + (depth1 + 1) + ".MetricName" , metricLists.get(depth1).getMetricName());
				putQueryParameter("MetricList." + (depth1 + 1) + ".Type" , metricLists.get(depth1).getType());
				putQueryParameter("MetricList." + (depth1 + 1) + ".Dimensions" , metricLists.get(depth1).getDimensions());
			}
		}	
	}

	public static class MetricList {

		private String period;

		private String groupId;

		private String values;

		private String time;

		private String metricName;

		private String type;

		private String dimensions;

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getValues() {
			return this.values;
		}

		public void setValues(String values) {
			this.values = values;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}
	}

	@Override
	public Class<PutCustomMetricResponse> getResponseClass() {
		return PutCustomMetricResponse.class;
	}

}

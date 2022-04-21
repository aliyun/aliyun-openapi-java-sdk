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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutHybridMonitorMetricDataRequest extends RpcAcsRequest<PutHybridMonitorMetricDataResponse> {
	   

	private List<MetricList> metricLists;

	private String namespace;
	public PutHybridMonitorMetricDataRequest() {
		super("Cms", "2019-01-01", "PutHybridMonitorMetricData", "cms");
		setMethod(MethodType.POST);
	}

	public List<MetricList> getMetricLists() {
		return this.metricLists;
	}

	public void setMetricLists(List<MetricList> metricLists) {
		this.metricLists = metricLists;	
		if (metricLists != null) {
			for (int depth1 = 0; depth1 < metricLists.size(); depth1++) {
				putQueryParameter("MetricList." + (depth1 + 1) + ".Name" , metricLists.get(depth1).getName());
				putQueryParameter("MetricList." + (depth1 + 1) + ".Value" , metricLists.get(depth1).getValue());
				if (metricLists.get(depth1).getLabelss() != null) {
					for (int depth2 = 0; depth2 < metricLists.get(depth1).getLabelss().size(); depth2++) {
						putQueryParameter("MetricList." + (depth1 + 1) + ".Labels." + (depth2 + 1) + ".Value" , metricLists.get(depth1).getLabelss().get(depth2).getValue());
						putQueryParameter("MetricList." + (depth1 + 1) + ".Labels." + (depth2 + 1) + ".Key" , metricLists.get(depth1).getLabelss().get(depth2).getKey());
					}
				}
				putQueryParameter("MetricList." + (depth1 + 1) + ".TS" , metricLists.get(depth1).getTS());
			}
		}	
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public static class MetricList {

		private String name;

		private String value;

		private List<Labels> labelss;

		private Long tS;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public List<Labels> getLabelss() {
			return this.labelss;
		}

		public void setLabelss(List<Labels> labelss) {
			this.labelss = labelss;
		}

		public Long getTS() {
			return this.tS;
		}

		public void setTS(Long tS) {
			this.tS = tS;
		}

		public static class Labels {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public Class<PutHybridMonitorMetricDataResponse> getResponseClass() {
		return PutHybridMonitorMetricDataResponse.class;
	}

}

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

package com.aliyuncs.selectdb.model.v20230522;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.ModifyElasticRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyElasticRuleResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dbInstanceId;

		private String clusterId;

		private Long ruleId;

		private String executionPeriod;

		private String elasticRuleStartTime;

		private String clusterClass;

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getExecutionPeriod() {
			return this.executionPeriod;
		}

		public void setExecutionPeriod(String executionPeriod) {
			this.executionPeriod = executionPeriod;
		}

		public String getElasticRuleStartTime() {
			return this.elasticRuleStartTime;
		}

		public void setElasticRuleStartTime(String elasticRuleStartTime) {
			this.elasticRuleStartTime = elasticRuleStartTime;
		}

		public String getClusterClass() {
			return this.clusterClass;
		}

		public void setClusterClass(String clusterClass) {
			this.clusterClass = clusterClass;
		}
	}

	@Override
	public ModifyElasticRuleResponse getInstance(UnmarshallerContext context) {
		return	ModifyElasticRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

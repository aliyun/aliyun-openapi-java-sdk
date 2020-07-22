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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ModifyElastictaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyElastictaskResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private ElasticExpansionTask elasticExpansionTask;

		private ElasticShrinkTask elasticShrinkTask;

		public ElasticExpansionTask getElasticExpansionTask() {
			return this.elasticExpansionTask;
		}

		public void setElasticExpansionTask(ElasticExpansionTask elasticExpansionTask) {
			this.elasticExpansionTask = elasticExpansionTask;
		}

		public ElasticShrinkTask getElasticShrinkTask() {
			return this.elasticShrinkTask;
		}

		public void setElasticShrinkTask(ElasticShrinkTask elasticShrinkTask) {
			this.elasticShrinkTask = elasticShrinkTask;
		}

		public static class ElasticExpansionTask {

			private String triggerType;

			private String cronExpression;

			private Integer elasticNodeCount;

			private Integer replicaCount;

			private List<String> targetIndices;

			public String getTriggerType() {
				return this.triggerType;
			}

			public void setTriggerType(String triggerType) {
				this.triggerType = triggerType;
			}

			public String getCronExpression() {
				return this.cronExpression;
			}

			public void setCronExpression(String cronExpression) {
				this.cronExpression = cronExpression;
			}

			public Integer getElasticNodeCount() {
				return this.elasticNodeCount;
			}

			public void setElasticNodeCount(Integer elasticNodeCount) {
				this.elasticNodeCount = elasticNodeCount;
			}

			public Integer getReplicaCount() {
				return this.replicaCount;
			}

			public void setReplicaCount(Integer replicaCount) {
				this.replicaCount = replicaCount;
			}

			public List<String> getTargetIndices() {
				return this.targetIndices;
			}

			public void setTargetIndices(List<String> targetIndices) {
				this.targetIndices = targetIndices;
			}
		}

		public static class ElasticShrinkTask {

			private String triggerType;

			private String cronExpression;

			private Integer elasticNodeCount;

			private Integer replicaCount;

			private List<String> targetIndices1;

			public String getTriggerType() {
				return this.triggerType;
			}

			public void setTriggerType(String triggerType) {
				this.triggerType = triggerType;
			}

			public String getCronExpression() {
				return this.cronExpression;
			}

			public void setCronExpression(String cronExpression) {
				this.cronExpression = cronExpression;
			}

			public Integer getElasticNodeCount() {
				return this.elasticNodeCount;
			}

			public void setElasticNodeCount(Integer elasticNodeCount) {
				this.elasticNodeCount = elasticNodeCount;
			}

			public Integer getReplicaCount() {
				return this.replicaCount;
			}

			public void setReplicaCount(Integer replicaCount) {
				this.replicaCount = replicaCount;
			}

			public List<String> getTargetIndices1() {
				return this.targetIndices1;
			}

			public void setTargetIndices1(List<String> targetIndices1) {
				this.targetIndices1 = targetIndices1;
			}
		}
	}

	@Override
	public ModifyElastictaskResponse getInstance(UnmarshallerContext context) {
		return	ModifyElastictaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.yundun_ds.model.v20190103;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeFlowTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowTotalCountResponse extends AcsResponse {

	private String requestId;

	private FlowCount flowCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FlowCount getFlowCount() {
		return this.flowCount;
	}

	public void setFlowCount(FlowCount flowCount) {
		this.flowCount = flowCount;
	}

	public static class FlowCount {

		private DataHub dataHub;

		private CDP cDP;

		public DataHub getDataHub() {
			return this.dataHub;
		}

		public void setDataHub(DataHub dataHub) {
			this.dataHub = dataHub;
		}

		public CDP getCDP() {
			return this.cDP;
		}

		public void setCDP(CDP cDP) {
			this.cDP = cDP;
		}

		public static class DataHub {

			private Project project;

			private Topic topic;

			private Subscription subscription;

			private Connector connector;

			public Project getProject() {
				return this.project;
			}

			public void setProject(Project project) {
				this.project = project;
			}

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public Subscription getSubscription() {
				return this.subscription;
			}

			public void setSubscription(Subscription subscription) {
				this.subscription = subscription;
			}

			public Connector getConnector() {
				return this.connector;
			}

			public void setConnector(Connector connector) {
				this.connector = connector;
			}

			public static class Project {

				private Long totalCount;

				private Long lastCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getLastCount() {
					return this.lastCount;
				}

				public void setLastCount(Long lastCount) {
					this.lastCount = lastCount;
				}
			}

			public static class Topic {

				private Long totalCount;

				private Long lastCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getLastCount() {
					return this.lastCount;
				}

				public void setLastCount(Long lastCount) {
					this.lastCount = lastCount;
				}
			}

			public static class Subscription {

				private Long totalCount;

				private Long lastCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getLastCount() {
					return this.lastCount;
				}

				public void setLastCount(Long lastCount) {
					this.lastCount = lastCount;
				}
			}

			public static class Connector {

				private Long totalCount;

				private Long lastCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getLastCount() {
					return this.lastCount;
				}

				public void setLastCount(Long lastCount) {
					this.lastCount = lastCount;
				}
			}
		}

		public static class CDP {

			private InputInstanceCount inputInstanceCount;

			private InputRecordCount inputRecordCount;

			private OutputInstanceCount outputInstanceCount;

			private OutputRecordCount outputRecordCount;

			public InputInstanceCount getInputInstanceCount() {
				return this.inputInstanceCount;
			}

			public void setInputInstanceCount(InputInstanceCount inputInstanceCount) {
				this.inputInstanceCount = inputInstanceCount;
			}

			public InputRecordCount getInputRecordCount() {
				return this.inputRecordCount;
			}

			public void setInputRecordCount(InputRecordCount inputRecordCount) {
				this.inputRecordCount = inputRecordCount;
			}

			public OutputInstanceCount getOutputInstanceCount() {
				return this.outputInstanceCount;
			}

			public void setOutputInstanceCount(OutputInstanceCount outputInstanceCount) {
				this.outputInstanceCount = outputInstanceCount;
			}

			public OutputRecordCount getOutputRecordCount() {
				return this.outputRecordCount;
			}

			public void setOutputRecordCount(OutputRecordCount outputRecordCount) {
				this.outputRecordCount = outputRecordCount;
			}

			public static class InputInstanceCount {

				private Long totalCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}
			}

			public static class InputRecordCount {

				private Long totalCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}
			}

			public static class OutputInstanceCount {

				private Long totalCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}
			}

			public static class OutputRecordCount {

				private Long totalCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}
			}
		}
	}

	@Override
	public DescribeFlowTotalCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowTotalCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

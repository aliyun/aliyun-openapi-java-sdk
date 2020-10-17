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
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeDiagnoseReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnoseReportResponse extends AcsResponse {

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

		private String reportId;

		private String instanceId;

		private String state;

		private Long createTime;

		private String health;

		private String trigger;

		private List<DiagnoseItemsItem> diagnoseItems;

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}

		public List<DiagnoseItemsItem> getDiagnoseItems() {
			return this.diagnoseItems;
		}

		public void setDiagnoseItems(List<DiagnoseItemsItem> diagnoseItems) {
			this.diagnoseItems = diagnoseItems;
		}

		public static class DiagnoseItemsItem {

			private String item;

			private String health;

			private Detail detail;

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getHealth() {
				return this.health;
			}

			public void setHealth(String health) {
				this.health = health;
			}

			public Detail getDetail() {
				return this.detail;
			}

			public void setDetail(Detail detail) {
				this.detail = detail;
			}

			public static class Detail {

				private String name;

				private String desc;

				private String type;

				private String suggest;

				private String result;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDesc() {
					return this.desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getSuggest() {
					return this.suggest;
				}

				public void setSuggest(String suggest) {
					this.suggest = suggest;
				}

				public String getResult() {
					return this.result;
				}

				public void setResult(String result) {
					this.result = result;
				}
			}
		}
	}

	@Override
	public DescribeDiagnoseReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnoseReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

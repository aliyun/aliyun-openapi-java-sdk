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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageBaselineStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineStrategyResponse extends AcsResponse {

	private String requestId;

	private Strategy strategy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Strategy getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public static class Strategy {

		private String type;

		private String strategyName;

		private Long strategyId;

		private Integer selectedItemCount;

		private Integer totalItemCount;

		private List<BaselineResult> baselineItemList;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStrategyName() {
			return this.strategyName;
		}

		public void setStrategyName(String strategyName) {
			this.strategyName = strategyName;
		}

		public Long getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(Long strategyId) {
			this.strategyId = strategyId;
		}

		public Integer getSelectedItemCount() {
			return this.selectedItemCount;
		}

		public void setSelectedItemCount(Integer selectedItemCount) {
			this.selectedItemCount = selectedItemCount;
		}

		public Integer getTotalItemCount() {
			return this.totalItemCount;
		}

		public void setTotalItemCount(Integer totalItemCount) {
			this.totalItemCount = totalItemCount;
		}

		public List<BaselineResult> getBaselineItemList() {
			return this.baselineItemList;
		}

		public void setBaselineItemList(List<BaselineResult> baselineItemList) {
			this.baselineItemList = baselineItemList;
		}

		public static class BaselineResult {

			private String nameKey;

			private String itemKey;

			private String classKey;

			public String getNameKey() {
				return this.nameKey;
			}

			public void setNameKey(String nameKey) {
				this.nameKey = nameKey;
			}

			public String getItemKey() {
				return this.itemKey;
			}

			public void setItemKey(String itemKey) {
				this.itemKey = itemKey;
			}

			public String getClassKey() {
				return this.classKey;
			}

			public void setClassKey(String classKey) {
				this.classKey = classKey;
			}
		}
	}

	@Override
	public DescribeImageBaselineStrategyResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageBaselineStrategyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

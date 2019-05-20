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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeRuleTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRuleTotalCountResponse extends AcsResponse {

	private String requestId;

	private RuleCount ruleCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RuleCount getRuleCount() {
		return this.ruleCount;
	}

	public void setRuleCount(RuleCount ruleCount) {
		this.ruleCount = ruleCount;
	}

	public static class RuleCount {

		private Long totalCount;

		private List<CategoryCount> categoryCountList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<CategoryCount> getCategoryCountList() {
			return this.categoryCountList;
		}

		public void setCategoryCountList(List<CategoryCount> categoryCountList) {
			this.categoryCountList = categoryCountList;
		}

		public static class CategoryCount {

			private String name;

			private String count;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeRuleTotalCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeRuleTotalCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

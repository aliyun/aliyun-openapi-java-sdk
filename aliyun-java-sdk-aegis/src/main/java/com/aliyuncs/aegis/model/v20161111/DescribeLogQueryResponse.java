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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeLogQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogQueryResponse extends AcsResponse {

	private String requestId;

	private Integer listTotal;

	private List<QueryItemsItem> queryItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getListTotal() {
		return this.listTotal;
	}

	public void setListTotal(Integer listTotal) {
		this.listTotal = listTotal;
	}

	public List<QueryItemsItem> getQueryItems() {
		return this.queryItems;
	}

	public void setQueryItems(List<QueryItemsItem> queryItems) {
		this.queryItems = queryItems;
	}

	public static class QueryItemsItem {

		private String queryDetail;

		private String queryName;

		private String conditions;

		public String getQueryDetail() {
			return this.queryDetail;
		}

		public void setQueryDetail(String queryDetail) {
			this.queryDetail = queryDetail;
		}

		public String getQueryName() {
			return this.queryName;
		}

		public void setQueryName(String queryName) {
			this.queryName = queryName;
		}

		public String getConditions() {
			return this.conditions;
		}

		public void setConditions(String conditions) {
			this.conditions = conditions;
		}
	}

	@Override
	public DescribeLogQueryResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.aegis.transform.v20161111.DescribeFilterFieldsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFilterFieldsResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private List<LogFilterListItem> logFilterList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<LogFilterListItem> getLogFilterList() {
		return this.logFilterList;
	}

	public void setLogFilterList(List<LogFilterListItem> logFilterList) {
		this.logFilterList = logFilterList;
	}

	public static class LogFilterListItem {

		private String fields;

		public String getFields() {
			return this.fields;
		}

		public void setFields(String fields) {
			this.fields = fields;
		}
	}

	@Override
	public DescribeFilterFieldsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFilterFieldsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

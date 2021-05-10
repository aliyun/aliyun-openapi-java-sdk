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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnUserSecDropByMinuteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnUserSecDropByMinuteResponse extends AcsResponse {

	private String requestId;

	private String description;

	private Integer totalCount;

	private Integer len;

	private Integer pageNumber;

	private Integer pageSize;

	private List<RowsItem> rows;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getLen() {
		return this.len;
	}

	public void setLen(Integer len) {
		this.len = len;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<RowsItem> getRows() {
		return this.rows;
	}

	public void setRows(List<RowsItem> rows) {
		this.rows = rows;
	}

	public static class RowsItem {

		private String ruleName;

		private String object;

		private String domain;

		private String secFunc;

		private String tmStr;

		private Integer drops;

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getObject() {
			return this.object;
		}

		public void setObject(String object) {
			this.object = object;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getSecFunc() {
			return this.secFunc;
		}

		public void setSecFunc(String secFunc) {
			this.secFunc = secFunc;
		}

		public String getTmStr() {
			return this.tmStr;
		}

		public void setTmStr(String tmStr) {
			this.tmStr = tmStr;
		}

		public Integer getDrops() {
			return this.drops;
		}

		public void setDrops(Integer drops) {
			this.drops = drops;
		}
	}

	@Override
	public DescribeDcdnUserSecDropByMinuteResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnUserSecDropByMinuteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.dcdn.transform.v20180115.ListDcdnEsTemplateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDcdnEsTemplateInfoResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<DataItem> dataItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DataItem> getDataItems() {
		return this.dataItems;
	}

	public void setDataItems(List<DataItem> dataItems) {
		this.dataItems = dataItems;
	}

	public static class DataItem {

		private Integer id;

		private String tmplName;

		private String tmplDef;

		private String tmplDesc;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTmplName() {
			return this.tmplName;
		}

		public void setTmplName(String tmplName) {
			this.tmplName = tmplName;
		}

		public String getTmplDef() {
			return this.tmplDef;
		}

		public void setTmplDef(String tmplDef) {
			this.tmplDef = tmplDef;
		}

		public String getTmplDesc() {
			return this.tmplDesc;
		}

		public void setTmplDesc(String tmplDesc) {
			this.tmplDesc = tmplDesc;
		}
	}

	@Override
	public ListDcdnEsTemplateInfoResponse getInstance(UnmarshallerContext context) {
		return	ListDcdnEsTemplateInfoResponseUnmarshaller.unmarshall(this, context);
	}
}

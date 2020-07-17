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

package com.aliyuncs.idsp.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idsp.transform.v20200710.GetSubjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubjectResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<SpecialSubjectDo> list;

		private PageModel pageModel;

		public List<SpecialSubjectDo> getList() {
			return this.list;
		}

		public void setList(List<SpecialSubjectDo> list) {
			this.list = list;
		}

		public PageModel getPageModel() {
			return this.pageModel;
		}

		public void setPageModel(PageModel pageModel) {
			this.pageModel = pageModel;
		}

		public static class SpecialSubjectDo {

			private Long id;

			private String name;

			private String posKeywords;

			private String assKeywords;

			private String excludeKeywords;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPosKeywords() {
				return this.posKeywords;
			}

			public void setPosKeywords(String posKeywords) {
				this.posKeywords = posKeywords;
			}

			public String getAssKeywords() {
				return this.assKeywords;
			}

			public void setAssKeywords(String assKeywords) {
				this.assKeywords = assKeywords;
			}

			public String getExcludeKeywords() {
				return this.excludeKeywords;
			}

			public void setExcludeKeywords(String excludeKeywords) {
				this.excludeKeywords = excludeKeywords;
			}
		}

		public static class PageModel {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public GetSubjectResponse getInstance(UnmarshallerContext context) {
		return	GetSubjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

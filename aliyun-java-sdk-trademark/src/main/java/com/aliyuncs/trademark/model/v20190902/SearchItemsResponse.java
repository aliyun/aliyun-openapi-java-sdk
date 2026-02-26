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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.SearchItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchItemsResponse extends AcsResponse {

	private Module module;

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Integer currentPageNum;

		private Integer pageSize;

		private Integer totalItemNum;

		private Integer totalPageNum;

		private List<Item> date;

		public Integer getCurrentPageNum() {
			return this.currentPageNum;
		}

		public void setCurrentPageNum(Integer currentPageNum) {
			this.currentPageNum = currentPageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalItemNum() {
			return this.totalItemNum;
		}

		public void setTotalItemNum(Integer totalItemNum) {
			this.totalItemNum = totalItemNum;
		}

		public Integer getTotalPageNum() {
			return this.totalPageNum;
		}

		public void setTotalPageNum(Integer totalPageNum) {
			this.totalPageNum = totalPageNum;
		}

		public List<Item> getDate() {
			return this.date;
		}

		public void setDate(List<Item> date) {
			this.date = date;
		}

		public static class Item {

			private String detailViewObjectSourceDatum;

			private String detailViewObjectSourceType;

			public String getDetailViewObjectSourceDatum() {
				return this.detailViewObjectSourceDatum;
			}

			public void setDetailViewObjectSourceDatum(String detailViewObjectSourceDatum) {
				this.detailViewObjectSourceDatum = detailViewObjectSourceDatum;
			}

			public String getDetailViewObjectSourceType() {
				return this.detailViewObjectSourceType;
			}

			public void setDetailViewObjectSourceType(String detailViewObjectSourceType) {
				this.detailViewObjectSourceType = detailViewObjectSourceType;
			}
		}
	}

	@Override
	public SearchItemsResponse getInstance(UnmarshallerContext context) {
		return	SearchItemsResponseUnmarshaller.unmarshall(this, context);
	}
}

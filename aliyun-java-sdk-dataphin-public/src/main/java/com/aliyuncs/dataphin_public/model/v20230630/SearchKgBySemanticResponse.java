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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.SearchKgBySemanticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchKgBySemanticResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private List<SearchResult> searchResults;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<SearchResult> getSearchResults() {
			return this.searchResults;
		}

		public void setSearchResults(List<SearchResult> searchResults) {
			this.searchResults = searchResults;
		}

		public static class SearchResult {

			private String matchedPropertyCode;

			private String itemTypeCode;

			private String matchedPropertyValue;

			private Float similarityScore;

			private String itemId;

			public String getMatchedPropertyCode() {
				return this.matchedPropertyCode;
			}

			public void setMatchedPropertyCode(String matchedPropertyCode) {
				this.matchedPropertyCode = matchedPropertyCode;
			}

			public String getItemTypeCode() {
				return this.itemTypeCode;
			}

			public void setItemTypeCode(String itemTypeCode) {
				this.itemTypeCode = itemTypeCode;
			}

			public String getMatchedPropertyValue() {
				return this.matchedPropertyValue;
			}

			public void setMatchedPropertyValue(String matchedPropertyValue) {
				this.matchedPropertyValue = matchedPropertyValue;
			}

			public Float getSimilarityScore() {
				return this.similarityScore;
			}

			public void setSimilarityScore(Float similarityScore) {
				this.similarityScore = similarityScore;
			}

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}
		}
	}

	@Override
	public SearchKgBySemanticResponse getInstance(UnmarshallerContext context) {
		return	SearchKgBySemanticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

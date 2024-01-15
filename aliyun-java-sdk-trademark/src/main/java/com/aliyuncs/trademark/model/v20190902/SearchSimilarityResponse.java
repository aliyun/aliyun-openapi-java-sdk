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
import com.aliyuncs.trademark.transform.v20190902.SearchSimilarityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchSimilarityResponse extends AcsResponse {

	private String requestId;

	private List<Data> dataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}

	public static class Data {

		private String name;

		private String uri;

		private List<ClassificationSimilarity> classificationSimilarityList;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public List<ClassificationSimilarity> getClassificationSimilarityList() {
			return this.classificationSimilarityList;
		}

		public void setClassificationSimilarityList(List<ClassificationSimilarity> classificationSimilarityList) {
			this.classificationSimilarityList = classificationSimilarityList;
		}

		public static class ClassificationSimilarity {

			private String classificationName;

			private Integer classification;

			private Integer rate;

			private List<SimilarGroup> similarGroupList;

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}

			public Integer getClassification() {
				return this.classification;
			}

			public void setClassification(Integer classification) {
				this.classification = classification;
			}

			public Integer getRate() {
				return this.rate;
			}

			public void setRate(Integer rate) {
				this.rate = rate;
			}

			public List<SimilarGroup> getSimilarGroupList() {
				return this.similarGroupList;
			}

			public void setSimilarGroupList(List<SimilarGroup> similarGroupList) {
				this.similarGroupList = similarGroupList;
			}

			public static class SimilarGroup {

				private String similarGroup;

				private String similarGroupName;

				private Integer rate;

				private List<Detail> detailList;

				public String getSimilarGroup() {
					return this.similarGroup;
				}

				public void setSimilarGroup(String similarGroup) {
					this.similarGroup = similarGroup;
				}

				public String getSimilarGroupName() {
					return this.similarGroupName;
				}

				public void setSimilarGroupName(String similarGroupName) {
					this.similarGroupName = similarGroupName;
				}

				public Integer getRate() {
					return this.rate;
				}

				public void setRate(Integer rate) {
					this.rate = rate;
				}

				public List<Detail> getDetailList() {
					return this.detailList;
				}

				public void setDetailList(List<Detail> detailList) {
					this.detailList = detailList;
				}

				public static class Detail {

					private String code;

					private String tmNumber;

					private String name;

					private String uri;

					private String uid;

					private Integer rate;

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
					}

					public String getTmNumber() {
						return this.tmNumber;
					}

					public void setTmNumber(String tmNumber) {
						this.tmNumber = tmNumber;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getUri() {
						return this.uri;
					}

					public void setUri(String uri) {
						this.uri = uri;
					}

					public String getUid() {
						return this.uid;
					}

					public void setUid(String uid) {
						this.uid = uid;
					}

					public Integer getRate() {
						return this.rate;
					}

					public void setRate(Integer rate) {
						this.rate = rate;
					}
				}
			}
		}
	}

	@Override
	public SearchSimilarityResponse getInstance(UnmarshallerContext context) {
		return	SearchSimilarityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

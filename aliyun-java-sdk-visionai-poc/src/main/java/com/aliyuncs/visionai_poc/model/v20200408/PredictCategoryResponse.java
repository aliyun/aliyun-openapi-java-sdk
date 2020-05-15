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

package com.aliyuncs.visionai_poc.model.v20200408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.visionai_poc.transform.v20200408.PredictCategoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PredictCategoryResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Boolean success;

	private Response response;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private Boolean success;

		private String url;

		private String requestId;

		private String errorCode;

		private String errorMessage;

		private List<Node> data;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public List<Node> getData() {
			return this.data;
		}

		public void setData(List<Node> data) {
			this.data = data;
		}

		public static class Node {

			private String cateId;

			private Category category;

			public String getCateId() {
				return this.cateId;
			}

			public void setCateId(String cateId) {
				this.cateId = cateId;
			}

			public Category getCategory() {
				return this.category;
			}

			public void setCategory(Category category) {
				this.category = category;
			}

			public static class Category {

				private String cateLevelFOURName;

				private Integer cateLevelTwoId;

				private Integer cateLevelOneId;

				private String cateLevelOneName;

				private Integer cateLevelFourId;

				private Integer cateLevel;

				private Integer cateLevelThreeId;

				private Integer cateLevelFiveId;

				private String cateLevelFiveName;

				private String cateName;

				private String cateLevelTwoName;

				private Float score;

				private Integer cateId;

				private String cateLevelThreeName;

				public String getCateLevelFOURName() {
					return this.cateLevelFOURName;
				}

				public void setCateLevelFOURName(String cateLevelFOURName) {
					this.cateLevelFOURName = cateLevelFOURName;
				}

				public Integer getCateLevelTwoId() {
					return this.cateLevelTwoId;
				}

				public void setCateLevelTwoId(Integer cateLevelTwoId) {
					this.cateLevelTwoId = cateLevelTwoId;
				}

				public Integer getCateLevelOneId() {
					return this.cateLevelOneId;
				}

				public void setCateLevelOneId(Integer cateLevelOneId) {
					this.cateLevelOneId = cateLevelOneId;
				}

				public String getCateLevelOneName() {
					return this.cateLevelOneName;
				}

				public void setCateLevelOneName(String cateLevelOneName) {
					this.cateLevelOneName = cateLevelOneName;
				}

				public Integer getCateLevelFourId() {
					return this.cateLevelFourId;
				}

				public void setCateLevelFourId(Integer cateLevelFourId) {
					this.cateLevelFourId = cateLevelFourId;
				}

				public Integer getCateLevel() {
					return this.cateLevel;
				}

				public void setCateLevel(Integer cateLevel) {
					this.cateLevel = cateLevel;
				}

				public Integer getCateLevelThreeId() {
					return this.cateLevelThreeId;
				}

				public void setCateLevelThreeId(Integer cateLevelThreeId) {
					this.cateLevelThreeId = cateLevelThreeId;
				}

				public Integer getCateLevelFiveId() {
					return this.cateLevelFiveId;
				}

				public void setCateLevelFiveId(Integer cateLevelFiveId) {
					this.cateLevelFiveId = cateLevelFiveId;
				}

				public String getCateLevelFiveName() {
					return this.cateLevelFiveName;
				}

				public void setCateLevelFiveName(String cateLevelFiveName) {
					this.cateLevelFiveName = cateLevelFiveName;
				}

				public String getCateName() {
					return this.cateName;
				}

				public void setCateName(String cateName) {
					this.cateName = cateName;
				}

				public String getCateLevelTwoName() {
					return this.cateLevelTwoName;
				}

				public void setCateLevelTwoName(String cateLevelTwoName) {
					this.cateLevelTwoName = cateLevelTwoName;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}

				public Integer getCateId() {
					return this.cateId;
				}

				public void setCateId(Integer cateId) {
					this.cateId = cateId;
				}

				public String getCateLevelThreeName() {
					return this.cateLevelThreeName;
				}

				public void setCateLevelThreeName(String cateLevelThreeName) {
					this.cateLevelThreeName = cateLevelThreeName;
				}
			}
		}
	}

	@Override
	public PredictCategoryResponse getInstance(UnmarshallerContext context) {
		return	PredictCategoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

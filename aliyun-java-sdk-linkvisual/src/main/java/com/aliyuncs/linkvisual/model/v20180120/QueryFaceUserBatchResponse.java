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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryFaceUserBatchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFaceUserBatchResponse extends AcsResponse {

	private String code;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String params;

		private String customUserId;

		private Long createTime;

		private String userId;

		private String name;

		private Long modifyTime;

		private List<FacePicListItem> facePicList;

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getCustomUserId() {
			return this.customUserId;
		}

		public void setCustomUserId(String customUserId) {
			this.customUserId = customUserId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public List<FacePicListItem> getFacePicList() {
			return this.facePicList;
		}

		public void setFacePicList(List<FacePicListItem> facePicList) {
			this.facePicList = facePicList;
		}

		public static class FacePicListItem {

			private String faceUrl;

			private String faceMd5;

			private List<FeatureDTO> featureDTOList;

			public String getFaceUrl() {
				return this.faceUrl;
			}

			public void setFaceUrl(String faceUrl) {
				this.faceUrl = faceUrl;
			}

			public String getFaceMd5() {
				return this.faceMd5;
			}

			public void setFaceMd5(String faceMd5) {
				this.faceMd5 = faceMd5;
			}

			public List<FeatureDTO> getFeatureDTOList() {
				return this.featureDTOList;
			}

			public void setFeatureDTOList(List<FeatureDTO> featureDTOList) {
				this.featureDTOList = featureDTOList;
			}

			public static class FeatureDTO {

				private String algorithmName;

				private String algorithmVersion;

				private String algorithmProvider;

				private String errorMessage;

				private String errorCode;

				private String faceMd5;

				public String getAlgorithmName() {
					return this.algorithmName;
				}

				public void setAlgorithmName(String algorithmName) {
					this.algorithmName = algorithmName;
				}

				public String getAlgorithmVersion() {
					return this.algorithmVersion;
				}

				public void setAlgorithmVersion(String algorithmVersion) {
					this.algorithmVersion = algorithmVersion;
				}

				public String getAlgorithmProvider() {
					return this.algorithmProvider;
				}

				public void setAlgorithmProvider(String algorithmProvider) {
					this.algorithmProvider = algorithmProvider;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getFaceMd5() {
					return this.faceMd5;
				}

				public void setFaceMd5(String faceMd5) {
					this.faceMd5 = faceMd5;
				}
			}
		}
	}

	@Override
	public QueryFaceUserBatchResponse getInstance(UnmarshallerContext context) {
		return	QueryFaceUserBatchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

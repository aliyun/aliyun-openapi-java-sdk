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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.DsgDesensPlanQueryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DsgDesensPlanQueryListResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private PageData pageData;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageData getPageData() {
		return this.pageData;
	}

	public void setPageData(PageData pageData) {
		this.pageData = pageData;
	}

	public static class PageData {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Datas> data;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Datas> getData() {
			return this.data;
		}

		public void setData(List<Datas> data) {
			this.data = data;
		}

		public static class Datas {

			private Long id;

			private String dataType;

			private String ruleName;

			private String owner;

			private String gmtCreate;

			private String gmtModified;

			private Integer status;

			private String desensWay;

			private String desenMode;

			private String desensRule;

			private String sceneCode;

			private Boolean checkWatermark;

			private String sceneName;

			private DesensPlan desensPlan;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getDesensWay() {
				return this.desensWay;
			}

			public void setDesensWay(String desensWay) {
				this.desensWay = desensWay;
			}

			public String getDesenMode() {
				return this.desenMode;
			}

			public void setDesenMode(String desenMode) {
				this.desenMode = desenMode;
			}

			public String getDesensRule() {
				return this.desensRule;
			}

			public void setDesensRule(String desensRule) {
				this.desensRule = desensRule;
			}

			public String getSceneCode() {
				return this.sceneCode;
			}

			public void setSceneCode(String sceneCode) {
				this.sceneCode = sceneCode;
			}

			public Boolean getCheckWatermark() {
				return this.checkWatermark;
			}

			public void setCheckWatermark(Boolean checkWatermark) {
				this.checkWatermark = checkWatermark;
			}

			public String getSceneName() {
				return this.sceneName;
			}

			public void setSceneName(String sceneName) {
				this.sceneName = sceneName;
			}

			public DesensPlan getDesensPlan() {
				return this.desensPlan;
			}

			public void setDesensPlan(DesensPlan desensPlan) {
				this.desensPlan = desensPlan;
			}

			public static class DesensPlan {

				private String desensPlanType;

				private Map<Object,Object> extParam;

				public String getDesensPlanType() {
					return this.desensPlanType;
				}

				public void setDesensPlanType(String desensPlanType) {
					this.desensPlanType = desensPlanType;
				}

				public Map<Object,Object> getExtParam() {
					return this.extParam;
				}

				public void setExtParam(Map<Object,Object> extParam) {
					this.extParam = extParam;
				}
			}
		}
	}

	@Override
	public DsgDesensPlanQueryListResponse getInstance(UnmarshallerContext context) {
		return	DsgDesensPlanQueryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

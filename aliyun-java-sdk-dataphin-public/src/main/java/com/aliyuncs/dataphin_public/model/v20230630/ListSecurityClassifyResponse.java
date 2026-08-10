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
import com.aliyuncs.dataphin_public.transform.v20230630.ListSecurityClassifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityClassifyResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private ClassifyListResult classifyListResult;

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

	public ClassifyListResult getClassifyListResult() {
		return this.classifyListResult;
	}

	public void setClassifyListResult(ClassifyListResult classifyListResult) {
		this.classifyListResult = classifyListResult;
	}

	public static class ClassifyListResult {

		private Integer totalCount;

		private List<ClassifyInfo> classifyList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ClassifyInfo> getClassifyList() {
			return this.classifyList;
		}

		public void setClassifyList(List<ClassifyInfo> classifyList) {
			this.classifyList = classifyList;
		}

		public static class ClassifyInfo {

			private String status;

			private String catalogPath;

			private Boolean isBindDesensitizeRule;

			private String description;

			private Integer priority;

			private String levelName;

			private String shortName;

			private Long id;

			private Long levelId;

			private Integer effectiveFieldCount;

			private String name;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCatalogPath() {
				return this.catalogPath;
			}

			public void setCatalogPath(String catalogPath) {
				this.catalogPath = catalogPath;
			}

			public Boolean getIsBindDesensitizeRule() {
				return this.isBindDesensitizeRule;
			}

			public void setIsBindDesensitizeRule(Boolean isBindDesensitizeRule) {
				this.isBindDesensitizeRule = isBindDesensitizeRule;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getLevelName() {
				return this.levelName;
			}

			public void setLevelName(String levelName) {
				this.levelName = levelName;
			}

			public String getShortName() {
				return this.shortName;
			}

			public void setShortName(String shortName) {
				this.shortName = shortName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getLevelId() {
				return this.levelId;
			}

			public void setLevelId(Long levelId) {
				this.levelId = levelId;
			}

			public Integer getEffectiveFieldCount() {
				return this.effectiveFieldCount;
			}

			public void setEffectiveFieldCount(Integer effectiveFieldCount) {
				this.effectiveFieldCount = effectiveFieldCount;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListSecurityClassifyResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityClassifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListTableLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTableLevelResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private Boolean success;

	private TableLevelInfo tableLevelInfo;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public TableLevelInfo getTableLevelInfo() {
		return this.tableLevelInfo;
	}

	public void setTableLevelInfo(TableLevelInfo tableLevelInfo) {
		this.tableLevelInfo = tableLevelInfo;
	}

	public static class TableLevelInfo {

		private Long totalCount;

		private List<LevelListItem> levelList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<LevelListItem> getLevelList() {
			return this.levelList;
		}

		public void setLevelList(List<LevelListItem> levelList) {
			this.levelList = levelList;
		}

		public static class LevelListItem {

			private Long levelId;

			private String name;

			private Long projectId;

			private Integer levelType;

			private String description;

			public Long getLevelId() {
				return this.levelId;
			}

			public void setLevelId(Long levelId) {
				this.levelId = levelId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Integer getLevelType() {
				return this.levelType;
			}

			public void setLevelType(Integer levelType) {
				this.levelType = levelType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public ListTableLevelResponse getInstance(UnmarshallerContext context) {
		return	ListTableLevelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

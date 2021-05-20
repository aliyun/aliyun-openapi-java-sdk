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
import com.aliyuncs.dataworks_public.transform.v20200518.GetMetaTableThemeLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableThemeLevelResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private Boolean success;

	private Entity entity;

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

	public Entity getEntity() {
		return this.entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public static class Entity {

		private List<ThemeItem> theme;

		private List<LevelItem> level;

		public List<ThemeItem> getTheme() {
			return this.theme;
		}

		public void setTheme(List<ThemeItem> theme) {
			this.theme = theme;
		}

		public List<LevelItem> getLevel() {
			return this.level;
		}

		public void setLevel(List<LevelItem> level) {
			this.level = level;
		}

		public static class ThemeItem {

			private Long themeId;

			private String name;

			private Integer level;

			private Long parentId;

			public Long getThemeId() {
				return this.themeId;
			}

			public void setThemeId(Long themeId) {
				this.themeId = themeId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}
		}

		public static class LevelItem {

			private Long levelId;

			private String name;

			private Integer type;

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

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
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
	public GetMetaTableThemeLevelResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableThemeLevelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

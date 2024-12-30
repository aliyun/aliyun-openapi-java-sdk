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
import com.aliyuncs.dataphin_public.transform.v20230630.GetDirectoryTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDirectoryTreeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<DataItem> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Parent parent;

		private Children children;

		public Parent getParent() {
			return this.parent;
		}

		public void setParent(Parent parent) {
			this.parent = parent;
		}

		public Children getChildren() {
			return this.children;
		}

		public void setChildren(Children children) {
			this.children = children;
		}

		public static class Parent {

			private Long id;

			private String stringId;

			private Long projectId;

			private String categoryType;

			private Long dataCellId;

			private String dirName;

			private String name;

			private String type;

			private String creator;

			private String creatorName;

			private String gmtCreate;

			private String gmtModified;

			private String lastModifier;

			private String lastModifierName;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getStringId() {
				return this.stringId;
			}

			public void setStringId(String stringId) {
				this.stringId = stringId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getCategoryType() {
				return this.categoryType;
			}

			public void setCategoryType(String categoryType) {
				this.categoryType = categoryType;
			}

			public Long getDataCellId() {
				return this.dataCellId;
			}

			public void setDataCellId(Long dataCellId) {
				this.dataCellId = dataCellId;
			}

			public String getDirName() {
				return this.dirName;
			}

			public void setDirName(String dirName) {
				this.dirName = dirName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
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

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getLastModifierName() {
				return this.lastModifierName;
			}

			public void setLastModifierName(String lastModifierName) {
				this.lastModifierName = lastModifierName;
			}
		}

		public static class Children {

			private Long id;

			private String stringId;

			private Long projectId;

			private String categoryType;

			private Long dataCellId;

			private String dirName;

			private String name;

			private String type;

			private String creator;

			private String creatorName;

			private String gmtCreate;

			private String gmtModified;

			private String lastModifier;

			private String lastModifierName;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getStringId() {
				return this.stringId;
			}

			public void setStringId(String stringId) {
				this.stringId = stringId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getCategoryType() {
				return this.categoryType;
			}

			public void setCategoryType(String categoryType) {
				this.categoryType = categoryType;
			}

			public Long getDataCellId() {
				return this.dataCellId;
			}

			public void setDataCellId(Long dataCellId) {
				this.dataCellId = dataCellId;
			}

			public String getDirName() {
				return this.dirName;
			}

			public void setDirName(String dirName) {
				this.dirName = dirName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
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

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getLastModifierName() {
				return this.lastModifierName;
			}

			public void setLastModifierName(String lastModifierName) {
				this.lastModifierName = lastModifierName;
			}
		}
	}

	@Override
	public GetDirectoryTreeResponse getInstance(UnmarshallerContext context) {
		return	GetDirectoryTreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

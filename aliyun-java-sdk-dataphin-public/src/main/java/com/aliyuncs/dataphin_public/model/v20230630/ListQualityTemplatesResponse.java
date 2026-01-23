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
import com.aliyuncs.dataphin_public.transform.v20230630.ListQualityTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityTemplatesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<QualityTemplate> qualityTemplateList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<QualityTemplate> getQualityTemplateList() {
			return this.qualityTemplateList;
		}

		public void setQualityTemplateList(List<QualityTemplate> qualityTemplateList) {
			this.qualityTemplateList = qualityTemplateList;
		}

		public static class QualityTemplate {

			private Long id;

			private String name;

			private String type;

			private String typeName;

			private String description;

			private String owner;

			private String ownerName;

			private String catalog;

			private String catalogName;

			private Boolean supportAllDataSourceType;

			private Boolean isSystemTemplate;

			private String creator;

			private String creatorName;

			private String createTime;

			private String modifyTime;

			private String modifier;

			private String modifierName;

			private List<FormProperty> formPropertyList;

			private List<String> supportDataSourceTypeList;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public String getTypeName() {
				return this.typeName;
			}

			public void setTypeName(String typeName) {
				this.typeName = typeName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getCatalog() {
				return this.catalog;
			}

			public void setCatalog(String catalog) {
				this.catalog = catalog;
			}

			public String getCatalogName() {
				return this.catalogName;
			}

			public void setCatalogName(String catalogName) {
				this.catalogName = catalogName;
			}

			public Boolean getSupportAllDataSourceType() {
				return this.supportAllDataSourceType;
			}

			public void setSupportAllDataSourceType(Boolean supportAllDataSourceType) {
				this.supportAllDataSourceType = supportAllDataSourceType;
			}

			public Boolean getIsSystemTemplate() {
				return this.isSystemTemplate;
			}

			public void setIsSystemTemplate(Boolean isSystemTemplate) {
				this.isSystemTemplate = isSystemTemplate;
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

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getModifierName() {
				return this.modifierName;
			}

			public void setModifierName(String modifierName) {
				this.modifierName = modifierName;
			}

			public List<FormProperty> getFormPropertyList() {
				return this.formPropertyList;
			}

			public void setFormPropertyList(List<FormProperty> formPropertyList) {
				this.formPropertyList = formPropertyList;
			}

			public List<String> getSupportDataSourceTypeList() {
				return this.supportDataSourceTypeList;
			}

			public void setSupportDataSourceTypeList(List<String> supportDataSourceTypeList) {
				this.supportDataSourceTypeList = supportDataSourceTypeList;
			}

			public static class FormProperty {

				private String componentType;

				private String name;

				private String value;

				public String getComponentType() {
					return this.componentType;
				}

				public void setComponentType(String componentType) {
					this.componentType = componentType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListQualityTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListQualityTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

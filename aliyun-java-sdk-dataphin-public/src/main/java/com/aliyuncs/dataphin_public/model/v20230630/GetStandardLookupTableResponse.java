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
import com.aliyuncs.dataphin_public.transform.v20230630.GetStandardLookupTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStandardLookupTableResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private LookupTableInfo lookupTableInfo;

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

	public LookupTableInfo getLookupTableInfo() {
		return this.lookupTableInfo;
	}

	public void setLookupTableInfo(LookupTableInfo lookupTableInfo) {
		this.lookupTableInfo = lookupTableInfo;
	}

	public static class LookupTableInfo {

		private Long id;

		private String name;

		private String code;

		private String description;

		private String creator;

		private String creatorName;

		private String lastModifier;

		private String lastModifierName;

		private String owner;

		private String ownerName;

		private String createTime;

		private String modifyTime;

		private List<LookupTableValue> lookupTableValueList;

		private DirectoryReference directoryReference;

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

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public List<LookupTableValue> getLookupTableValueList() {
			return this.lookupTableValueList;
		}

		public void setLookupTableValueList(List<LookupTableValue> lookupTableValueList) {
			this.lookupTableValueList = lookupTableValueList;
		}

		public DirectoryReference getDirectoryReference() {
			return this.directoryReference;
		}

		public void setDirectoryReference(DirectoryReference directoryReference) {
			this.directoryReference = directoryReference;
		}

		public static class LookupTableValue {

			private String value;

			private String name;

			private String englishName;

			private String description;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getEnglishName() {
				return this.englishName;
			}

			public void setEnglishName(String englishName) {
				this.englishName = englishName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class DirectoryReference {

			private String directory;

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}
	}

	@Override
	public GetStandardLookupTableResponse getInstance(UnmarshallerContext context) {
		return	GetStandardLookupTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

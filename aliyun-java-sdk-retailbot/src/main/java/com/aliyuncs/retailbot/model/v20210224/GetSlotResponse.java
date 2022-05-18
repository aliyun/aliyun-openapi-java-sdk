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

package com.aliyuncs.retailbot.model.v20210224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.GetSlotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSlotResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer id;

		private String alias;

		private Integer categoryId;

		private String categoryName;

		private Integer source;

		private String sourceName;

		private Integer type;

		private String typeName;

		private String description;

		private Integer ownStatus;

		private List<SimilarEntryListItem> similarEntryList;

		private List<BlackEntryListItem> blackEntryList;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public Integer getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Integer getSource() {
			return this.source;
		}

		public void setSource(Integer source) {
			this.source = source;
		}

		public String getSourceName() {
			return this.sourceName;
		}

		public void setSourceName(String sourceName) {
			this.sourceName = sourceName;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
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

		public Integer getOwnStatus() {
			return this.ownStatus;
		}

		public void setOwnStatus(Integer ownStatus) {
			this.ownStatus = ownStatus;
		}

		public List<SimilarEntryListItem> getSimilarEntryList() {
			return this.similarEntryList;
		}

		public void setSimilarEntryList(List<SimilarEntryListItem> similarEntryList) {
			this.similarEntryList = similarEntryList;
		}

		public List<BlackEntryListItem> getBlackEntryList() {
			return this.blackEntryList;
		}

		public void setBlackEntryList(List<BlackEntryListItem> blackEntryList) {
			this.blackEntryList = blackEntryList;
		}

		public static class SimilarEntryListItem {

			private List<SimilarEntrie> similarEntries;

			private CoreEntry coreEntry;

			public List<SimilarEntrie> getSimilarEntries() {
				return this.similarEntries;
			}

			public void setSimilarEntries(List<SimilarEntrie> similarEntries) {
				this.similarEntries = similarEntries;
			}

			public CoreEntry getCoreEntry() {
				return this.coreEntry;
			}

			public void setCoreEntry(CoreEntry coreEntry) {
				this.coreEntry = coreEntry;
			}

			public static class SimilarEntrie {

				private Integer id;

				private Integer slotId;

				private String value;

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}

				public Integer getSlotId() {
					return this.slotId;
				}

				public void setSlotId(Integer slotId) {
					this.slotId = slotId;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class CoreEntry {

				private Integer id;

				private Integer slotId;

				private String value;

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}

				public Integer getSlotId() {
					return this.slotId;
				}

				public void setSlotId(Integer slotId) {
					this.slotId = slotId;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class BlackEntryListItem {

			private Integer id;

			private Integer slotId;

			private String value;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getSlotId() {
				return this.slotId;
			}

			public void setSlotId(Integer slotId) {
				this.slotId = slotId;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetSlotResponse getInstance(UnmarshallerContext context) {
		return	GetSlotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

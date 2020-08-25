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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListClriskProductScenesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClriskProductScenesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageCount;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<SceneInfosItem> sceneInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SceneInfosItem> getSceneInfos() {
		return this.sceneInfos;
	}

	public void setSceneInfos(List<SceneInfosItem> sceneInfos) {
		this.sceneInfos = sceneInfos;
	}

	public static class SceneInfosItem {

		private String description;

		private Long id;

		private String modifyUser;

		private String name;

		private Long parentId;

		private Long relatedNodeCount;

		private List<SonSceneInfosItem> sonSceneInfos;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Long getRelatedNodeCount() {
			return this.relatedNodeCount;
		}

		public void setRelatedNodeCount(Long relatedNodeCount) {
			this.relatedNodeCount = relatedNodeCount;
		}

		public List<SonSceneInfosItem> getSonSceneInfos() {
			return this.sonSceneInfos;
		}

		public void setSonSceneInfos(List<SonSceneInfosItem> sonSceneInfos) {
			this.sonSceneInfos = sonSceneInfos;
		}

		public static class SonSceneInfosItem {

			private String description;

			private Long id;

			private String modifyUser;

			private String name;

			private Long parentId;

			private Long relatedNodeCount;

			private List<LeafSceneInfosItem> leafSceneInfos;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getModifyUser() {
				return this.modifyUser;
			}

			public void setModifyUser(String modifyUser) {
				this.modifyUser = modifyUser;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public Long getRelatedNodeCount() {
				return this.relatedNodeCount;
			}

			public void setRelatedNodeCount(Long relatedNodeCount) {
				this.relatedNodeCount = relatedNodeCount;
			}

			public List<LeafSceneInfosItem> getLeafSceneInfos() {
				return this.leafSceneInfos;
			}

			public void setLeafSceneInfos(List<LeafSceneInfosItem> leafSceneInfos) {
				this.leafSceneInfos = leafSceneInfos;
			}

			public static class LeafSceneInfosItem {

				private String description;

				private Long id;

				private String modifyUser;

				private String name;

				private Long parentId;

				private Long relatedNodeCount;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getModifyUser() {
					return this.modifyUser;
				}

				public void setModifyUser(String modifyUser) {
					this.modifyUser = modifyUser;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getParentId() {
					return this.parentId;
				}

				public void setParentId(Long parentId) {
					this.parentId = parentId;
				}

				public Long getRelatedNodeCount() {
					return this.relatedNodeCount;
				}

				public void setRelatedNodeCount(Long relatedNodeCount) {
					this.relatedNodeCount = relatedNodeCount;
				}
			}
		}
	}

	@Override
	public ListClriskProductScenesResponse getInstance(UnmarshallerContext context) {
		return	ListClriskProductScenesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

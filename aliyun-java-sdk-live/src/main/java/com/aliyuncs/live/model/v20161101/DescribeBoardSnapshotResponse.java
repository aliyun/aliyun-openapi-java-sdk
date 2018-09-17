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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeBoardSnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBoardSnapshotResponse extends AcsResponse {

	private String requestId;

	private Snapshot snapshot;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Snapshot getSnapshot() {
		return this.snapshot;
	}

	public void setSnapshot(Snapshot snapshot) {
		this.snapshot = snapshot;
	}

	public static class Snapshot {

		private Board board;

		public Board getBoard() {
			return this.board;
		}

		public void setBoard(Board board) {
			this.board = board;
		}

		public static class Board {

			private String boardId;

			private String appUid;

			private Long eventTimestamp;

			private Long createTimestamp;

			private Long updateTimestamp;

			private List<Page> pages;

			private List<Config> configs;

			public String getBoardId() {
				return this.boardId;
			}

			public void setBoardId(String boardId) {
				this.boardId = boardId;
			}

			public String getAppUid() {
				return this.appUid;
			}

			public void setAppUid(String appUid) {
				this.appUid = appUid;
			}

			public Long getEventTimestamp() {
				return this.eventTimestamp;
			}

			public void setEventTimestamp(Long eventTimestamp) {
				this.eventTimestamp = eventTimestamp;
			}

			public Long getCreateTimestamp() {
				return this.createTimestamp;
			}

			public void setCreateTimestamp(Long createTimestamp) {
				this.createTimestamp = createTimestamp;
			}

			public Long getUpdateTimestamp() {
				return this.updateTimestamp;
			}

			public void setUpdateTimestamp(Long updateTimestamp) {
				this.updateTimestamp = updateTimestamp;
			}

			public List<Page> getPages() {
				return this.pages;
			}

			public void setPages(List<Page> pages) {
				this.pages = pages;
			}

			public List<Config> getConfigs() {
				return this.configs;
			}

			public void setConfigs(List<Config> configs) {
				this.configs = configs;
			}

			public static class Page {

				private Integer pageIndex;

				private List<Element> elements;

				public Integer getPageIndex() {
					return this.pageIndex;
				}

				public void setPageIndex(Integer pageIndex) {
					this.pageIndex = pageIndex;
				}

				public List<Element> getElements() {
					return this.elements;
				}

				public void setElements(List<Element> elements) {
					this.elements = elements;
				}

				public static class Element {

					private String elementIndex;

					private String ownerId;

					private Integer elementType;

					private Long updateTimestamp;

					private String data;

					public String getElementIndex() {
						return this.elementIndex;
					}

					public void setElementIndex(String elementIndex) {
						this.elementIndex = elementIndex;
					}

					public String getOwnerId() {
						return this.ownerId;
					}

					public void setOwnerId(String ownerId) {
						this.ownerId = ownerId;
					}

					public Integer getElementType() {
						return this.elementType;
					}

					public void setElementType(Integer elementType) {
						this.elementType = elementType;
					}

					public Long getUpdateTimestamp() {
						return this.updateTimestamp;
					}

					public void setUpdateTimestamp(Long updateTimestamp) {
						this.updateTimestamp = updateTimestamp;
					}

					public String getData() {
						return this.data;
					}

					public void setData(String data) {
						this.data = data;
					}
				}
			}

			public static class Config {

				private String appUid;

				private String data;

				public String getAppUid() {
					return this.appUid;
				}

				public void setAppUid(String appUid) {
					this.appUid = appUid;
				}

				public String getData() {
					return this.data;
				}

				public void setData(String data) {
					this.data = data;
				}
			}
		}
	}

	@Override
	public DescribeBoardSnapshotResponse getInstance(UnmarshallerContext context) {
		return	DescribeBoardSnapshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

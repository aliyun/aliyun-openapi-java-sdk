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

package com.aliyuncs.avatar.model.v20220130;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.avatar.transform.v20220130.QueryAvatarListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAvatarListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNo;

		private Integer pageSize;

		private Integer totalPage;

		private List<ListItem> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String code;

			private String name;

			private String image;

			private String portrait;

			private String description;

			private String avatarType;

			private String modelType;

			private String makeStatus;

			private String makeFailReason;

			private String makeStage;

			private SupportedResolutions supportedResolutions;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getPortrait() {
				return this.portrait;
			}

			public void setPortrait(String portrait) {
				this.portrait = portrait;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAvatarType() {
				return this.avatarType;
			}

			public void setAvatarType(String avatarType) {
				this.avatarType = avatarType;
			}

			public String getModelType() {
				return this.modelType;
			}

			public void setModelType(String modelType) {
				this.modelType = modelType;
			}

			public String getMakeStatus() {
				return this.makeStatus;
			}

			public void setMakeStatus(String makeStatus) {
				this.makeStatus = makeStatus;
			}

			public String getMakeFailReason() {
				return this.makeFailReason;
			}

			public void setMakeFailReason(String makeFailReason) {
				this.makeFailReason = makeFailReason;
			}

			public String getMakeStage() {
				return this.makeStage;
			}

			public void setMakeStage(String makeStage) {
				this.makeStage = makeStage;
			}

			public SupportedResolutions getSupportedResolutions() {
				return this.supportedResolutions;
			}

			public void setSupportedResolutions(SupportedResolutions supportedResolutions) {
				this.supportedResolutions = supportedResolutions;
			}

			public static class SupportedResolutions {

				private List<OfflineItem> offline;

				private List<OnlineItem> online;

				public List<OfflineItem> getOffline() {
					return this.offline;
				}

				public void setOffline(List<OfflineItem> offline) {
					this.offline = offline;
				}

				public List<OnlineItem> getOnline() {
					return this.online;
				}

				public void setOnline(List<OnlineItem> online) {
					this.online = online;
				}

				public static class OfflineItem {

					private Integer width;

					private Integer height;

					private String desc;

					public Integer getWidth() {
						return this.width;
					}

					public void setWidth(Integer width) {
						this.width = width;
					}

					public Integer getHeight() {
						return this.height;
					}

					public void setHeight(Integer height) {
						this.height = height;
					}

					public String getDesc() {
						return this.desc;
					}

					public void setDesc(String desc) {
						this.desc = desc;
					}
				}

				public static class OnlineItem {

					private Integer width;

					private Integer height;

					private String desc;

					public Integer getWidth() {
						return this.width;
					}

					public void setWidth(Integer width) {
						this.width = width;
					}

					public Integer getHeight() {
						return this.height;
					}

					public void setHeight(Integer height) {
						this.height = height;
					}

					public String getDesc() {
						return this.desc;
					}

					public void setDesc(String desc) {
						this.desc = desc;
					}
				}
			}
		}
	}

	@Override
	public QueryAvatarListResponse getInstance(UnmarshallerContext context) {
		return	QueryAvatarListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

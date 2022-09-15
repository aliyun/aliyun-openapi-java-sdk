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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeShowListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShowListResponse extends AcsResponse {

	private String showList;

	private String requestId;

	private ShowListInfo showListInfo;

	public String getShowList() {
		return this.showList;
	}

	public void setShowList(String showList) {
		this.showList = showList;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ShowListInfo getShowListInfo() {
		return this.showListInfo;
	}

	public void setShowListInfo(ShowListInfo showListInfo) {
		this.showListInfo = showListInfo;
	}

	public static class ShowListInfo {

		private String highPriorityShowStartTime;

		private Integer totalShowListRepeatTimes;

		private Integer showListRepeatTimes;

		private String currentShowId;

		private String highPriorityShowId;

		private List<Show> showList;

		public String getHighPriorityShowStartTime() {
			return this.highPriorityShowStartTime;
		}

		public void setHighPriorityShowStartTime(String highPriorityShowStartTime) {
			this.highPriorityShowStartTime = highPriorityShowStartTime;
		}

		public Integer getTotalShowListRepeatTimes() {
			return this.totalShowListRepeatTimes;
		}

		public void setTotalShowListRepeatTimes(Integer totalShowListRepeatTimes) {
			this.totalShowListRepeatTimes = totalShowListRepeatTimes;
		}

		public Integer getShowListRepeatTimes() {
			return this.showListRepeatTimes;
		}

		public void setShowListRepeatTimes(Integer showListRepeatTimes) {
			this.showListRepeatTimes = showListRepeatTimes;
		}

		public String getCurrentShowId() {
			return this.currentShowId;
		}

		public void setCurrentShowId(String currentShowId) {
			this.currentShowId = currentShowId;
		}

		public String getHighPriorityShowId() {
			return this.highPriorityShowId;
		}

		public void setHighPriorityShowId(String highPriorityShowId) {
			this.highPriorityShowId = highPriorityShowId;
		}

		public List<Show> getShowList() {
			return this.showList;
		}

		public void setShowList(List<Show> showList) {
			this.showList = showList;
		}

		public static class Show {

			private String showName;

			private Long duration;

			private Integer repeatTimes;

			private String showId;

			private ResourceInfo resourceInfo;

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Integer getRepeatTimes() {
				return this.repeatTimes;
			}

			public void setRepeatTimes(Integer repeatTimes) {
				this.repeatTimes = repeatTimes;
			}

			public String getShowId() {
				return this.showId;
			}

			public void setShowId(String showId) {
				this.showId = showId;
			}

			public ResourceInfo getResourceInfo() {
				return this.resourceInfo;
			}

			public void setResourceInfo(ResourceInfo resourceInfo) {
				this.resourceInfo = resourceInfo;
			}

			public static class ResourceInfo {

				private Integer liveInputType;

				private String resourceUrl;

				private String resourceType;

				private String resourceId;

				public Integer getLiveInputType() {
					return this.liveInputType;
				}

				public void setLiveInputType(Integer liveInputType) {
					this.liveInputType = liveInputType;
				}

				public String getResourceUrl() {
					return this.resourceUrl;
				}

				public void setResourceUrl(String resourceUrl) {
					this.resourceUrl = resourceUrl;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}
			}
		}
	}

	@Override
	public DescribeShowListResponse getInstance(UnmarshallerContext context) {
		return	DescribeShowListResponseUnmarshaller.unmarshall(this, context);
	}
}

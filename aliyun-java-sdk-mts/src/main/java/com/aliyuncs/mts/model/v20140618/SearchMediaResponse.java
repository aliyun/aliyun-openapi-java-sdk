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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.SearchMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchMediaResponse extends AcsResponse {

	private Long totalNum;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<Media> mediaList;

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Media> getMediaList() {
		return this.mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public static class Media {

		private String creationTime;

		private Long cateId;

		private String height;

		private String bitrate;

		private String mediaId;

		private String publishState;

		private String description;

		private String width;

		private String size;

		private String coverURL;

		private String duration;

		private String fps;

		private String title;

		private String format;

		private List<String> tags;

		private List<String> runIdList;

		private File file;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Long getCateId() {
			return this.cateId;
		}

		public void setCateId(Long cateId) {
			this.cateId = cateId;
		}

		public String getHeight() {
			return this.height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getPublishState() {
			return this.publishState;
		}

		public void setPublishState(String publishState) {
			this.publishState = publishState;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public List<String> getRunIdList() {
			return this.runIdList;
		}

		public void setRunIdList(List<String> runIdList) {
			this.runIdList = runIdList;
		}

		public File getFile() {
			return this.file;
		}

		public void setFile(File file) {
			this.file = file;
		}

		public static class File {

			private String state;

			private String uRL;

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}
		}
	}

	@Override
	public SearchMediaResponse getInstance(UnmarshallerContext context) {
		return	SearchMediaResponseUnmarshaller.unmarshall(this, context);
	}
}

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

package com.aliyuncs.eci.model.v20180808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeImageCachesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageCachesResponse extends AcsResponse {

	private String requestId;

	private List<ImageCache> imageCaches;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageCache> getImageCaches() {
		return this.imageCaches;
	}

	public void setImageCaches(List<ImageCache> imageCaches) {
		this.imageCaches = imageCaches;
	}

	public static class ImageCache {

		private String containerGroupId;

		private String imageCacheId;

		private String imageCacheName;

		private String snapshotId;

		private String progress;

		private String status;

		private List<Event> events;

		private List<String> images;

		public String getContainerGroupId() {
			return this.containerGroupId;
		}

		public void setContainerGroupId(String containerGroupId) {
			this.containerGroupId = containerGroupId;
		}

		public String getImageCacheId() {
			return this.imageCacheId;
		}

		public void setImageCacheId(String imageCacheId) {
			this.imageCacheId = imageCacheId;
		}

		public String getImageCacheName() {
			return this.imageCacheName;
		}

		public void setImageCacheName(String imageCacheName) {
			this.imageCacheName = imageCacheName;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Event> getEvents() {
			return this.events;
		}

		public void setEvents(List<Event> events) {
			this.events = events;
		}

		public List<String> getImages() {
			return this.images;
		}

		public void setImages(List<String> images) {
			this.images = images;
		}

		public static class Event {

			private Integer count;

			private String type;

			private String name;

			private String message;

			private String firstTimestamp;

			private String lastTimestamp;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getFirstTimestamp() {
				return this.firstTimestamp;
			}

			public void setFirstTimestamp(String firstTimestamp) {
				this.firstTimestamp = firstTimestamp;
			}

			public String getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(String lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}
		}
	}

	@Override
	public DescribeImageCachesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageCachesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

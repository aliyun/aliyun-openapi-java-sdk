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
import com.aliyuncs.live.transform.v20161101.DescribeCasterVideoResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterVideoResourcesResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<VideoResource> videoResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<VideoResource> getVideoResources() {
		return this.videoResources;
	}

	public void setVideoResources(List<VideoResource> videoResources) {
		this.videoResources = videoResources;
	}

	public static class VideoResource {

		private String materialId;

		private String resourceId;

		private String resourceName;

		private String locationId;

		private String liveStreamUrl;

		private String flvUrl;

		private Integer repeatNum;

		private String vodUrl;

		private Integer beginOffset;

		private Integer endOffset;

		private Integer ptsCallbackInterval;

		public String getMaterialId() {
			return this.materialId;
		}

		public void setMaterialId(String materialId) {
			this.materialId = materialId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getLocationId() {
			return this.locationId;
		}

		public void setLocationId(String locationId) {
			this.locationId = locationId;
		}

		public String getLiveStreamUrl() {
			return this.liveStreamUrl;
		}

		public void setLiveStreamUrl(String liveStreamUrl) {
			this.liveStreamUrl = liveStreamUrl;
		}

		public String getFlvUrl() {
			return this.flvUrl;
		}

		public void setFlvUrl(String flvUrl) {
			this.flvUrl = flvUrl;
		}

		public Integer getRepeatNum() {
			return this.repeatNum;
		}

		public void setRepeatNum(Integer repeatNum) {
			this.repeatNum = repeatNum;
		}

		public String getVodUrl() {
			return this.vodUrl;
		}

		public void setVodUrl(String vodUrl) {
			this.vodUrl = vodUrl;
		}

		public Integer getBeginOffset() {
			return this.beginOffset;
		}

		public void setBeginOffset(Integer beginOffset) {
			this.beginOffset = beginOffset;
		}

		public Integer getEndOffset() {
			return this.endOffset;
		}

		public void setEndOffset(Integer endOffset) {
			this.endOffset = endOffset;
		}

		public Integer getPtsCallbackInterval() {
			return this.ptsCallbackInterval;
		}

		public void setPtsCallbackInterval(Integer ptsCallbackInterval) {
			this.ptsCallbackInterval = ptsCallbackInterval;
		}
	}

	@Override
	public DescribeCasterVideoResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterVideoResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}

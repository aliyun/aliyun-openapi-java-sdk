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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribePlayTopVideosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlayTopVideosResponse extends AcsResponse {

	private String requestId;

	private Long pageNo;

	private Long pageSize;

	private Long totalNum;

	private List<TopPlayVideoStatis> topPlayVideos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public List<TopPlayVideoStatis> getTopPlayVideos() {
		return this.topPlayVideos;
	}

	public void setTopPlayVideos(List<TopPlayVideoStatis> topPlayVideos) {
		this.topPlayVideos = topPlayVideos;
	}

	public static class TopPlayVideoStatis {

		private String playDuration;

		private String vV;

		private String uV;

		private String videoId;

		private String title;

		public String getPlayDuration() {
			return this.playDuration;
		}

		public void setPlayDuration(String playDuration) {
			this.playDuration = playDuration;
		}

		public String getVV() {
			return this.vV;
		}

		public void setVV(String vV) {
			this.vV = vV;
		}

		public String getUV() {
			return this.uV;
		}

		public void setUV(String uV) {
			this.uV = uV;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	@Override
	public DescribePlayTopVideosResponse getInstance(UnmarshallerContext context) {
		return	DescribePlayTopVideosResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.vod.transform.v20170321.DescribeVodMediaPlayDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodMediaPlayDataResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNo;

	private Long pageSize;

	private List<Data> qoeInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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

	public List<Data> getQoeInfoList() {
		return this.qoeInfoList;
	}

	public void setQoeInfoList(List<Data> qoeInfoList) {
		this.qoeInfoList = qoeInfoList;
	}

	public static class Data {

		private Float videoTitle;

		private Float videoDuration;

		private String mediaId;

		private Float dAU;

		private Float playSuccessVv;

		private Float playDurationPerUv;

		private Float playDuration;

		private Float playPerVv;

		public Float getVideoTitle() {
			return this.videoTitle;
		}

		public void setVideoTitle(Float videoTitle) {
			this.videoTitle = videoTitle;
		}

		public Float getVideoDuration() {
			return this.videoDuration;
		}

		public void setVideoDuration(Float videoDuration) {
			this.videoDuration = videoDuration;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public Float getDAU() {
			return this.dAU;
		}

		public void setDAU(Float dAU) {
			this.dAU = dAU;
		}

		public Float getPlaySuccessVv() {
			return this.playSuccessVv;
		}

		public void setPlaySuccessVv(Float playSuccessVv) {
			this.playSuccessVv = playSuccessVv;
		}

		public Float getPlayDurationPerUv() {
			return this.playDurationPerUv;
		}

		public void setPlayDurationPerUv(Float playDurationPerUv) {
			this.playDurationPerUv = playDurationPerUv;
		}

		public Float getPlayDuration() {
			return this.playDuration;
		}

		public void setPlayDuration(Float playDuration) {
			this.playDuration = playDuration;
		}

		public Float getPlayPerVv() {
			return this.playPerVv;
		}

		public void setPlayPerVv(Float playPerVv) {
			this.playPerVv = playPerVv;
		}
	}

	@Override
	public DescribeVodMediaPlayDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodMediaPlayDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

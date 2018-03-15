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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamOnlineBpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamOnlineBpsResponse extends AcsResponse {

	private String requestId;

	private Long totalUserNumber;

	private Float flvBps;

	private Float hlsBps;

	private List<LiveStreamOnlineBpsInfo> liveStreamOnlineBpsInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalUserNumber() {
		return this.totalUserNumber;
	}

	public void setTotalUserNumber(Long totalUserNumber) {
		this.totalUserNumber = totalUserNumber;
	}

	public Float getFlvBps() {
		return this.flvBps;
	}

	public void setFlvBps(Float flvBps) {
		this.flvBps = flvBps;
	}

	public Float getHlsBps() {
		return this.hlsBps;
	}

	public void setHlsBps(Float hlsBps) {
		this.hlsBps = hlsBps;
	}

	public List<LiveStreamOnlineBpsInfo> getLiveStreamOnlineBpsInfos() {
		return this.liveStreamOnlineBpsInfos;
	}

	public void setLiveStreamOnlineBpsInfos(List<LiveStreamOnlineBpsInfo> liveStreamOnlineBpsInfos) {
		this.liveStreamOnlineBpsInfos = liveStreamOnlineBpsInfos;
	}

	public static class LiveStreamOnlineBpsInfo {

		private String streamUrl;

		private Float upBps;

		private Float downBps;

		private String time;

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public Float getUpBps() {
			return this.upBps;
		}

		public void setUpBps(Float upBps) {
			this.upBps = upBps;
		}

		public Float getDownBps() {
			return this.downBps;
		}

		public void setDownBps(Float downBps) {
			this.downBps = downBps;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public DescribeLiveStreamOnlineBpsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamOnlineBpsResponseUnmarshaller.unmarshall(this, context);
	}
}

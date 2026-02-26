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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamMetricDetailDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamMetricDetailDataResponse extends AcsResponse {

	private String domainName;

	private String endTime;

	private String nextPageToken;

	private Integer pageSize;

	private String requestId;

	private String startTime;

	private List<StreamData> streamDetailData;

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<StreamData> getStreamDetailData() {
		return this.streamDetailData;
	}

	public void setStreamDetailData(List<StreamData> streamDetailData) {
		this.streamDetailData = streamDetailData;
	}

	public static class StreamData {

		private String appName;

		private Float bps;

		private Long count;

		private Float flvBps;

		private Long flvCount;

		private Long flvTraffic;

		private Float hlsBps;

		private Long hlsCount;

		private Long hlsTraffic;

		private String newConns;

		private Float p2pBps;

		private Long p2pCount;

		private Long p2pTraffic;

		private Float rtmpBps;

		private Long rtmpCount;

		private Long rtmpTraffic;

		private Float rtsBps;

		private Long rtsCount;

		private Long rtsTraffic;

		private String streamName;

		private String timeStamp;

		private Long traffic;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Float getBps() {
			return this.bps;
		}

		public void setBps(Float bps) {
			this.bps = bps;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Float getFlvBps() {
			return this.flvBps;
		}

		public void setFlvBps(Float flvBps) {
			this.flvBps = flvBps;
		}

		public Long getFlvCount() {
			return this.flvCount;
		}

		public void setFlvCount(Long flvCount) {
			this.flvCount = flvCount;
		}

		public Long getFlvTraffic() {
			return this.flvTraffic;
		}

		public void setFlvTraffic(Long flvTraffic) {
			this.flvTraffic = flvTraffic;
		}

		public Float getHlsBps() {
			return this.hlsBps;
		}

		public void setHlsBps(Float hlsBps) {
			this.hlsBps = hlsBps;
		}

		public Long getHlsCount() {
			return this.hlsCount;
		}

		public void setHlsCount(Long hlsCount) {
			this.hlsCount = hlsCount;
		}

		public Long getHlsTraffic() {
			return this.hlsTraffic;
		}

		public void setHlsTraffic(Long hlsTraffic) {
			this.hlsTraffic = hlsTraffic;
		}

		public String getNewConns() {
			return this.newConns;
		}

		public void setNewConns(String newConns) {
			this.newConns = newConns;
		}

		public Float getP2pBps() {
			return this.p2pBps;
		}

		public void setP2pBps(Float p2pBps) {
			this.p2pBps = p2pBps;
		}

		public Long getP2pCount() {
			return this.p2pCount;
		}

		public void setP2pCount(Long p2pCount) {
			this.p2pCount = p2pCount;
		}

		public Long getP2pTraffic() {
			return this.p2pTraffic;
		}

		public void setP2pTraffic(Long p2pTraffic) {
			this.p2pTraffic = p2pTraffic;
		}

		public Float getRtmpBps() {
			return this.rtmpBps;
		}

		public void setRtmpBps(Float rtmpBps) {
			this.rtmpBps = rtmpBps;
		}

		public Long getRtmpCount() {
			return this.rtmpCount;
		}

		public void setRtmpCount(Long rtmpCount) {
			this.rtmpCount = rtmpCount;
		}

		public Long getRtmpTraffic() {
			return this.rtmpTraffic;
		}

		public void setRtmpTraffic(Long rtmpTraffic) {
			this.rtmpTraffic = rtmpTraffic;
		}

		public Float getRtsBps() {
			return this.rtsBps;
		}

		public void setRtsBps(Float rtsBps) {
			this.rtsBps = rtsBps;
		}

		public Long getRtsCount() {
			return this.rtsCount;
		}

		public void setRtsCount(Long rtsCount) {
			this.rtsCount = rtsCount;
		}

		public Long getRtsTraffic() {
			return this.rtsTraffic;
		}

		public void setRtsTraffic(Long rtsTraffic) {
			this.rtsTraffic = rtsTraffic;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getTraffic() {
			return this.traffic;
		}

		public void setTraffic(Long traffic) {
			this.traffic = traffic;
		}
	}

	@Override
	public DescribeLiveStreamMetricDetailDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamMetricDetailDataResponseUnmarshaller.unmarshall(this, context);
	}
}

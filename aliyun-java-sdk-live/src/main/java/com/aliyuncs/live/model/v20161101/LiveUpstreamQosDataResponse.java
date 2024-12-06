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
import com.aliyuncs.live.transform.v20161101.LiveUpstreamQosDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LiveUpstreamQosDataResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private List<DataItem> data;

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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String cdnDomain;

		private String upstreamDomain;

		private String kwaiSidc;

		private Long kwaiTsc;

		private String cdnIsp;

		private String cdnProvince;

		private String cdnOcid;

		private List<DetailDataItem> detailData;

		public String getCdnDomain() {
			return this.cdnDomain;
		}

		public void setCdnDomain(String cdnDomain) {
			this.cdnDomain = cdnDomain;
		}

		public String getUpstreamDomain() {
			return this.upstreamDomain;
		}

		public void setUpstreamDomain(String upstreamDomain) {
			this.upstreamDomain = upstreamDomain;
		}

		public String getKwaiSidc() {
			return this.kwaiSidc;
		}

		public void setKwaiSidc(String kwaiSidc) {
			this.kwaiSidc = kwaiSidc;
		}

		public Long getKwaiTsc() {
			return this.kwaiTsc;
		}

		public void setKwaiTsc(Long kwaiTsc) {
			this.kwaiTsc = kwaiTsc;
		}

		public String getCdnIsp() {
			return this.cdnIsp;
		}

		public void setCdnIsp(String cdnIsp) {
			this.cdnIsp = cdnIsp;
		}

		public String getCdnProvince() {
			return this.cdnProvince;
		}

		public void setCdnProvince(String cdnProvince) {
			this.cdnProvince = cdnProvince;
		}

		public String getCdnOcid() {
			return this.cdnOcid;
		}

		public void setCdnOcid(String cdnOcid) {
			this.cdnOcid = cdnOcid;
		}

		public List<DetailDataItem> getDetailData() {
			return this.detailData;
		}

		public void setDetailData(List<DetailDataItem> detailData) {
			this.detailData = detailData;
		}

		public static class DetailDataItem {

			private String timestamp;

			private Long connectDur;

			private Long firstDataDur;

			private Long firstFrameDur;

			private Long connectFailedCount;

			private Long firstDataFailedCount;

			private Long statusCode5Xx;

			private Long statusCode4Xx;

			private Long statusCode3Xx;

			private Long statusCode2Xx;

			private Long firstFrameSuccessCount;

			private Long count;

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public Long getConnectDur() {
				return this.connectDur;
			}

			public void setConnectDur(Long connectDur) {
				this.connectDur = connectDur;
			}

			public Long getFirstDataDur() {
				return this.firstDataDur;
			}

			public void setFirstDataDur(Long firstDataDur) {
				this.firstDataDur = firstDataDur;
			}

			public Long getFirstFrameDur() {
				return this.firstFrameDur;
			}

			public void setFirstFrameDur(Long firstFrameDur) {
				this.firstFrameDur = firstFrameDur;
			}

			public Long getConnectFailedCount() {
				return this.connectFailedCount;
			}

			public void setConnectFailedCount(Long connectFailedCount) {
				this.connectFailedCount = connectFailedCount;
			}

			public Long getFirstDataFailedCount() {
				return this.firstDataFailedCount;
			}

			public void setFirstDataFailedCount(Long firstDataFailedCount) {
				this.firstDataFailedCount = firstDataFailedCount;
			}

			public Long getStatusCode5Xx() {
				return this.statusCode5Xx;
			}

			public void setStatusCode5Xx(Long statusCode5Xx) {
				this.statusCode5Xx = statusCode5Xx;
			}

			public Long getStatusCode4Xx() {
				return this.statusCode4Xx;
			}

			public void setStatusCode4Xx(Long statusCode4Xx) {
				this.statusCode4Xx = statusCode4Xx;
			}

			public Long getStatusCode3Xx() {
				return this.statusCode3Xx;
			}

			public void setStatusCode3Xx(Long statusCode3Xx) {
				this.statusCode3Xx = statusCode3Xx;
			}

			public Long getStatusCode2Xx() {
				return this.statusCode2Xx;
			}

			public void setStatusCode2Xx(Long statusCode2Xx) {
				this.statusCode2Xx = statusCode2Xx;
			}

			public Long getFirstFrameSuccessCount() {
				return this.firstFrameSuccessCount;
			}

			public void setFirstFrameSuccessCount(Long firstFrameSuccessCount) {
				this.firstFrameSuccessCount = firstFrameSuccessCount;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}
	}

	@Override
	public LiveUpstreamQosDataResponse getInstance(UnmarshallerContext context) {
		return	LiveUpstreamQosDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.vod.transform.v20170321.DescribeVodPlayerMetricDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodPlayerMetricDataResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCnt;

	private List<Datds> dataList;

	private Extend extend;

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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Long totalCnt) {
		this.totalCnt = totalCnt;
	}

	public List<Datds> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Datds> dataList) {
		this.dataList = dataList;
	}

	public Extend getExtend() {
		return this.extend;
	}

	public void setExtend(Extend extend) {
		this.extend = extend;
	}

	public static class Datds {

		private String timeStamp;

		private String dimension;

		private Double uv;

		private Double vv;

		private Double realVv;

		private Double firstFrame;

		private Double secondPlayRate;

		private Double slowPlayRate;

		private Double stuckCountRate;

		private Double seekDuration;

		private Double stuckDuration100s;

		private Double playFailRate;

		private Double seedFailRate;

		private Double avgPlayBitrate;

		private Double avgStartBitrate;

		private Double errorCount100s;

		private Double avgPerVv;

		private Double avgVideoDuration;

		private Double avgPerPlayDuration;

		private Double avgPerCompletionVv;

		private Double completionVv;

		private Double completionRate;

		private Double avgPlayDuration;

		private Double jumpRate5s;

		private Double totalPlayDuration;

		private String stuckCount100s;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public Double getUv() {
			return this.uv;
		}

		public void setUv(Double uv) {
			this.uv = uv;
		}

		public Double getVv() {
			return this.vv;
		}

		public void setVv(Double vv) {
			this.vv = vv;
		}

		public Double getRealVv() {
			return this.realVv;
		}

		public void setRealVv(Double realVv) {
			this.realVv = realVv;
		}

		public Double getFirstFrame() {
			return this.firstFrame;
		}

		public void setFirstFrame(Double firstFrame) {
			this.firstFrame = firstFrame;
		}

		public Double getSecondPlayRate() {
			return this.secondPlayRate;
		}

		public void setSecondPlayRate(Double secondPlayRate) {
			this.secondPlayRate = secondPlayRate;
		}

		public Double getSlowPlayRate() {
			return this.slowPlayRate;
		}

		public void setSlowPlayRate(Double slowPlayRate) {
			this.slowPlayRate = slowPlayRate;
		}

		public Double getStuckCountRate() {
			return this.stuckCountRate;
		}

		public void setStuckCountRate(Double stuckCountRate) {
			this.stuckCountRate = stuckCountRate;
		}

		public Double getSeekDuration() {
			return this.seekDuration;
		}

		public void setSeekDuration(Double seekDuration) {
			this.seekDuration = seekDuration;
		}

		public Double getStuckDuration100s() {
			return this.stuckDuration100s;
		}

		public void setStuckDuration100s(Double stuckDuration100s) {
			this.stuckDuration100s = stuckDuration100s;
		}

		public Double getPlayFailRate() {
			return this.playFailRate;
		}

		public void setPlayFailRate(Double playFailRate) {
			this.playFailRate = playFailRate;
		}

		public Double getSeedFailRate() {
			return this.seedFailRate;
		}

		public void setSeedFailRate(Double seedFailRate) {
			this.seedFailRate = seedFailRate;
		}

		public Double getAvgPlayBitrate() {
			return this.avgPlayBitrate;
		}

		public void setAvgPlayBitrate(Double avgPlayBitrate) {
			this.avgPlayBitrate = avgPlayBitrate;
		}

		public Double getAvgStartBitrate() {
			return this.avgStartBitrate;
		}

		public void setAvgStartBitrate(Double avgStartBitrate) {
			this.avgStartBitrate = avgStartBitrate;
		}

		public Double getErrorCount100s() {
			return this.errorCount100s;
		}

		public void setErrorCount100s(Double errorCount100s) {
			this.errorCount100s = errorCount100s;
		}

		public Double getAvgPerVv() {
			return this.avgPerVv;
		}

		public void setAvgPerVv(Double avgPerVv) {
			this.avgPerVv = avgPerVv;
		}

		public Double getAvgVideoDuration() {
			return this.avgVideoDuration;
		}

		public void setAvgVideoDuration(Double avgVideoDuration) {
			this.avgVideoDuration = avgVideoDuration;
		}

		public Double getAvgPerPlayDuration() {
			return this.avgPerPlayDuration;
		}

		public void setAvgPerPlayDuration(Double avgPerPlayDuration) {
			this.avgPerPlayDuration = avgPerPlayDuration;
		}

		public Double getAvgPerCompletionVv() {
			return this.avgPerCompletionVv;
		}

		public void setAvgPerCompletionVv(Double avgPerCompletionVv) {
			this.avgPerCompletionVv = avgPerCompletionVv;
		}

		public Double getCompletionVv() {
			return this.completionVv;
		}

		public void setCompletionVv(Double completionVv) {
			this.completionVv = completionVv;
		}

		public Double getCompletionRate() {
			return this.completionRate;
		}

		public void setCompletionRate(Double completionRate) {
			this.completionRate = completionRate;
		}

		public Double getAvgPlayDuration() {
			return this.avgPlayDuration;
		}

		public void setAvgPlayDuration(Double avgPlayDuration) {
			this.avgPlayDuration = avgPlayDuration;
		}

		public Double getJumpRate5s() {
			return this.jumpRate5s;
		}

		public void setJumpRate5s(Double jumpRate5s) {
			this.jumpRate5s = jumpRate5s;
		}

		public Double getTotalPlayDuration() {
			return this.totalPlayDuration;
		}

		public void setTotalPlayDuration(Double totalPlayDuration) {
			this.totalPlayDuration = totalPlayDuration;
		}

		public String getStuckCount100s() {
			return this.stuckCount100s;
		}

		public void setStuckCount100s(String stuckCount100s) {
			this.stuckCount100s = stuckCount100s;
		}
	}

	public static class Extend {

		private String actualStartTime;

		private String actualEndTime;

		private Long intervalSeconds;

		public String getActualStartTime() {
			return this.actualStartTime;
		}

		public void setActualStartTime(String actualStartTime) {
			this.actualStartTime = actualStartTime;
		}

		public String getActualEndTime() {
			return this.actualEndTime;
		}

		public void setActualEndTime(String actualEndTime) {
			this.actualEndTime = actualEndTime;
		}

		public Long getIntervalSeconds() {
			return this.intervalSeconds;
		}

		public void setIntervalSeconds(Long intervalSeconds) {
			this.intervalSeconds = intervalSeconds;
		}
	}

	@Override
	public DescribeVodPlayerMetricDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodPlayerMetricDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

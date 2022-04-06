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
import com.aliyuncs.live.transform.v20161101.DescribeLiveRecordConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveRecordConfigResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private String order;

	private Integer totalPage;

	private Integer pageSize;

	private Integer totalNum;

	private List<LiveAppRecord> liveAppRecordList;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<LiveAppRecord> getLiveAppRecordList() {
		return this.liveAppRecordList;
	}

	public void setLiveAppRecordList(List<LiveAppRecord> liveAppRecordList) {
		this.liveAppRecordList = liveAppRecordList;
	}

	public static class LiveAppRecord {

		private String endTime;

		private String startTime;

		private String appName;

		private String streamName;

		private String createTime;

		private Integer onDemond;

		private String ossBucket;

		private String domainName;

		private String ossEndpoint;

		private List<RecordFormat> recordFormatList;

		private List<RecordFormat> transcodeRecordFormatList;

		private List<String> transcodeTemplates;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getOnDemond() {
			return this.onDemond;
		}

		public void setOnDemond(Integer onDemond) {
			this.onDemond = onDemond;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public List<RecordFormat> getRecordFormatList() {
			return this.recordFormatList;
		}

		public void setRecordFormatList(List<RecordFormat> recordFormatList) {
			this.recordFormatList = recordFormatList;
		}

		public List<RecordFormat> getTranscodeRecordFormatList() {
			return this.transcodeRecordFormatList;
		}

		public void setTranscodeRecordFormatList(List<RecordFormat> transcodeRecordFormatList) {
			this.transcodeRecordFormatList = transcodeRecordFormatList;
		}

		public List<String> getTranscodeTemplates() {
			return this.transcodeTemplates;
		}

		public void setTranscodeTemplates(List<String> transcodeTemplates) {
			this.transcodeTemplates = transcodeTemplates;
		}

		public static class RecordFormat {

			private Integer sliceDuration;

			private Integer cycleDuration;

			private String sliceOssObjectPrefix;

			private String ossObjectPrefix;

			private String format;

			public Integer getSliceDuration() {
				return this.sliceDuration;
			}

			public void setSliceDuration(Integer sliceDuration) {
				this.sliceDuration = sliceDuration;
			}

			public Integer getCycleDuration() {
				return this.cycleDuration;
			}

			public void setCycleDuration(Integer cycleDuration) {
				this.cycleDuration = cycleDuration;
			}

			public String getSliceOssObjectPrefix() {
				return this.sliceOssObjectPrefix;
			}

			public void setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
				this.sliceOssObjectPrefix = sliceOssObjectPrefix;
			}

			public String getOssObjectPrefix() {
				return this.ossObjectPrefix;
			}

			public void setOssObjectPrefix(String ossObjectPrefix) {
				this.ossObjectPrefix = ossObjectPrefix;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}
		}
	}

	@Override
	public DescribeLiveRecordConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveRecordConfigResponseUnmarshaller.unmarshall(this, context);
	}
}

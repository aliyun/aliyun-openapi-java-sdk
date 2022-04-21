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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTemplatesResponse extends AcsResponse {

	private Long pageNum;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private Long pageCount;

	private List<Template> templates;

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public static class Template {

		private String type;

		private String trigger;

		private String ossFilePrefix;

		private String hlsTs;

		private String mp4;

		private String jpgOnDemand;

		private String ossBucket;

		private String jpgSequence;

		private String jpgOverwrite;

		private String fileFormat;

		private String callback;

		private String endTime;

		private String startTime;

		private Long interval;

		private String description;

		private String region;

		private Long retention;

		private String hlsM3u8;

		private String flv;

		private String name;

		private String createdTime;

		private String ossEndpoint;

		private String id;

		private List<TransConfig> transConfigs;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}

		public String getOssFilePrefix() {
			return this.ossFilePrefix;
		}

		public void setOssFilePrefix(String ossFilePrefix) {
			this.ossFilePrefix = ossFilePrefix;
		}

		public String getHlsTs() {
			return this.hlsTs;
		}

		public void setHlsTs(String hlsTs) {
			this.hlsTs = hlsTs;
		}

		public String getMp4() {
			return this.mp4;
		}

		public void setMp4(String mp4) {
			this.mp4 = mp4;
		}

		public String getJpgOnDemand() {
			return this.jpgOnDemand;
		}

		public void setJpgOnDemand(String jpgOnDemand) {
			this.jpgOnDemand = jpgOnDemand;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getJpgSequence() {
			return this.jpgSequence;
		}

		public void setJpgSequence(String jpgSequence) {
			this.jpgSequence = jpgSequence;
		}

		public String getJpgOverwrite() {
			return this.jpgOverwrite;
		}

		public void setJpgOverwrite(String jpgOverwrite) {
			this.jpgOverwrite = jpgOverwrite;
		}

		public String getFileFormat() {
			return this.fileFormat;
		}

		public void setFileFormat(String fileFormat) {
			this.fileFormat = fileFormat;
		}

		public String getCallback() {
			return this.callback;
		}

		public void setCallback(String callback) {
			this.callback = callback;
		}

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

		public Long getInterval() {
			return this.interval;
		}

		public void setInterval(Long interval) {
			this.interval = interval;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getHlsM3u8() {
			return this.hlsM3u8;
		}

		public void setHlsM3u8(String hlsM3u8) {
			this.hlsM3u8 = hlsM3u8;
		}

		public String getFlv() {
			return this.flv;
		}

		public void setFlv(String flv) {
			this.flv = flv;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<TransConfig> getTransConfigs() {
			return this.transConfigs;
		}

		public void setTransConfigs(List<TransConfig> transConfigs) {
			this.transConfigs = transConfigs;
		}

		public static class TransConfig {

			private Long gop;

			private Long width;

			private Long videoBitrate;

			private Long height;

			private String videoCodec;

			private Long fps;

			private String name;

			private String id;

			public Long getGop() {
				return this.gop;
			}

			public void setGop(Long gop) {
				this.gop = gop;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getVideoBitrate() {
				return this.videoBitrate;
			}

			public void setVideoBitrate(Long videoBitrate) {
				this.videoBitrate = videoBitrate;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public String getVideoCodec() {
				return this.videoCodec;
			}

			public void setVideoCodec(String videoCodec) {
				this.videoCodec = videoCodec;
			}

			public Long getFps() {
				return this.fps;
			}

			public void setFps(Long fps) {
				this.fps = fps;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public DescribeTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

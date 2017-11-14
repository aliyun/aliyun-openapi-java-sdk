/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCasterConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterConfigResponse extends AcsResponse {

	private String requestId;

	private String casterId;

	private String casterName;

	private String domainName;

	private Float delay;

	private String urgentMaterialId;

	private TranscodeConfig transcodeConfig;

	private RecordConfig recordConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public String getCasterName() {
		return this.casterName;
	}

	public void setCasterName(String casterName) {
		this.casterName = casterName;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public Float getDelay() {
		return this.delay;
	}

	public void setDelay(Float delay) {
		this.delay = delay;
	}

	public String getUrgentMaterialId() {
		return this.urgentMaterialId;
	}

	public void setUrgentMaterialId(String urgentMaterialId) {
		this.urgentMaterialId = urgentMaterialId;
	}

	public TranscodeConfig getTranscodeConfig() {
		return this.transcodeConfig;
	}

	public void setTranscodeConfig(TranscodeConfig transcodeConfig) {
		this.transcodeConfig = transcodeConfig;
	}

	public RecordConfig getRecordConfig() {
		return this.recordConfig;
	}

	public void setRecordConfig(RecordConfig recordConfig) {
		this.recordConfig = recordConfig;
	}

	public static class TranscodeConfig {

		private String casterTemplate;

		private List<String> liveTemplateIds;

		public String getCasterTemplate() {
			return this.casterTemplate;
		}

		public void setCasterTemplate(String casterTemplate) {
			this.casterTemplate = casterTemplate;
		}

		public List<String> getLiveTemplateIds() {
			return this.liveTemplateIds;
		}

		public void setLiveTemplateIds(List<String> liveTemplateIds) {
			this.liveTemplateIds = liveTemplateIds;
		}
	}

	public static class RecordConfig {

		private String ossEndpoint;

		private String ossBucket;

		private List<RecordFormatItem> recordFormat;

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public List<RecordFormatItem> getRecordFormat() {
			return this.recordFormat;
		}

		public void setRecordFormat(List<RecordFormatItem> recordFormat) {
			this.recordFormat = recordFormat;
		}

		public static class RecordFormatItem {

			private String format;

			private String ossObjectPrefix;

			private String sliceOssObjectPrefix;

			private Integer cycleDuration;

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getOssObjectPrefix() {
				return this.ossObjectPrefix;
			}

			public void setOssObjectPrefix(String ossObjectPrefix) {
				this.ossObjectPrefix = ossObjectPrefix;
			}

			public String getSliceOssObjectPrefix() {
				return this.sliceOssObjectPrefix;
			}

			public void setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
				this.sliceOssObjectPrefix = sliceOssObjectPrefix;
			}

			public Integer getCycleDuration() {
				return this.cycleDuration;
			}

			public void setCycleDuration(Integer cycleDuration) {
				this.cycleDuration = cycleDuration;
			}
		}
	}

	@Override
	public DescribeCasterConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterConfigResponseUnmarshaller.unmarshall(this, context);
	}
}

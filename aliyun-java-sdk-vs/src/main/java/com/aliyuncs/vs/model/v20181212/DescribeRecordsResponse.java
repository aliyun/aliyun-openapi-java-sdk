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
import com.aliyuncs.vs.transform.v20181212.DescribeRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecordsResponse extends AcsResponse {

	private String requestId;

	private Long pageSize;

	private Long pageNum;

	private Long pageCount;

	private Long totalCount;

	private String nextStartTime;

	private List<Record> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextStartTime() {
		return this.nextStartTime;
	}

	public void setNextStartTime(String nextStartTime) {
		this.nextStartTime = nextStartTime;
	}

	public List<Record> getRecords() {
		return this.records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public static class Record {

		private String id;

		private String streamId;

		private String templateId;

		private String type;

		private String url;

		private String fileFormat;

		private String ossBucket;

		private String ossObject;

		private String ossEndpoint;

		private String startTime;

		private String endTime;

		private Long height;

		private Long width;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getStreamId() {
			return this.streamId;
		}

		public void setStreamId(String streamId) {
			this.streamId = streamId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getFileFormat() {
			return this.fileFormat;
		}

		public void setFileFormat(String fileFormat) {
			this.fileFormat = fileFormat;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getOssObject() {
			return this.ossObject;
		}

		public void setOssObject(String ossObject) {
			this.ossObject = ossObject;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
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

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}
	}

	@Override
	public DescribeRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

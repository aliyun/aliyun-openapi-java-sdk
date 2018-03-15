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
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamRecordIndexFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamRecordIndexFilesResponse extends AcsResponse {

	private String requestId;

	private List<RecordIndexInfo> recordIndexInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordIndexInfo> getRecordIndexInfoList() {
		return this.recordIndexInfoList;
	}

	public void setRecordIndexInfoList(List<RecordIndexInfo> recordIndexInfoList) {
		this.recordIndexInfoList = recordIndexInfoList;
	}

	public static class RecordIndexInfo {

		private String recordId;

		private String recordUrl;

		private String domainName;

		private String appName;

		private String streamName;

		private String ossObject;

		private String startTime;

		private String endTime;

		private Float duration;

		private Integer height;

		private Integer width;

		private String createTime;

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getRecordUrl() {
			return this.recordUrl;
		}

		public void setRecordUrl(String recordUrl) {
			this.recordUrl = recordUrl;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
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

		public String getOssObject() {
			return this.ossObject;
		}

		public void setOssObject(String ossObject) {
			this.ossObject = ossObject;
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

		public Float getDuration() {
			return this.duration;
		}

		public void setDuration(Float duration) {
			this.duration = duration;
		}

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getWidth() {
			return this.width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeLiveStreamRecordIndexFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamRecordIndexFilesResponseUnmarshaller.unmarshall(this, context);
	}
}

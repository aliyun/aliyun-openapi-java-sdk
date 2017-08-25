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
package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.CreateLiveStreamRecordIndexFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLiveStreamRecordIndexFilesResponse extends AcsResponse {

	private String requestId;

	private RecordInfo recordInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RecordInfo getRecordInfo() {
		return this.recordInfo;
	}

	public void setRecordInfo(RecordInfo recordInfo) {
		this.recordInfo = recordInfo;
	}

	public static class RecordInfo {

		private String recordId;

		private String recordUrl;

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
	public CreateLiveStreamRecordIndexFilesResponse getInstance(UnmarshallerContext context) {
		return	CreateLiveStreamRecordIndexFilesResponseUnmarshaller.unmarshall(this, context);
	}
}

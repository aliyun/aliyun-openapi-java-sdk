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
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.UpdateInputBucketSyncStateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateInputBucketSyncStateResponse extends AcsResponse {

	private String requestId;

	private MediaBucket mediaBucket;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaBucket getMediaBucket() {
		return this.mediaBucket;
	}

	public void setMediaBucket(MediaBucket mediaBucket) {
		this.mediaBucket = mediaBucket;
	}

	public static class MediaBucket {

		private String bucket;

		private String type;

		private Boolean sync;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getSync() {
			return this.sync;
		}

		public void setSync(Boolean sync) {
			this.sync = sync;
		}
	}

	@Override
	public UpdateInputBucketSyncStateResponse getInstance(UnmarshallerContext context) {
		return	UpdateInputBucketSyncStateResponseUnmarshaller.unmarshall(this, context);
	}
}

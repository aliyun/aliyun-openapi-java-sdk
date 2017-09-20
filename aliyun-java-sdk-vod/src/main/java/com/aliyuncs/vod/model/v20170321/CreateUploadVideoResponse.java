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
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.CreateUploadVideoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUploadVideoResponse extends AcsResponse {

	private String requestId;

	private String videoId;

	private String uploadAddress;

	private String uploadAuth;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getUploadAddress() {
		return this.uploadAddress;
	}

	public void setUploadAddress(String uploadAddress) {
		this.uploadAddress = uploadAddress;
	}

	public String getUploadAuth() {
		return this.uploadAuth;
	}

	public void setUploadAuth(String uploadAuth) {
		this.uploadAuth = uploadAuth;
	}

	@Override
	public CreateUploadVideoResponse getInstance(UnmarshallerContext context) {
		return	CreateUploadVideoResponseUnmarshaller.unmarshall(this, context);
	}
}

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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpLoadMapRequest extends RpcAcsRequest<UpLoadMapResponse> {
	
	public UpLoadMapRequest() {
		super("cloudwf", "2017-03-28", "UpLoadMap");
	}

	private String fileName;

	private String uploadId;

	private String objectName;

	private Integer chunkIndex;

	private Integer chunkCnt;

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public String getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
		if(uploadId != null){
			putQueryParameter("UploadId", uploadId);
		}
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
		if(objectName != null){
			putQueryParameter("ObjectName", objectName);
		}
	}

	public Integer getChunkIndex() {
		return this.chunkIndex;
	}

	public void setChunkIndex(Integer chunkIndex) {
		this.chunkIndex = chunkIndex;
		if(chunkIndex != null){
			putQueryParameter("ChunkIndex", chunkIndex.toString());
		}
	}

	public Integer getChunkCnt() {
		return this.chunkCnt;
	}

	public void setChunkCnt(Integer chunkCnt) {
		this.chunkCnt = chunkCnt;
		if(chunkCnt != null){
			putQueryParameter("ChunkCnt", chunkCnt.toString());
		}
	}

	@Override
	public Class<UpLoadMapResponse> getResponseClass() {
		return UpLoadMapResponse.class;
	}

}

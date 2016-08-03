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
package com.aliyuncs.green.model.v20160801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AntispamDetectionRequest extends RpcAcsRequest<AntispamDetectionResponse> {
	
	public AntispamDetectionRequest() {
		super("Green", "2016-08-01", "AntispamDetection");
		setMethod(MethodType.POST);
	}

	private String dataId;

	private String postId;

	private String sceneId;

	private String postNick;

	private String postIp;

	private String postMac;

	private Long postTime;

	private String machineCode;

	private String parentDataId;

	private String title;

	private String postContent;

	private List<String> imageUrls;

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		putQueryParameter("DataId", dataId);
	}

	public String getPostId() {
		return this.postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
		putQueryParameter("PostId", postId);
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		putQueryParameter("SceneId", sceneId);
	}

	public String getPostNick() {
		return this.postNick;
	}

	public void setPostNick(String postNick) {
		this.postNick = postNick;
		putQueryParameter("PostNick", postNick);
	}

	public String getPostIp() {
		return this.postIp;
	}

	public void setPostIp(String postIp) {
		this.postIp = postIp;
		putQueryParameter("PostIp", postIp);
	}

	public String getPostMac() {
		return this.postMac;
	}

	public void setPostMac(String postMac) {
		this.postMac = postMac;
		putQueryParameter("PostMac", postMac);
	}

	public Long getPostTime() {
		return this.postTime;
	}

	public void setPostTime(Long postTime) {
		this.postTime = postTime;
		putQueryParameter("PostTime", postTime);
	}

	public String getMachineCode() {
		return this.machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
		putQueryParameter("MachineCode", machineCode);
	}

	public String getParentDataId() {
		return this.parentDataId;
	}

	public void setParentDataId(String parentDataId) {
		this.parentDataId = parentDataId;
		putQueryParameter("ParentDataId", parentDataId);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		putQueryParameter("Title", title);
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
		putQueryParameter("PostContent", postContent);
	}

	public List<String> getImageUrls() {
		return this.imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;	
		for (int i = 0; i < imageUrls.size(); i++) {
			putQueryParameter("ImageUrl." + (i + 1) , imageUrls.get(i));
		}	
	}

	@Override
	public Class<AntispamDetectionResponse> getResponseClass() {
		return AntispamDetectionResponse.class;
	}

}

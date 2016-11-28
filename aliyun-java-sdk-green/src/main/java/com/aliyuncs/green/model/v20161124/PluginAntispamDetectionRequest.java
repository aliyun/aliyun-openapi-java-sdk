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
package com.aliyuncs.green.model.v20161124;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PluginAntispamDetectionRequest extends RpcAcsRequest<PluginAntispamDetectionResponse> {
	
	public PluginAntispamDetectionRequest() {
		super("Green", "2016-11-24", "PluginAntispamDetection", "green");
		setMethod(MethodType.POST);
	}

	private String bizScene;

	private String clientVersion;

	private String userId;

	private String topicId;

	private String feedId;

	private String title;

	private Long postTime;

	private String postContent;

	private String postContentType;

	private String dynamicProp;

	public String getBizScene() {
		return this.bizScene;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
		putQueryParameter("BizScene", bizScene);
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		putQueryParameter("ClientVersion", clientVersion);
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		putQueryParameter("UserId", userId);
	}

	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
		putQueryParameter("TopicId", topicId);
	}

	public String getFeedId() {
		return this.feedId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
		putQueryParameter("FeedId", feedId);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		putQueryParameter("Title", title);
	}

	public Long getPostTime() {
		return this.postTime;
	}

	public void setPostTime(Long postTime) {
		this.postTime = postTime;
		putQueryParameter("PostTime", postTime);
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
		putQueryParameter("PostContent", postContent);
	}

	public String getPostContentType() {
		return this.postContentType;
	}

	public void setPostContentType(String postContentType) {
		this.postContentType = postContentType;
		putQueryParameter("PostContentType", postContentType);
	}

	public String getDynamicProp() {
		return this.dynamicProp;
	}

	public void setDynamicProp(String dynamicProp) {
		this.dynamicProp = dynamicProp;
		putQueryParameter("DynamicProp", dynamicProp);
	}

	@Override
	public Class<PluginAntispamDetectionResponse> getResponseClass() {
		return PluginAntispamDetectionResponse.class;
	}

}

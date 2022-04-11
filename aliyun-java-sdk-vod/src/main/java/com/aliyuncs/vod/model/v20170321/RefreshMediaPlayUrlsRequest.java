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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RefreshMediaPlayUrlsRequest extends RpcAcsRequest<RefreshMediaPlayUrlsResponse> {
	   

	private String formats;

	private String userData;

	private String mediaIds;

	private String definitions;

	private String streamType;

	private String taskType;

	private Boolean sliceFlag;

	private String resultType;

	private Integer sliceCount;
	public RefreshMediaPlayUrlsRequest() {
		super("vod", "2017-03-21", "RefreshMediaPlayUrls", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFormats() {
		return this.formats;
	}

	public void setFormats(String formats) {
		this.formats = formats;
		if(formats != null){
			putQueryParameter("Formats", formats);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getMediaIds() {
		return this.mediaIds;
	}

	public void setMediaIds(String mediaIds) {
		this.mediaIds = mediaIds;
		if(mediaIds != null){
			putQueryParameter("MediaIds", mediaIds);
		}
	}

	public String getDefinitions() {
		return this.definitions;
	}

	public void setDefinitions(String definitions) {
		this.definitions = definitions;
		if(definitions != null){
			putQueryParameter("Definitions", definitions);
		}
	}

	public String getStreamType() {
		return this.streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType);
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public Boolean getSliceFlag() {
		return this.sliceFlag;
	}

	public void setSliceFlag(Boolean sliceFlag) {
		this.sliceFlag = sliceFlag;
		if(sliceFlag != null){
			putQueryParameter("SliceFlag", sliceFlag.toString());
		}
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
		if(resultType != null){
			putQueryParameter("ResultType", resultType);
		}
	}

	public Integer getSliceCount() {
		return this.sliceCount;
	}

	public void setSliceCount(Integer sliceCount) {
		this.sliceCount = sliceCount;
		if(sliceCount != null){
			putQueryParameter("SliceCount", sliceCount.toString());
		}
	}

	@Override
	public Class<RefreshMediaPlayUrlsResponse> getResponseClass() {
		return RefreshMediaPlayUrlsResponse.class;
	}

}

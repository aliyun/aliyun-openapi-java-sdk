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
public class SubmitDetectionJobRequest extends RpcAcsRequest<SubmitDetectionJobResponse> {
	   

	private String whiteListUrls;

	private String copyrightEndTime;

	private String copyrightStatus;

	private String copyrightBeginTime;

	private Integer duration;

	private String videoId;

	private String beginTime;

	private Boolean shortVideo;

	private String templateId;

	private String copyrightFile;
	public SubmitDetectionJobRequest() {
		super("vod", "2017-03-21", "SubmitDetectionJob", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWhiteListUrls() {
		return this.whiteListUrls;
	}

	public void setWhiteListUrls(String whiteListUrls) {
		this.whiteListUrls = whiteListUrls;
		if(whiteListUrls != null){
			putQueryParameter("WhiteListUrls", whiteListUrls);
		}
	}

	public String getCopyrightEndTime() {
		return this.copyrightEndTime;
	}

	public void setCopyrightEndTime(String copyrightEndTime) {
		this.copyrightEndTime = copyrightEndTime;
		if(copyrightEndTime != null){
			putQueryParameter("CopyrightEndTime", copyrightEndTime);
		}
	}

	public String getCopyrightStatus() {
		return this.copyrightStatus;
	}

	public void setCopyrightStatus(String copyrightStatus) {
		this.copyrightStatus = copyrightStatus;
		if(copyrightStatus != null){
			putQueryParameter("CopyrightStatus", copyrightStatus);
		}
	}

	public String getCopyrightBeginTime() {
		return this.copyrightBeginTime;
	}

	public void setCopyrightBeginTime(String copyrightBeginTime) {
		this.copyrightBeginTime = copyrightBeginTime;
		if(copyrightBeginTime != null){
			putQueryParameter("CopyrightBeginTime", copyrightBeginTime);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime);
		}
	}

	public Boolean getShortVideo() {
		return this.shortVideo;
	}

	public void setShortVideo(Boolean shortVideo) {
		this.shortVideo = shortVideo;
		if(shortVideo != null){
			putQueryParameter("ShortVideo", shortVideo.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getCopyrightFile() {
		return this.copyrightFile;
	}

	public void setCopyrightFile(String copyrightFile) {
		this.copyrightFile = copyrightFile;
		if(copyrightFile != null){
			putQueryParameter("CopyrightFile", copyrightFile);
		}
	}

	@Override
	public Class<SubmitDetectionJobResponse> getResponseClass() {
		return SubmitDetectionJobResponse.class;
	}

}

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
public class UpdateDetectionJobRequest extends RpcAcsRequest<UpdateDetectionJobResponse> {
	   

	private String whiteListUrls;

	private String copyrightEndTime;

	private String copyrightStatus;

	private String copyrightBeginTime;

	private Integer duration;

	private String jobId;

	private String beginTime;

	private String templateId;

	private String copyrightFile;
	public UpdateDetectionJobRequest() {
		super("vod", "2017-03-21", "UpdateDetectionJob", "vod");
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

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
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
	public Class<UpdateDetectionJobResponse> getResponseClass() {
		return UpdateDetectionJobResponse.class;
	}

}

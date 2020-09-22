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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRecordTemplateRequest extends RpcAcsRequest<UpdateRecordTemplateResponse> {
	   

	private List<String> formatss;

	private String ossFilePrefix;

	private Integer backgroundColor;

	private String taskProfile;

	private List<Long> layoutIdss;

	private String ossBucket;

	private String mnsQueue;

	private Integer fileSplitInterval;

	private Long ownerId;

	private String templateId;

	private String appId;

	private String name;

	private Integer mediaEncode;
	public UpdateRecordTemplateRequest() {
		super("rtc", "2018-01-11", "UpdateRecordTemplate", "rtc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getFormatss() {
		return this.formatss;
	}

	public void setFormatss(List<String> formatss) {
		this.formatss = formatss;	
		if (formatss != null) {
			for (int i = 0; i < formatss.size(); i++) {
				putQueryParameter("Formats." + (i + 1) , formatss.get(i));
			}
		}	
	}

	public String getOssFilePrefix() {
		return this.ossFilePrefix;
	}

	public void setOssFilePrefix(String ossFilePrefix) {
		this.ossFilePrefix = ossFilePrefix;
		if(ossFilePrefix != null){
			putQueryParameter("OssFilePrefix", ossFilePrefix);
		}
	}

	public Integer getBackgroundColor() {
		return this.backgroundColor;
	}

	public void setBackgroundColor(Integer backgroundColor) {
		this.backgroundColor = backgroundColor;
		if(backgroundColor != null){
			putQueryParameter("BackgroundColor", backgroundColor.toString());
		}
	}

	public String getTaskProfile() {
		return this.taskProfile;
	}

	public void setTaskProfile(String taskProfile) {
		this.taskProfile = taskProfile;
		if(taskProfile != null){
			putQueryParameter("TaskProfile", taskProfile);
		}
	}

	public List<Long> getLayoutIdss() {
		return this.layoutIdss;
	}

	public void setLayoutIdss(List<Long> layoutIdss) {
		this.layoutIdss = layoutIdss;	
		if (layoutIdss != null) {
			for (int i = 0; i < layoutIdss.size(); i++) {
				putQueryParameter("LayoutIds." + (i + 1) , layoutIdss.get(i));
			}
		}	
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putQueryParameter("OssBucket", ossBucket);
		}
	}

	public String getMnsQueue() {
		return this.mnsQueue;
	}

	public void setMnsQueue(String mnsQueue) {
		this.mnsQueue = mnsQueue;
		if(mnsQueue != null){
			putQueryParameter("MnsQueue", mnsQueue);
		}
	}

	public Integer getFileSplitInterval() {
		return this.fileSplitInterval;
	}

	public void setFileSplitInterval(Integer fileSplitInterval) {
		this.fileSplitInterval = fileSplitInterval;
		if(fileSplitInterval != null){
			putQueryParameter("FileSplitInterval", fileSplitInterval.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getMediaEncode() {
		return this.mediaEncode;
	}

	public void setMediaEncode(Integer mediaEncode) {
		this.mediaEncode = mediaEncode;
		if(mediaEncode != null){
			putQueryParameter("MediaEncode", mediaEncode.toString());
		}
	}

	@Override
	public Class<UpdateRecordTemplateResponse> getResponseClass() {
		return UpdateRecordTemplateResponse.class;
	}

}

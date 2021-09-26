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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTemplateRequest extends RpcAcsRequest<CreateTemplateResponse> {
	   

	private String hlsTs;

	private String ossEndpoint;

	private String description;

	private String ossFilePrefix;

	private String jpgOverwrite;

	private String startTime;

	private String type;

	private String jpgOnDemand;

	private Long retention;

	private String hlsM3u8;

	private String ossBucket;

	private String transConfigsJSON;

	private String endTime;

	private String trigger;

	private Long ownerId;

	private String jpgSequence;

	private String mp4;

	private String flv;

	private String name;

	private String callback;

	private Long interval;

	private String fileFormat;

	private String region;
	public CreateTemplateRequest() {
		super("vs", "2018-12-12", "CreateTemplate", "vs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHlsTs() {
		return this.hlsTs;
	}

	public void setHlsTs(String hlsTs) {
		this.hlsTs = hlsTs;
		if(hlsTs != null){
			putQueryParameter("HlsTs", hlsTs);
		}
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putQueryParameter("OssEndpoint", ossEndpoint);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getJpgOverwrite() {
		return this.jpgOverwrite;
	}

	public void setJpgOverwrite(String jpgOverwrite) {
		this.jpgOverwrite = jpgOverwrite;
		if(jpgOverwrite != null){
			putQueryParameter("JpgOverwrite", jpgOverwrite);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getJpgOnDemand() {
		return this.jpgOnDemand;
	}

	public void setJpgOnDemand(String jpgOnDemand) {
		this.jpgOnDemand = jpgOnDemand;
		if(jpgOnDemand != null){
			putQueryParameter("JpgOnDemand", jpgOnDemand);
		}
	}

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	public String getHlsM3u8() {
		return this.hlsM3u8;
	}

	public void setHlsM3u8(String hlsM3u8) {
		this.hlsM3u8 = hlsM3u8;
		if(hlsM3u8 != null){
			putQueryParameter("HlsM3u8", hlsM3u8);
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

	public String getTransConfigsJSON() {
		return this.transConfigsJSON;
	}

	public void setTransConfigsJSON(String transConfigsJSON) {
		this.transConfigsJSON = transConfigsJSON;
		if(transConfigsJSON != null){
			putQueryParameter("TransConfigsJSON", transConfigsJSON);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getTrigger() {
		return this.trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
		if(trigger != null){
			putQueryParameter("Trigger", trigger);
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

	public String getJpgSequence() {
		return this.jpgSequence;
	}

	public void setJpgSequence(String jpgSequence) {
		this.jpgSequence = jpgSequence;
		if(jpgSequence != null){
			putQueryParameter("JpgSequence", jpgSequence);
		}
	}

	public String getMp4() {
		return this.mp4;
	}

	public void setMp4(String mp4) {
		this.mp4 = mp4;
		if(mp4 != null){
			putQueryParameter("Mp4", mp4);
		}
	}

	public String getFlv() {
		return this.flv;
	}

	public void setFlv(String flv) {
		this.flv = flv;
		if(flv != null){
			putQueryParameter("Flv", flv);
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

	public String getCallback() {
		return this.callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback);
		}
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
		if(fileFormat != null){
			putQueryParameter("FileFormat", fileFormat);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<CreateTemplateResponse> getResponseClass() {
		return CreateTemplateResponse.class;
	}

}

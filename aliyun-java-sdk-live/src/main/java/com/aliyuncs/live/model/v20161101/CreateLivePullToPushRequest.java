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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLivePullToPushRequest extends RpcAcsRequest<CreateLivePullToPushResponse> {
	   

	private Integer fileIndex;

	private Integer retryCount;

	private String taskName;

	private String startTime;

	private Integer repeatNumber;

	private String sourceProtocol;

	private String sourceType;

	private Integer offset;

	private String dstUrl;

	private String endTime;

	private Long ownerId;

	@SerializedName("sourceUrls")
	private List<String> sourceUrls;

	private Integer retryInterval;

	private String callbackUrl;

	private String region;
	public CreateLivePullToPushRequest() {
		super("live", "2016-11-01", "CreateLivePullToPush", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getFileIndex() {
		return this.fileIndex;
	}

	public void setFileIndex(Integer fileIndex) {
		this.fileIndex = fileIndex;
		if(fileIndex != null){
			putQueryParameter("FileIndex", fileIndex.toString());
		}
	}

	public Integer getRetryCount() {
		return this.retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
		if(retryCount != null){
			putQueryParameter("RetryCount", retryCount.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
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

	public Integer getRepeatNumber() {
		return this.repeatNumber;
	}

	public void setRepeatNumber(Integer repeatNumber) {
		this.repeatNumber = repeatNumber;
		if(repeatNumber != null){
			putQueryParameter("RepeatNumber", repeatNumber.toString());
		}
	}

	public String getSourceProtocol() {
		return this.sourceProtocol;
	}

	public void setSourceProtocol(String sourceProtocol) {
		this.sourceProtocol = sourceProtocol;
		if(sourceProtocol != null){
			putQueryParameter("SourceProtocol", sourceProtocol);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getDstUrl() {
		return this.dstUrl;
	}

	public void setDstUrl(String dstUrl) {
		this.dstUrl = dstUrl;
		if(dstUrl != null){
			putQueryParameter("DstUrl", dstUrl);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getSourceUrls() {
		return this.sourceUrls;
	}

	public void setSourceUrls(List<String> sourceUrls) {
		this.sourceUrls = sourceUrls;	
		if (sourceUrls != null) {
			putQueryParameter("SourceUrls" , new Gson().toJson(sourceUrls));
		}	
	}

	public Integer getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Integer retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
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
	public Class<CreateLivePullToPushResponse> getResponseClass() {
		return CreateLivePullToPushResponse.class;
	}

}

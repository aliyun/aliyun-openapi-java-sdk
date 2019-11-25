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
public class CreateTemplateRequest extends RpcAcsRequest<CreateTemplateResponse> {
	   

	private Integer serviceMode;

	private List<LiveConfig> liveConfigs;

	private Integer mediaConfig;

	private Integer maxMixStreamCount;

	private List<RecordConfig> recordConfigs;

	private Long ownerId;

	private List<LayOut> layOuts;

	private String appId;

	private String callBack;

	private Integer mixMode;
	public CreateTemplateRequest() {
		super("rtc", "2018-01-11", "CreateTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getServiceMode() {
		return this.serviceMode;
	}

	public void setServiceMode(Integer serviceMode) {
		this.serviceMode = serviceMode;
		if(serviceMode != null){
			putQueryParameter("ServiceMode", serviceMode.toString());
		}
	}

	public List<LiveConfig> getLiveConfigs() {
		return this.liveConfigs;
	}

	public void setLiveConfigs(List<LiveConfig> liveConfigs) {
		this.liveConfigs = liveConfigs;	
		if (liveConfigs != null) {
			for (int depth1 = 0; depth1 < liveConfigs.size(); depth1++) {
				putQueryParameter("LiveConfig." + (depth1 + 1) + ".DomainName" , liveConfigs.get(depth1).getDomainName());
				putQueryParameter("LiveConfig." + (depth1 + 1) + ".AppName" , liveConfigs.get(depth1).getAppName());
			}
		}	
	}

	public Integer getMediaConfig() {
		return this.mediaConfig;
	}

	public void setMediaConfig(Integer mediaConfig) {
		this.mediaConfig = mediaConfig;
		if(mediaConfig != null){
			putQueryParameter("MediaConfig", mediaConfig.toString());
		}
	}

	public Integer getMaxMixStreamCount() {
		return this.maxMixStreamCount;
	}

	public void setMaxMixStreamCount(Integer maxMixStreamCount) {
		this.maxMixStreamCount = maxMixStreamCount;
		if(maxMixStreamCount != null){
			putQueryParameter("MaxMixStreamCount", maxMixStreamCount.toString());
		}
	}

	public List<RecordConfig> getRecordConfigs() {
		return this.recordConfigs;
	}

	public void setRecordConfigs(List<RecordConfig> recordConfigs) {
		this.recordConfigs = recordConfigs;	
		if (recordConfigs != null) {
			for (int depth1 = 0; depth1 < recordConfigs.size(); depth1++) {
				putQueryParameter("RecordConfig." + (depth1 + 1) + ".StorageType" , recordConfigs.get(depth1).getStorageType());
				putQueryParameter("RecordConfig." + (depth1 + 1) + ".FileFormat" , recordConfigs.get(depth1).getFileFormat());
				putQueryParameter("RecordConfig." + (depth1 + 1) + ".OssEndPoint" , recordConfigs.get(depth1).getOssEndPoint());
				putQueryParameter("RecordConfig." + (depth1 + 1) + ".OssBucket" , recordConfigs.get(depth1).getOssBucket());
				putQueryParameter("RecordConfig." + (depth1 + 1) + ".VodTransCodeGroupId" , recordConfigs.get(depth1).getVodTransCodeGroupId());
			}
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

	public List<LayOut> getLayOuts() {
		return this.layOuts;
	}

	public void setLayOuts(List<LayOut> layOuts) {
		this.layOuts = layOuts;	
		if (layOuts != null) {
			for (int depth1 = 0; depth1 < layOuts.size(); depth1++) {
				putQueryParameter("LayOut." + (depth1 + 1) + ".Color" , layOuts.get(depth1).getColor());
				putQueryParameter("LayOut." + (depth1 + 1) + ".CutMode" , layOuts.get(depth1).getCutMode());
				putQueryParameter("LayOut." + (depth1 + 1) + ".LayOutId" , layOuts.get(depth1).getLayOutId());
			}
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

	public String getCallBack() {
		return this.callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
		if(callBack != null){
			putQueryParameter("CallBack", callBack);
		}
	}

	public Integer getMixMode() {
		return this.mixMode;
	}

	public void setMixMode(Integer mixMode) {
		this.mixMode = mixMode;
		if(mixMode != null){
			putQueryParameter("MixMode", mixMode.toString());
		}
	}

	public static class LiveConfig {

		private String domainName;

		private String appName;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}
	}

	public static class RecordConfig {

		private String storageType;

		private Integer fileFormat;

		private String ossEndPoint;

		private String ossBucket;

		private Integer vodTransCodeGroupId;

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Integer getFileFormat() {
			return this.fileFormat;
		}

		public void setFileFormat(Integer fileFormat) {
			this.fileFormat = fileFormat;
		}

		public String getOssEndPoint() {
			return this.ossEndPoint;
		}

		public void setOssEndPoint(String ossEndPoint) {
			this.ossEndPoint = ossEndPoint;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public Integer getVodTransCodeGroupId() {
			return this.vodTransCodeGroupId;
		}

		public void setVodTransCodeGroupId(Integer vodTransCodeGroupId) {
			this.vodTransCodeGroupId = vodTransCodeGroupId;
		}
	}

	public static class LayOut {

		private String color;

		private Integer cutMode;

		private Integer layOutId;

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Integer getCutMode() {
			return this.cutMode;
		}

		public void setCutMode(Integer cutMode) {
			this.cutMode = cutMode;
		}

		public Integer getLayOutId() {
			return this.layOutId;
		}

		public void setLayOutId(Integer layOutId) {
			this.layOutId = layOutId;
		}
	}

	@Override
	public Class<CreateTemplateResponse> getResponseClass() {
		return CreateTemplateResponse.class;
	}

}

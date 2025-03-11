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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectConfigRequest extends RpcAcsRequest<UpdateProjectConfigResponse> {
	   

	@SerializedName("commonTransferConfig")
	private CommonTransferConfig commonTransferConfig;

	@SerializedName("reverseIncrTransferConfig")
	private ReverseIncrTransferConfig reverseIncrTransferConfig;

	@SerializedName("fullTransferConfig")
	private FullTransferConfig fullTransferConfig;

	private String id;

	@SerializedName("incrTransferConfig")
	private IncrTransferConfig incrTransferConfig;
	public UpdateProjectConfigRequest() {
		super("OceanBasePro", "2019-09-01", "UpdateProjectConfig", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public CommonTransferConfig getCommonTransferConfig() {
		return this.commonTransferConfig;
	}

	public void setCommonTransferConfig(CommonTransferConfig commonTransferConfig) {
		this.commonTransferConfig = commonTransferConfig;	
		if (commonTransferConfig != null) {
			putBodyParameter("CommonTransferConfig" , new Gson().toJson(commonTransferConfig));
		}	
	}

	public ReverseIncrTransferConfig getReverseIncrTransferConfig() {
		return this.reverseIncrTransferConfig;
	}

	public void setReverseIncrTransferConfig(ReverseIncrTransferConfig reverseIncrTransferConfig) {
		this.reverseIncrTransferConfig = reverseIncrTransferConfig;	
		if (reverseIncrTransferConfig != null) {
			putBodyParameter("ReverseIncrTransferConfig" , new Gson().toJson(reverseIncrTransferConfig));
		}	
	}

	public FullTransferConfig getFullTransferConfig() {
		return this.fullTransferConfig;
	}

	public void setFullTransferConfig(FullTransferConfig fullTransferConfig) {
		this.fullTransferConfig = fullTransferConfig;	
		if (fullTransferConfig != null) {
			putBodyParameter("FullTransferConfig" , new Gson().toJson(fullTransferConfig));
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public IncrTransferConfig getIncrTransferConfig() {
		return this.incrTransferConfig;
	}

	public void setIncrTransferConfig(IncrTransferConfig incrTransferConfig) {
		this.incrTransferConfig = incrTransferConfig;	
		if (incrTransferConfig != null) {
			putBodyParameter("IncrTransferConfig" , new Gson().toJson(incrTransferConfig));
		}	
	}

	public static class CommonTransferConfig {

		@SerializedName("SinkStoreFormat")
		private String sinkStoreFormat;

		@SerializedName("SourceStoreFormat")
		private String sourceStoreFormat;

		public String getSinkStoreFormat() {
			return this.sinkStoreFormat;
		}

		public void setSinkStoreFormat(String sinkStoreFormat) {
			this.sinkStoreFormat = sinkStoreFormat;
		}

		public String getSourceStoreFormat() {
			return this.sourceStoreFormat;
		}

		public void setSourceStoreFormat(String sourceStoreFormat) {
			this.sourceStoreFormat = sourceStoreFormat;
		}
	}

	public static class ReverseIncrTransferConfig {

		@SerializedName("ThrottleRps")
		private Integer throttleRps;

		@SerializedName("SupportDDLTypes")
		private List<String> supportDDLTypes;

		@SerializedName("ThrottleIOPS")
		private Integer throttleIOPS;

		@SerializedName("RecordTypeWhiteList")
		private List<String> recordTypeWhiteList;

		@SerializedName("IncrSyncThreadCount")
		private Integer incrSyncThreadCount;

		public Integer getThrottleRps() {
			return this.throttleRps;
		}

		public void setThrottleRps(Integer throttleRps) {
			this.throttleRps = throttleRps;
		}

		public List<String> getSupportDDLTypes() {
			return this.supportDDLTypes;
		}

		public void setSupportDDLTypes(List<String> supportDDLTypes) {
			this.supportDDLTypes = supportDDLTypes;
		}

		public Integer getThrottleIOPS() {
			return this.throttleIOPS;
		}

		public void setThrottleIOPS(Integer throttleIOPS) {
			this.throttleIOPS = throttleIOPS;
		}

		public List<String> getRecordTypeWhiteList() {
			return this.recordTypeWhiteList;
		}

		public void setRecordTypeWhiteList(List<String> recordTypeWhiteList) {
			this.recordTypeWhiteList = recordTypeWhiteList;
		}

		public Integer getIncrSyncThreadCount() {
			return this.incrSyncThreadCount;
		}

		public void setIncrSyncThreadCount(Integer incrSyncThreadCount) {
			this.incrSyncThreadCount = incrSyncThreadCount;
		}
	}

	public static class FullTransferConfig {

		@SerializedName("IndexDDLConcurrencyLimit")
		private Integer indexDDLConcurrencyLimit;

		@SerializedName("ThrottleRps")
		private Integer throttleRps;

		@SerializedName("WriteWorkerNum")
		private Integer writeWorkerNum;

		@SerializedName("MaxConcurrentIndexDDLs")
		private Integer maxConcurrentIndexDDLs;

		@SerializedName("ReadWorkerNum")
		private Integer readWorkerNum;

		@SerializedName("ThrottleIOPS")
		private Integer throttleIOPS;

		public Integer getIndexDDLConcurrencyLimit() {
			return this.indexDDLConcurrencyLimit;
		}

		public void setIndexDDLConcurrencyLimit(Integer indexDDLConcurrencyLimit) {
			this.indexDDLConcurrencyLimit = indexDDLConcurrencyLimit;
		}

		public Integer getThrottleRps() {
			return this.throttleRps;
		}

		public void setThrottleRps(Integer throttleRps) {
			this.throttleRps = throttleRps;
		}

		public Integer getWriteWorkerNum() {
			return this.writeWorkerNum;
		}

		public void setWriteWorkerNum(Integer writeWorkerNum) {
			this.writeWorkerNum = writeWorkerNum;
		}

		public Integer getMaxConcurrentIndexDDLs() {
			return this.maxConcurrentIndexDDLs;
		}

		public void setMaxConcurrentIndexDDLs(Integer maxConcurrentIndexDDLs) {
			this.maxConcurrentIndexDDLs = maxConcurrentIndexDDLs;
		}

		public Integer getReadWorkerNum() {
			return this.readWorkerNum;
		}

		public void setReadWorkerNum(Integer readWorkerNum) {
			this.readWorkerNum = readWorkerNum;
		}

		public Integer getThrottleIOPS() {
			return this.throttleIOPS;
		}

		public void setThrottleIOPS(Integer throttleIOPS) {
			this.throttleIOPS = throttleIOPS;
		}
	}

	public static class IncrTransferConfig {

		@SerializedName("ThrottleRps")
		private Integer throttleRps;

		@SerializedName("SupportDDLTypes")
		private List<String> supportDDLTypes;

		@SerializedName("ThrottleIOPS")
		private Integer throttleIOPS;

		@SerializedName("RecordTypeWhiteList")
		private List<String> recordTypeWhiteList;

		@SerializedName("IncrSyncThreadCount")
		private Integer incrSyncThreadCount;

		public Integer getThrottleRps() {
			return this.throttleRps;
		}

		public void setThrottleRps(Integer throttleRps) {
			this.throttleRps = throttleRps;
		}

		public List<String> getSupportDDLTypes() {
			return this.supportDDLTypes;
		}

		public void setSupportDDLTypes(List<String> supportDDLTypes) {
			this.supportDDLTypes = supportDDLTypes;
		}

		public Integer getThrottleIOPS() {
			return this.throttleIOPS;
		}

		public void setThrottleIOPS(Integer throttleIOPS) {
			this.throttleIOPS = throttleIOPS;
		}

		public List<String> getRecordTypeWhiteList() {
			return this.recordTypeWhiteList;
		}

		public void setRecordTypeWhiteList(List<String> recordTypeWhiteList) {
			this.recordTypeWhiteList = recordTypeWhiteList;
		}

		public Integer getIncrSyncThreadCount() {
			return this.incrSyncThreadCount;
		}

		public void setIncrSyncThreadCount(Integer incrSyncThreadCount) {
			this.incrSyncThreadCount = incrSyncThreadCount;
		}
	}

	@Override
	public Class<UpdateProjectConfigResponse> getResponseClass() {
		return UpdateProjectConfigResponse.class;
	}

}

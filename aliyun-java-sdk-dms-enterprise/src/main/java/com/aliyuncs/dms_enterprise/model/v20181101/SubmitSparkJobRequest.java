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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitSparkJobRequest extends RpcAcsRequest<SubmitSparkJobResponse> {
	   

	private String mainClass;

	@SerializedName("configuration")
	private Map<String,String> configuration;

	@SerializedName("ossInfo")
	private OssInfo ossInfo;

	private Long tid;

	private String mainFile;

	private String name;

	@SerializedName("files")
	private List<String> files;

	private String appCode;

	@SerializedName("arguments")
	private List<String> arguments;
	public SubmitSparkJobRequest() {
		super("dms-enterprise", "2018-11-01", "SubmitSparkJob", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMainClass() {
		return this.mainClass;
	}

	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
		if(mainClass != null){
			putBodyParameter("MainClass", mainClass);
		}
	}

	public Map<String,String> getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(Map<String,String> configuration) {
		this.configuration = configuration;	
		if (configuration != null) {
			putBodyParameter("Configuration" , new Gson().toJson(configuration));
		}	
	}

	public OssInfo getOssInfo() {
		return this.ossInfo;
	}

	public void setOssInfo(OssInfo ossInfo) {
		this.ossInfo = ossInfo;	
		if (ossInfo != null) {
			putBodyParameter("OssInfo" , new Gson().toJson(ossInfo));
		}	
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getMainFile() {
		return this.mainFile;
	}

	public void setMainFile(String mainFile) {
		this.mainFile = mainFile;
		if(mainFile != null){
			putBodyParameter("MainFile", mainFile);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<String> getFiles() {
		return this.files;
	}

	public void setFiles(List<String> files) {
		this.files = files;	
		if (files != null) {
			putBodyParameter("Files" , new Gson().toJson(files));
		}	
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putBodyParameter("AppCode", appCode);
		}
	}

	public List<String> getArguments() {
		return this.arguments;
	}

	public void setArguments(List<String> arguments) {
		this.arguments = arguments;	
		if (arguments != null) {
			putBodyParameter("Arguments" , new Gson().toJson(arguments));
		}	
	}

	public static class OssInfo {

		@SerializedName("Endpoint")
		private String endpoint;

		@SerializedName("AccessKeySecret")
		private String accessKeySecret;

		@SerializedName("AccessKeyId")
		private String accessKeyId;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}
	}

	@Override
	public Class<SubmitSparkJobResponse> getResponseClass() {
		return SubmitSparkJobResponse.class;
	}

}

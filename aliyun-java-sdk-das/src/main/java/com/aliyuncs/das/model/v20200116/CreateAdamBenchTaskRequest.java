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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAdamBenchTaskRequest extends RpcAcsRequest<CreateAdamBenchTaskResponse> {
	   

	private String srcEngine;

	private String description;

	private Long requestStartTime;

	private String dstSuperPassword;

	private String dstSuperAccount;

	private Integer rate;

	private String dstInstanceId;

	private Long requestDuration;

	private Double srcMeanQps;

	private Double srcMaxQps;

	private String srcEngineVersion;

	private String srcSqlOssAddr;
	public CreateAdamBenchTaskRequest() {
		super("DAS", "2020-01-16", "CreateAdamBenchTask", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSrcEngine() {
		return this.srcEngine;
	}

	public void setSrcEngine(String srcEngine) {
		this.srcEngine = srcEngine;
		if(srcEngine != null){
			putQueryParameter("SrcEngine", srcEngine);
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

	public Long getRequestStartTime() {
		return this.requestStartTime;
	}

	public void setRequestStartTime(Long requestStartTime) {
		this.requestStartTime = requestStartTime;
		if(requestStartTime != null){
			putQueryParameter("RequestStartTime", requestStartTime.toString());
		}
	}

	public String getDstSuperPassword() {
		return this.dstSuperPassword;
	}

	public void setDstSuperPassword(String dstSuperPassword) {
		this.dstSuperPassword = dstSuperPassword;
		if(dstSuperPassword != null){
			putQueryParameter("DstSuperPassword", dstSuperPassword);
		}
	}

	public String getDstSuperAccount() {
		return this.dstSuperAccount;
	}

	public void setDstSuperAccount(String dstSuperAccount) {
		this.dstSuperAccount = dstSuperAccount;
		if(dstSuperAccount != null){
			putQueryParameter("DstSuperAccount", dstSuperAccount);
		}
	}

	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
		if(rate != null){
			putQueryParameter("Rate", rate.toString());
		}
	}

	public String getDstInstanceId() {
		return this.dstInstanceId;
	}

	public void setDstInstanceId(String dstInstanceId) {
		this.dstInstanceId = dstInstanceId;
		if(dstInstanceId != null){
			putQueryParameter("DstInstanceId", dstInstanceId);
		}
	}

	public Long getRequestDuration() {
		return this.requestDuration;
	}

	public void setRequestDuration(Long requestDuration) {
		this.requestDuration = requestDuration;
		if(requestDuration != null){
			putQueryParameter("RequestDuration", requestDuration.toString());
		}
	}

	public Double getSrcMeanQps() {
		return this.srcMeanQps;
	}

	public void setSrcMeanQps(Double srcMeanQps) {
		this.srcMeanQps = srcMeanQps;
		if(srcMeanQps != null){
			putQueryParameter("SrcMeanQps", srcMeanQps.toString());
		}
	}

	public Double getSrcMaxQps() {
		return this.srcMaxQps;
	}

	public void setSrcMaxQps(Double srcMaxQps) {
		this.srcMaxQps = srcMaxQps;
		if(srcMaxQps != null){
			putQueryParameter("SrcMaxQps", srcMaxQps.toString());
		}
	}

	public String getSrcEngineVersion() {
		return this.srcEngineVersion;
	}

	public void setSrcEngineVersion(String srcEngineVersion) {
		this.srcEngineVersion = srcEngineVersion;
		if(srcEngineVersion != null){
			putQueryParameter("SrcEngineVersion", srcEngineVersion);
		}
	}

	public String getSrcSqlOssAddr() {
		return this.srcSqlOssAddr;
	}

	public void setSrcSqlOssAddr(String srcSqlOssAddr) {
		this.srcSqlOssAddr = srcSqlOssAddr;
		if(srcSqlOssAddr != null){
			putQueryParameter("SrcSqlOssAddr", srcSqlOssAddr);
		}
	}

	@Override
	public Class<CreateAdamBenchTaskResponse> getResponseClass() {
		return CreateAdamBenchTaskResponse.class;
	}

}

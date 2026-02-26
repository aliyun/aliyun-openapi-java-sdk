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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProductDistributeJobRequest extends RpcAcsRequest<CreateProductDistributeJobResponse> {
	   

	private String sourceInstanceId;

	private String targetAliyunId;

	private String productKey;

	private String targetInstanceId;

	private String targetUid;
	public CreateProductDistributeJobRequest() {
		super("Iot", "2018-01-20", "CreateProductDistributeJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceInstanceId() {
		return this.sourceInstanceId;
	}

	public void setSourceInstanceId(String sourceInstanceId) {
		this.sourceInstanceId = sourceInstanceId;
		if(sourceInstanceId != null){
			putQueryParameter("SourceInstanceId", sourceInstanceId);
		}
	}

	public String getTargetAliyunId() {
		return this.targetAliyunId;
	}

	public void setTargetAliyunId(String targetAliyunId) {
		this.targetAliyunId = targetAliyunId;
		if(targetAliyunId != null){
			putQueryParameter("TargetAliyunId", targetAliyunId);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getTargetInstanceId() {
		return this.targetInstanceId;
	}

	public void setTargetInstanceId(String targetInstanceId) {
		this.targetInstanceId = targetInstanceId;
		if(targetInstanceId != null){
			putQueryParameter("TargetInstanceId", targetInstanceId);
		}
	}

	public String getTargetUid() {
		return this.targetUid;
	}

	public void setTargetUid(String targetUid) {
		this.targetUid = targetUid;
		if(targetUid != null){
			putQueryParameter("TargetUid", targetUid);
		}
	}

	@Override
	public Class<CreateProductDistributeJobResponse> getResponseClass() {
		return CreateProductDistributeJobResponse.class;
	}

}

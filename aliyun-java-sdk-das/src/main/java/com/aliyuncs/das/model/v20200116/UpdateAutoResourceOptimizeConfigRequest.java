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
public class UpdateAutoResourceOptimizeConfigRequest extends RpcAcsRequest<UpdateAutoResourceOptimizeConfigResponse> {
	   

	private String __context;

	private String signature;

	private Integer autoDefragment;

	private Integer autoDuplicateIndexDelete;

	private String userId;

	private String uid;

	private String instanceId;

	private String accessKey;

	private Float tableSpaceSize;

	private Float tableFragmentationRatio;
	public UpdateAutoResourceOptimizeConfigRequest() {
		super("DAS", "2020-01-16", "UpdateAutoResourceOptimizeConfig", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String get__Context() {
		return this.__context;
	}

	public void set__Context(String __context) {
		this.__context = __context;
		if(__context != null){
			putQueryParameter("__context", __context);
		}
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
		if(signature != null){
			putQueryParameter("Signature", signature);
		}
	}

	public Integer getAutoDefragment() {
		return this.autoDefragment;
	}

	public void setAutoDefragment(Integer autoDefragment) {
		this.autoDefragment = autoDefragment;
		if(autoDefragment != null){
			putQueryParameter("AutoDefragment", autoDefragment.toString());
		}
	}

	public Integer getAutoDuplicateIndexDelete() {
		return this.autoDuplicateIndexDelete;
	}

	public void setAutoDuplicateIndexDelete(Integer autoDuplicateIndexDelete) {
		this.autoDuplicateIndexDelete = autoDuplicateIndexDelete;
		if(autoDuplicateIndexDelete != null){
			putQueryParameter("AutoDuplicateIndexDelete", autoDuplicateIndexDelete.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putQueryParameter("AccessKey", accessKey);
		}
	}

	public Float getTableSpaceSize() {
		return this.tableSpaceSize;
	}

	public void setTableSpaceSize(Float tableSpaceSize) {
		this.tableSpaceSize = tableSpaceSize;
		if(tableSpaceSize != null){
			putQueryParameter("TableSpaceSize", tableSpaceSize.toString());
		}
	}

	public Float getTableFragmentationRatio() {
		return this.tableFragmentationRatio;
	}

	public void setTableFragmentationRatio(Float tableFragmentationRatio) {
		this.tableFragmentationRatio = tableFragmentationRatio;
		if(tableFragmentationRatio != null){
			putQueryParameter("TableFragmentationRatio", tableFragmentationRatio.toString());
		}
	}

	@Override
	public Class<UpdateAutoResourceOptimizeConfigResponse> getResponseClass() {
		return UpdateAutoResourceOptimizeConfigResponse.class;
	}

}

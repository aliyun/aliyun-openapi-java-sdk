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

package com.aliyuncs.gts_smart_call.model.v20201021;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveCallOutRelationRequest extends RpcAcsRequest<SaveCallOutRelationResponse> {
	   

	private String acid;

	private String caller;

	private String appName;

	private String callee;

	private String targetBizId;
	public SaveCallOutRelationRequest() {
		super("gts-smart-call", "2020-10-21", "SaveCallOutRelation");
		setMethod(MethodType.POST);
	}

	public String getAcid() {
		return this.acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
		if(acid != null){
			putQueryParameter("Acid", acid);
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = callee;
		if(callee != null){
			putQueryParameter("Callee", callee);
		}
	}

	public String getTargetBizId() {
		return this.targetBizId;
	}

	public void setTargetBizId(String targetBizId) {
		this.targetBizId = targetBizId;
		if(targetBizId != null){
			putQueryParameter("TargetBizId", targetBizId);
		}
	}

	@Override
	public Class<SaveCallOutRelationResponse> getResponseClass() {
		return SaveCallOutRelationResponse.class;
	}

}

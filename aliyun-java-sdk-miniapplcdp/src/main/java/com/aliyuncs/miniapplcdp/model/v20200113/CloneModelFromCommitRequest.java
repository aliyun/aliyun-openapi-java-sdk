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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CloneModelFromCommitRequest extends RpcAcsRequest<CloneModelFromCommitResponse> {
	   

	private String targetSubType;

	private String targetModuleId;

	private String modelId;

	private String source;

	private String targetName;

	private String sourceCommitId;

	private String subType;

	private String sourceModuleId;
	public CloneModelFromCommitRequest() {
		super("miniapplcdp", "2020-01-13", "CloneModelFromCommit");
		setMethod(MethodType.POST);
	}

	public String getTargetSubType() {
		return this.targetSubType;
	}

	public void setTargetSubType(String targetSubType) {
		this.targetSubType = targetSubType;
		if(targetSubType != null){
			putQueryParameter("TargetSubType", targetSubType);
		}
	}

	public String getTargetModuleId() {
		return this.targetModuleId;
	}

	public void setTargetModuleId(String targetModuleId) {
		this.targetModuleId = targetModuleId;
		if(targetModuleId != null){
			putQueryParameter("TargetModuleId", targetModuleId);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
		if(targetName != null){
			putQueryParameter("TargetName", targetName);
		}
	}

	public String getSourceCommitId() {
		return this.sourceCommitId;
	}

	public void setSourceCommitId(String sourceCommitId) {
		this.sourceCommitId = sourceCommitId;
		if(sourceCommitId != null){
			putQueryParameter("SourceCommitId", sourceCommitId);
		}
	}

	public String getSubType() {
		return this.subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
		if(subType != null){
			putQueryParameter("SubType", subType);
		}
	}

	public String getSourceModuleId() {
		return this.sourceModuleId;
	}

	public void setSourceModuleId(String sourceModuleId) {
		this.sourceModuleId = sourceModuleId;
		if(sourceModuleId != null){
			putQueryParameter("SourceModuleId", sourceModuleId);
		}
	}

	@Override
	public Class<CloneModelFromCommitResponse> getResponseClass() {
		return CloneModelFromCommitResponse.class;
	}

}

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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateOuterAgentRequest extends RpcAcsRequest<CreateOuterAgentResponse> {
	   

	private String outerType;

	private String outerBuId;

	private String outerAccountId;

	private String outerAccountName;

	private String showName;

	private Integer maxServiceNum;
	public CreateOuterAgentRequest() {
		super("CCCXSpaceInner", "2019-12-27", "CreateOuterAgent");
		setMethod(MethodType.POST);
	}

	public String getOuterType() {
		return this.outerType;
	}

	public void setOuterType(String outerType) {
		this.outerType = outerType;
		if(outerType != null){
			putBodyParameter("OuterType", outerType);
		}
	}

	public String getOuterBuId() {
		return this.outerBuId;
	}

	public void setOuterBuId(String outerBuId) {
		this.outerBuId = outerBuId;
		if(outerBuId != null){
			putBodyParameter("OuterBuId", outerBuId);
		}
	}

	public String getOuterAccountId() {
		return this.outerAccountId;
	}

	public void setOuterAccountId(String outerAccountId) {
		this.outerAccountId = outerAccountId;
		if(outerAccountId != null){
			putBodyParameter("OuterAccountId", outerAccountId);
		}
	}

	public String getOuterAccountName() {
		return this.outerAccountName;
	}

	public void setOuterAccountName(String outerAccountName) {
		this.outerAccountName = outerAccountName;
		if(outerAccountName != null){
			putBodyParameter("OuterAccountName", outerAccountName);
		}
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
		if(showName != null){
			putBodyParameter("ShowName", showName);
		}
	}

	public Integer getMaxServiceNum() {
		return this.maxServiceNum;
	}

	public void setMaxServiceNum(Integer maxServiceNum) {
		this.maxServiceNum = maxServiceNum;
		if(maxServiceNum != null){
			putBodyParameter("MaxServiceNum", maxServiceNum.toString());
		}
	}

	@Override
	public Class<CreateOuterAgentResponse> getResponseClass() {
		return CreateOuterAgentResponse.class;
	}

}

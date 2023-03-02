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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddBsnFabricBizChainRequest extends RpcAcsRequest<AddBsnFabricBizChainResponse> {
	   

	private String remark;

	private String name;

	private String appCode;

	private String nodeList;

	private String userCode;
	public AddBsnFabricBizChainRequest() {
		super("lto", "2021-07-07", "AddBsnFabricBizChain");
		setMethod(MethodType.POST);
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public String getNodeList() {
		return this.nodeList;
	}

	public void setNodeList(String nodeList) {
		this.nodeList = nodeList;
		if(nodeList != null){
			putQueryParameter("NodeList", nodeList);
		}
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
		if(userCode != null){
			putQueryParameter("UserCode", userCode);
		}
	}

	@Override
	public Class<AddBsnFabricBizChainResponse> getResponseClass() {
		return AddBsnFabricBizChainResponse.class;
	}

}

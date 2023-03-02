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
public class ListRouteRuleRequest extends RpcAcsRequest<ListRouteRuleResponse> {
	   

	private Integer num;

	private String bizChainName;

	private Integer size;

	private String deviceGroupName;

	private String chainUpMode;
	public ListRouteRuleRequest() {
		super("lto", "2021-07-07", "ListRouteRule");
		setMethod(MethodType.POST);
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
		if(num != null){
			putQueryParameter("Num", num.toString());
		}
	}

	public String getBizChainName() {
		return this.bizChainName;
	}

	public void setBizChainName(String bizChainName) {
		this.bizChainName = bizChainName;
		if(bizChainName != null){
			putQueryParameter("BizChainName", bizChainName);
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getDeviceGroupName() {
		return this.deviceGroupName;
	}

	public void setDeviceGroupName(String deviceGroupName) {
		this.deviceGroupName = deviceGroupName;
		if(deviceGroupName != null){
			putQueryParameter("DeviceGroupName", deviceGroupName);
		}
	}

	public String getChainUpMode() {
		return this.chainUpMode;
	}

	public void setChainUpMode(String chainUpMode) {
		this.chainUpMode = chainUpMode;
		if(chainUpMode != null){
			putQueryParameter("ChainUpMode", chainUpMode);
		}
	}

	@Override
	public Class<ListRouteRuleResponse> getResponseClass() {
		return ListRouteRuleResponse.class;
	}

}

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

package com.aliyuncs.beian.model.v20160810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InsertUnbeianIpCheckTypeRequest extends RpcAcsRequest<InsertUnbeianIpCheckTypeResponse> {
	   

	private String ip;

	private String remark;

	private Integer checkType;

	private String caller;
	public InsertUnbeianIpCheckTypeRequest() {
		super("Beian", "2016-08-10", "InsertUnbeianIpCheckType");
		setMethod(MethodType.POST);
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
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

	public Integer getCheckType() {
		return this.checkType;
	}

	public void setCheckType(Integer checkType) {
		this.checkType = checkType;
		if(checkType != null){
			putQueryParameter("CheckType", checkType.toString());
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

	@Override
	public Class<InsertUnbeianIpCheckTypeResponse> getResponseClass() {
		return InsertUnbeianIpCheckTypeResponse.class;
	}

}

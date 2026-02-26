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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ManageAccessorDomainWhiteListRequest extends RpcAcsRequest<ManageAccessorDomainWhiteListResponse> {
	   

	private String endTime;

	private List<String> domainss;

	private String remark;

	private String startTime;

	private String caller;

	private String operation;
	public ManageAccessorDomainWhiteListRequest() {
		super("Beian", "2016-08-10", "ManageAccessorDomainWhiteList");
		setMethod(MethodType.POST);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public List<String> getDomainss() {
		return this.domainss;
	}

	public void setDomainss(List<String> domainss) {
		this.domainss = domainss;	
		if (domainss != null) {
			for (int i = 0; i < domainss.size(); i++) {
				putQueryParameter("Domains." + (i + 1) , domainss.get(i));
			}
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<ManageAccessorDomainWhiteListResponse> getResponseClass() {
		return ManageAccessorDomainWhiteListResponse.class;
	}

}

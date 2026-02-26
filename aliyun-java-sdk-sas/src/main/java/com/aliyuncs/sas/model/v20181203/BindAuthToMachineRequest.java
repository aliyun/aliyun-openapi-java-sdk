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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindAuthToMachineRequest extends RpcAcsRequest<BindAuthToMachineResponse> {
	   

	private String criteria;

	private Boolean bindAll;

	private List<String> binds;

	private Integer authVersion;

	private String logicalExp;

	private Integer autoBind;

	private List<String> unBinds;
	public BindAuthToMachineRequest() {
		super("Sas", "2018-12-03", "BindAuthToMachine");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
		if(criteria != null){
			putQueryParameter("Criteria", criteria);
		}
	}

	public Boolean getBindAll() {
		return this.bindAll;
	}

	public void setBindAll(Boolean bindAll) {
		this.bindAll = bindAll;
		if(bindAll != null){
			putQueryParameter("BindAll", bindAll.toString());
		}
	}

	public List<String> getBinds() {
		return this.binds;
	}

	public void setBinds(List<String> binds) {
		this.binds = binds;	
		if (binds != null) {
			for (int i = 0; i < binds.size(); i++) {
				putQueryParameter("Bind." + (i + 1) , binds.get(i));
			}
		}	
	}

	public Integer getAuthVersion() {
		return this.authVersion;
	}

	public void setAuthVersion(Integer authVersion) {
		this.authVersion = authVersion;
		if(authVersion != null){
			putQueryParameter("AuthVersion", authVersion.toString());
		}
	}

	public String getLogicalExp() {
		return this.logicalExp;
	}

	public void setLogicalExp(String logicalExp) {
		this.logicalExp = logicalExp;
		if(logicalExp != null){
			putQueryParameter("LogicalExp", logicalExp);
		}
	}

	public Integer getAutoBind() {
		return this.autoBind;
	}

	public void setAutoBind(Integer autoBind) {
		this.autoBind = autoBind;
		if(autoBind != null){
			putQueryParameter("AutoBind", autoBind.toString());
		}
	}

	public List<String> getUnBinds() {
		return this.unBinds;
	}

	public void setUnBinds(List<String> unBinds) {
		this.unBinds = unBinds;	
		if (unBinds != null) {
			for (int i = 0; i < unBinds.size(); i++) {
				putQueryParameter("UnBind." + (i + 1) , unBinds.get(i));
			}
		}	
	}

	@Override
	public Class<BindAuthToMachineResponse> getResponseClass() {
		return BindAuthToMachineResponse.class;
	}

}

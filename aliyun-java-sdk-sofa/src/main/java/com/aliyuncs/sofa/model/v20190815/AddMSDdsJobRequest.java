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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddMSDdsJobRequest extends RpcAcsRequest<AddMSDdsJobResponse> {
	   

	private String app;

	private String cron;

	private String des;

	private String instanceId;

	private String name;

	private List<String> customParamss;

	private Integer shardingCount;

	private String status;
	public AddMSDdsJobRequest() {
		super("SOFA", "2019-08-15", "AddMSDdsJob", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putBodyParameter("App", app);
		}
	}

	public String getCron() {
		return this.cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
		if(cron != null){
			putBodyParameter("Cron", cron);
		}
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
		if(des != null){
			putBodyParameter("Des", des);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<String> getCustomParamss() {
		return this.customParamss;
	}

	public void setCustomParamss(List<String> customParamss) {
		this.customParamss = customParamss;	
		if (customParamss != null) {
			for (int i = 0; i < customParamss.size(); i++) {
				putBodyParameter("CustomParams." + (i + 1) , customParamss.get(i));
			}
		}	
	}

	public Integer getShardingCount() {
		return this.shardingCount;
	}

	public void setShardingCount(Integer shardingCount) {
		this.shardingCount = shardingCount;
		if(shardingCount != null){
			putBodyParameter("ShardingCount", shardingCount.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<AddMSDdsJobResponse> getResponseClass() {
		return AddMSDdsJobResponse.class;
	}

}

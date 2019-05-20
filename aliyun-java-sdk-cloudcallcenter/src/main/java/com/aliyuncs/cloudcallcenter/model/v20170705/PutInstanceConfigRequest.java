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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class PutInstanceConfigRequest extends RpcAcsRequest<PutInstanceConfigResponse> {
	
	public PutInstanceConfigRequest() {
		super("CloudCallCenter", "2017-07-05", "PutInstanceConfig", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private List<String> names;

	private List<String> values;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getNames() {
		return this.names;
	}

	public void setNames(List<String> names) {
		this.names = names;	
		if (names != null) {
			for (int i = 0; i < names.size(); i++) {
				putQueryParameter("name." + (i + 1) , names.get(i));
			}
		}	
	}

	public List<String> getValues() {
		return this.values;
	}

	public void setValues(List<String> values) {
		this.values = values;	
		if (values != null) {
			for (int i = 0; i < values.size(); i++) {
				putQueryParameter("value." + (i + 1) , values.get(i));
			}
		}	
	}

	@Override
	public Class<PutInstanceConfigResponse> getResponseClass() {
		return PutInstanceConfigResponse.class;
	}

}

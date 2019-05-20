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

/**
 * @author auto create
 * @version 
 */
public class GetConfigItemForFlatRequest extends RpcAcsRequest<GetConfigItemForFlatResponse> {
	
	public GetConfigItemForFlatRequest() {
		super("CloudCallCenter", "2017-07-05", "GetConfigItemForFlat", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String name;

	private String dimensionName;

	private String dimension;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getDimensionName() {
		return this.dimensionName;
	}

	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName;
		if(dimensionName != null){
			putQueryParameter("DimensionName", dimensionName);
		}
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension);
		}
	}

	@Override
	public Class<GetConfigItemForFlatResponse> getResponseClass() {
		return GetConfigItemForFlatResponse.class;
	}

}

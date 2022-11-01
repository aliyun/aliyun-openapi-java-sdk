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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersRequest extends RpcAcsRequest<DescribeParametersResponse> {
	   

	private String dimensionValue;

	private String instanceId;

	private String dimension;
	public DescribeParametersRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeParameters");
		setMethod(MethodType.POST);
	}

	public String getDimensionValue() {
		return this.dimensionValue;
	}

	public void setDimensionValue(String dimensionValue) {
		this.dimensionValue = dimensionValue;
		if(dimensionValue != null){
			putBodyParameter("DimensionValue", dimensionValue);
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

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putBodyParameter("Dimension", dimension);
		}
	}

	@Override
	public Class<DescribeParametersResponse> getResponseClass() {
		return DescribeParametersResponse.class;
	}

}

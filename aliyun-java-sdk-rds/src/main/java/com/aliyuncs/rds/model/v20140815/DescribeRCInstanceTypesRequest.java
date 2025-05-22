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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInstanceTypesRequest extends RpcAcsRequest<DescribeRCInstanceTypesResponse> {
	   

	private String instanceTypeFamily;

	private String commodityCode;

	private String engine;

	private List<String> instanceType;
	public DescribeRCInstanceTypesRequest() {
		super("Rds", "2014-08-15", "DescribeRCInstanceTypes", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public List<String> getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(List<String> instanceType) {
		this.instanceType = instanceType;	
		if (instanceType != null) {
			String instanceTypeArrVal = "";
			for(int depth1 = 0; depth1 < instanceType.size(); depth1++) {
				instanceTypeArrVal += instanceType.get(depth1) + ",";
			}
			if (instanceTypeArrVal.length() > 0) {
				instanceTypeArrVal = instanceTypeArrVal.substring(0, instanceTypeArrVal.length() - 1);
			}
			putQueryParameter("InstanceType" , instanceTypeArrVal);
		}	
	}

	@Override
	public Class<DescribeRCInstanceTypesResponse> getResponseClass() {
		return DescribeRCInstanceTypesResponse.class;
	}

}

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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsNetDistrictRequest extends RpcAcsRequest<DescribeEnsNetDistrictResponse> {
	   

	private String netLevelCode;

	private String netDistrictCode;
	public DescribeEnsNetDistrictRequest() {
		super("Ens", "2017-11-10", "DescribeEnsNetDistrict", "ens");
		setMethod(MethodType.POST);
	}

	public String getNetLevelCode() {
		return this.netLevelCode;
	}

	public void setNetLevelCode(String netLevelCode) {
		this.netLevelCode = netLevelCode;
		if(netLevelCode != null){
			putQueryParameter("NetLevelCode", netLevelCode);
		}
	}

	public String getNetDistrictCode() {
		return this.netDistrictCode;
	}

	public void setNetDistrictCode(String netDistrictCode) {
		this.netDistrictCode = netDistrictCode;
		if(netDistrictCode != null){
			putQueryParameter("NetDistrictCode", netDistrictCode);
		}
	}

	@Override
	public Class<DescribeEnsNetDistrictResponse> getResponseClass() {
		return DescribeEnsNetDistrictResponse.class;
	}

}

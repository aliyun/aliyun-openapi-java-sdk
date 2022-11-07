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
public class DescribeTimeZonesRequest extends RpcAcsRequest<DescribeTimeZonesResponse> {
	   
	public DescribeTimeZonesRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeTimeZones");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<DescribeTimeZonesResponse> getResponseClass() {
		return DescribeTimeZonesResponse.class;
	}

}

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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.DescribeInstanceResponse;
import com.aliyuncs.airec.model.v20201126.DescribeInstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setCode(_ctx.stringValue("DescribeInstanceResponse.code"));
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.requestId"));
		describeInstanceResponse.setMessage(_ctx.stringValue("DescribeInstanceResponse.message"));

		Result result = new Result();
		result.setRegionId(_ctx.stringValue("DescribeInstanceResponse.result.regionId"));
		result.setType(_ctx.stringValue("DescribeInstanceResponse.result.type"));
		result.setLockMode(_ctx.stringValue("DescribeInstanceResponse.result.lockMode"));
		result.setExpiredTime(_ctx.stringValue("DescribeInstanceResponse.result.expiredTime"));
		result.setScene(_ctx.stringValue("DescribeInstanceResponse.result.scene"));
		result.setStatus(_ctx.stringValue("DescribeInstanceResponse.result.status"));
		result.setGmtCreate(_ctx.stringValue("DescribeInstanceResponse.result.gmtCreate"));
		result.setChargeType(_ctx.stringValue("DescribeInstanceResponse.result.chargeType"));
		result.setIndustry(_ctx.stringValue("DescribeInstanceResponse.result.industry"));
		result.setCommodityCode(_ctx.stringValue("DescribeInstanceResponse.result.commodityCode"));
		result.setGmtModified(_ctx.stringValue("DescribeInstanceResponse.result.gmtModified"));
		result.setDataSetVersion(_ctx.stringValue("DescribeInstanceResponse.result.dataSetVersion"));
		result.setName(_ctx.stringValue("DescribeInstanceResponse.result.name"));
		result.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.result.instanceId"));
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}
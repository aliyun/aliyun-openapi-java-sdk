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
		describeInstanceResponse.setMessage(_ctx.stringValue("DescribeInstanceResponse.message"));
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.requestId"));

		Result result = new Result();
		result.setChargeType(_ctx.stringValue("DescribeInstanceResponse.result.chargeType"));
		result.setCommodityCode(_ctx.stringValue("DescribeInstanceResponse.result.commodityCode"));
		result.setDataSetVersion(_ctx.stringValue("DescribeInstanceResponse.result.dataSetVersion"));
		result.setExpiredTime(_ctx.stringValue("DescribeInstanceResponse.result.expiredTime"));
		result.setGmtCreate(_ctx.stringValue("DescribeInstanceResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("DescribeInstanceResponse.result.gmtModified"));
		result.setIndustry(_ctx.stringValue("DescribeInstanceResponse.result.industry"));
		result.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.result.instanceId"));
		result.setLockMode(_ctx.stringValue("DescribeInstanceResponse.result.lockMode"));
		result.setName(_ctx.stringValue("DescribeInstanceResponse.result.name"));
		result.setRegionId(_ctx.stringValue("DescribeInstanceResponse.result.regionId"));
		result.setScene(_ctx.stringValue("DescribeInstanceResponse.result.scene"));
		result.setStatus(_ctx.stringValue("DescribeInstanceResponse.result.status"));
		result.setType(_ctx.stringValue("DescribeInstanceResponse.result.type"));
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}
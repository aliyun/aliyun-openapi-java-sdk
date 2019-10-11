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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.DescribeInstanceResponse;
import com.aliyuncs.airec.model.v20181012.DescribeInstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setCode(_ctx.stringValue("DescribeInstanceResponse.Code"));
		describeInstanceResponse.setMessage(_ctx.stringValue("DescribeInstanceResponse.Message"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.Result.InstanceId"));
		result.setChargeType(_ctx.stringValue("DescribeInstanceResponse.Result.ChargeType"));
		result.setRegionId(_ctx.stringValue("DescribeInstanceResponse.Result.RegionId"));
		result.setName(_ctx.stringValue("DescribeInstanceResponse.Result.Name"));
		result.setType(_ctx.stringValue("DescribeInstanceResponse.Result.Type"));
		result.setExpiredTime(_ctx.stringValue("DescribeInstanceResponse.Result.ExpiredTime"));
		result.setGmtCreate(_ctx.stringValue("DescribeInstanceResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("DescribeInstanceResponse.Result.GmtModified"));
		result.setStatus(_ctx.stringValue("DescribeInstanceResponse.Result.Status"));
		result.setIndustry(_ctx.stringValue("DescribeInstanceResponse.Result.Industry"));
		result.setScene(_ctx.stringValue("DescribeInstanceResponse.Result.Scene"));
		result.setDataSetVersion(_ctx.stringValue("DescribeInstanceResponse.Result.DataSetVersion"));
		result.setCommodityCode(_ctx.stringValue("DescribeInstanceResponse.Result.CommodityCode"));
		result.setLockMode(_ctx.stringValue("DescribeInstanceResponse.Result.LockMode"));
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}
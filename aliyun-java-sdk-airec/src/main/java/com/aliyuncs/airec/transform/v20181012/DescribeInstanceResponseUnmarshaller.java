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

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext context) {
		
		describeInstanceResponse.setRequestId(context.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setCode(context.stringValue("DescribeInstanceResponse.Code"));
		describeInstanceResponse.setMessage(context.stringValue("DescribeInstanceResponse.Message"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("DescribeInstanceResponse.Result.InstanceId"));
		result.setChargeType(context.stringValue("DescribeInstanceResponse.Result.ChargeType"));
		result.setRegionId(context.stringValue("DescribeInstanceResponse.Result.RegionId"));
		result.setName(context.stringValue("DescribeInstanceResponse.Result.Name"));
		result.setType(context.stringValue("DescribeInstanceResponse.Result.Type"));
		result.setExpiredTime(context.stringValue("DescribeInstanceResponse.Result.ExpiredTime"));
		result.setGmtCreate(context.stringValue("DescribeInstanceResponse.Result.GmtCreate"));
		result.setGmtModified(context.stringValue("DescribeInstanceResponse.Result.GmtModified"));
		result.setStatus(context.stringValue("DescribeInstanceResponse.Result.Status"));
		result.setIndustry(context.stringValue("DescribeInstanceResponse.Result.Industry"));
		result.setScene(context.stringValue("DescribeInstanceResponse.Result.Scene"));
		result.setDataSetVersion(context.stringValue("DescribeInstanceResponse.Result.DataSetVersion"));
		result.setCommodityCode(context.stringValue("DescribeInstanceResponse.Result.CommodityCode"));
		result.setLockMode(context.stringValue("DescribeInstanceResponse.Result.LockMode"));
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}
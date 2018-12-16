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

import com.aliyuncs.airec.model.v20181012.DescribeQuotaResponse;
import com.aliyuncs.airec.model.v20181012.DescribeQuotaResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQuotaResponseUnmarshaller {

	public static DescribeQuotaResponse unmarshall(DescribeQuotaResponse describeQuotaResponse, UnmarshallerContext context) {
		
		describeQuotaResponse.setRequestId(context.stringValue("DescribeQuotaResponse.RequestId"));
		describeQuotaResponse.setCode(context.stringValue("DescribeQuotaResponse.Code"));
		describeQuotaResponse.setMessage(context.stringValue("DescribeQuotaResponse.Message"));

		Result result = new Result();
		result.setUserCount(context.longValue("DescribeQuotaResponse.Result.UserCount"));
		result.setUserCountUsed(context.longValue("DescribeQuotaResponse.Result.UserCountUsed"));
		result.setItemCount(context.longValue("DescribeQuotaResponse.Result.ItemCount"));
		result.setItemCountUsed(context.longValue("DescribeQuotaResponse.Result.ItemCountUsed"));
		result.setQps(context.integerValue("DescribeQuotaResponse.Result.Qps"));
		result.setCurrentQps(context.integerValue("DescribeQuotaResponse.Result.CurrentQps"));
		describeQuotaResponse.setResult(result);
	 
	 	return describeQuotaResponse;
	}
}
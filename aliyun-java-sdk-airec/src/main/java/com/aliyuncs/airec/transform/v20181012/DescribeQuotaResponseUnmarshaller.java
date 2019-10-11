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

	public static DescribeQuotaResponse unmarshall(DescribeQuotaResponse describeQuotaResponse, UnmarshallerContext _ctx) {
		
		describeQuotaResponse.setRequestId(_ctx.stringValue("DescribeQuotaResponse.RequestId"));
		describeQuotaResponse.setCode(_ctx.stringValue("DescribeQuotaResponse.Code"));
		describeQuotaResponse.setMessage(_ctx.stringValue("DescribeQuotaResponse.Message"));

		Result result = new Result();
		result.setUserCount(_ctx.longValue("DescribeQuotaResponse.Result.UserCount"));
		result.setUserCountUsed(_ctx.longValue("DescribeQuotaResponse.Result.UserCountUsed"));
		result.setItemCount(_ctx.longValue("DescribeQuotaResponse.Result.ItemCount"));
		result.setItemCountUsed(_ctx.longValue("DescribeQuotaResponse.Result.ItemCountUsed"));
		result.setQps(_ctx.integerValue("DescribeQuotaResponse.Result.Qps"));
		result.setCurrentQps(_ctx.integerValue("DescribeQuotaResponse.Result.CurrentQps"));
		describeQuotaResponse.setResult(result);
	 
	 	return describeQuotaResponse;
	}
}
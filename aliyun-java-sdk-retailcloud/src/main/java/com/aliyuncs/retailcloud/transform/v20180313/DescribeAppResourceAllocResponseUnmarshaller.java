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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.DescribeAppResourceAllocResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeAppResourceAllocResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppResourceAllocResponseUnmarshaller {

	public static DescribeAppResourceAllocResponse unmarshall(DescribeAppResourceAllocResponse describeAppResourceAllocResponse, UnmarshallerContext _ctx) {
		
		describeAppResourceAllocResponse.setRequestId(_ctx.stringValue("DescribeAppResourceAllocResponse.RequestId"));
		describeAppResourceAllocResponse.setCode(_ctx.integerValue("DescribeAppResourceAllocResponse.Code"));
		describeAppResourceAllocResponse.setErrMsg(_ctx.stringValue("DescribeAppResourceAllocResponse.ErrMsg"));
		describeAppResourceAllocResponse.setSuccess(_ctx.booleanValue("DescribeAppResourceAllocResponse.Success"));

		Result result = new Result();
		result.setAppEnvId(_ctx.longValue("DescribeAppResourceAllocResponse.Result.AppEnvId"));
		result.setAppId(_ctx.longValue("DescribeAppResourceAllocResponse.Result.AppId"));
		result.setClusterId(_ctx.stringValue("DescribeAppResourceAllocResponse.Result.ClusterId"));
		result.setId(_ctx.longValue("DescribeAppResourceAllocResponse.Result.Id"));
		result.setResourceDef(_ctx.stringValue("DescribeAppResourceAllocResponse.Result.ResourceDef"));
		describeAppResourceAllocResponse.setResult(result);
	 
	 	return describeAppResourceAllocResponse;
	}
}
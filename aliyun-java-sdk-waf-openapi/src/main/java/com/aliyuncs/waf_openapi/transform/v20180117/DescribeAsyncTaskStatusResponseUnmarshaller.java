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

package com.aliyuncs.waf_openapi.transform.v20180117;

import com.aliyuncs.waf_openapi.model.v20180117.DescribeAsyncTaskStatusResponse;
import com.aliyuncs.waf_openapi.model.v20180117.DescribeAsyncTaskStatusResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAsyncTaskStatusResponseUnmarshaller {

	public static DescribeAsyncTaskStatusResponse unmarshall(DescribeAsyncTaskStatusResponse describeAsyncTaskStatusResponse, UnmarshallerContext _ctx) {
		
		describeAsyncTaskStatusResponse.setRequestId(_ctx.stringValue("DescribeAsyncTaskStatusResponse.RequestId"));

		Result result = new Result();
		result.setAsyncTaskStatus(_ctx.stringValue("DescribeAsyncTaskStatusResponse.Result.AsyncTaskStatus"));
		result.setProgress(_ctx.integerValue("DescribeAsyncTaskStatusResponse.Result.Progress"));
		result.setErrCode(_ctx.stringValue("DescribeAsyncTaskStatusResponse.Result.ErrCode"));
		result.setErrMsg(_ctx.stringValue("DescribeAsyncTaskStatusResponse.Result.ErrMsg"));
		result.setData(_ctx.stringValue("DescribeAsyncTaskStatusResponse.Result.Data"));
		describeAsyncTaskStatusResponse.setResult(result);
	 
	 	return describeAsyncTaskStatusResponse;
	}
}
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

import com.aliyuncs.retailcloud.model.v20180313.DescribeAppEnvironmentDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeAppEnvironmentDetailResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppEnvironmentDetailResponseUnmarshaller {

	public static DescribeAppEnvironmentDetailResponse unmarshall(DescribeAppEnvironmentDetailResponse describeAppEnvironmentDetailResponse, UnmarshallerContext _ctx) {
		
		describeAppEnvironmentDetailResponse.setRequestId(_ctx.stringValue("DescribeAppEnvironmentDetailResponse.RequestId"));
		describeAppEnvironmentDetailResponse.setCode(_ctx.integerValue("DescribeAppEnvironmentDetailResponse.Code"));
		describeAppEnvironmentDetailResponse.setErrMsg(_ctx.stringValue("DescribeAppEnvironmentDetailResponse.ErrMsg"));

		Result result = new Result();
		result.setAppId(_ctx.longValue("DescribeAppEnvironmentDetailResponse.Result.AppId"));
		result.setEnvId(_ctx.longValue("DescribeAppEnvironmentDetailResponse.Result.EnvId"));
		result.setEnvName(_ctx.stringValue("DescribeAppEnvironmentDetailResponse.Result.EnvName"));
		result.setEnvType(_ctx.integerValue("DescribeAppEnvironmentDetailResponse.Result.EnvType"));
		result.setEnvTypeName(_ctx.stringValue("DescribeAppEnvironmentDetailResponse.Result.EnvTypeName"));
		result.setAppSchemaId(_ctx.longValue("DescribeAppEnvironmentDetailResponse.Result.AppSchemaId"));
		result.setRegion(_ctx.stringValue("DescribeAppEnvironmentDetailResponse.Result.Region"));
		result.setReplicas(_ctx.integerValue("DescribeAppEnvironmentDetailResponse.Result.Replicas"));
		describeAppEnvironmentDetailResponse.setResult(result);
	 
	 	return describeAppEnvironmentDetailResponse;
	}
}
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

import com.aliyuncs.retailcloud.model.v20180313.DescribeEciConfigResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeEciConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEciConfigResponseUnmarshaller {

	public static DescribeEciConfigResponse unmarshall(DescribeEciConfigResponse describeEciConfigResponse, UnmarshallerContext _ctx) {
		
		describeEciConfigResponse.setRequestId(_ctx.stringValue("DescribeEciConfigResponse.RequestId"));
		describeEciConfigResponse.setErrMsg(_ctx.stringValue("DescribeEciConfigResponse.ErrMsg"));
		describeEciConfigResponse.setCode(_ctx.integerValue("DescribeEciConfigResponse.Code"));

		Result result = new Result();
		result.setAppEnvId(_ctx.longValue("DescribeEciConfigResponse.Result.AppEnvId"));
		result.setScheduleVirtualNode(_ctx.booleanValue("DescribeEciConfigResponse.Result.ScheduleVirtualNode"));
		result.setMirrorCache(_ctx.booleanValue("DescribeEciConfigResponse.Result.MirrorCache"));
		result.setEipBandwidth(_ctx.integerValue("DescribeEciConfigResponse.Result.EipBandwidth"));
		result.setNormalInstanceLimit(_ctx.integerValue("DescribeEciConfigResponse.Result.NormalInstanceLimit"));
		result.setEnableEciSchedulePolicy(_ctx.booleanValue("DescribeEciConfigResponse.Result.EnableEciSchedulePolicy"));
		describeEciConfigResponse.setResult(result);
	 
	 	return describeEciConfigResponse;
	}
}
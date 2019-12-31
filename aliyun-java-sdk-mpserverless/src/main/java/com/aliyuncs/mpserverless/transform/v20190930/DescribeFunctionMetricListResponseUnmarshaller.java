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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.DescribeFunctionMetricListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFunctionMetricListResponseUnmarshaller {

	public static DescribeFunctionMetricListResponse unmarshall(DescribeFunctionMetricListResponse describeFunctionMetricListResponse, UnmarshallerContext _ctx) {
		
		describeFunctionMetricListResponse.setRequestId(_ctx.stringValue("DescribeFunctionMetricListResponse.RequestId"));
		describeFunctionMetricListResponse.setHttpStatusCode(_ctx.stringValue("DescribeFunctionMetricListResponse.HttpStatusCode"));
		describeFunctionMetricListResponse.setSuccess(_ctx.booleanValue("DescribeFunctionMetricListResponse.Success"));
		describeFunctionMetricListResponse.setCode(_ctx.stringValue("DescribeFunctionMetricListResponse.Code"));
		describeFunctionMetricListResponse.setMessage(_ctx.stringValue("DescribeFunctionMetricListResponse.Message"));
		describeFunctionMetricListResponse.setDatapoints(_ctx.stringValue("DescribeFunctionMetricListResponse.Datapoints"));
		describeFunctionMetricListResponse.setPeriod(_ctx.stringValue("DescribeFunctionMetricListResponse.Period"));
		describeFunctionMetricListResponse.setNextToken(_ctx.stringValue("DescribeFunctionMetricListResponse.NextToken"));
	 
	 	return describeFunctionMetricListResponse;
	}
}
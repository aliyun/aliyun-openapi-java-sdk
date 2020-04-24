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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeBenchmarkResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBenchmarkResponseUnmarshaller {

	public static DescribeBenchmarkResponse unmarshall(DescribeBenchmarkResponse describeBenchmarkResponse, UnmarshallerContext _ctx) {
		
		describeBenchmarkResponse.setRequestId(_ctx.stringValue("DescribeBenchmarkResponse.RequestId"));
		describeBenchmarkResponse.setCode(_ctx.stringValue("DescribeBenchmarkResponse.Code"));
		describeBenchmarkResponse.setMessage(_ctx.stringValue("DescribeBenchmarkResponse.Message"));
		describeBenchmarkResponse.setRouteResponseBody(_ctx.mapValue("DescribeBenchmarkResponse.RouteResponseBody"));
		describeBenchmarkResponse.setSuccess(_ctx.stringValue("DescribeBenchmarkResponse.Success"));
	 
	 	return describeBenchmarkResponse;
	}
}
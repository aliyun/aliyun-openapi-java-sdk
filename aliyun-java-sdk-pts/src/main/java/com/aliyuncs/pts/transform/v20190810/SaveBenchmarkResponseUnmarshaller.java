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

import com.aliyuncs.pts.model.v20190810.SaveBenchmarkResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveBenchmarkResponseUnmarshaller {

	public static SaveBenchmarkResponse unmarshall(SaveBenchmarkResponse saveBenchmarkResponse, UnmarshallerContext _ctx) {
		
		saveBenchmarkResponse.setRequestId(_ctx.stringValue("SaveBenchmarkResponse.RequestId"));
		saveBenchmarkResponse.setCode(_ctx.stringValue("SaveBenchmarkResponse.Code"));
		saveBenchmarkResponse.setMessage(_ctx.stringValue("SaveBenchmarkResponse.Message"));
		saveBenchmarkResponse.setRouteResponseBody(_ctx.mapValue("SaveBenchmarkResponse.RouteResponseBody"));
		saveBenchmarkResponse.setSuccess(_ctx.stringValue("SaveBenchmarkResponse.Success"));
	 
	 	return saveBenchmarkResponse;
	}
}
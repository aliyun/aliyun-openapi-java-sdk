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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.DescribeSceneResponse;
import com.aliyuncs.airec.model.v20201126.DescribeSceneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneResponseUnmarshaller {

	public static DescribeSceneResponse unmarshall(DescribeSceneResponse describeSceneResponse, UnmarshallerContext _ctx) {
		
		describeSceneResponse.setRequestId(_ctx.stringValue("DescribeSceneResponse.requestId"));
		describeSceneResponse.setCode(_ctx.stringValue("DescribeSceneResponse.code"));
		describeSceneResponse.setMessage(_ctx.stringValue("DescribeSceneResponse.message"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("DescribeSceneResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("DescribeSceneResponse.result.gmtModified"));
		result.setSceneId(_ctx.stringValue("DescribeSceneResponse.result.sceneId"));
		result.setStatus(_ctx.stringValue("DescribeSceneResponse.result.status"));
		describeSceneResponse.setResult(result);
	 
	 	return describeSceneResponse;
	}
}
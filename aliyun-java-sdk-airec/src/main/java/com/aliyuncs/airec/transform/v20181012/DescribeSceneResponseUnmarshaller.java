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

import com.aliyuncs.airec.model.v20181012.DescribeSceneResponse;
import com.aliyuncs.airec.model.v20181012.DescribeSceneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneResponseUnmarshaller {

	public static DescribeSceneResponse unmarshall(DescribeSceneResponse describeSceneResponse, UnmarshallerContext _ctx) {
		
		describeSceneResponse.setRequestId(_ctx.stringValue("DescribeSceneResponse.RequestId"));

		Result result = new Result();
		result.setSceneId(_ctx.stringValue("DescribeSceneResponse.Result.SceneId"));
		result.setGmtCreate(_ctx.stringValue("DescribeSceneResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("DescribeSceneResponse.Result.GmtModified"));
		result.setStatus(_ctx.stringValue("DescribeSceneResponse.Result.Status"));
		describeSceneResponse.setResult(result);
	 
	 	return describeSceneResponse;
	}
}
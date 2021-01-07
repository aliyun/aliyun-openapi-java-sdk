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

import com.aliyuncs.airec.model.v20201126.StopDataSetResponse;
import com.aliyuncs.airec.model.v20201126.StopDataSetResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDataSetResponseUnmarshaller {

	public static StopDataSetResponse unmarshall(StopDataSetResponse stopDataSetResponse, UnmarshallerContext _ctx) {
		
		stopDataSetResponse.setCode(_ctx.stringValue("StopDataSetResponse.code"));
		stopDataSetResponse.setMessage(_ctx.stringValue("StopDataSetResponse.message"));
		stopDataSetResponse.setRequestId(_ctx.stringValue("StopDataSetResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.longValue("StopDataSetResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.longValue("StopDataSetResponse.result.gmtModified"));
		result.setInstanceId(_ctx.stringValue("StopDataSetResponse.result.instanceId"));
		result.setState(_ctx.stringValue("StopDataSetResponse.result.state"));
		result.setVersionId(_ctx.stringValue("StopDataSetResponse.result.versionId"));
		stopDataSetResponse.setResult(result);
	 
	 	return stopDataSetResponse;
	}
}
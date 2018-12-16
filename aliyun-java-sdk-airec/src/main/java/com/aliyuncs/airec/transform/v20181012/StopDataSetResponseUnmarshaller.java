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

import com.aliyuncs.airec.model.v20181012.StopDataSetResponse;
import com.aliyuncs.airec.model.v20181012.StopDataSetResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDataSetResponseUnmarshaller {

	public static StopDataSetResponse unmarshall(StopDataSetResponse stopDataSetResponse, UnmarshallerContext context) {
		
		stopDataSetResponse.setRequestId(context.stringValue("StopDataSetResponse.RequestId"));
		stopDataSetResponse.setCode(context.stringValue("StopDataSetResponse.Code"));
		stopDataSetResponse.setMessage(context.stringValue("StopDataSetResponse.Message"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("StopDataSetResponse.Result.InstanceId"));
		result.setVersionId(context.stringValue("StopDataSetResponse.Result.VersionId"));
		result.setState(context.stringValue("StopDataSetResponse.Result.State"));
		result.setGmtCreate(context.longValue("StopDataSetResponse.Result.GmtCreate"));
		result.setGmtModified(context.longValue("StopDataSetResponse.Result.GmtModified"));
		stopDataSetResponse.setResult(result);
	 
	 	return stopDataSetResponse;
	}
}
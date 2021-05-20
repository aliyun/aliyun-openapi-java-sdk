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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.RunCycleDagNodesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunCycleDagNodesResponseUnmarshaller {

	public static RunCycleDagNodesResponse unmarshall(RunCycleDagNodesResponse runCycleDagNodesResponse, UnmarshallerContext _ctx) {
		
		runCycleDagNodesResponse.setRequestId(_ctx.stringValue("RunCycleDagNodesResponse.RequestId"));
		runCycleDagNodesResponse.setErrorCode(_ctx.stringValue("RunCycleDagNodesResponse.ErrorCode"));
		runCycleDagNodesResponse.setErrorMessage(_ctx.stringValue("RunCycleDagNodesResponse.ErrorMessage"));
		runCycleDagNodesResponse.setHttpStatusCode(_ctx.integerValue("RunCycleDagNodesResponse.HttpStatusCode"));
		runCycleDagNodesResponse.setSuccess(_ctx.booleanValue("RunCycleDagNodesResponse.Success"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("RunCycleDagNodesResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("RunCycleDagNodesResponse.Data["+ i +"]"));
		}
		runCycleDagNodesResponse.setData(data);
	 
	 	return runCycleDagNodesResponse;
	}
}
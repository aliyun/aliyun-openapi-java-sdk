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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.CreateAScriptsResponse;
import com.aliyuncs.alb.model.v20200616.CreateAScriptsResponse.AScriptId;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAScriptsResponseUnmarshaller {

	public static CreateAScriptsResponse unmarshall(CreateAScriptsResponse createAScriptsResponse, UnmarshallerContext _ctx) {
		
		createAScriptsResponse.setRequestId(_ctx.stringValue("CreateAScriptsResponse.RequestId"));
		createAScriptsResponse.setJobId(_ctx.stringValue("CreateAScriptsResponse.JobId"));

		List<AScriptId> aScriptIds = new ArrayList<AScriptId>();
		for (int i = 0; i < _ctx.lengthValue("CreateAScriptsResponse.AScriptIds.Length"); i++) {
			AScriptId aScriptId = new AScriptId();
			aScriptId.setAScriptId(_ctx.stringValue("CreateAScriptsResponse.AScriptIds["+ i +"].AScriptId"));

			aScriptIds.add(aScriptId);
		}
		createAScriptsResponse.setAScriptIds(aScriptIds);
	 
	 	return createAScriptsResponse;
	}
}
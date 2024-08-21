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

package com.aliyuncs.ecs_workbench.transform.v20220220;

import com.aliyuncs.ecs_workbench.model.v20220220.ViewInstanceRecordsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ViewInstanceRecordsResponseUnmarshaller {

	public static ViewInstanceRecordsResponse unmarshall(ViewInstanceRecordsResponse viewInstanceRecordsResponse, UnmarshallerContext _ctx) {
		
		viewInstanceRecordsResponse.setRequestId(_ctx.stringValue("ViewInstanceRecordsResponse.RequestId"));
		viewInstanceRecordsResponse.setSuccess(_ctx.booleanValue("ViewInstanceRecordsResponse.Success"));
		viewInstanceRecordsResponse.setCode(_ctx.stringValue("ViewInstanceRecordsResponse.Code"));
		viewInstanceRecordsResponse.setRoot(_ctx.booleanValue("ViewInstanceRecordsResponse.Root"));
		viewInstanceRecordsResponse.setMessage(_ctx.stringValue("ViewInstanceRecordsResponse.Message"));
	 
	 	return viewInstanceRecordsResponse;
	}
}
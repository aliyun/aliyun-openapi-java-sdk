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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.StartWorkflowResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartWorkflowResponseUnmarshaller {

	public static StartWorkflowResponse unmarshall(StartWorkflowResponse startWorkflowResponse, UnmarshallerContext _ctx) {
		
		startWorkflowResponse.setCode(_ctx.integerValue("StartWorkflowResponse.code"));
		startWorkflowResponse.setData(_ctx.mapValue("StartWorkflowResponse.data"));
		startWorkflowResponse.setMessage(_ctx.stringValue("StartWorkflowResponse.message"));
		startWorkflowResponse.setSuccess(_ctx.booleanValue("StartWorkflowResponse.success"));
	 
	 	return startWorkflowResponse;
	}
}
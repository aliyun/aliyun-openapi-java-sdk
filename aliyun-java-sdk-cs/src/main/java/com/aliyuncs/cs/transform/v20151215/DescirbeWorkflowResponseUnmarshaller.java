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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.DescirbeWorkflowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescirbeWorkflowResponseUnmarshaller {

	public static DescirbeWorkflowResponse unmarshall(DescirbeWorkflowResponse descirbeWorkflowResponse, UnmarshallerContext _ctx) {
		
		descirbeWorkflowResponse.setCreate_time(_ctx.stringValue("DescirbeWorkflowResponse.create_time"));
		descirbeWorkflowResponse.setDuration(_ctx.stringValue("DescirbeWorkflowResponse.duration"));
		descirbeWorkflowResponse.setFinish_time(_ctx.stringValue("DescirbeWorkflowResponse.finish_time"));
		descirbeWorkflowResponse.setInput_data_size(_ctx.stringValue("DescirbeWorkflowResponse.input_data_size"));
		descirbeWorkflowResponse.setJob_name(_ctx.stringValue("DescirbeWorkflowResponse.job_name"));
		descirbeWorkflowResponse.setJob_namespace(_ctx.stringValue("DescirbeWorkflowResponse.job_namespace"));
		descirbeWorkflowResponse.setOutput_data_size(_ctx.stringValue("DescirbeWorkflowResponse.output_data_size"));
		descirbeWorkflowResponse.setStatus(_ctx.stringValue("DescirbeWorkflowResponse.status"));
		descirbeWorkflowResponse.setTotal_bases(_ctx.stringValue("DescirbeWorkflowResponse.total_bases"));
		descirbeWorkflowResponse.setTotal_reads(_ctx.stringValue("DescirbeWorkflowResponse.total_reads"));
		descirbeWorkflowResponse.setUser_input_data(_ctx.stringValue("DescirbeWorkflowResponse.user_input_data"));
	 
	 	return descirbeWorkflowResponse;
	}
}
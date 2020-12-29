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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.CreateJobResponse;
import com.aliyuncs.paistudio.model.v20201123.CreateJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobResponseUnmarshaller {

	public static CreateJobResponse unmarshall(CreateJobResponse createJobResponse, UnmarshallerContext _ctx) {
		
		createJobResponse.setRequestId(_ctx.stringValue("CreateJobResponse.RequestId"));
		createJobResponse.setMessage(_ctx.stringValue("CreateJobResponse.Message"));
		createJobResponse.setCode(_ctx.stringValue("CreateJobResponse.Code"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateJobResponse.Data.JobId"));
		createJobResponse.setData(data);
	 
	 	return createJobResponse;
	}
}
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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateStreamPushJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.CreateStreamPushJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStreamPushJobResponseUnmarshaller {

	public static CreateStreamPushJobResponse unmarshall(CreateStreamPushJobResponse createStreamPushJobResponse, UnmarshallerContext _ctx) {
		
		createStreamPushJobResponse.setRequestId(_ctx.stringValue("CreateStreamPushJobResponse.RequestId"));
		createStreamPushJobResponse.setCode(_ctx.stringValue("CreateStreamPushJobResponse.Code"));
		createStreamPushJobResponse.setErrorMessage(_ctx.stringValue("CreateStreamPushJobResponse.ErrorMessage"));
		createStreamPushJobResponse.setSuccess(_ctx.booleanValue("CreateStreamPushJobResponse.Success"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateStreamPushJobResponse.Data.JobId"));
		createStreamPushJobResponse.setData(data);
	 
	 	return createStreamPushJobResponse;
	}
}
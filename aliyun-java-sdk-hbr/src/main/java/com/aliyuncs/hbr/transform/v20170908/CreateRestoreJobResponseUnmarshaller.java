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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreateRestoreJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRestoreJobResponseUnmarshaller {

	public static CreateRestoreJobResponse unmarshall(CreateRestoreJobResponse createRestoreJobResponse, UnmarshallerContext _ctx) {
		
		createRestoreJobResponse.setRequestId(_ctx.stringValue("CreateRestoreJobResponse.RequestId"));
		createRestoreJobResponse.setSuccess(_ctx.booleanValue("CreateRestoreJobResponse.Success"));
		createRestoreJobResponse.setCode(_ctx.stringValue("CreateRestoreJobResponse.Code"));
		createRestoreJobResponse.setMessage(_ctx.stringValue("CreateRestoreJobResponse.Message"));
		createRestoreJobResponse.setRestoreId(_ctx.stringValue("CreateRestoreJobResponse.RestoreId"));
	 
	 	return createRestoreJobResponse;
	}
}
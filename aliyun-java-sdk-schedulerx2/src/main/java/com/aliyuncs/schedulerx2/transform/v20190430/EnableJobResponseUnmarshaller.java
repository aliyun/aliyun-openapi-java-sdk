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

package com.aliyuncs.schedulerx2.transform.v20190430;

import com.aliyuncs.schedulerx2.model.v20190430.EnableJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableJobResponseUnmarshaller {

	public static EnableJobResponse unmarshall(EnableJobResponse enableJobResponse, UnmarshallerContext _ctx) {
		
		enableJobResponse.setRequestId(_ctx.stringValue("EnableJobResponse.RequestId"));
		enableJobResponse.setCode(_ctx.integerValue("EnableJobResponse.Code"));
		enableJobResponse.setMessage(_ctx.stringValue("EnableJobResponse.Message"));
		enableJobResponse.setSuccess(_ctx.booleanValue("EnableJobResponse.Success"));
	 
	 	return enableJobResponse;
	}
}
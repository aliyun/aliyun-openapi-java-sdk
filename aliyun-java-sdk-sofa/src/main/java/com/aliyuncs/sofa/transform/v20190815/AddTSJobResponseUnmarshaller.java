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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.AddTSJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTSJobResponseUnmarshaller {

	public static AddTSJobResponse unmarshall(AddTSJobResponse addTSJobResponse, UnmarshallerContext _ctx) {
		
		addTSJobResponse.setRequestId(_ctx.stringValue("AddTSJobResponse.RequestId"));
		addTSJobResponse.setResultCode(_ctx.stringValue("AddTSJobResponse.ResultCode"));
		addTSJobResponse.setResultMessage(_ctx.stringValue("AddTSJobResponse.ResultMessage"));
		addTSJobResponse.setData(_ctx.longValue("AddTSJobResponse.Data"));
	 
	 	return addTSJobResponse;
	}
}
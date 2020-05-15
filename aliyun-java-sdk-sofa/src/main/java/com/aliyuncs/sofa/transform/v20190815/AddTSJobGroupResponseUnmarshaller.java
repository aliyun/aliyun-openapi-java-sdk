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

import com.aliyuncs.sofa.model.v20190815.AddTSJobGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTSJobGroupResponseUnmarshaller {

	public static AddTSJobGroupResponse unmarshall(AddTSJobGroupResponse addTSJobGroupResponse, UnmarshallerContext _ctx) {
		
		addTSJobGroupResponse.setRequestId(_ctx.stringValue("AddTSJobGroupResponse.RequestId"));
		addTSJobGroupResponse.setResultCode(_ctx.stringValue("AddTSJobGroupResponse.ResultCode"));
		addTSJobGroupResponse.setResultMessage(_ctx.stringValue("AddTSJobGroupResponse.ResultMessage"));
		addTSJobGroupResponse.setData(_ctx.longValue("AddTSJobGroupResponse.Data"));
	 
	 	return addTSJobGroupResponse;
	}
}
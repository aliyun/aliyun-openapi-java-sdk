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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetAutonomousNotifyEventContentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutonomousNotifyEventContentResponseUnmarshaller {

	public static GetAutonomousNotifyEventContentResponse unmarshall(GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContentResponse, UnmarshallerContext _ctx) {
		
		getAutonomousNotifyEventContentResponse.setRequestId(_ctx.stringValue("GetAutonomousNotifyEventContentResponse.RequestId"));
		getAutonomousNotifyEventContentResponse.setCode(_ctx.stringValue("GetAutonomousNotifyEventContentResponse.Code"));
		getAutonomousNotifyEventContentResponse.setData(_ctx.stringValue("GetAutonomousNotifyEventContentResponse.Data"));
		getAutonomousNotifyEventContentResponse.setMessage(_ctx.stringValue("GetAutonomousNotifyEventContentResponse.Message"));
		getAutonomousNotifyEventContentResponse.setSuccess(_ctx.stringValue("GetAutonomousNotifyEventContentResponse.Success"));
	 
	 	return getAutonomousNotifyEventContentResponse;
	}
}
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

package com.aliyuncs.mns_open.transform.v20220119;

import com.aliyuncs.mns_open.model.v20220119.UnsubscribeResponse;
import com.aliyuncs.mns_open.model.v20220119.UnsubscribeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnsubscribeResponseUnmarshaller {

	public static UnsubscribeResponse unmarshall(UnsubscribeResponse unsubscribeResponse, UnmarshallerContext _ctx) {
		
		unsubscribeResponse.setRequestId(_ctx.stringValue("UnsubscribeResponse.RequestId"));
		unsubscribeResponse.setCode(_ctx.longValue("UnsubscribeResponse.Code"));
		unsubscribeResponse.setStatus(_ctx.stringValue("UnsubscribeResponse.Status"));
		unsubscribeResponse.setMessage(_ctx.stringValue("UnsubscribeResponse.Message"));
		unsubscribeResponse.setSuccess(_ctx.booleanValue("UnsubscribeResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("UnsubscribeResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("UnsubscribeResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("UnsubscribeResponse.Data.Success"));
		unsubscribeResponse.setData(data);
	 
	 	return unsubscribeResponse;
	}
}
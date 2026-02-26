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

import com.aliyuncs.mns_open.model.v20220119.SetQueueAttributesResponse;
import com.aliyuncs.mns_open.model.v20220119.SetQueueAttributesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetQueueAttributesResponseUnmarshaller {

	public static SetQueueAttributesResponse unmarshall(SetQueueAttributesResponse setQueueAttributesResponse, UnmarshallerContext _ctx) {
		
		setQueueAttributesResponse.setRequestId(_ctx.stringValue("SetQueueAttributesResponse.RequestId"));
		setQueueAttributesResponse.setCode(_ctx.longValue("SetQueueAttributesResponse.Code"));
		setQueueAttributesResponse.setStatus(_ctx.stringValue("SetQueueAttributesResponse.Status"));
		setQueueAttributesResponse.setMessage(_ctx.stringValue("SetQueueAttributesResponse.Message"));
		setQueueAttributesResponse.setSuccess(_ctx.booleanValue("SetQueueAttributesResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("SetQueueAttributesResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("SetQueueAttributesResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("SetQueueAttributesResponse.Data.Success"));
		setQueueAttributesResponse.setData(data);
	 
	 	return setQueueAttributesResponse;
	}
}
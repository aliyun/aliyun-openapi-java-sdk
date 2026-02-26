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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.GetSubscriptionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubscriptionResponseUnmarshaller {

	public static GetSubscriptionResponse unmarshall(GetSubscriptionResponse getSubscriptionResponse, UnmarshallerContext _ctx) {
		
		getSubscriptionResponse.setRequestId(_ctx.stringValue("GetSubscriptionResponse.RequestId"));
		getSubscriptionResponse.setCode(_ctx.longValue("GetSubscriptionResponse.Code"));
		getSubscriptionResponse.setStatus(_ctx.stringValue("GetSubscriptionResponse.Status"));
		getSubscriptionResponse.setMessage(_ctx.stringValue("GetSubscriptionResponse.Message"));
		getSubscriptionResponse.setSuccess(_ctx.booleanValue("GetSubscriptionResponse.Success"));
		getSubscriptionResponse.setData(_ctx.mapValue("GetSubscriptionResponse.Data"));
	 
	 	return getSubscriptionResponse;
	}
}
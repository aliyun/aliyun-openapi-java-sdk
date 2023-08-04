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

import com.aliyuncs.mns.model.v20210319.ListSubscriptionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscriptionResponseUnmarshaller {

	public static ListSubscriptionResponse unmarshall(ListSubscriptionResponse listSubscriptionResponse, UnmarshallerContext _ctx) {
		
		listSubscriptionResponse.setRequestId(_ctx.stringValue("ListSubscriptionResponse.RequestId"));
		listSubscriptionResponse.setCode(_ctx.longValue("ListSubscriptionResponse.Code"));
		listSubscriptionResponse.setStatus(_ctx.stringValue("ListSubscriptionResponse.Status"));
		listSubscriptionResponse.setMessage(_ctx.stringValue("ListSubscriptionResponse.Message"));
		listSubscriptionResponse.setSuccess(_ctx.booleanValue("ListSubscriptionResponse.Success"));
		listSubscriptionResponse.setData(_ctx.mapValue("ListSubscriptionResponse.Data"));
	 
	 	return listSubscriptionResponse;
	}
}
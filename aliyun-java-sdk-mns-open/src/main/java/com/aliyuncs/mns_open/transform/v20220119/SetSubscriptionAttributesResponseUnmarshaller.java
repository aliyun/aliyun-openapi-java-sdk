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

import com.aliyuncs.mns_open.model.v20220119.SetSubscriptionAttributesResponse;
import com.aliyuncs.mns_open.model.v20220119.SetSubscriptionAttributesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetSubscriptionAttributesResponseUnmarshaller {

	public static SetSubscriptionAttributesResponse unmarshall(SetSubscriptionAttributesResponse setSubscriptionAttributesResponse, UnmarshallerContext _ctx) {
		
		setSubscriptionAttributesResponse.setRequestId(_ctx.stringValue("SetSubscriptionAttributesResponse.RequestId"));
		setSubscriptionAttributesResponse.setCode(_ctx.longValue("SetSubscriptionAttributesResponse.Code"));
		setSubscriptionAttributesResponse.setStatus(_ctx.stringValue("SetSubscriptionAttributesResponse.Status"));
		setSubscriptionAttributesResponse.setMessage(_ctx.stringValue("SetSubscriptionAttributesResponse.Message"));
		setSubscriptionAttributesResponse.setSuccess(_ctx.booleanValue("SetSubscriptionAttributesResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("SetSubscriptionAttributesResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("SetSubscriptionAttributesResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("SetSubscriptionAttributesResponse.Data.Success"));
		setSubscriptionAttributesResponse.setData(data);
	 
	 	return setSubscriptionAttributesResponse;
	}
}
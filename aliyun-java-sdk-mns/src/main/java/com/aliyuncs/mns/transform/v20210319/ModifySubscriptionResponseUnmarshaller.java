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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ModifySubscriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySubscriptionResponseUnmarshaller {

	public static ModifySubscriptionResponse unmarshall(ModifySubscriptionResponse modifySubscriptionResponse, UnmarshallerContext _ctx) {
		
		modifySubscriptionResponse.setRequestId(_ctx.stringValue("ModifySubscriptionResponse.RequestId"));
		modifySubscriptionResponse.setCode(_ctx.longValue("ModifySubscriptionResponse.Code"));
		modifySubscriptionResponse.setStatus(_ctx.stringValue("ModifySubscriptionResponse.Status"));
		modifySubscriptionResponse.setMessage(_ctx.stringValue("ModifySubscriptionResponse.Message"));
		modifySubscriptionResponse.setSuccess(_ctx.booleanValue("ModifySubscriptionResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifySubscriptionResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ModifySubscriptionResponse.Data["+ i +"]"));
		}
		modifySubscriptionResponse.setData(data);
	 
	 	return modifySubscriptionResponse;
	}
}
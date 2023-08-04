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

import com.aliyuncs.mns.model.v20210319.DeleteSubscriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSubscriptionResponseUnmarshaller {

	public static DeleteSubscriptionResponse unmarshall(DeleteSubscriptionResponse deleteSubscriptionResponse, UnmarshallerContext _ctx) {
		
		deleteSubscriptionResponse.setRequestId(_ctx.stringValue("DeleteSubscriptionResponse.RequestId"));
		deleteSubscriptionResponse.setCode(_ctx.longValue("DeleteSubscriptionResponse.Code"));
		deleteSubscriptionResponse.setStatus(_ctx.stringValue("DeleteSubscriptionResponse.Status"));
		deleteSubscriptionResponse.setMessage(_ctx.stringValue("DeleteSubscriptionResponse.Message"));
		deleteSubscriptionResponse.setSuccess(_ctx.booleanValue("DeleteSubscriptionResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSubscriptionResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("DeleteSubscriptionResponse.Data["+ i +"]"));
		}
		deleteSubscriptionResponse.setData(data);
	 
	 	return deleteSubscriptionResponse;
	}
}
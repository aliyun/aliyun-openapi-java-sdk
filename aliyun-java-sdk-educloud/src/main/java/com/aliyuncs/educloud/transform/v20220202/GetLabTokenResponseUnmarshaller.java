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

package com.aliyuncs.educloud.transform.v20220202;

import com.aliyuncs.educloud.model.v20220202.GetLabTokenResponse;
import com.aliyuncs.educloud.model.v20220202.GetLabTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabTokenResponseUnmarshaller {

	public static GetLabTokenResponse unmarshall(GetLabTokenResponse getLabTokenResponse, UnmarshallerContext _ctx) {
		
		getLabTokenResponse.setRequestId(_ctx.stringValue("GetLabTokenResponse.RequestId"));
		getLabTokenResponse.setSuccess(_ctx.booleanValue("GetLabTokenResponse.Success"));
		getLabTokenResponse.setCode(_ctx.longValue("GetLabTokenResponse.Code"));
		getLabTokenResponse.setMessage(_ctx.stringValue("GetLabTokenResponse.Message"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("GetLabTokenResponse.Data.OrderId"));
		data.setUrl(_ctx.stringValue("GetLabTokenResponse.Data.Url"));
		getLabTokenResponse.setData(data);
	 
	 	return getLabTokenResponse;
	}
}
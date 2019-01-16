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

package com.aliyuncs.welfare_inner.transform.v20180524;

import com.aliyuncs.welfare_inner.model.v20180524.GetWelfareGeekInfoResponse;
import com.aliyuncs.welfare_inner.model.v20180524.GetWelfareGeekInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWelfareGeekInfoResponseUnmarshaller {

	public static GetWelfareGeekInfoResponse unmarshall(GetWelfareGeekInfoResponse getWelfareGeekInfoResponse, UnmarshallerContext context) {
		
		getWelfareGeekInfoResponse.setRequestId(context.stringValue("GetWelfareGeekInfoResponse.RequestId"));
		getWelfareGeekInfoResponse.setSuccess(context.booleanValue("GetWelfareGeekInfoResponse.Success"));
		getWelfareGeekInfoResponse.setCode(context.stringValue("GetWelfareGeekInfoResponse.Code"));
		getWelfareGeekInfoResponse.setMessage(context.stringValue("GetWelfareGeekInfoResponse.Message"));

		Data data = new Data();
		data.setGeekId(context.longValue("GetWelfareGeekInfoResponse.Data.GeekId"));
		data.setGeekName(context.stringValue("GetWelfareGeekInfoResponse.Data.GeekName"));
		getWelfareGeekInfoResponse.setData(data);
	 
	 	return getWelfareGeekInfoResponse;
	}
}
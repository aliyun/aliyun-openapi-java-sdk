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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.GetHotlineQualificationByOrderResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.GetHotlineQualificationByOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineQualificationByOrderResponseUnmarshaller {

	public static GetHotlineQualificationByOrderResponse unmarshall(GetHotlineQualificationByOrderResponse getHotlineQualificationByOrderResponse, UnmarshallerContext _ctx) {
		
		getHotlineQualificationByOrderResponse.setRequestId(_ctx.stringValue("GetHotlineQualificationByOrderResponse.RequestId"));
		getHotlineQualificationByOrderResponse.setCode(_ctx.stringValue("GetHotlineQualificationByOrderResponse.Code"));
		getHotlineQualificationByOrderResponse.setMessage(_ctx.stringValue("GetHotlineQualificationByOrderResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetHotlineQualificationByOrderResponse.Data.Status"));
		data.setQualificationId(_ctx.stringValue("GetHotlineQualificationByOrderResponse.Data.QualificationId"));
		data.setOrderId(_ctx.stringValue("GetHotlineQualificationByOrderResponse.Data.OrderId"));
		getHotlineQualificationByOrderResponse.setData(data);
	 
	 	return getHotlineQualificationByOrderResponse;
	}
}
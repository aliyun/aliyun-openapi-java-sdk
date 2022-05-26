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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.GetAliyunPKByAliyunIDResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAliyunPKByAliyunIDResponseUnmarshaller {

	public static GetAliyunPKByAliyunIDResponse unmarshall(GetAliyunPKByAliyunIDResponse getAliyunPKByAliyunIDResponse, UnmarshallerContext _ctx) {
		
		getAliyunPKByAliyunIDResponse.setRequestId(_ctx.stringValue("GetAliyunPKByAliyunIDResponse.RequestId"));
		getAliyunPKByAliyunIDResponse.setCode(_ctx.stringValue("GetAliyunPKByAliyunIDResponse.Code"));
		getAliyunPKByAliyunIDResponse.setMsg(_ctx.stringValue("GetAliyunPKByAliyunIDResponse.Msg"));
		getAliyunPKByAliyunIDResponse.setData(_ctx.stringValue("GetAliyunPKByAliyunIDResponse.Data"));
	 
	 	return getAliyunPKByAliyunIDResponse;
	}
}
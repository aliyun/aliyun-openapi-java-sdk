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

package com.aliyuncs.ots.transform.v20160620;

import com.aliyuncs.ots.model.v20160620.GetOtsServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOtsServiceStatusResponseUnmarshaller {

	public static GetOtsServiceStatusResponse unmarshall(GetOtsServiceStatusResponse getOtsServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getOtsServiceStatusResponse.setRequestId(_ctx.stringValue("GetOtsServiceStatusResponse.RequestId"));
		getOtsServiceStatusResponse.setMessage(_ctx.stringValue("GetOtsServiceStatusResponse.Message"));
		getOtsServiceStatusResponse.setHttpStatusCode(_ctx.integerValue("GetOtsServiceStatusResponse.HttpStatusCode"));
		getOtsServiceStatusResponse.setData(_ctx.booleanValue("GetOtsServiceStatusResponse.Data"));
		getOtsServiceStatusResponse.setDynamicCode(_ctx.stringValue("GetOtsServiceStatusResponse.DynamicCode"));
		getOtsServiceStatusResponse.setDynamicMessage(_ctx.stringValue("GetOtsServiceStatusResponse.DynamicMessage"));
		getOtsServiceStatusResponse.setSuccess(_ctx.booleanValue("GetOtsServiceStatusResponse.Success"));
		getOtsServiceStatusResponse.setErrCode(_ctx.stringValue("GetOtsServiceStatusResponse.ErrCode"));
	 
	 	return getOtsServiceStatusResponse;
	}
}
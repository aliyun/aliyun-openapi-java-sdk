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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.GetQuickQueryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuickQueryResponseUnmarshaller {

	public static GetQuickQueryResponse unmarshall(GetQuickQueryResponse getQuickQueryResponse, UnmarshallerContext _ctx) {
		
		getQuickQueryResponse.setRequestId(_ctx.stringValue("GetQuickQueryResponse.RequestId"));
		getQuickQueryResponse.setData(_ctx.stringValue("GetQuickQueryResponse.Data"));
		getQuickQueryResponse.setSuccess(_ctx.booleanValue("GetQuickQueryResponse.Success"));
		getQuickQueryResponse.setCode(_ctx.integerValue("GetQuickQueryResponse.Code"));
		getQuickQueryResponse.setMessage(_ctx.stringValue("GetQuickQueryResponse.Message"));
		getQuickQueryResponse.setErrCode(_ctx.stringValue("GetQuickQueryResponse.ErrCode"));
		getQuickQueryResponse.setDyCode(_ctx.stringValue("GetQuickQueryResponse.DyCode"));
		getQuickQueryResponse.setDyMessage(_ctx.stringValue("GetQuickQueryResponse.DyMessage"));
	 
	 	return getQuickQueryResponse;
	}
}
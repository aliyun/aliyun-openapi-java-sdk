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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.FindSvcMapBindResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindSvcMapBindResponseUnmarshaller {

	public static FindSvcMapBindResponse unmarshall(FindSvcMapBindResponse findSvcMapBindResponse, UnmarshallerContext _ctx) {
		
		findSvcMapBindResponse.setRequestId(_ctx.stringValue("FindSvcMapBindResponse.RequestId"));
		findSvcMapBindResponse.setData(_ctx.mapValue("FindSvcMapBindResponse.Data"));
		findSvcMapBindResponse.setCurrent(_ctx.integerValue("FindSvcMapBindResponse.Current"));
		findSvcMapBindResponse.setSize(_ctx.integerValue("FindSvcMapBindResponse.Size"));
		findSvcMapBindResponse.setTotal(_ctx.integerValue("FindSvcMapBindResponse.Total"));
		findSvcMapBindResponse.setPages(_ctx.integerValue("FindSvcMapBindResponse.Pages"));
		findSvcMapBindResponse.setSuccess(_ctx.booleanValue("FindSvcMapBindResponse.Success"));
		findSvcMapBindResponse.setCode(_ctx.stringValue("FindSvcMapBindResponse.Code"));
		findSvcMapBindResponse.setMessage(_ctx.stringValue("FindSvcMapBindResponse.Message"));
		findSvcMapBindResponse.setErrorName(_ctx.stringValue("FindSvcMapBindResponse.ErrorName"));
		findSvcMapBindResponse.setHttpCode(_ctx.integerValue("FindSvcMapBindResponse.HttpCode"));
	 
	 	return findSvcMapBindResponse;
	}
}
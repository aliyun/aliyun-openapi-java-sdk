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

package com.aliyuncs.dataworks_public.transform.v20180601;

import com.aliyuncs.dataworks_public.model.v20180601.GetDISyncInstanceInfoResponse;
import com.aliyuncs.dataworks_public.model.v20180601.GetDISyncInstanceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDISyncInstanceInfoResponseUnmarshaller {

	public static GetDISyncInstanceInfoResponse unmarshall(GetDISyncInstanceInfoResponse getDISyncInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		getDISyncInstanceInfoResponse.setRequestId(_ctx.stringValue("GetDISyncInstanceInfoResponse.RequestId"));
		getDISyncInstanceInfoResponse.setSuccess(_ctx.booleanValue("GetDISyncInstanceInfoResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.Status"));
		data.setName(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.Name"));
		data.setMessage(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.Message"));
		getDISyncInstanceInfoResponse.setData(data);
	 
	 	return getDISyncInstanceInfoResponse;
	}
}
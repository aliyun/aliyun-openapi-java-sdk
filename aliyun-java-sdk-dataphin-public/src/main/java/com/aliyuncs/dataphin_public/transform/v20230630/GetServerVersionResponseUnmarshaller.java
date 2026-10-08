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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetServerVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerVersionResponseUnmarshaller {

	public static GetServerVersionResponse unmarshall(GetServerVersionResponse getServerVersionResponse, UnmarshallerContext _ctx) {
		
		getServerVersionResponse.setRequestId(_ctx.stringValue("GetServerVersionResponse.RequestId"));
		getServerVersionResponse.setMessage(_ctx.stringValue("GetServerVersionResponse.Message"));
		getServerVersionResponse.setHttpStatusCode(_ctx.integerValue("GetServerVersionResponse.HttpStatusCode"));
		getServerVersionResponse.setData(_ctx.stringValue("GetServerVersionResponse.Data"));
		getServerVersionResponse.setCode(_ctx.stringValue("GetServerVersionResponse.Code"));
		getServerVersionResponse.setSuccess(_ctx.booleanValue("GetServerVersionResponse.Success"));
	 
	 	return getServerVersionResponse;
	}
}
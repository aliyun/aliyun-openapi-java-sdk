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

import com.aliyuncs.dataphin_public.model.v20230630.CreateSecurityIdentifyResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSecurityIdentifyResultResponseUnmarshaller {

	public static CreateSecurityIdentifyResultResponse unmarshall(CreateSecurityIdentifyResultResponse createSecurityIdentifyResultResponse, UnmarshallerContext _ctx) {
		
		createSecurityIdentifyResultResponse.setRequestId(_ctx.stringValue("CreateSecurityIdentifyResultResponse.RequestId"));
		createSecurityIdentifyResultResponse.setMessage(_ctx.stringValue("CreateSecurityIdentifyResultResponse.Message"));
		createSecurityIdentifyResultResponse.setHttpStatusCode(_ctx.integerValue("CreateSecurityIdentifyResultResponse.HttpStatusCode"));
		createSecurityIdentifyResultResponse.setData(_ctx.longValue("CreateSecurityIdentifyResultResponse.Data"));
		createSecurityIdentifyResultResponse.setCode(_ctx.stringValue("CreateSecurityIdentifyResultResponse.Code"));
		createSecurityIdentifyResultResponse.setSuccess(_ctx.booleanValue("CreateSecurityIdentifyResultResponse.Success"));
	 
	 	return createSecurityIdentifyResultResponse;
	}
}
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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.CreateOrUpdateTntConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateTntConfigResponseUnmarshaller {

	public static CreateOrUpdateTntConfigResponse unmarshall(CreateOrUpdateTntConfigResponse createOrUpdateTntConfigResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateTntConfigResponse.setRequestId(_ctx.stringValue("CreateOrUpdateTntConfigResponse.RequestId"));
		createOrUpdateTntConfigResponse.setCode(_ctx.stringValue("CreateOrUpdateTntConfigResponse.Code"));
		createOrUpdateTntConfigResponse.setErrInfo(_ctx.stringValue("CreateOrUpdateTntConfigResponse.ErrInfo"));
		createOrUpdateTntConfigResponse.setMsg(_ctx.stringValue("CreateOrUpdateTntConfigResponse.Msg"));
		createOrUpdateTntConfigResponse.setSucc(_ctx.booleanValue("CreateOrUpdateTntConfigResponse.Succ"));
		createOrUpdateTntConfigResponse.setResult(_ctx.booleanValue("CreateOrUpdateTntConfigResponse.Result"));
		createOrUpdateTntConfigResponse.setErrorCode(_ctx.stringValue("CreateOrUpdateTntConfigResponse.ErrorCode"));
	 
	 	return createOrUpdateTntConfigResponse;
	}
}
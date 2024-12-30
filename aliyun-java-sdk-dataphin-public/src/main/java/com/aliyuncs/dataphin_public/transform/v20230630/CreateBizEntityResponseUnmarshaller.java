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

import com.aliyuncs.dataphin_public.model.v20230630.CreateBizEntityResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateBizEntityResponse.CreateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBizEntityResponseUnmarshaller {

	public static CreateBizEntityResponse unmarshall(CreateBizEntityResponse createBizEntityResponse, UnmarshallerContext _ctx) {
		
		createBizEntityResponse.setRequestId(_ctx.stringValue("CreateBizEntityResponse.RequestId"));
		createBizEntityResponse.setSuccess(_ctx.booleanValue("CreateBizEntityResponse.Success"));
		createBizEntityResponse.setHttpStatusCode(_ctx.integerValue("CreateBizEntityResponse.HttpStatusCode"));
		createBizEntityResponse.setCode(_ctx.stringValue("CreateBizEntityResponse.Code"));
		createBizEntityResponse.setMessage(_ctx.stringValue("CreateBizEntityResponse.Message"));

		CreateResult createResult = new CreateResult();
		createResult.setBizEntityId(_ctx.longValue("CreateBizEntityResponse.CreateResult.BizEntityId"));
		createBizEntityResponse.setCreateResult(createResult);
	 
	 	return createBizEntityResponse;
	}
}
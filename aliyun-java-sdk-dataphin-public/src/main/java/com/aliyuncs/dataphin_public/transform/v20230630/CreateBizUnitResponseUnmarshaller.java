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

import com.aliyuncs.dataphin_public.model.v20230630.CreateBizUnitResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateBizUnitResponse.CreateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBizUnitResponseUnmarshaller {

	public static CreateBizUnitResponse unmarshall(CreateBizUnitResponse createBizUnitResponse, UnmarshallerContext _ctx) {
		
		createBizUnitResponse.setRequestId(_ctx.stringValue("CreateBizUnitResponse.RequestId"));
		createBizUnitResponse.setSuccess(_ctx.booleanValue("CreateBizUnitResponse.Success"));
		createBizUnitResponse.setHttpStatusCode(_ctx.integerValue("CreateBizUnitResponse.HttpStatusCode"));
		createBizUnitResponse.setCode(_ctx.stringValue("CreateBizUnitResponse.Code"));
		createBizUnitResponse.setMessage(_ctx.stringValue("CreateBizUnitResponse.Message"));

		CreateResult createResult = new CreateResult();
		createResult.setBizUnitId(_ctx.longValue("CreateBizUnitResponse.CreateResult.BizUnitId"));
		createBizUnitResponse.setCreateResult(createResult);
	 
	 	return createBizUnitResponse;
	}
}
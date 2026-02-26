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

import com.aliyuncs.dataphin_public.model.v20230630.CreateDataSourceResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateDataSourceResponse.CreateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataSourceResponseUnmarshaller {

	public static CreateDataSourceResponse unmarshall(CreateDataSourceResponse createDataSourceResponse, UnmarshallerContext _ctx) {
		
		createDataSourceResponse.setRequestId(_ctx.stringValue("CreateDataSourceResponse.RequestId"));
		createDataSourceResponse.setSuccess(_ctx.booleanValue("CreateDataSourceResponse.Success"));
		createDataSourceResponse.setHttpStatusCode(_ctx.integerValue("CreateDataSourceResponse.HttpStatusCode"));
		createDataSourceResponse.setCode(_ctx.stringValue("CreateDataSourceResponse.Code"));
		createDataSourceResponse.setMessage(_ctx.stringValue("CreateDataSourceResponse.Message"));

		CreateResult createResult = new CreateResult();
		createResult.setDevDataSourceId(_ctx.longValue("CreateDataSourceResponse.CreateResult.DevDataSourceId"));
		createResult.setProdDataSourceId(_ctx.longValue("CreateDataSourceResponse.CreateResult.ProdDataSourceId"));
		createDataSourceResponse.setCreateResult(createResult);
	 
	 	return createDataSourceResponse;
	}
}
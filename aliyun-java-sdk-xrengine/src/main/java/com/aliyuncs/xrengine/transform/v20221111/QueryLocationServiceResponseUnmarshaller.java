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

import com.aliyuncs.xrengine.model.v20221111.QueryLocationServiceResponse;
import com.aliyuncs.xrengine.model.v20221111.QueryLocationServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLocationServiceResponseUnmarshaller {

	public static QueryLocationServiceResponse unmarshall(QueryLocationServiceResponse queryLocationServiceResponse, UnmarshallerContext _ctx) {
		
		queryLocationServiceResponse.setRequestId(_ctx.stringValue("QueryLocationServiceResponse.RequestId"));
		queryLocationServiceResponse.setSuccess(_ctx.booleanValue("QueryLocationServiceResponse.Success"));
		queryLocationServiceResponse.setCode(_ctx.stringValue("QueryLocationServiceResponse.Code"));
		queryLocationServiceResponse.setMessage(_ctx.stringValue("QueryLocationServiceResponse.Message"));
		queryLocationServiceResponse.setErrorName(_ctx.stringValue("QueryLocationServiceResponse.ErrorName"));
		queryLocationServiceResponse.setHttpCode(_ctx.integerValue("QueryLocationServiceResponse.HttpCode"));

		Data data = new Data();
		data.setId(_ctx.longValue("QueryLocationServiceResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryLocationServiceResponse.Data.Name"));
		data.setSvcState(_ctx.stringValue("QueryLocationServiceResponse.Data.SvcState"));
		data.setQps(_ctx.longValue("QueryLocationServiceResponse.Data.Qps"));
		data.setAppId(_ctx.stringValue("QueryLocationServiceResponse.Data.AppId"));
		data.setStartTime(_ctx.stringValue("QueryLocationServiceResponse.Data.StartTime"));
		data.setExpireTime(_ctx.stringValue("QueryLocationServiceResponse.Data.ExpireTime"));
		data.setImageId(_ctx.longValue("QueryLocationServiceResponse.Data.ImageId"));
		data.setImageName(_ctx.stringValue("QueryLocationServiceResponse.Data.ImageName"));
		data.setNote(_ctx.stringValue("QueryLocationServiceResponse.Data.Note"));
		data.setTreeConfig(_ctx.stringValue("QueryLocationServiceResponse.Data.TreeConfig"));
		data.setSvcDeployStatus(_ctx.stringValue("QueryLocationServiceResponse.Data.SvcDeployStatus"));
		data.setUuidLogMap(_ctx.stringValue("QueryLocationServiceResponse.Data.UuidLogMap"));
		data.setGmtCreate(_ctx.stringValue("QueryLocationServiceResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryLocationServiceResponse.Data.GmtModified"));
		queryLocationServiceResponse.setData(data);
	 
	 	return queryLocationServiceResponse;
	}
}
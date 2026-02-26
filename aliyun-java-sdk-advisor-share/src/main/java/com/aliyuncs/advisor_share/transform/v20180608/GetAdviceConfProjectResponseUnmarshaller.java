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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdviceConfProjectResponseUnmarshaller {

	public static GetAdviceConfProjectResponse unmarshall(GetAdviceConfProjectResponse getAdviceConfProjectResponse, UnmarshallerContext _ctx) {
		
		getAdviceConfProjectResponse.setRequestId(_ctx.stringValue("GetAdviceConfProjectResponse.RequestId"));
		getAdviceConfProjectResponse.setCode(_ctx.stringValue("GetAdviceConfProjectResponse.Code"));
		getAdviceConfProjectResponse.setMessage(_ctx.stringValue("GetAdviceConfProjectResponse.Message"));
		getAdviceConfProjectResponse.setSuccess(_ctx.booleanValue("GetAdviceConfProjectResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetAdviceConfProjectResponse.Data.Status"));
		data.setGmtModified(_ctx.longValue("GetAdviceConfProjectResponse.Data.GmtModified"));
		data.setName(_ctx.stringValue("GetAdviceConfProjectResponse.Data.Name"));
		data.setValid(_ctx.booleanValue("GetAdviceConfProjectResponse.Data.Valid"));
		data.setId(_ctx.integerValue("GetAdviceConfProjectResponse.Data.Id"));
		getAdviceConfProjectResponse.setData(data);
	 
	 	return getAdviceConfProjectResponse;
	}
}
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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetBusinessResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetBusinessResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBusinessResponseUnmarshaller {

	public static GetBusinessResponse unmarshall(GetBusinessResponse getBusinessResponse, UnmarshallerContext _ctx) {
		
		getBusinessResponse.setRequestId(_ctx.stringValue("GetBusinessResponse.RequestId"));
		getBusinessResponse.setHttpStatusCode(_ctx.integerValue("GetBusinessResponse.HttpStatusCode"));
		getBusinessResponse.setErrorMessage(_ctx.stringValue("GetBusinessResponse.ErrorMessage"));
		getBusinessResponse.setErrorCode(_ctx.stringValue("GetBusinessResponse.ErrorCode"));
		getBusinessResponse.setSuccess(_ctx.booleanValue("GetBusinessResponse.Success"));

		Data data = new Data();
		data.setOwner(_ctx.stringValue("GetBusinessResponse.Data.Owner"));
		data.setDescription(_ctx.stringValue("GetBusinessResponse.Data.Description"));
		data.setProjectId(_ctx.stringValue("GetBusinessResponse.Data.ProjectId"));
		data.setBusinessId(_ctx.longValue("GetBusinessResponse.Data.BusinessId"));
		data.setBusinessName(_ctx.stringValue("GetBusinessResponse.Data.BusinessName"));
		data.setUseType(_ctx.stringValue("GetBusinessResponse.Data.UseType"));
		getBusinessResponse.setData(data);
	 
	 	return getBusinessResponse;
	}
}
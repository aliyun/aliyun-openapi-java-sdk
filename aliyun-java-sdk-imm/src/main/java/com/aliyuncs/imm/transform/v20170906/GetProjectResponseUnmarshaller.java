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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setProject(_ctx.stringValue("GetProjectResponse.Project"));
		getProjectResponse.setServiceRole(_ctx.stringValue("GetProjectResponse.ServiceRole"));
		getProjectResponse.setEndpoint(_ctx.stringValue("GetProjectResponse.Endpoint"));
		getProjectResponse.setCreateTime(_ctx.stringValue("GetProjectResponse.CreateTime"));
		getProjectResponse.setModifyTime(_ctx.stringValue("GetProjectResponse.ModifyTime"));
		getProjectResponse.setType(_ctx.stringValue("GetProjectResponse.Type"));
		getProjectResponse.setCU(_ctx.integerValue("GetProjectResponse.CU"));
		getProjectResponse.setBillingType(_ctx.stringValue("GetProjectResponse.BillingType"));
		getProjectResponse.setRegionId(_ctx.stringValue("GetProjectResponse.RegionId"));
	 
	 	return getProjectResponse;
	}
}
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

import com.aliyuncs.dataphin_public.model.v20230630.GetComputeSourceResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetComputeSourceResponse.ComputeSourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetComputeSourceResponseUnmarshaller {

	public static GetComputeSourceResponse unmarshall(GetComputeSourceResponse getComputeSourceResponse, UnmarshallerContext _ctx) {
		
		getComputeSourceResponse.setRequestId(_ctx.stringValue("GetComputeSourceResponse.RequestId"));
		getComputeSourceResponse.setSuccess(_ctx.booleanValue("GetComputeSourceResponse.Success"));
		getComputeSourceResponse.setHttpStatusCode(_ctx.integerValue("GetComputeSourceResponse.HttpStatusCode"));
		getComputeSourceResponse.setCode(_ctx.stringValue("GetComputeSourceResponse.Code"));
		getComputeSourceResponse.setMessage(_ctx.stringValue("GetComputeSourceResponse.Message"));

		ComputeSourceInfo computeSourceInfo = new ComputeSourceInfo();
		computeSourceInfo.setId(_ctx.longValue("GetComputeSourceResponse.ComputeSourceInfo.Id"));
		computeSourceInfo.setName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Name"));
		computeSourceInfo.setDisplayName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.DisplayName"));
		computeSourceInfo.setDescription(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Description"));
		computeSourceInfo.setGmtCreate(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.GmtCreate"));
		computeSourceInfo.setGmtModified(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.GmtModified"));
		computeSourceInfo.setOwner(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Owner"));
		computeSourceInfo.setCreator(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Creator"));
		computeSourceInfo.setOwnerName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.OwnerName"));
		computeSourceInfo.setCreatorName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.CreatorName"));
		computeSourceInfo.setBindProjectName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.BindProjectName"));
		computeSourceInfo.setBindProjectId(_ctx.longValue("GetComputeSourceResponse.ComputeSourceInfo.BindProjectId"));
		computeSourceInfo.setBindProject(_ctx.booleanValue("GetComputeSourceResponse.ComputeSourceInfo.BindProject"));
		computeSourceInfo.setType(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Type"));
		getComputeSourceResponse.setComputeSourceInfo(computeSourceInfo);
	 
	 	return getComputeSourceResponse;
	}
}
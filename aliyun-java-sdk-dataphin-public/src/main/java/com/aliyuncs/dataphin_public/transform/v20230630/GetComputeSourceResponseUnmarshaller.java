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
		getComputeSourceResponse.setMessage(_ctx.stringValue("GetComputeSourceResponse.Message"));
		getComputeSourceResponse.setHttpStatusCode(_ctx.integerValue("GetComputeSourceResponse.HttpStatusCode"));
		getComputeSourceResponse.setCode(_ctx.stringValue("GetComputeSourceResponse.Code"));
		getComputeSourceResponse.setSuccess(_ctx.booleanValue("GetComputeSourceResponse.Success"));

		ComputeSourceInfo computeSourceInfo = new ComputeSourceInfo();
		computeSourceInfo.setOwner(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Owner"));
		computeSourceInfo.setOwnerName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.OwnerName"));
		computeSourceInfo.setBindProjectId(_ctx.longValue("GetComputeSourceResponse.ComputeSourceInfo.BindProjectId"));
		computeSourceInfo.setDescription(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Description"));
		computeSourceInfo.setBindProject(_ctx.booleanValue("GetComputeSourceResponse.ComputeSourceInfo.BindProject"));
		computeSourceInfo.setGmtModified(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.GmtModified"));
		computeSourceInfo.setCreator(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Creator"));
		computeSourceInfo.setName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Name"));
		computeSourceInfo.setGmtCreate(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.GmtCreate"));
		computeSourceInfo.setType(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.Type"));
		computeSourceInfo.setDisplayName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.DisplayName"));
		computeSourceInfo.setId(_ctx.longValue("GetComputeSourceResponse.ComputeSourceInfo.Id"));
		computeSourceInfo.setBindProjectName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.BindProjectName"));
		computeSourceInfo.setCreatorName(_ctx.stringValue("GetComputeSourceResponse.ComputeSourceInfo.CreatorName"));
		getComputeSourceResponse.setComputeSourceInfo(computeSourceInfo);
	 
	 	return getComputeSourceResponse;
	}
}
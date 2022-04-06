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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetLhSpaceByNameResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetLhSpaceByNameResponse.LakehouseSpace;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLhSpaceByNameResponseUnmarshaller {

	public static GetLhSpaceByNameResponse unmarshall(GetLhSpaceByNameResponse getLhSpaceByNameResponse, UnmarshallerContext _ctx) {
		
		getLhSpaceByNameResponse.setRequestId(_ctx.stringValue("GetLhSpaceByNameResponse.RequestId"));
		getLhSpaceByNameResponse.setErrorCode(_ctx.stringValue("GetLhSpaceByNameResponse.ErrorCode"));
		getLhSpaceByNameResponse.setErrorMessage(_ctx.stringValue("GetLhSpaceByNameResponse.ErrorMessage"));
		getLhSpaceByNameResponse.setSuccess(_ctx.booleanValue("GetLhSpaceByNameResponse.Success"));

		LakehouseSpace lakehouseSpace = new LakehouseSpace();
		lakehouseSpace.setId(_ctx.longValue("GetLhSpaceByNameResponse.LakehouseSpace.Id"));
		lakehouseSpace.setSpaceName(_ctx.stringValue("GetLhSpaceByNameResponse.LakehouseSpace.SpaceName"));
		lakehouseSpace.setCreatorId(_ctx.stringValue("GetLhSpaceByNameResponse.LakehouseSpace.CreatorId"));
		lakehouseSpace.setTenantId(_ctx.stringValue("GetLhSpaceByNameResponse.LakehouseSpace.TenantId"));
		lakehouseSpace.setDescription(_ctx.stringValue("GetLhSpaceByNameResponse.LakehouseSpace.Description"));
		lakehouseSpace.setMode(_ctx.integerValue("GetLhSpaceByNameResponse.LakehouseSpace.Mode"));
		lakehouseSpace.setDwDbType(_ctx.stringValue("GetLhSpaceByNameResponse.LakehouseSpace.DwDbType"));
		lakehouseSpace.setSpaceConfig(_ctx.stringValue("GetLhSpaceByNameResponse.LakehouseSpace.SpaceConfig"));
		lakehouseSpace.setDevDbId(_ctx.integerValue("GetLhSpaceByNameResponse.LakehouseSpace.DevDbId"));
		lakehouseSpace.setProdDbId(_ctx.integerValue("GetLhSpaceByNameResponse.LakehouseSpace.ProdDbId"));
		lakehouseSpace.setIsDeleted(_ctx.booleanValue("GetLhSpaceByNameResponse.LakehouseSpace.IsDeleted"));
		getLhSpaceByNameResponse.setLakehouseSpace(lakehouseSpace);
	 
	 	return getLhSpaceByNameResponse;
	}
}
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

package com.aliyuncs.brinekingdom.transform.v20190627;

import com.aliyuncs.brinekingdom.model.v20190627.QueryAzoneByNameResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryAzoneByNameResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAzoneByNameResponseUnmarshaller {

	public static QueryAzoneByNameResponse unmarshall(QueryAzoneByNameResponse queryAzoneByNameResponse, UnmarshallerContext _ctx) {
		
		queryAzoneByNameResponse.setRequestId(_ctx.stringValue("QueryAzoneByNameResponse.RequestId"));
		queryAzoneByNameResponse.set_Class(_ctx.stringValue("QueryAzoneByNameResponse.Class"));
		queryAzoneByNameResponse.setErrorMessage(_ctx.stringValue("QueryAzoneByNameResponse.ErrorMessage"));
		queryAzoneByNameResponse.setSuccess(_ctx.booleanValue("QueryAzoneByNameResponse.Success"));
		queryAzoneByNameResponse.setResultCode(_ctx.stringValue("QueryAzoneByNameResponse.ResultCode"));

		Result result = new Result();
		result.setAzAlias(_ctx.stringValue("QueryAzoneByNameResponse.Result.AzAlias"));
		result.setAzCnName(_ctx.stringValue("QueryAzoneByNameResponse.Result.AzCnName"));
		result.setAzId(_ctx.longValue("QueryAzoneByNameResponse.Result.AzId"));
		result.setAzName(_ctx.stringValue("QueryAzoneByNameResponse.Result.AzName"));
		result.setCityCnName(_ctx.stringValue("QueryAzoneByNameResponse.Result.CityCnName"));
		result.setCityEnName(_ctx.stringValue("QueryAzoneByNameResponse.Result.CityEnName"));
		result.set_Class(_ctx.stringValue("QueryAzoneByNameResponse.Result.Class"));
		result.setCnStatus(_ctx.stringValue("QueryAzoneByNameResponse.Result.CnStatus"));
		result.setCreator(_ctx.stringValue("QueryAzoneByNameResponse.Result.Creator"));
		result.setCreatorNic(_ctx.stringValue("QueryAzoneByNameResponse.Result.CreatorNic"));
		result.setEnStatus(_ctx.stringValue("QueryAzoneByNameResponse.Result.EnStatus"));
		result.setLastUpdate(_ctx.longValue("QueryAzoneByNameResponse.Result.LastUpdate"));
		result.setModifier(_ctx.stringValue("QueryAzoneByNameResponse.Result.Modifier"));
		result.setModifierNic(_ctx.stringValue("QueryAzoneByNameResponse.Result.ModifierNic"));
		result.setRoomCode(_ctx.stringValue("QueryAzoneByNameResponse.Result.RoomCode"));
		result.setRoomName(_ctx.stringValue("QueryAzoneByNameResponse.Result.RoomName"));
		queryAzoneByNameResponse.setResult(result);
	 
	 	return queryAzoneByNameResponse;
	}
}
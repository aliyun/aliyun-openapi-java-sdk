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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.QueryAzoneByCityCodeResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryAzoneByCityCodeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAzoneByCityCodeResponseUnmarshaller {

	public static QueryAzoneByCityCodeResponse unmarshall(QueryAzoneByCityCodeResponse queryAzoneByCityCodeResponse, UnmarshallerContext _ctx) {
		
		queryAzoneByCityCodeResponse.setRequestId(_ctx.stringValue("QueryAzoneByCityCodeResponse.RequestId"));
		queryAzoneByCityCodeResponse.set_Class(_ctx.stringValue("QueryAzoneByCityCodeResponse.Class"));
		queryAzoneByCityCodeResponse.setErrorMessage(_ctx.stringValue("QueryAzoneByCityCodeResponse.ErrorMessage"));
		queryAzoneByCityCodeResponse.setSuccess(_ctx.booleanValue("QueryAzoneByCityCodeResponse.Success"));
		queryAzoneByCityCodeResponse.setResultCode(_ctx.stringValue("QueryAzoneByCityCodeResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAzoneByCityCodeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAzAlias(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].AzAlias"));
			resultItem.setAzCnName(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].AzCnName"));
			resultItem.setAzId(_ctx.longValue("QueryAzoneByCityCodeResponse.Result["+ i +"].AzId"));
			resultItem.setAzName(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].AzName"));
			resultItem.setCityCnName(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].CityCnName"));
			resultItem.setCityEnName(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].CityEnName"));
			resultItem.set_Class(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].Class"));
			resultItem.setCnStatus(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].CnStatus"));
			resultItem.setCreator(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorNic(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].CreatorNic"));
			resultItem.setEnStatus(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].EnStatus"));
			resultItem.setLastUpdate(_ctx.longValue("QueryAzoneByCityCodeResponse.Result["+ i +"].LastUpdate"));
			resultItem.setModifier(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].Modifier"));
			resultItem.setModifierNic(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].ModifierNic"));
			resultItem.setRoomCode(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].RoomCode"));
			resultItem.setRoomName(_ctx.stringValue("QueryAzoneByCityCodeResponse.Result["+ i +"].RoomName"));

			result.add(resultItem);
		}
		queryAzoneByCityCodeResponse.setResult(result);
	 
	 	return queryAzoneByCityCodeResponse;
	}
}
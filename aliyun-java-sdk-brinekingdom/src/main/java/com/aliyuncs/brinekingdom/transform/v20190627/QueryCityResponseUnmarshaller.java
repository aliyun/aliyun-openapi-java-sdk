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

import com.aliyuncs.brinekingdom.model.v20190627.QueryCityResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryCityResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCityResponseUnmarshaller {

	public static QueryCityResponse unmarshall(QueryCityResponse queryCityResponse, UnmarshallerContext _ctx) {
		
		queryCityResponse.setRequestId(_ctx.stringValue("QueryCityResponse.RequestId"));
		queryCityResponse.set_Class(_ctx.stringValue("QueryCityResponse.Class"));
		queryCityResponse.setErrorMessage(_ctx.stringValue("QueryCityResponse.ErrorMessage"));
		queryCityResponse.setSuccess(_ctx.booleanValue("QueryCityResponse.Success"));
		queryCityResponse.setResultCode(_ctx.stringValue("QueryCityResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCityResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCityAlias(_ctx.stringValue("QueryCityResponse.Result["+ i +"].CityAlias"));
			resultItem.setCityCnName(_ctx.stringValue("QueryCityResponse.Result["+ i +"].CityCnName"));
			resultItem.setCityCode(_ctx.stringValue("QueryCityResponse.Result["+ i +"].CityCode"));
			resultItem.setCityEnName(_ctx.stringValue("QueryCityResponse.Result["+ i +"].CityEnName"));
			resultItem.setCityId(_ctx.longValue("QueryCityResponse.Result["+ i +"].CityId"));
			resultItem.set_Class(_ctx.stringValue("QueryCityResponse.Result["+ i +"].Class"));
			resultItem.setCreator(_ctx.stringValue("QueryCityResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorNic(_ctx.stringValue("QueryCityResponse.Result["+ i +"].CreatorNic"));
			resultItem.setLastUpdate(_ctx.longValue("QueryCityResponse.Result["+ i +"].LastUpdate"));
			resultItem.setModifier(_ctx.stringValue("QueryCityResponse.Result["+ i +"].Modifier"));
			resultItem.setModifierNic(_ctx.stringValue("QueryCityResponse.Result["+ i +"].ModifierNic"));

			result.add(resultItem);
		}
		queryCityResponse.setResult(result);
	 
	 	return queryCityResponse;
	}
}
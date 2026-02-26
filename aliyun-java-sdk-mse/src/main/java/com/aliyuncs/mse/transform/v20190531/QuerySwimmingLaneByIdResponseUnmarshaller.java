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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QuerySwimmingLaneByIdResponse;
import com.aliyuncs.mse.model.v20190531.QuerySwimmingLaneByIdResponse.Data;
import com.aliyuncs.mse.model.v20190531.QuerySwimmingLaneByIdResponse.Data.EntryRule;
import com.aliyuncs.mse.model.v20190531.QuerySwimmingLaneByIdResponse.Data.EntryRule.RestItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySwimmingLaneByIdResponseUnmarshaller {

	public static QuerySwimmingLaneByIdResponse unmarshall(QuerySwimmingLaneByIdResponse querySwimmingLaneByIdResponse, UnmarshallerContext _ctx) {
		
		querySwimmingLaneByIdResponse.setRequestId(_ctx.stringValue("QuerySwimmingLaneByIdResponse.RequestId"));
		querySwimmingLaneByIdResponse.setSuccess(_ctx.booleanValue("QuerySwimmingLaneByIdResponse.Success"));
		querySwimmingLaneByIdResponse.setCode(_ctx.integerValue("QuerySwimmingLaneByIdResponse.Code"));
		querySwimmingLaneByIdResponse.setErrorCode(_ctx.stringValue("QuerySwimmingLaneByIdResponse.ErrorCode"));
		querySwimmingLaneByIdResponse.setHttpStatusCode(_ctx.integerValue("QuerySwimmingLaneByIdResponse.HttpStatusCode"));
		querySwimmingLaneByIdResponse.setMessage(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Message"));

		Data data = new Data();
		data.setName(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.name"));
		data.setId(_ctx.longValue("QuerySwimmingLaneByIdResponse.Data.id"));
		data.setTag(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.tag"));
		data.setStatus(_ctx.integerValue("QuerySwimmingLaneByIdResponse.Data.status"));
		data.setEnable(_ctx.booleanValue("QuerySwimmingLaneByIdResponse.Data.enable"));
		data.setRegionId(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.regionId"));
		data.setGroupId(_ctx.longValue("QuerySwimmingLaneByIdResponse.Data.groupId"));
		data.setEntryRule(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRule"));
		data.setEnableRules(_ctx.booleanValue("QuerySwimmingLaneByIdResponse.Data.enableRules"));
		data.setGmtCreate(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.gmtCreate"));
		data.setGmtModified(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.gmtModified"));
		data.setGatewaySwimmingLaneRouteJson(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.gatewaySwimmingLaneRouteJson"));

		List<EntryRule> entryRules = new ArrayList<EntryRule>();
		for (int i = 0; i < _ctx.lengthValue("QuerySwimmingLaneByIdResponse.Data.entryRules.Length"); i++) {
			EntryRule entryRule = new EntryRule();
			entryRule.setPath(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].path"));
			entryRule.setCondition(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].condition"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].paths.Length"); j++) {
				paths.add(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].paths["+ j +"]"));
			}
			entryRule.setPaths(paths);

			List<RestItemsItem> restItems = new ArrayList<RestItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems.Length"); j++) {
				RestItemsItem restItemsItem = new RestItemsItem();
				restItemsItem.setType(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].type"));
				restItemsItem.setName(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].name"));
				restItemsItem.setOperator(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].operator"));
				restItemsItem.setDatum(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].datum"));
				restItemsItem.setCond(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].cond"));
				restItemsItem.setDivisor(_ctx.integerValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].divisor"));
				restItemsItem.setRemainder(_ctx.integerValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].remainder"));
				restItemsItem.setRate(_ctx.integerValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].rate"));
				restItemsItem.setValue(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].value"));

				List<String> nameList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].nameList.Length"); k++) {
					nameList.add(_ctx.stringValue("QuerySwimmingLaneByIdResponse.Data.entryRules["+ i +"].restItems["+ j +"].nameList["+ k +"]"));
				}
				restItemsItem.setNameList(nameList);

				restItems.add(restItemsItem);
			}
			entryRule.setRestItems(restItems);

			entryRules.add(entryRule);
		}
		data.setEntryRules(entryRules);
		querySwimmingLaneByIdResponse.setData(data);
	 
	 	return querySwimmingLaneByIdResponse;
	}
}
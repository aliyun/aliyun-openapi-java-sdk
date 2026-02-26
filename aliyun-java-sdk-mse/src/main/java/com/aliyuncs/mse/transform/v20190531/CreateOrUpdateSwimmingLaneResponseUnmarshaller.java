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

import com.aliyuncs.mse.model.v20190531.CreateOrUpdateSwimmingLaneResponse;
import com.aliyuncs.mse.model.v20190531.CreateOrUpdateSwimmingLaneResponse.Data;
import com.aliyuncs.mse.model.v20190531.CreateOrUpdateSwimmingLaneResponse.Data.EntryRule;
import com.aliyuncs.mse.model.v20190531.CreateOrUpdateSwimmingLaneResponse.Data.EntryRule.RestItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateSwimmingLaneResponseUnmarshaller {

	public static CreateOrUpdateSwimmingLaneResponse unmarshall(CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLaneResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateSwimmingLaneResponse.setRequestId(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.RequestId"));
		createOrUpdateSwimmingLaneResponse.setSuccess(_ctx.booleanValue("CreateOrUpdateSwimmingLaneResponse.Success"));
		createOrUpdateSwimmingLaneResponse.setCode(_ctx.integerValue("CreateOrUpdateSwimmingLaneResponse.Code"));
		createOrUpdateSwimmingLaneResponse.setErrorCode(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.ErrorCode"));
		createOrUpdateSwimmingLaneResponse.setHttpStatusCode(_ctx.integerValue("CreateOrUpdateSwimmingLaneResponse.HttpStatusCode"));
		createOrUpdateSwimmingLaneResponse.setMessage(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Message"));

		Data data = new Data();
		data.setName(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.name"));
		data.setId(_ctx.longValue("CreateOrUpdateSwimmingLaneResponse.Data.id"));
		data.setTag(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.tag"));
		data.setStatus(_ctx.integerValue("CreateOrUpdateSwimmingLaneResponse.Data.status"));
		data.setEnable(_ctx.booleanValue("CreateOrUpdateSwimmingLaneResponse.Data.enable"));
		data.setRegionId(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.regionId"));
		data.setGroupId(_ctx.longValue("CreateOrUpdateSwimmingLaneResponse.Data.groupId"));
		data.setEntryRule(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRule"));
		data.setEnableRules(_ctx.booleanValue("CreateOrUpdateSwimmingLaneResponse.Data.enableRules"));
		data.setGmtCreate(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.gmtCreate"));
		data.setGmtModified(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.gmtModified"));
		data.setGatewaySwimmingLaneRouteJson(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.gatewaySwimmingLaneRouteJson"));

		List<EntryRule> entryRules = new ArrayList<EntryRule>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules.Length"); i++) {
			EntryRule entryRule = new EntryRule();
			entryRule.setPath(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].path"));
			entryRule.setCondition(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].condition"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].paths.Length"); j++) {
				paths.add(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].paths["+ j +"]"));
			}
			entryRule.setPaths(paths);

			List<RestItemsItem> restItems = new ArrayList<RestItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems.Length"); j++) {
				RestItemsItem restItemsItem = new RestItemsItem();
				restItemsItem.setType(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].type"));
				restItemsItem.setName(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].name"));
				restItemsItem.setOperator(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].operator"));
				restItemsItem.setDatum(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].datum"));
				restItemsItem.setCond(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].cond"));
				restItemsItem.setDivisor(_ctx.integerValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].divisor"));
				restItemsItem.setRemainder(_ctx.integerValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].remainder"));
				restItemsItem.setRate(_ctx.integerValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].rate"));
				restItemsItem.setValue(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].value"));

				List<String> nameList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].nameList.Length"); k++) {
					nameList.add(_ctx.stringValue("CreateOrUpdateSwimmingLaneResponse.Data.entryRules["+ i +"].restItems["+ j +"].nameList["+ k +"]"));
				}
				restItemsItem.setNameList(nameList);

				restItems.add(restItemsItem);
			}
			entryRule.setRestItems(restItems);

			entryRules.add(entryRule);
		}
		data.setEntryRules(entryRules);
		createOrUpdateSwimmingLaneResponse.setData(data);
	 
	 	return createOrUpdateSwimmingLaneResponse;
	}
}
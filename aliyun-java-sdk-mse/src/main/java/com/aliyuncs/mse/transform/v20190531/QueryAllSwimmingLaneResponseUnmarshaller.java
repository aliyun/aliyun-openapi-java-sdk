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

import com.aliyuncs.mse.model.v20190531.QueryAllSwimmingLaneResponse;
import com.aliyuncs.mse.model.v20190531.QueryAllSwimmingLaneResponse.SwimmingLaneGroup;
import com.aliyuncs.mse.model.v20190531.QueryAllSwimmingLaneResponse.SwimmingLaneGroup.EntryRule;
import com.aliyuncs.mse.model.v20190531.QueryAllSwimmingLaneResponse.SwimmingLaneGroup.EntryRule.RestItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllSwimmingLaneResponseUnmarshaller {

	public static QueryAllSwimmingLaneResponse unmarshall(QueryAllSwimmingLaneResponse queryAllSwimmingLaneResponse, UnmarshallerContext _ctx) {
		
		queryAllSwimmingLaneResponse.setRequestId(_ctx.stringValue("QueryAllSwimmingLaneResponse.RequestId"));
		queryAllSwimmingLaneResponse.setSuccess(_ctx.booleanValue("QueryAllSwimmingLaneResponse.Success"));
		queryAllSwimmingLaneResponse.setErrorCode(_ctx.stringValue("QueryAllSwimmingLaneResponse.ErrorCode"));
		queryAllSwimmingLaneResponse.setMessage(_ctx.stringValue("QueryAllSwimmingLaneResponse.Message"));

		List<SwimmingLaneGroup> data = new ArrayList<SwimmingLaneGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllSwimmingLaneResponse.Data.Length"); i++) {
			SwimmingLaneGroup swimmingLaneGroup = new SwimmingLaneGroup();
			swimmingLaneGroup.setName(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].Name"));
			swimmingLaneGroup.setName1(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].name"));
			swimmingLaneGroup.setUserId(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].userId"));
			swimmingLaneGroup.setUserId2(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].UserId"));
			swimmingLaneGroup.setMessageQueueFilterSide(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].MessageQueueFilterSide"));
			swimmingLaneGroup.setEnable(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].enable"));
			swimmingLaneGroup.setEnable3(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].Enable"));
			swimmingLaneGroup.setNamespace(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].Namespace"));
			swimmingLaneGroup.setRecordCanaryDetail(_ctx.booleanValue("QueryAllSwimmingLaneResponse.Data["+ i +"].RecordCanaryDetail"));
			swimmingLaneGroup.setId(_ctx.longValue("QueryAllSwimmingLaneResponse.Data["+ i +"].id"));
			swimmingLaneGroup.setId4(_ctx.longValue("QueryAllSwimmingLaneResponse.Data["+ i +"].Id"));
			swimmingLaneGroup.setRegionId(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].regionId"));
			swimmingLaneGroup.setRegionId5(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].RegionId"));
			swimmingLaneGroup.setMessageQueueGrayEnable(_ctx.booleanValue("QueryAllSwimmingLaneResponse.Data["+ i +"].MessageQueueGrayEnable"));
			swimmingLaneGroup.setStatus(_ctx.integerValue("QueryAllSwimmingLaneResponse.Data["+ i +"].status"));
			swimmingLaneGroup.setEnableRules(_ctx.booleanValue("QueryAllSwimmingLaneResponse.Data["+ i +"].enableRules"));
			swimmingLaneGroup.setEntryRule(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].entryRule"));
			swimmingLaneGroup.setGmtCreate(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].gmtCreate"));
			swimmingLaneGroup.setGmtModified(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].gmtModified"));
			swimmingLaneGroup.setGroupId(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].groupId"));
			swimmingLaneGroup.setGroupId6(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].GroupId"));
			swimmingLaneGroup.setTag(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].tag"));
			swimmingLaneGroup.setTag7(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].Tag"));

			List<EntryRule> entryRules = new ArrayList<EntryRule>();
			for (int j = 0; j < _ctx.lengthValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules.Length"); j++) {
				EntryRule entryRule = new EntryRule();
				entryRule.setPath(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].path"));
				entryRule.setCondition(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].condition"));

				List<String> paths = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].paths.Length"); k++) {
					paths.add(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].paths["+ k +"]"));
				}
				entryRule.setPaths(paths);

				List<RestItemsItem> restItems = new ArrayList<RestItemsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems.Length"); k++) {
					RestItemsItem restItemsItem = new RestItemsItem();
					restItemsItem.setType(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].type"));
					restItemsItem.setName(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].name"));
					restItemsItem.setOperator(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].operator"));
					restItemsItem.setDatum(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].datum"));
					restItemsItem.setCond(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].cond"));
					restItemsItem.setDivisor(_ctx.integerValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].divisor"));
					restItemsItem.setRemainder(_ctx.integerValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].remainder"));
					restItemsItem.setRate(_ctx.integerValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].rate"));
					restItemsItem.setValue(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].value"));

					List<String> nameList = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].nameList.Length"); l++) {
						nameList.add(_ctx.stringValue("QueryAllSwimmingLaneResponse.Data["+ i +"].EntryRules["+ j +"].restItems["+ k +"].nameList["+ l +"]"));
					}
					restItemsItem.setNameList(nameList);

					restItems.add(restItemsItem);
				}
				entryRule.setRestItems(restItems);

				entryRules.add(entryRule);
			}
			swimmingLaneGroup.setEntryRules(entryRules);

			data.add(swimmingLaneGroup);
		}
		queryAllSwimmingLaneResponse.setData(data);
	 
	 	return queryAllSwimmingLaneResponse;
	}
}
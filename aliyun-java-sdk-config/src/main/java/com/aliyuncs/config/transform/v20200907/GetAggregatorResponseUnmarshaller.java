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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetAggregatorResponse;
import com.aliyuncs.config.model.v20200907.GetAggregatorResponse.Aggregator;
import com.aliyuncs.config.model.v20200907.GetAggregatorResponse.Aggregator.AggregatorAccountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregatorResponseUnmarshaller {

	public static GetAggregatorResponse unmarshall(GetAggregatorResponse getAggregatorResponse, UnmarshallerContext _ctx) {
		
		getAggregatorResponse.setRequestId(_ctx.stringValue("GetAggregatorResponse.RequestId"));

		Aggregator aggregator = new Aggregator();
		aggregator.setAggregatorCreateTimestamp(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorCreateTimestamp"));
		aggregator.setAggregatorAccountCount(_ctx.longValue("GetAggregatorResponse.Aggregator.AggregatorAccountCount"));
		aggregator.setDescription(_ctx.stringValue("GetAggregatorResponse.Aggregator.Description"));
		aggregator.setAggregatorName(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorName"));
		aggregator.setAggregatorStatus(_ctx.integerValue("GetAggregatorResponse.Aggregator.AggregatorStatus"));
		aggregator.setAggregatorType(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorType"));
		aggregator.setAccountId(_ctx.longValue("GetAggregatorResponse.Aggregator.AccountId"));
		aggregator.setAggregatorId(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorId"));
		aggregator.setFolderId(_ctx.stringValue("GetAggregatorResponse.Aggregator.FolderId"));

		List<AggregatorAccountsItem> aggregatorAccounts = new ArrayList<AggregatorAccountsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregatorResponse.Aggregator.AggregatorAccounts.Length"); i++) {
			AggregatorAccountsItem aggregatorAccountsItem = new AggregatorAccountsItem();
			aggregatorAccountsItem.setRecorderStatus(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorAccounts["+ i +"].RecorderStatus"));
			aggregatorAccountsItem.setAccountId(_ctx.longValue("GetAggregatorResponse.Aggregator.AggregatorAccounts["+ i +"].AccountId"));
			aggregatorAccountsItem.setAccountType(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorAccounts["+ i +"].AccountType"));
			aggregatorAccountsItem.setAccountName(_ctx.stringValue("GetAggregatorResponse.Aggregator.AggregatorAccounts["+ i +"].AccountName"));

			aggregatorAccounts.add(aggregatorAccountsItem);
		}
		aggregator.setAggregatorAccounts(aggregatorAccounts);
		getAggregatorResponse.setAggregator(aggregator);
	 
	 	return getAggregatorResponse;
	}
}
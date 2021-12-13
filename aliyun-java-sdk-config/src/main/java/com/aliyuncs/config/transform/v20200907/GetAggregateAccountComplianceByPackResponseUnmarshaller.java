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

import com.aliyuncs.config.model.v20200907.GetAggregateAccountComplianceByPackResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateAccountComplianceByPackResponse.AccountComplianceResult;
import com.aliyuncs.config.model.v20200907.GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.AccountCompliancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateAccountComplianceByPackResponseUnmarshaller {

	public static GetAggregateAccountComplianceByPackResponse unmarshall(GetAggregateAccountComplianceByPackResponse getAggregateAccountComplianceByPackResponse, UnmarshallerContext _ctx) {
		
		getAggregateAccountComplianceByPackResponse.setRequestId(_ctx.stringValue("GetAggregateAccountComplianceByPackResponse.RequestId"));

		AccountComplianceResult accountComplianceResult = new AccountComplianceResult();
		accountComplianceResult.setCompliancePackId(_ctx.stringValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.CompliancePackId"));
		accountComplianceResult.setNonCompliantCount(_ctx.integerValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.NonCompliantCount"));
		accountComplianceResult.setTotalCount(_ctx.integerValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.TotalCount"));

		List<AccountCompliancesItem> accountCompliances = new ArrayList<AccountCompliancesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.AccountCompliances.Length"); i++) {
			AccountCompliancesItem accountCompliancesItem = new AccountCompliancesItem();
			accountCompliancesItem.setComplianceType(_ctx.stringValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.AccountCompliances["+ i +"].ComplianceType"));
			accountCompliancesItem.setAccountId(_ctx.longValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.AccountCompliances["+ i +"].AccountId"));
			accountCompliancesItem.setAccountName(_ctx.stringValue("GetAggregateAccountComplianceByPackResponse.AccountComplianceResult.AccountCompliances["+ i +"].AccountName"));

			accountCompliances.add(accountCompliancesItem);
		}
		accountComplianceResult.setAccountCompliances(accountCompliances);
		getAggregateAccountComplianceByPackResponse.setAccountComplianceResult(accountComplianceResult);
	 
	 	return getAggregateAccountComplianceByPackResponse;
	}
}
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

import com.aliyuncs.config.model.v20200907.ListAggregateCompliancePacksResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateCompliancePacksResponse.CompliancePacksResult;
import com.aliyuncs.config.model.v20200907.ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateCompliancePacksResponseUnmarshaller {

	public static ListAggregateCompliancePacksResponse unmarshall(ListAggregateCompliancePacksResponse listAggregateCompliancePacksResponse, UnmarshallerContext _ctx) {
		
		listAggregateCompliancePacksResponse.setRequestId(_ctx.stringValue("ListAggregateCompliancePacksResponse.RequestId"));

		CompliancePacksResult compliancePacksResult = new CompliancePacksResult();
		compliancePacksResult.setPageSize(_ctx.integerValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.PageSize"));
		compliancePacksResult.setPageNumber(_ctx.integerValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.PageNumber"));
		compliancePacksResult.setTotalCount(_ctx.longValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.TotalCount"));

		List<CompliancePacksItem> compliancePacks = new ArrayList<CompliancePacksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks.Length"); i++) {
			CompliancePacksItem compliancePacksItem = new CompliancePacksItem();
			compliancePacksItem.setStatus(_ctx.stringValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Status"));
			compliancePacksItem.setRiskLevel(_ctx.integerValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].RiskLevel"));
			compliancePacksItem.setCompliancePackId(_ctx.stringValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CompliancePackId"));
			compliancePacksItem.setDescription(_ctx.stringValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Description"));
			compliancePacksItem.setCompliancePackName(_ctx.stringValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CompliancePackName"));
			compliancePacksItem.setAccountId(_ctx.longValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].AccountId"));
			compliancePacksItem.setAggregatorId(_ctx.stringValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].AggregatorId"));
			compliancePacksItem.setCompliancePackTemplateId(_ctx.stringValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CompliancePackTemplateId"));
			compliancePacksItem.setCreateTimestamp(_ctx.longValue("ListAggregateCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CreateTimestamp"));

			compliancePacks.add(compliancePacksItem);
		}
		compliancePacksResult.setCompliancePacks(compliancePacks);
		listAggregateCompliancePacksResponse.setCompliancePacksResult(compliancePacksResult);
	 
	 	return listAggregateCompliancePacksResponse;
	}
}
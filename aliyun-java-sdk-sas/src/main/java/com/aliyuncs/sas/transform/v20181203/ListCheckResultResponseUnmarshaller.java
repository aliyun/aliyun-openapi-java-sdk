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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListCheckResultResponse;
import com.aliyuncs.sas.model.v20181203.ListCheckResultResponse.ChecksItem;
import com.aliyuncs.sas.model.v20181203.ListCheckResultResponse.ChecksItem.CheckPolicie;
import com.aliyuncs.sas.model.v20181203.ListCheckResultResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckResultResponseUnmarshaller {

	public static ListCheckResultResponse unmarshall(ListCheckResultResponse listCheckResultResponse, UnmarshallerContext _ctx) {
		
		listCheckResultResponse.setRequestId(_ctx.stringValue("ListCheckResultResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCheckResultResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListCheckResultResponse.PageInfo.PageSize"));
		pageInfo.setNextToken(_ctx.stringValue("ListCheckResultResponse.PageInfo.NextToken"));
		pageInfo.setMaxResults(_ctx.integerValue("ListCheckResultResponse.PageInfo.MaxResults"));
		pageInfo.setTotalCount(_ctx.integerValue("ListCheckResultResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListCheckResultResponse.PageInfo.Count"));
		listCheckResultResponse.setPageInfo(pageInfo);

		List<ChecksItem> checks = new ArrayList<ChecksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckResultResponse.Checks.Length"); i++) {
			ChecksItem checksItem = new ChecksItem();
			checksItem.setCheckId(_ctx.longValue("ListCheckResultResponse.Checks["+ i +"].CheckId"));
			checksItem.setCheckShowName(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].CheckShowName"));
			checksItem.setVendor(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].Vendor"));
			checksItem.setVendorShowName(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].VendorShowName"));
			checksItem.setInstanceType(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].InstanceType"));
			checksItem.setInstanceSubType(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].InstanceSubType"));
			checksItem.setRiskLevel(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].RiskLevel"));
			checksItem.setStatus(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].Status"));
			checksItem.setTaskId(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].TaskId"));
			checksItem.setLastCheckTime(_ctx.longValue("ListCheckResultResponse.Checks["+ i +"].LastCheckTime"));
			checksItem.setTrialPermission(_ctx.booleanValue("ListCheckResultResponse.Checks["+ i +"].TrialPermission"));

			List<CheckPolicie> checkPolicies = new ArrayList<CheckPolicie>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies.Length"); j++) {
				CheckPolicie checkPolicie = new CheckPolicie();
				checkPolicie.setStandardId(_ctx.longValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies["+ j +"].StandardId"));
				checkPolicie.setStandardShowName(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies["+ j +"].StandardShowName"));
				checkPolicie.setRequirementId(_ctx.longValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies["+ j +"].RequirementId"));
				checkPolicie.setRequirementShowName(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies["+ j +"].RequirementShowName"));
				checkPolicie.setSectionId(_ctx.longValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies["+ j +"].SectionId"));
				checkPolicie.setSectionShowName(_ctx.stringValue("ListCheckResultResponse.Checks["+ i +"].CheckPolicies["+ j +"].SectionShowName"));

				checkPolicies.add(checkPolicie);
			}
			checksItem.setCheckPolicies(checkPolicies);

			checks.add(checksItem);
		}
		listCheckResultResponse.setChecks(checks);
	 
	 	return listCheckResultResponse;
	}
}
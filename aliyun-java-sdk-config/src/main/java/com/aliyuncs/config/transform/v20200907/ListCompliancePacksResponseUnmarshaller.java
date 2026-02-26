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

import com.aliyuncs.config.model.v20200907.ListCompliancePacksResponse;
import com.aliyuncs.config.model.v20200907.ListCompliancePacksResponse.CompliancePacksResult;
import com.aliyuncs.config.model.v20200907.ListCompliancePacksResponse.CompliancePacksResult.CompliancePacksItem;
import com.aliyuncs.config.model.v20200907.ListCompliancePacksResponse.CompliancePacksResult.CompliancePacksItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCompliancePacksResponseUnmarshaller {

	public static ListCompliancePacksResponse unmarshall(ListCompliancePacksResponse listCompliancePacksResponse, UnmarshallerContext _ctx) {
		
		listCompliancePacksResponse.setRequestId(_ctx.stringValue("ListCompliancePacksResponse.RequestId"));

		CompliancePacksResult compliancePacksResult = new CompliancePacksResult();
		compliancePacksResult.setPageSize(_ctx.integerValue("ListCompliancePacksResponse.CompliancePacksResult.PageSize"));
		compliancePacksResult.setPageNumber(_ctx.integerValue("ListCompliancePacksResponse.CompliancePacksResult.PageNumber"));
		compliancePacksResult.setTotalCount(_ctx.longValue("ListCompliancePacksResponse.CompliancePacksResult.TotalCount"));

		List<CompliancePacksItem> compliancePacks = new ArrayList<CompliancePacksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks.Length"); i++) {
			CompliancePacksItem compliancePacksItem = new CompliancePacksItem();
			compliancePacksItem.setStatus(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Status"));
			compliancePacksItem.setCompliancePackId(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CompliancePackId"));
			compliancePacksItem.setRiskLevel(_ctx.integerValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].RiskLevel"));
			compliancePacksItem.setDescription(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Description"));
			compliancePacksItem.setCompliancePackName(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CompliancePackName"));
			compliancePacksItem.setAccountId(_ctx.longValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].AccountId"));
			compliancePacksItem.setCompliancePackTemplateId(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CompliancePackTemplateId"));
			compliancePacksItem.setCreateTimestamp(_ctx.longValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].CreateTimestamp"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("ListCompliancePacksResponse.CompliancePacksResult.CompliancePacks["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			compliancePacksItem.setTags(tags);

			compliancePacks.add(compliancePacksItem);
		}
		compliancePacksResult.setCompliancePacks(compliancePacks);
		listCompliancePacksResponse.setCompliancePacksResult(compliancePacksResult);
	 
	 	return listCompliancePacksResponse;
	}
}
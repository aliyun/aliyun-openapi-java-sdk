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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeCategoryTemplateRuleListResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeCategoryTemplateRuleListResponse.DataLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCategoryTemplateRuleListResponseUnmarshaller {

	public static DescribeCategoryTemplateRuleListResponse unmarshall(DescribeCategoryTemplateRuleListResponse describeCategoryTemplateRuleListResponse, UnmarshallerContext _ctx) {
		
		describeCategoryTemplateRuleListResponse.setRequestId(_ctx.stringValue("DescribeCategoryTemplateRuleListResponse.RequestId"));
		describeCategoryTemplateRuleListResponse.setCurrentPage(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.CurrentPage"));
		describeCategoryTemplateRuleListResponse.setPageSize(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.PageSize"));
		describeCategoryTemplateRuleListResponse.setTotalCount(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.TotalCount"));

		List<DataLimit> items = new ArrayList<DataLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCategoryTemplateRuleListResponse.Items.Length"); i++) {
			DataLimit dataLimit = new DataLimit();
			dataLimit.setStatus(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].Status"));
			dataLimit.setIdentificationScope(_ctx.stringValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].IdentificationScope"));
			dataLimit.setRiskLevelId(_ctx.longValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].RiskLevelId"));
			dataLimit.setParentCategoryId(_ctx.longValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].ParentCategoryId"));
			dataLimit.setDescription(_ctx.stringValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].Description"));
			dataLimit.setCustomType(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].CustomType"));
			dataLimit.setIdentificationRuleIds(_ctx.stringValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].IdentificationRuleIds"));
			dataLimit.setName(_ctx.stringValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].Name"));
			dataLimit.setOrderNum(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].OrderNum"));
			dataLimit.setTemplateId(_ctx.longValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].TemplateId"));
			dataLimit.setId(_ctx.longValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].Id"));
			dataLimit.setCategoryLevel(_ctx.integerValue("DescribeCategoryTemplateRuleListResponse.Items["+ i +"].CategoryLevel"));

			items.add(dataLimit);
		}
		describeCategoryTemplateRuleListResponse.setItems(items);
	 
	 	return describeCategoryTemplateRuleListResponse;
	}
}
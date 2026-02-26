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

import com.aliyuncs.sddp.model.v20190103.DescribeCategoryTemplateListResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeCategoryTemplateListResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCategoryTemplateListResponseUnmarshaller {

	public static DescribeCategoryTemplateListResponse unmarshall(DescribeCategoryTemplateListResponse describeCategoryTemplateListResponse, UnmarshallerContext _ctx) {
		
		describeCategoryTemplateListResponse.setRequestId(_ctx.stringValue("DescribeCategoryTemplateListResponse.RequestId"));
		describeCategoryTemplateListResponse.setCurrentPage(_ctx.integerValue("DescribeCategoryTemplateListResponse.CurrentPage"));
		describeCategoryTemplateListResponse.setPageSize(_ctx.integerValue("DescribeCategoryTemplateListResponse.PageSize"));
		describeCategoryTemplateListResponse.setTotalCount(_ctx.integerValue("DescribeCategoryTemplateListResponse.TotalCount"));

		List<Template> items = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCategoryTemplateListResponse.Items.Length"); i++) {
			Template template = new Template();
			template.setCurrentRiskLevel(_ctx.integerValue("DescribeCategoryTemplateListResponse.Items["+ i +"].CurrentRiskLevel"));
			template.setStatus(_ctx.integerValue("DescribeCategoryTemplateListResponse.Items["+ i +"].Status"));
			template.setType(_ctx.integerValue("DescribeCategoryTemplateListResponse.Items["+ i +"].Type"));
			template.setSupportEdit(_ctx.integerValue("DescribeCategoryTemplateListResponse.Items["+ i +"].SupportEdit"));
			template.setMaxCategoryLevel(_ctx.integerValue("DescribeCategoryTemplateListResponse.Items["+ i +"].MaxCategoryLevel"));
			template.setName(_ctx.stringValue("DescribeCategoryTemplateListResponse.Items["+ i +"].Name"));
			template.setMaxRiskLevel(_ctx.integerValue("DescribeCategoryTemplateListResponse.Items["+ i +"].MaxRiskLevel"));
			template.setId(_ctx.longValue("DescribeCategoryTemplateListResponse.Items["+ i +"].Id"));
			template.setDescription(_ctx.stringValue("DescribeCategoryTemplateListResponse.Items["+ i +"].Description"));
			template.setGmtCreate(_ctx.longValue("DescribeCategoryTemplateListResponse.Items["+ i +"].GmtCreate"));
			template.setGmtModified(_ctx.longValue("DescribeCategoryTemplateListResponse.Items["+ i +"].GmtModified"));

			items.add(template);
		}
		describeCategoryTemplateListResponse.setItems(items);
	 
	 	return describeCategoryTemplateListResponse;
	}
}
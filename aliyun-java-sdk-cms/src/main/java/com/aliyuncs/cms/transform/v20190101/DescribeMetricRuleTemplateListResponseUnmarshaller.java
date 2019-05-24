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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateListResponse.Template;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTemplateListResponse.Template.ApplyHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleTemplateListResponseUnmarshaller {

	public static DescribeMetricRuleTemplateListResponse unmarshall(DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateListResponse, UnmarshallerContext context) {
		
		describeMetricRuleTemplateListResponse.setRequestId(context.stringValue("DescribeMetricRuleTemplateListResponse.RequestId"));
		describeMetricRuleTemplateListResponse.setSuccess(context.booleanValue("DescribeMetricRuleTemplateListResponse.Success"));
		describeMetricRuleTemplateListResponse.setCode(context.integerValue("DescribeMetricRuleTemplateListResponse.Code"));
		describeMetricRuleTemplateListResponse.setMessage(context.stringValue("DescribeMetricRuleTemplateListResponse.Message"));
		describeMetricRuleTemplateListResponse.setTotal(context.longValue("DescribeMetricRuleTemplateListResponse.Total"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("DescribeMetricRuleTemplateListResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setName(context.stringValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].Name"));
			template.setDescription(context.stringValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].Description"));
			template.setRestVersion(context.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].RestVersion"));
			template.setTemplateId(context.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].TemplateId"));
			template.setGmtCreate(context.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].GmtCreate"));
			template.setGmtModified(context.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].GmtModified"));

			List<ApplyHistory> applyHistories = new ArrayList<ApplyHistory>();
			for (int j = 0; j < context.lengthValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories.Length"); j++) {
				ApplyHistory applyHistory = new ApplyHistory();
				applyHistory.setGroupId(context.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories["+ j +"].GroupId"));
				applyHistory.setGroupName(context.stringValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories["+ j +"].GroupName"));
				applyHistory.setApplyTime(context.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories["+ j +"].ApplyTime"));

				applyHistories.add(applyHistory);
			}
			template.setApplyHistories(applyHistories);

			templates.add(template);
		}
		describeMetricRuleTemplateListResponse.setTemplates(templates);
	 
	 	return describeMetricRuleTemplateListResponse;
	}
}
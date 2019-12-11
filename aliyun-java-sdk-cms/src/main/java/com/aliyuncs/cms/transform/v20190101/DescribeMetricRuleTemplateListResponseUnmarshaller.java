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

	public static DescribeMetricRuleTemplateListResponse unmarshall(DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateListResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleTemplateListResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleTemplateListResponse.RequestId"));
		describeMetricRuleTemplateListResponse.setSuccess(_ctx.booleanValue("DescribeMetricRuleTemplateListResponse.Success"));
		describeMetricRuleTemplateListResponse.setCode(_ctx.integerValue("DescribeMetricRuleTemplateListResponse.Code"));
		describeMetricRuleTemplateListResponse.setMessage(_ctx.stringValue("DescribeMetricRuleTemplateListResponse.Message"));
		describeMetricRuleTemplateListResponse.setTotal(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Total"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleTemplateListResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setName(_ctx.stringValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].Name"));
			template.setDescription(_ctx.stringValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].Description"));
			template.setRestVersion(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].RestVersion"));
			template.setTemplateId(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].TemplateId"));
			template.setGmtCreate(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].GmtCreate"));
			template.setGmtModified(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].GmtModified"));

			List<ApplyHistory> applyHistories = new ArrayList<ApplyHistory>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories.Length"); j++) {
				ApplyHistory applyHistory = new ApplyHistory();
				applyHistory.setGroupId(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories["+ j +"].GroupId"));
				applyHistory.setGroupName(_ctx.stringValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories["+ j +"].GroupName"));
				applyHistory.setApplyTime(_ctx.longValue("DescribeMetricRuleTemplateListResponse.Templates["+ i +"].ApplyHistories["+ j +"].ApplyTime"));

				applyHistories.add(applyHistory);
			}
			template.setApplyHistories(applyHistories);

			templates.add(template);
		}
		describeMetricRuleTemplateListResponse.setTemplates(templates);
	 
	 	return describeMetricRuleTemplateListResponse;
	}
}
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

import com.aliyuncs.cms.model.v20190101.DeleteMetricRuleTemplateResponse;
import com.aliyuncs.cms.model.v20190101.DeleteMetricRuleTemplateResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMetricRuleTemplateResponseUnmarshaller {

	public static DeleteMetricRuleTemplateResponse unmarshall(DeleteMetricRuleTemplateResponse deleteMetricRuleTemplateResponse, UnmarshallerContext context) {
		
		deleteMetricRuleTemplateResponse.setRequestId(context.stringValue("DeleteMetricRuleTemplateResponse.RequestId"));
		deleteMetricRuleTemplateResponse.setSuccess(context.booleanValue("DeleteMetricRuleTemplateResponse.Success"));
		deleteMetricRuleTemplateResponse.setCode(context.integerValue("DeleteMetricRuleTemplateResponse.Code"));
		deleteMetricRuleTemplateResponse.setMessage(context.stringValue("DeleteMetricRuleTemplateResponse.Message"));

		Resource resource = new Resource();
		resource.setTemplateId(context.stringValue("DeleteMetricRuleTemplateResponse.Resource.TemplateId"));
		deleteMetricRuleTemplateResponse.setResource(resource);
	 
	 	return deleteMetricRuleTemplateResponse;
	}
}
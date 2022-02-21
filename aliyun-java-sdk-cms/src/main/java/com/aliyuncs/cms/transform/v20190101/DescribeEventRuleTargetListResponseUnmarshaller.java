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

import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse.ContactParameter;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse.FCParameter;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse.MnsParameter;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse.OpenApiParametersItem;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse.SlsParameter;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleTargetListResponse.WebhookParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventRuleTargetListResponseUnmarshaller {

	public static DescribeEventRuleTargetListResponse unmarshall(DescribeEventRuleTargetListResponse describeEventRuleTargetListResponse, UnmarshallerContext _ctx) {
		
		describeEventRuleTargetListResponse.setRequestId(_ctx.stringValue("DescribeEventRuleTargetListResponse.RequestId"));
		describeEventRuleTargetListResponse.setCode(_ctx.stringValue("DescribeEventRuleTargetListResponse.Code"));
		describeEventRuleTargetListResponse.setMessage(_ctx.stringValue("DescribeEventRuleTargetListResponse.Message"));

		List<ContactParameter> contactParameters = new ArrayList<ContactParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleTargetListResponse.ContactParameters.Length"); i++) {
			ContactParameter contactParameter = new ContactParameter();
			contactParameter.setContactGroupName(_ctx.stringValue("DescribeEventRuleTargetListResponse.ContactParameters["+ i +"].ContactGroupName"));
			contactParameter.setLevel(_ctx.stringValue("DescribeEventRuleTargetListResponse.ContactParameters["+ i +"].Level"));
			contactParameter.setId(_ctx.stringValue("DescribeEventRuleTargetListResponse.ContactParameters["+ i +"].Id"));

			contactParameters.add(contactParameter);
		}
		describeEventRuleTargetListResponse.setContactParameters(contactParameters);

		List<FCParameter> fcParameters = new ArrayList<FCParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleTargetListResponse.FcParameters.Length"); i++) {
			FCParameter fCParameter = new FCParameter();
			fCParameter.setServiceName(_ctx.stringValue("DescribeEventRuleTargetListResponse.FcParameters["+ i +"].ServiceName"));
			fCParameter.setFunctionName(_ctx.stringValue("DescribeEventRuleTargetListResponse.FcParameters["+ i +"].FunctionName"));
			fCParameter.setArn(_ctx.stringValue("DescribeEventRuleTargetListResponse.FcParameters["+ i +"].Arn"));
			fCParameter.setId(_ctx.stringValue("DescribeEventRuleTargetListResponse.FcParameters["+ i +"].Id"));
			fCParameter.setRegion(_ctx.stringValue("DescribeEventRuleTargetListResponse.FcParameters["+ i +"].Region"));

			fcParameters.add(fCParameter);
		}
		describeEventRuleTargetListResponse.setFcParameters(fcParameters);

		List<MnsParameter> mnsParameters = new ArrayList<MnsParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleTargetListResponse.MnsParameters.Length"); i++) {
			MnsParameter mnsParameter = new MnsParameter();
			mnsParameter.setQueue(_ctx.stringValue("DescribeEventRuleTargetListResponse.MnsParameters["+ i +"].Queue"));
			mnsParameter.setArn(_ctx.stringValue("DescribeEventRuleTargetListResponse.MnsParameters["+ i +"].Arn"));
			mnsParameter.setRegion(_ctx.stringValue("DescribeEventRuleTargetListResponse.MnsParameters["+ i +"].Region"));
			mnsParameter.setId(_ctx.stringValue("DescribeEventRuleTargetListResponse.MnsParameters["+ i +"].Id"));

			mnsParameters.add(mnsParameter);
		}
		describeEventRuleTargetListResponse.setMnsParameters(mnsParameters);

		List<WebhookParameter> webhookParameters = new ArrayList<WebhookParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleTargetListResponse.WebhookParameters.Length"); i++) {
			WebhookParameter webhookParameter = new WebhookParameter();
			webhookParameter.setUrl(_ctx.stringValue("DescribeEventRuleTargetListResponse.WebhookParameters["+ i +"].Url"));
			webhookParameter.setBizMethod(_ctx.stringValue("DescribeEventRuleTargetListResponse.WebhookParameters["+ i +"].Method"));
			webhookParameter.setBizProtocol(_ctx.stringValue("DescribeEventRuleTargetListResponse.WebhookParameters["+ i +"].Protocol"));
			webhookParameter.setId(_ctx.stringValue("DescribeEventRuleTargetListResponse.WebhookParameters["+ i +"].Id"));

			webhookParameters.add(webhookParameter);
		}
		describeEventRuleTargetListResponse.setWebhookParameters(webhookParameters);

		List<SlsParameter> slsParameters = new ArrayList<SlsParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleTargetListResponse.SlsParameters.Length"); i++) {
			SlsParameter slsParameter = new SlsParameter();
			slsParameter.setProject(_ctx.stringValue("DescribeEventRuleTargetListResponse.SlsParameters["+ i +"].Project"));
			slsParameter.setLogStore(_ctx.stringValue("DescribeEventRuleTargetListResponse.SlsParameters["+ i +"].LogStore"));
			slsParameter.setArn(_ctx.stringValue("DescribeEventRuleTargetListResponse.SlsParameters["+ i +"].Arn"));
			slsParameter.setRegion(_ctx.stringValue("DescribeEventRuleTargetListResponse.SlsParameters["+ i +"].Region"));
			slsParameter.setId(_ctx.stringValue("DescribeEventRuleTargetListResponse.SlsParameters["+ i +"].Id"));

			slsParameters.add(slsParameter);
		}
		describeEventRuleTargetListResponse.setSlsParameters(slsParameters);

		List<OpenApiParametersItem> openApiParameters = new ArrayList<OpenApiParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleTargetListResponse.OpenApiParameters.Length"); i++) {
			OpenApiParametersItem openApiParametersItem = new OpenApiParametersItem();
			openApiParametersItem.setAction(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Action"));
			openApiParametersItem.setArn(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Arn"));
			openApiParametersItem.setId(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Id"));
			openApiParametersItem.setProduct(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Product"));
			openApiParametersItem.setRegion(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Region"));
			openApiParametersItem.setRole(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Role"));
			openApiParametersItem.setVersion(_ctx.stringValue("DescribeEventRuleTargetListResponse.OpenApiParameters["+ i +"].Version"));

			openApiParameters.add(openApiParametersItem);
		}
		describeEventRuleTargetListResponse.setOpenApiParameters(openApiParameters);
	 
	 	return describeEventRuleTargetListResponse;
	}
}
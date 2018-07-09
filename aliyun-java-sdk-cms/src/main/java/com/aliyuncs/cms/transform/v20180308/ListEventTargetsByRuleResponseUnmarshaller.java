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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListEventTargetsByRuleResponse;
import com.aliyuncs.cms.model.v20180308.ListEventTargetsByRuleResponse.ContactParameter;
import com.aliyuncs.cms.model.v20180308.ListEventTargetsByRuleResponse.FCParameter;
import com.aliyuncs.cms.model.v20180308.ListEventTargetsByRuleResponse.MnsParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventTargetsByRuleResponseUnmarshaller {

	public static ListEventTargetsByRuleResponse unmarshall(ListEventTargetsByRuleResponse listEventTargetsByRuleResponse, UnmarshallerContext context) {
		
		listEventTargetsByRuleResponse.setRequestId(context.stringValue("ListEventTargetsByRuleResponse.RequestId"));
		listEventTargetsByRuleResponse.setCode(context.stringValue("ListEventTargetsByRuleResponse.Code"));
		listEventTargetsByRuleResponse.setMessage(context.stringValue("ListEventTargetsByRuleResponse.Message"));
		listEventTargetsByRuleResponse.setParameterCount(context.integerValue("ListEventTargetsByRuleResponse.ParameterCount"));

		List<ContactParameter> contactParameters = new ArrayList<ContactParameter>();
		for (int i = 0; i < context.lengthValue("ListEventTargetsByRuleResponse.ContactParameters.Length"); i++) {
			ContactParameter contactParameter = new ContactParameter();
			contactParameter.setContactGroupName(context.stringValue("ListEventTargetsByRuleResponse.ContactParameters["+ i +"].ContactGroupName"));
			contactParameter.setLevel(context.stringValue("ListEventTargetsByRuleResponse.ContactParameters["+ i +"].Level"));
			contactParameter.setId(context.stringValue("ListEventTargetsByRuleResponse.ContactParameters["+ i +"].Id"));

			contactParameters.add(contactParameter);
		}
		listEventTargetsByRuleResponse.setContactParameters(contactParameters);

		List<FCParameter> fcParameters = new ArrayList<FCParameter>();
		for (int i = 0; i < context.lengthValue("ListEventTargetsByRuleResponse.FcParameters.Length"); i++) {
			FCParameter fCParameter = new FCParameter();
			fCParameter.setRegion(context.stringValue("ListEventTargetsByRuleResponse.FcParameters["+ i +"].Region"));
			fCParameter.setServiceName(context.stringValue("ListEventTargetsByRuleResponse.FcParameters["+ i +"].ServiceName"));
			fCParameter.setFunctionName(context.stringValue("ListEventTargetsByRuleResponse.FcParameters["+ i +"].FunctionName"));
			fCParameter.setId(context.stringValue("ListEventTargetsByRuleResponse.FcParameters["+ i +"].Id"));

			fcParameters.add(fCParameter);
		}
		listEventTargetsByRuleResponse.setFcParameters(fcParameters);

		List<MnsParameter> mnsParameters = new ArrayList<MnsParameter>();
		for (int i = 0; i < context.lengthValue("ListEventTargetsByRuleResponse.MnsParameters.Length"); i++) {
			MnsParameter mnsParameter = new MnsParameter();
			mnsParameter.setRegion(context.stringValue("ListEventTargetsByRuleResponse.MnsParameters["+ i +"].Region"));
			mnsParameter.setQueue(context.stringValue("ListEventTargetsByRuleResponse.MnsParameters["+ i +"].Queue"));
			mnsParameter.setId(context.stringValue("ListEventTargetsByRuleResponse.MnsParameters["+ i +"].Id"));

			mnsParameters.add(mnsParameter);
		}
		listEventTargetsByRuleResponse.setMnsParameters(mnsParameters);
	 
	 	return listEventTargetsByRuleResponse;
	}
}
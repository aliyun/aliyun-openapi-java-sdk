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

import com.aliyuncs.cms.model.v20190101.PutEventRuleTargetsResponse;
import com.aliyuncs.cms.model.v20190101.PutEventRuleTargetsResponse.ContactParameter;
import com.aliyuncs.cms.model.v20190101.PutEventRuleTargetsResponse.FcParameter;
import com.aliyuncs.cms.model.v20190101.PutEventRuleTargetsResponse.MnsParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutEventRuleTargetsResponseUnmarshaller {

	public static PutEventRuleTargetsResponse unmarshall(PutEventRuleTargetsResponse putEventRuleTargetsResponse, UnmarshallerContext _ctx) {
		
		putEventRuleTargetsResponse.setRequestId(_ctx.stringValue("PutEventRuleTargetsResponse.RequestId"));
		putEventRuleTargetsResponse.setSuccess(_ctx.booleanValue("PutEventRuleTargetsResponse.Success"));
		putEventRuleTargetsResponse.setCode(_ctx.stringValue("PutEventRuleTargetsResponse.Code"));
		putEventRuleTargetsResponse.setMessage(_ctx.stringValue("PutEventRuleTargetsResponse.Message"));
		putEventRuleTargetsResponse.setFailedParameterCount(_ctx.stringValue("PutEventRuleTargetsResponse.FailedParameterCount"));

		List<ContactParameter> failedContactParameters = new ArrayList<ContactParameter>();
		for (int i = 0; i < _ctx.lengthValue("PutEventRuleTargetsResponse.FailedContactParameters.Length"); i++) {
			ContactParameter contactParameter = new ContactParameter();
			contactParameter.setId(_ctx.integerValue("PutEventRuleTargetsResponse.FailedContactParameters["+ i +"].Id"));
			contactParameter.setContactGroupName(_ctx.stringValue("PutEventRuleTargetsResponse.FailedContactParameters["+ i +"].ContactGroupName"));
			contactParameter.setLevel(_ctx.stringValue("PutEventRuleTargetsResponse.FailedContactParameters["+ i +"].Level"));

			failedContactParameters.add(contactParameter);
		}
		putEventRuleTargetsResponse.setFailedContactParameters(failedContactParameters);

		List<MnsParameter> failedMnsParameters = new ArrayList<MnsParameter>();
		for (int i = 0; i < _ctx.lengthValue("PutEventRuleTargetsResponse.FailedMnsParameters.Length"); i++) {
			MnsParameter mnsParameter = new MnsParameter();
			mnsParameter.setId(_ctx.integerValue("PutEventRuleTargetsResponse.FailedMnsParameters["+ i +"].Id"));
			mnsParameter.setRegion(_ctx.stringValue("PutEventRuleTargetsResponse.FailedMnsParameters["+ i +"].Region"));
			mnsParameter.setQueue(_ctx.stringValue("PutEventRuleTargetsResponse.FailedMnsParameters["+ i +"].Queue"));

			failedMnsParameters.add(mnsParameter);
		}
		putEventRuleTargetsResponse.setFailedMnsParameters(failedMnsParameters);

		List<FcParameter> failedFcParameters = new ArrayList<FcParameter>();
		for (int i = 0; i < _ctx.lengthValue("PutEventRuleTargetsResponse.FailedFcParameters.Length"); i++) {
			FcParameter fcParameter = new FcParameter();
			fcParameter.setId(_ctx.integerValue("PutEventRuleTargetsResponse.FailedFcParameters["+ i +"].Id"));
			fcParameter.setRegion(_ctx.stringValue("PutEventRuleTargetsResponse.FailedFcParameters["+ i +"].Region"));
			fcParameter.setServiceName(_ctx.stringValue("PutEventRuleTargetsResponse.FailedFcParameters["+ i +"].ServiceName"));
			fcParameter.setFunctionName(_ctx.stringValue("PutEventRuleTargetsResponse.FailedFcParameters["+ i +"].FunctionName"));

			failedFcParameters.add(fcParameter);
		}
		putEventRuleTargetsResponse.setFailedFcParameters(failedFcParameters);
	 
	 	return putEventRuleTargetsResponse;
	}
}
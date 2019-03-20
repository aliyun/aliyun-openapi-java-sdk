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

import com.aliyuncs.cms.model.v20180308.PutEventTargetsResponse;
import com.aliyuncs.cms.model.v20180308.PutEventTargetsResponse.ContactParameter;
import com.aliyuncs.cms.model.v20180308.PutEventTargetsResponse.FailedSlsParameter;
import com.aliyuncs.cms.model.v20180308.PutEventTargetsResponse.FcParameter;
import com.aliyuncs.cms.model.v20180308.PutEventTargetsResponse.MnsParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutEventTargetsResponseUnmarshaller {

	public static PutEventTargetsResponse unmarshall(PutEventTargetsResponse putEventTargetsResponse, UnmarshallerContext context) {
		
		putEventTargetsResponse.setRequestId(context.stringValue("PutEventTargetsResponse.RequestId"));
		putEventTargetsResponse.setSuccess(context.booleanValue("PutEventTargetsResponse.Success"));
		putEventTargetsResponse.setCode(context.stringValue("PutEventTargetsResponse.Code"));
		putEventTargetsResponse.setMessage(context.stringValue("PutEventTargetsResponse.Message"));
		putEventTargetsResponse.setParameterCount(context.stringValue("PutEventTargetsResponse.ParameterCount"));
		putEventTargetsResponse.setFailedParameterCount(context.stringValue("PutEventTargetsResponse.FailedParameterCount"));

		List<ContactParameter> contactParameters = new ArrayList<ContactParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.ContactParameters.Length"); i++) {
			ContactParameter contactParameter = new ContactParameter();
			contactParameter.setId(context.integerValue("PutEventTargetsResponse.ContactParameters["+ i +"].Id"));
			contactParameter.setContactGroupName(context.stringValue("PutEventTargetsResponse.ContactParameters["+ i +"].ContactGroupName"));
			contactParameter.setLevel(context.stringValue("PutEventTargetsResponse.ContactParameters["+ i +"].Level"));

			contactParameters.add(contactParameter);
		}
		putEventTargetsResponse.setContactParameters(contactParameters);

		List<MnsParameter> mnsParameters = new ArrayList<MnsParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.MnsParameters.Length"); i++) {
			MnsParameter mnsParameter = new MnsParameter();
			mnsParameter.setId(context.integerValue("PutEventTargetsResponse.MnsParameters["+ i +"].Id"));
			mnsParameter.setRegion(context.stringValue("PutEventTargetsResponse.MnsParameters["+ i +"].Region"));
			mnsParameter.setQueue(context.stringValue("PutEventTargetsResponse.MnsParameters["+ i +"].Queue"));

			mnsParameters.add(mnsParameter);
		}
		putEventTargetsResponse.setMnsParameters(mnsParameters);

		List<FcParameter> fcParameters = new ArrayList<FcParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.FcParameters.Length"); i++) {
			FcParameter fcParameter = new FcParameter();
			fcParameter.setId(context.integerValue("PutEventTargetsResponse.FcParameters["+ i +"].Id"));
			fcParameter.setRegion(context.stringValue("PutEventTargetsResponse.FcParameters["+ i +"].Region"));
			fcParameter.setServiceName(context.stringValue("PutEventTargetsResponse.FcParameters["+ i +"].ServiceName"));
			fcParameter.setFunctionName(context.stringValue("PutEventTargetsResponse.FcParameters["+ i +"].FunctionName"));

			fcParameters.add(fcParameter);
		}
		putEventTargetsResponse.setFcParameters(fcParameters);

		List<ContactParameter> failedContactParameters = new ArrayList<ContactParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.FailedContactParameters.Length"); i++) {
			ContactParameter contactParameter = new ContactParameter();
			contactParameter.setId(context.integerValue("PutEventTargetsResponse.FailedContactParameters["+ i +"].Id"));
			contactParameter.setContactGroupName(context.stringValue("PutEventTargetsResponse.FailedContactParameters["+ i +"].ContactGroupName"));
			contactParameter.setLevel(context.stringValue("PutEventTargetsResponse.FailedContactParameters["+ i +"].Level"));

			failedContactParameters.add(contactParameter);
		}
		putEventTargetsResponse.setFailedContactParameters(failedContactParameters);

		List<MnsParameter> failedMnsParameters = new ArrayList<MnsParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.FailedMnsParameters.Length"); i++) {
			MnsParameter mnsParameter = new MnsParameter();
			mnsParameter.setId(context.integerValue("PutEventTargetsResponse.FailedMnsParameters["+ i +"].Id"));
			mnsParameter.setRegion(context.stringValue("PutEventTargetsResponse.FailedMnsParameters["+ i +"].Region"));
			mnsParameter.setQueue(context.stringValue("PutEventTargetsResponse.FailedMnsParameters["+ i +"].Queue"));

			failedMnsParameters.add(mnsParameter);
		}
		putEventTargetsResponse.setFailedMnsParameters(failedMnsParameters);

		List<FcParameter> failedFcParameters = new ArrayList<FcParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.FailedFcParameters.Length"); i++) {
			FcParameter fcParameter = new FcParameter();
			fcParameter.setId(context.integerValue("PutEventTargetsResponse.FailedFcParameters["+ i +"].Id"));
			fcParameter.setRegion(context.stringValue("PutEventTargetsResponse.FailedFcParameters["+ i +"].Region"));
			fcParameter.setServiceName(context.stringValue("PutEventTargetsResponse.FailedFcParameters["+ i +"].ServiceName"));
			fcParameter.setFunctionName(context.stringValue("PutEventTargetsResponse.FailedFcParameters["+ i +"].FunctionName"));

			failedFcParameters.add(fcParameter);
		}
		putEventTargetsResponse.setFailedFcParameters(failedFcParameters);

		List<FailedSlsParameter> failedSlsParameters = new ArrayList<FailedSlsParameter>();
		for (int i = 0; i < context.lengthValue("PutEventTargetsResponse.FailedSlsParameters.Length"); i++) {
			FailedSlsParameter failedSlsParameter = new FailedSlsParameter();
			failedSlsParameter.setId(context.stringValue("PutEventTargetsResponse.FailedSlsParameters["+ i +"].Id"));
			failedSlsParameter.setRegion(context.stringValue("PutEventTargetsResponse.FailedSlsParameters["+ i +"].Region"));
			failedSlsParameter.setProject(context.stringValue("PutEventTargetsResponse.FailedSlsParameters["+ i +"].Project"));
			failedSlsParameter.setLogStore(context.stringValue("PutEventTargetsResponse.FailedSlsParameters["+ i +"].LogStore"));

			failedSlsParameters.add(failedSlsParameter);
		}
		putEventTargetsResponse.setFailedSlsParameters(failedSlsParameters);
	 
	 	return putEventTargetsResponse;
	}
}
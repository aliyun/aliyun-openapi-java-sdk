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

package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.DecodeDiagnosticMessageResponse;
import com.aliyuncs.ram.model.v20150501.DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage;
import com.aliyuncs.ram.model.v20150501.DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthConditionsItem;
import com.aliyuncs.ram.model.v20150501.DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthPrincipal;
import com.aliyuncs.ram.model.v20150501.DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPoliciesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DecodeDiagnosticMessageResponseUnmarshaller {

	public static DecodeDiagnosticMessageResponse unmarshall(DecodeDiagnosticMessageResponse decodeDiagnosticMessageResponse, UnmarshallerContext _ctx) {
		
		decodeDiagnosticMessageResponse.setRequestId(_ctx.stringValue("DecodeDiagnosticMessageResponse.RequestId"));

		DecodedDiagnosticMessage decodedDiagnosticMessage = new DecodedDiagnosticMessage();
		decodedDiagnosticMessage.setExplicitDeny(_ctx.booleanValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.ExplicitDeny"));
		decodedDiagnosticMessage.setNoPermissionPolicyType(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.NoPermissionPolicyType"));
		decodedDiagnosticMessage.setAuthAction(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthAction"));
		decodedDiagnosticMessage.setAuthResource(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthResource"));

		AuthPrincipal authPrincipal = new AuthPrincipal();
		authPrincipal.setAuthPrincipalType(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthPrincipal.AuthPrincipalType"));
		authPrincipal.setAuthPrincipalOwnerId(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthPrincipal.AuthPrincipalOwnerId"));
		authPrincipal.setAuthPrincipalDisplayName(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthPrincipal.AuthPrincipalDisplayName"));
		decodedDiagnosticMessage.setAuthPrincipal(authPrincipal);

		List<AuthConditionsItem> authConditions = new ArrayList<AuthConditionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthConditions.Length"); i++) {
			AuthConditionsItem authConditionsItem = new AuthConditionsItem();
			authConditionsItem.setConditionKey(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthConditions["+ i +"].ConditionKey"));

			List<String> conditionValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthConditions["+ i +"].ConditionValues.Length"); j++) {
				conditionValues.add(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.AuthConditions["+ i +"].ConditionValues["+ j +"]"));
			}
			authConditionsItem.setConditionValues(conditionValues);

			authConditions.add(authConditionsItem);
		}
		decodedDiagnosticMessage.setAuthConditions(authConditions);

		List<MatchedPoliciesItem> matchedPolicies = new ArrayList<MatchedPoliciesItem>();
		for (int i = 0; i < _ctx.lengthValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies.Length"); i++) {
			MatchedPoliciesItem matchedPoliciesItem = new MatchedPoliciesItem();
			matchedPoliciesItem.setEffect(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies["+ i +"].Effect"));
			matchedPoliciesItem.setPolicyIdentifier(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies["+ i +"].PolicyIdentifier"));
			matchedPoliciesItem.setPolicyType(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies["+ i +"].PolicyType"));
			matchedPoliciesItem.setPolicyVersion(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies["+ i +"].PolicyVersion"));
			matchedPoliciesItem.setAttachedEntityType(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies["+ i +"].AttachedEntityType"));
			matchedPoliciesItem.setAttachedScope(_ctx.stringValue("DecodeDiagnosticMessageResponse.DecodedDiagnosticMessage.MatchedPolicies["+ i +"].AttachedScope"));

			matchedPolicies.add(matchedPoliciesItem);
		}
		decodedDiagnosticMessage.setMatchedPolicies(matchedPolicies);
		decodeDiagnosticMessageResponse.setDecodedDiagnosticMessage(decodedDiagnosticMessage);
	 
	 	return decodeDiagnosticMessageResponse;
	}
}
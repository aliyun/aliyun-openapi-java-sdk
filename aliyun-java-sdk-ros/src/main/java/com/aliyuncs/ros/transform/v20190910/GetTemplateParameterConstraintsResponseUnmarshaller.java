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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetTemplateParameterConstraintsResponse;
import com.aliyuncs.ros.model.v20190910.GetTemplateParameterConstraintsResponse.ParameterConstraint;
import com.aliyuncs.ros.model.v20190910.GetTemplateParameterConstraintsResponse.ParameterConstraint.NotSupportResource;
import com.aliyuncs.ros.model.v20190910.GetTemplateParameterConstraintsResponse.ParameterConstraint.OriginalConstraint;
import com.aliyuncs.ros.model.v20190910.GetTemplateParameterConstraintsResponse.ParameterConstraint.QueryError;
import com.aliyuncs.ros.model.v20190910.GetTemplateParameterConstraintsResponse.ParameterConstraint.QueryTimeoutDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateParameterConstraintsResponseUnmarshaller {

	public static GetTemplateParameterConstraintsResponse unmarshall(GetTemplateParameterConstraintsResponse getTemplateParameterConstraintsResponse, UnmarshallerContext _ctx) {
		
		getTemplateParameterConstraintsResponse.setRequestId(_ctx.stringValue("GetTemplateParameterConstraintsResponse.RequestId"));

		List<ParameterConstraint> parameterConstraints = new ArrayList<ParameterConstraint>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints.Length"); i++) {
			ParameterConstraint parameterConstraint = new ParameterConstraint();
			parameterConstraint.setParameterKey(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].ParameterKey"));
			parameterConstraint.setType(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].Type"));
			parameterConstraint.setBehavior(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].Behavior"));
			parameterConstraint.setBehaviorReason(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].BehaviorReason"));

			List<String> allowedValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AllowedValues.Length"); j++) {
				allowedValues.add(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AllowedValues["+ j +"]"));
			}
			parameterConstraint.setAllowedValues(allowedValues);

			List<String> associationParameterNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AssociationParameterNames.Length"); j++) {
				associationParameterNames.add(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AssociationParameterNames["+ j +"]"));
			}
			parameterConstraint.setAssociationParameterNames(associationParameterNames);

			List<String> illegalValueByParameterConstraints = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].IllegalValueByParameterConstraints.Length"); j++) {
				illegalValueByParameterConstraints.add(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].IllegalValueByParameterConstraints["+ j +"]"));
			}
			parameterConstraint.setIllegalValueByParameterConstraints(illegalValueByParameterConstraints);

			List<String> illegalValueByRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].IllegalValueByRules.Length"); j++) {
				illegalValueByRules.add(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].IllegalValueByRules["+ j +"]"));
			}
			parameterConstraint.setIllegalValueByRules(illegalValueByRules);

			List<NotSupportResource> notSupportResources = new ArrayList<NotSupportResource>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].NotSupportResources.Length"); j++) {
				NotSupportResource notSupportResource = new NotSupportResource();
				notSupportResource.setResourceType(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].NotSupportResources["+ j +"].ResourceType"));
				notSupportResource.setPropertyName(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].NotSupportResources["+ j +"].PropertyName"));

				notSupportResources.add(notSupportResource);
			}
			parameterConstraint.setNotSupportResources(notSupportResources);

			List<QueryError> queryErrors = new ArrayList<QueryError>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryErrors.Length"); j++) {
				QueryError queryError = new QueryError();
				queryError.setErrorMessage(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryErrors["+ j +"].ErrorMessage"));
				queryError.setResourceName(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryErrors["+ j +"].ResourceName"));
				queryError.setResourceType(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryErrors["+ j +"].ResourceType"));

				queryErrors.add(queryError);
			}
			parameterConstraint.setQueryErrors(queryErrors);

			List<OriginalConstraint> originalConstraints = new ArrayList<OriginalConstraint>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints.Length"); j++) {
				OriginalConstraint originalConstraint = new OriginalConstraint();
				originalConstraint.setResourceName(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].ResourceName"));
				originalConstraint.setResourceType(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].ResourceType"));
				originalConstraint.setPropertyName(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].PropertyName"));

				List<String> allowedValues1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].AllowedValues.Length"); k++) {
					allowedValues1.add(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].AllowedValues["+ k +"]"));
				}
				originalConstraint.setAllowedValues1(allowedValues1);

				originalConstraints.add(originalConstraint);
			}
			parameterConstraint.setOriginalConstraints(originalConstraints);

			List<QueryTimeoutDetail> queryTimeoutDetails = new ArrayList<QueryTimeoutDetail>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryTimeoutDetails.Length"); j++) {
				QueryTimeoutDetail queryTimeoutDetail = new QueryTimeoutDetail();
				queryTimeoutDetail.setResourceType(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryTimeoutDetails["+ j +"].ResourceType"));
				queryTimeoutDetail.setResourceName(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryTimeoutDetails["+ j +"].ResourceName"));
				queryTimeoutDetail.setErrorMessage(_ctx.stringValue("GetTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].QueryTimeoutDetails["+ j +"].ErrorMessage"));

				queryTimeoutDetails.add(queryTimeoutDetail);
			}
			parameterConstraint.setQueryTimeoutDetails(queryTimeoutDetails);

			parameterConstraints.add(parameterConstraint);
		}
		getTemplateParameterConstraintsResponse.setParameterConstraints(parameterConstraints);
	 
	 	return getTemplateParameterConstraintsResponse;
	}
}
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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceTemplateParameterConstraintsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceTemplateParameterConstraintsResponse.ParameterConstraintsItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceTemplateParameterConstraintsResponse.ParameterConstraintsItem.OriginalConstraintsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceTemplateParameterConstraintsResponseUnmarshaller {

	public static GetServiceTemplateParameterConstraintsResponse unmarshall(GetServiceTemplateParameterConstraintsResponse getServiceTemplateParameterConstraintsResponse, UnmarshallerContext _ctx) {
		
		getServiceTemplateParameterConstraintsResponse.setRequestId(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.RequestId"));

		List<String> familyConstraints = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceTemplateParameterConstraintsResponse.FamilyConstraints.Length"); i++) {
			familyConstraints.add(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.FamilyConstraints["+ i +"]"));
		}
		getServiceTemplateParameterConstraintsResponse.setFamilyConstraints(familyConstraints);

		List<ParameterConstraintsItem> parameterConstraints = new ArrayList<ParameterConstraintsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints.Length"); i++) {
			ParameterConstraintsItem parameterConstraintsItem = new ParameterConstraintsItem();
			parameterConstraintsItem.setType(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].Type"));
			parameterConstraintsItem.setParameterKey(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].ParameterKey"));
			parameterConstraintsItem.setBehavior(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].Behavior"));
			parameterConstraintsItem.setBehaviorReason(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].BehaviorReason"));

			List<String> allowedValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AllowedValues.Length"); j++) {
				allowedValues.add(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AllowedValues["+ j +"]"));
			}
			parameterConstraintsItem.setAllowedValues(allowedValues);

			List<String> associationParameterNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AssociationParameterNames.Length"); j++) {
				associationParameterNames.add(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].AssociationParameterNames["+ j +"]"));
			}
			parameterConstraintsItem.setAssociationParameterNames(associationParameterNames);

			List<OriginalConstraintsItem> originalConstraints = new ArrayList<OriginalConstraintsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints.Length"); j++) {
				OriginalConstraintsItem originalConstraintsItem = new OriginalConstraintsItem();
				originalConstraintsItem.setPropertyName(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].PropertyName"));
				originalConstraintsItem.setResourceName(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].ResourceName"));
				originalConstraintsItem.setResourceType(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].ResourceType"));

				List<String> allowedValues1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].AllowedValues.Length"); k++) {
					allowedValues1.add(_ctx.stringValue("GetServiceTemplateParameterConstraintsResponse.ParameterConstraints["+ i +"].OriginalConstraints["+ j +"].AllowedValues["+ k +"]"));
				}
				originalConstraintsItem.setAllowedValues1(allowedValues1);

				originalConstraints.add(originalConstraintsItem);
			}
			parameterConstraintsItem.setOriginalConstraints(originalConstraints);

			parameterConstraints.add(parameterConstraintsItem);
		}
		getServiceTemplateParameterConstraintsResponse.setParameterConstraints(parameterConstraints);
	 
	 	return getServiceTemplateParameterConstraintsResponse;
	}
}
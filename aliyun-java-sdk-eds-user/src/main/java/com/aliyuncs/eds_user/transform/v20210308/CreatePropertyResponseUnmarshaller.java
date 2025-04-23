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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.CreatePropertyResponse;
import com.aliyuncs.eds_user.model.v20210308.CreatePropertyResponse.CreateResult;
import com.aliyuncs.eds_user.model.v20210308.CreatePropertyResponse.CreateResult.SavePropertyValueModel;
import com.aliyuncs.eds_user.model.v20210308.CreatePropertyResponse.CreateResult.SavePropertyValueModel.FailedPropertyValuesItem;
import com.aliyuncs.eds_user.model.v20210308.CreatePropertyResponse.CreateResult.SavePropertyValueModel.SavePropertyValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePropertyResponseUnmarshaller {

	public static CreatePropertyResponse unmarshall(CreatePropertyResponse createPropertyResponse, UnmarshallerContext _ctx) {
		
		createPropertyResponse.setRequestId(_ctx.stringValue("CreatePropertyResponse.RequestId"));

		CreateResult createResult = new CreateResult();
		createResult.setPropertyId(_ctx.longValue("CreatePropertyResponse.CreateResult.PropertyId"));
		createResult.setPropertyKey(_ctx.stringValue("CreatePropertyResponse.CreateResult.PropertyKey"));

		SavePropertyValueModel savePropertyValueModel = new SavePropertyValueModel();

		List<SavePropertyValuesItem> savePropertyValues = new ArrayList<SavePropertyValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.SavePropertyValues.Length"); i++) {
			SavePropertyValuesItem savePropertyValuesItem = new SavePropertyValuesItem();
			savePropertyValuesItem.setPropertyValueId(_ctx.longValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.SavePropertyValues["+ i +"].PropertyValueId"));
			savePropertyValuesItem.setPropertyValue(_ctx.stringValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.SavePropertyValues["+ i +"].PropertyValue"));

			savePropertyValues.add(savePropertyValuesItem);
		}
		savePropertyValueModel.setSavePropertyValues(savePropertyValues);

		List<FailedPropertyValuesItem> failedPropertyValues = new ArrayList<FailedPropertyValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.FailedPropertyValues.Length"); i++) {
			FailedPropertyValuesItem failedPropertyValuesItem = new FailedPropertyValuesItem();
			failedPropertyValuesItem.setPropertyId(_ctx.longValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].PropertyId"));
			failedPropertyValuesItem.setPropertyValue(_ctx.stringValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].PropertyValue"));
			failedPropertyValuesItem.setErrorCode(_ctx.stringValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].ErrorCode"));
			failedPropertyValuesItem.setErrorMessage(_ctx.stringValue("CreatePropertyResponse.CreateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].ErrorMessage"));

			failedPropertyValues.add(failedPropertyValuesItem);
		}
		savePropertyValueModel.setFailedPropertyValues(failedPropertyValues);
		createResult.setSavePropertyValueModel(savePropertyValueModel);
		createPropertyResponse.setCreateResult(createResult);
	 
	 	return createPropertyResponse;
	}
}
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

import com.aliyuncs.eds_user.model.v20210308.UpdatePropertyResponse;
import com.aliyuncs.eds_user.model.v20210308.UpdatePropertyResponse.UpdateResult;
import com.aliyuncs.eds_user.model.v20210308.UpdatePropertyResponse.UpdateResult.SavePropertyValueModel;
import com.aliyuncs.eds_user.model.v20210308.UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.FailedPropertyValuesItem;
import com.aliyuncs.eds_user.model.v20210308.UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.SavePropertyValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePropertyResponseUnmarshaller {

	public static UpdatePropertyResponse unmarshall(UpdatePropertyResponse updatePropertyResponse, UnmarshallerContext _ctx) {
		
		updatePropertyResponse.setRequestId(_ctx.stringValue("UpdatePropertyResponse.RequestId"));

		UpdateResult updateResult = new UpdateResult();
		updateResult.setPropertyId(_ctx.longValue("UpdatePropertyResponse.UpdateResult.PropertyId"));
		updateResult.setPropertyKey(_ctx.stringValue("UpdatePropertyResponse.UpdateResult.PropertyKey"));

		SavePropertyValueModel savePropertyValueModel = new SavePropertyValueModel();

		List<SavePropertyValuesItem> savePropertyValues = new ArrayList<SavePropertyValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.SavePropertyValues.Length"); i++) {
			SavePropertyValuesItem savePropertyValuesItem = new SavePropertyValuesItem();
			savePropertyValuesItem.setPropertyValueId(_ctx.longValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.SavePropertyValues["+ i +"].PropertyValueId"));
			savePropertyValuesItem.setPropertyValue(_ctx.stringValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.SavePropertyValues["+ i +"].PropertyValue"));

			savePropertyValues.add(savePropertyValuesItem);
		}
		savePropertyValueModel.setSavePropertyValues(savePropertyValues);

		List<FailedPropertyValuesItem> failedPropertyValues = new ArrayList<FailedPropertyValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.FailedPropertyValues.Length"); i++) {
			FailedPropertyValuesItem failedPropertyValuesItem = new FailedPropertyValuesItem();
			failedPropertyValuesItem.setPropertyId(_ctx.longValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].PropertyId"));
			failedPropertyValuesItem.setPropertyValue(_ctx.stringValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].PropertyValue"));
			failedPropertyValuesItem.setErrorCode(_ctx.stringValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].ErrorCode"));
			failedPropertyValuesItem.setErrorMessage(_ctx.stringValue("UpdatePropertyResponse.UpdateResult.SavePropertyValueModel.FailedPropertyValues["+ i +"].ErrorMessage"));

			failedPropertyValues.add(failedPropertyValuesItem);
		}
		savePropertyValueModel.setFailedPropertyValues(failedPropertyValues);
		updateResult.setSavePropertyValueModel(savePropertyValueModel);
		updatePropertyResponse.setUpdateResult(updateResult);
	 
	 	return updatePropertyResponse;
	}
}
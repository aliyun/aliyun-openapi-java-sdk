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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.GetWhatsappHealthStatusResponse;
import com.aliyuncs.cams.model.v20200606.GetWhatsappHealthStatusResponse.Data;
import com.aliyuncs.cams.model.v20200606.GetWhatsappHealthStatusResponse.Data.EntitiesItem;
import com.aliyuncs.cams.model.v20200606.GetWhatsappHealthStatusResponse.Data.EntitiesItem.ErrorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWhatsappHealthStatusResponseUnmarshaller {

	public static GetWhatsappHealthStatusResponse unmarshall(GetWhatsappHealthStatusResponse getWhatsappHealthStatusResponse, UnmarshallerContext _ctx) {
		
		getWhatsappHealthStatusResponse.setRequestId(_ctx.stringValue("GetWhatsappHealthStatusResponse.RequestId"));
		getWhatsappHealthStatusResponse.setAccessDeniedDetail(_ctx.stringValue("GetWhatsappHealthStatusResponse.AccessDeniedDetail"));
		getWhatsappHealthStatusResponse.setMessage(_ctx.stringValue("GetWhatsappHealthStatusResponse.Message"));
		getWhatsappHealthStatusResponse.setCode(_ctx.stringValue("GetWhatsappHealthStatusResponse.Code"));
		getWhatsappHealthStatusResponse.setSuccess(_ctx.booleanValue("GetWhatsappHealthStatusResponse.Success"));

		Data data = new Data();
		data.setCanSendMessage(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.CanSendMessage"));

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWhatsappHealthStatusResponse.Data.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();
			entitiesItem.setEntityType(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].EntityType"));
			entitiesItem.setTemplateCode(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].TemplateCode"));
			entitiesItem.setLanguage(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].Language"));
			entitiesItem.setCanSendMessage(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].CanSendMessage"));
			entitiesItem.setPhoneNumber(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].PhoneNumber"));
			entitiesItem.setWabaId(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].WabaId"));
			entitiesItem.setBusinessId(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].BusinessId"));

			List<ErrorsItem> errors = new ArrayList<ErrorsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].Errors.Length"); j++) {
				ErrorsItem errorsItem = new ErrorsItem();
				errorsItem.setErrorDescription(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].Errors["+ j +"].ErrorDescription"));
				errorsItem.setPossibleSolution(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].Errors["+ j +"].PossibleSolution"));
				errorsItem.setErrorCode(_ctx.stringValue("GetWhatsappHealthStatusResponse.Data.Entities["+ i +"].Errors["+ j +"].ErrorCode"));

				errors.add(errorsItem);
			}
			entitiesItem.setErrors(errors);

			entities.add(entitiesItem);
		}
		data.setEntities(entities);
		getWhatsappHealthStatusResponse.setData(data);
	 
	 	return getWhatsappHealthStatusResponse;
	}
}
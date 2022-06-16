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

package com.aliyuncs.dytnsapi.transform.v20200217;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dytnsapi.model.v20200217.InvalidPhoneNumberFilterResponse;
import com.aliyuncs.dytnsapi.model.v20200217.InvalidPhoneNumberFilterResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvalidPhoneNumberFilterResponseUnmarshaller {

	public static InvalidPhoneNumberFilterResponse unmarshall(InvalidPhoneNumberFilterResponse invalidPhoneNumberFilterResponse, UnmarshallerContext _ctx) {
		
		invalidPhoneNumberFilterResponse.setRequestId(_ctx.stringValue("InvalidPhoneNumberFilterResponse.RequestId"));
		invalidPhoneNumberFilterResponse.setCode(_ctx.stringValue("InvalidPhoneNumberFilterResponse.Code"));
		invalidPhoneNumberFilterResponse.setMessage(_ctx.stringValue("InvalidPhoneNumberFilterResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("InvalidPhoneNumberFilterResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("InvalidPhoneNumberFilterResponse.Data["+ i +"].Code"));
			dataItem.setOriginalNumber(_ctx.stringValue("InvalidPhoneNumberFilterResponse.Data["+ i +"].OriginalNumber"));
			dataItem.setEncryptedNumber(_ctx.stringValue("InvalidPhoneNumberFilterResponse.Data["+ i +"].EncryptedNumber"));
			dataItem.setExpireTime(_ctx.stringValue("InvalidPhoneNumberFilterResponse.Data["+ i +"].ExpireTime"));

			data.add(dataItem);
		}
		invalidPhoneNumberFilterResponse.setData(data);
	 
	 	return invalidPhoneNumberFilterResponse;
	}
}
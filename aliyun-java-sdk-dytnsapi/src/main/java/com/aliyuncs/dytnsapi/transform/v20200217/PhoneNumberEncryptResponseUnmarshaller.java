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

import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberEncryptResponse;
import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberEncryptResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhoneNumberEncryptResponseUnmarshaller {

	public static PhoneNumberEncryptResponse unmarshall(PhoneNumberEncryptResponse phoneNumberEncryptResponse, UnmarshallerContext _ctx) {
		
		phoneNumberEncryptResponse.setRequestId(_ctx.stringValue("PhoneNumberEncryptResponse.RequestId"));
		phoneNumberEncryptResponse.setCode(_ctx.stringValue("PhoneNumberEncryptResponse.Code"));
		phoneNumberEncryptResponse.setMessage(_ctx.stringValue("PhoneNumberEncryptResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("PhoneNumberEncryptResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOriginalNumber(_ctx.stringValue("PhoneNumberEncryptResponse.Data["+ i +"].OriginalNumber"));
			dataItem.setEncryptedNumber(_ctx.stringValue("PhoneNumberEncryptResponse.Data["+ i +"].EncryptedNumber"));
			dataItem.setExpireTime(_ctx.stringValue("PhoneNumberEncryptResponse.Data["+ i +"].ExpireTime"));

			data.add(dataItem);
		}
		phoneNumberEncryptResponse.setData(data);
	 
	 	return phoneNumberEncryptResponse;
	}
}
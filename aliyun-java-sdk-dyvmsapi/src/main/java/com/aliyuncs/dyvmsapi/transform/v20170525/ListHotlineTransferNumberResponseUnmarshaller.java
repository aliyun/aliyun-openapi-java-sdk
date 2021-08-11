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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyvmsapi.model.v20170525.ListHotlineTransferNumberResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.ListHotlineTransferNumberResponse.Data;
import com.aliyuncs.dyvmsapi.model.v20170525.ListHotlineTransferNumberResponse.Data.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotlineTransferNumberResponseUnmarshaller {

	public static ListHotlineTransferNumberResponse unmarshall(ListHotlineTransferNumberResponse listHotlineTransferNumberResponse, UnmarshallerContext _ctx) {
		
		listHotlineTransferNumberResponse.setRequestId(_ctx.stringValue("ListHotlineTransferNumberResponse.RequestId"));
		listHotlineTransferNumberResponse.setCode(_ctx.stringValue("ListHotlineTransferNumberResponse.Code"));
		listHotlineTransferNumberResponse.setMessage(_ctx.stringValue("ListHotlineTransferNumberResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListHotlineTransferNumberResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("ListHotlineTransferNumberResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListHotlineTransferNumberResponse.Data.PageSize"));

		List<ValuesItem> values = new ArrayList<ValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotlineTransferNumberResponse.Data.Values.Length"); i++) {
			ValuesItem valuesItem = new ValuesItem();
			valuesItem.setQualificationId(_ctx.stringValue("ListHotlineTransferNumberResponse.Data.Values["+ i +"].QualificationId"));
			valuesItem.setPhoneNumber(_ctx.stringValue("ListHotlineTransferNumberResponse.Data.Values["+ i +"].PhoneNumber"));
			valuesItem.setNumberOwnerName(_ctx.stringValue("ListHotlineTransferNumberResponse.Data.Values["+ i +"].NumberOwnerName"));
			valuesItem.setIdentityCard(_ctx.stringValue("ListHotlineTransferNumberResponse.Data.Values["+ i +"].IdentityCard"));
			valuesItem.setResUniqueCode(_ctx.stringValue("ListHotlineTransferNumberResponse.Data.Values["+ i +"].ResUniqueCode"));
			valuesItem.setHotlineNumber(_ctx.stringValue("ListHotlineTransferNumberResponse.Data.Values["+ i +"].HotlineNumber"));

			values.add(valuesItem);
		}
		data.setValues(values);
		listHotlineTransferNumberResponse.setData(data);
	 
	 	return listHotlineTransferNumberResponse;
	}
}
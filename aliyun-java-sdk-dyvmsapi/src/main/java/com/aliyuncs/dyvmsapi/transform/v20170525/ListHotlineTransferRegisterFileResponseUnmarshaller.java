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

import com.aliyuncs.dyvmsapi.model.v20170525.ListHotlineTransferRegisterFileResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.ListHotlineTransferRegisterFileResponse.Data;
import com.aliyuncs.dyvmsapi.model.v20170525.ListHotlineTransferRegisterFileResponse.Data.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotlineTransferRegisterFileResponseUnmarshaller {

	public static ListHotlineTransferRegisterFileResponse unmarshall(ListHotlineTransferRegisterFileResponse listHotlineTransferRegisterFileResponse, UnmarshallerContext _ctx) {
		
		listHotlineTransferRegisterFileResponse.setRequestId(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.RequestId"));
		listHotlineTransferRegisterFileResponse.setCode(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Code"));
		listHotlineTransferRegisterFileResponse.setMessage(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListHotlineTransferRegisterFileResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("ListHotlineTransferRegisterFileResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListHotlineTransferRegisterFileResponse.Data.PageSize"));

		List<ValuesItem> values = new ArrayList<ValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotlineTransferRegisterFileResponse.Data.Values.Length"); i++) {
			ValuesItem valuesItem = new ValuesItem();
			valuesItem.setQualificationId(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].QualificationId"));
			valuesItem.setCorpName(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].CorpName"));
			valuesItem.setMngOpName(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].MngOpName"));
			valuesItem.setMngOpMail(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].MngOpMail"));
			valuesItem.setMngOpMobile(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].MngOpMobile"));
			valuesItem.setMngOpIdentityCard(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].MngOpIdentityCard"));
			valuesItem.setAgree(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].Agree"));
			valuesItem.setResUniqueCode(_ctx.longValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].ResUniqueCode"));
			valuesItem.setHotlineNumber(_ctx.stringValue("ListHotlineTransferRegisterFileResponse.Data.Values["+ i +"].HotlineNumber"));

			values.add(valuesItem);
		}
		data.setValues(values);
		listHotlineTransferRegisterFileResponse.setData(data);
	 
	 	return listHotlineTransferRegisterFileResponse;
	}
}
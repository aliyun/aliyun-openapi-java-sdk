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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.MobileDetectResponse;
import com.aliyuncs.cloudauth.model.v20190307.MobileDetectResponse.ResultObject;
import com.aliyuncs.cloudauth.model.v20190307.MobileDetectResponse.ResultObject.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class MobileDetectResponseUnmarshaller {

	public static MobileDetectResponse unmarshall(MobileDetectResponse mobileDetectResponse, UnmarshallerContext _ctx) {
		
		mobileDetectResponse.setRequestId(_ctx.stringValue("MobileDetectResponse.RequestId"));
		mobileDetectResponse.setCode(_ctx.stringValue("MobileDetectResponse.Code"));
		mobileDetectResponse.setMessage(_ctx.stringValue("MobileDetectResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setChargeCount(_ctx.stringValue("MobileDetectResponse.ResultObject.ChargeCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("MobileDetectResponse.ResultObject.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setMobile(_ctx.stringValue("MobileDetectResponse.ResultObject.Items["+ i +"].Mobile"));
			itemsItem.setBizCode(_ctx.stringValue("MobileDetectResponse.ResultObject.Items["+ i +"].BizCode"));
			itemsItem.setSubCode(_ctx.stringValue("MobileDetectResponse.ResultObject.Items["+ i +"].SubCode"));
			itemsItem.setIspName(_ctx.stringValue("MobileDetectResponse.ResultObject.Items["+ i +"].IspName"));
			itemsItem.setArea(_ctx.stringValue("MobileDetectResponse.ResultObject.Items["+ i +"].Area"));

			items.add(itemsItem);
		}
		resultObject.setItems(items);
		mobileDetectResponse.setResultObject(resultObject);
	 
	 	return mobileDetectResponse;
	}
}
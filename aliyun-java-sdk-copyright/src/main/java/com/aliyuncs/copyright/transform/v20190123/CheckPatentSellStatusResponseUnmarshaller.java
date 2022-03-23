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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.CheckPatentSellStatusResponse;
import com.aliyuncs.copyright.model.v20190123.CheckPatentSellStatusResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckPatentSellStatusResponseUnmarshaller {

	public static CheckPatentSellStatusResponse unmarshall(CheckPatentSellStatusResponse checkPatentSellStatusResponse, UnmarshallerContext _ctx) {
		
		checkPatentSellStatusResponse.setRequestId(_ctx.stringValue("CheckPatentSellStatusResponse.RequestId"));
		checkPatentSellStatusResponse.setSuccess(_ctx.booleanValue("CheckPatentSellStatusResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckPatentSellStatusResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("CheckPatentSellStatusResponse.Data["+ i +"].Type"));
			dataItem.setEndDate(_ctx.stringValue("CheckPatentSellStatusResponse.Data["+ i +"].EndDate"));
			dataItem.setErrorMessage(_ctx.stringValue("CheckPatentSellStatusResponse.Data["+ i +"].ErrorMessage"));
			dataItem.setApplyNumber(_ctx.stringValue("CheckPatentSellStatusResponse.Data["+ i +"].ApplyNumber"));
			dataItem.setDiscount(_ctx.stringValue("CheckPatentSellStatusResponse.Data["+ i +"].Discount"));
			dataItem.setAge(_ctx.stringValue("CheckPatentSellStatusResponse.Data["+ i +"].Age"));
			dataItem.setFee(_ctx.floatValue("CheckPatentSellStatusResponse.Data["+ i +"].Fee"));

			data.add(dataItem);
		}
		checkPatentSellStatusResponse.setData(data);
	 
	 	return checkPatentSellStatusResponse;
	}
}
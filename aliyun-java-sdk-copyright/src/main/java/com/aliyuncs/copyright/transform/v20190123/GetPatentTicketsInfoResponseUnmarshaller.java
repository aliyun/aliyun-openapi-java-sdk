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

import com.aliyuncs.copyright.model.v20190123.GetPatentTicketsInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentTicketsInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentTicketsInfoResponseUnmarshaller {

	public static GetPatentTicketsInfoResponse unmarshall(GetPatentTicketsInfoResponse getPatentTicketsInfoResponse, UnmarshallerContext _ctx) {
		
		getPatentTicketsInfoResponse.setRequestId(_ctx.stringValue("GetPatentTicketsInfoResponse.RequestId"));
		getPatentTicketsInfoResponse.setSuccess(_ctx.booleanValue("GetPatentTicketsInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentTicketsInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInvoiceUrl(_ctx.stringValue("GetPatentTicketsInfoResponse.Data["+ i +"].InvoiceUrl"));
			dataItem.setPatentNo(_ctx.stringValue("GetPatentTicketsInfoResponse.Data["+ i +"].PatentNo"));
			dataItem.setFee(_ctx.stringValue("GetPatentTicketsInfoResponse.Data["+ i +"].Fee"));
			dataItem.setRemark(_ctx.stringValue("GetPatentTicketsInfoResponse.Data["+ i +"].Remark"));

			data.add(dataItem);
		}
		getPatentTicketsInfoResponse.setData(data);
	 
	 	return getPatentTicketsInfoResponse;
	}
}
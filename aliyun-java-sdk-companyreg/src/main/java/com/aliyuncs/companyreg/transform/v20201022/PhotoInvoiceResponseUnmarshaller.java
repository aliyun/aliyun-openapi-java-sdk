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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.PhotoInvoiceResponse;
import com.aliyuncs.companyreg.model.v20201022.PhotoInvoiceResponse.ItemItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhotoInvoiceResponseUnmarshaller {

	public static PhotoInvoiceResponse unmarshall(PhotoInvoiceResponse photoInvoiceResponse, UnmarshallerContext _ctx) {
		
		photoInvoiceResponse.setRequestId(_ctx.stringValue("PhotoInvoiceResponse.RequestId"));

		List<ItemItem> item = new ArrayList<ItemItem>();
		for (int i = 0; i < _ctx.lengthValue("PhotoInvoiceResponse.Item.Length"); i++) {
			ItemItem itemItem = new ItemItem();
			itemItem.setNoteRecognizedStatus(_ctx.stringValue("PhotoInvoiceResponse.Item["+ i +"].NoteRecognizedStatus"));
			itemItem.setTargetBoName(_ctx.stringValue("PhotoInvoiceResponse.Item["+ i +"].TargetBoName"));
			itemItem.setTargetVoucherId(_ctx.longValue("PhotoInvoiceResponse.Item["+ i +"].TargetVoucherId"));

			item.add(itemItem);
		}
		photoInvoiceResponse.setItem(item);
	 
	 	return photoInvoiceResponse;
	}
}
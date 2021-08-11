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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeQuotaInvoiceResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeQuotaInvoiceResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeQuotaInvoiceResponse.Data.Content;
import com.aliyuncs.ocr.model.v20191230.RecognizeQuotaInvoiceResponse.Data.KeyValueInfosItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeQuotaInvoiceResponse.Data.KeyValueInfosItem.ValuePositionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeQuotaInvoiceResponseUnmarshaller {

	public static RecognizeQuotaInvoiceResponse unmarshall(RecognizeQuotaInvoiceResponse recognizeQuotaInvoiceResponse, UnmarshallerContext _ctx) {
		
		recognizeQuotaInvoiceResponse.setRequestId(_ctx.stringValue("RecognizeQuotaInvoiceResponse.RequestId"));
		recognizeQuotaInvoiceResponse.setCode(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Code"));
		recognizeQuotaInvoiceResponse.setMessage(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Message"));

		Data data = new Data();
		data.setAngle(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.Angle"));
		data.setHeight(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.Height"));
		data.setWidth(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.Width"));
		data.setOrgHeight(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.OrgHeight"));
		data.setOrgWidth(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.OrgWidth"));

		Content content = new Content();
		content.setSumAmount(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.Content.SumAmount"));
		content.setInvoiceCode(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.Content.InvoiceCode"));
		content.setInvoiceNo(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.Content.InvoiceNo"));
		content.setInvoiceAmount(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.Content.InvoiceAmount"));
		content.setInvoiceDetails(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.Content.InvoiceDetails"));
		data.setContent(content);

		List<KeyValueInfosItem> keyValueInfos = new ArrayList<KeyValueInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos.Length"); i++) {
			KeyValueInfosItem keyValueInfosItem = new KeyValueInfosItem();
			keyValueInfosItem.setKey(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos["+ i +"].Key"));
			keyValueInfosItem.setValue(_ctx.stringValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos["+ i +"].Value"));
			keyValueInfosItem.setValueScore(_ctx.floatValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos["+ i +"].ValueScore"));

			List<ValuePositionsItem> valuePositions = new ArrayList<ValuePositionsItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos["+ i +"].ValuePositions.Length"); j++) {
				ValuePositionsItem valuePositionsItem = new ValuePositionsItem();
				valuePositionsItem.setX(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos["+ i +"].ValuePositions["+ j +"].X"));
				valuePositionsItem.setY(_ctx.longValue("RecognizeQuotaInvoiceResponse.Data.KeyValueInfos["+ i +"].ValuePositions["+ j +"].Y"));

				valuePositions.add(valuePositionsItem);
			}
			keyValueInfosItem.setValuePositions(valuePositions);

			keyValueInfos.add(keyValueInfosItem);
		}
		data.setKeyValueInfos(keyValueInfos);
		recognizeQuotaInvoiceResponse.setData(data);
	 
	 	return recognizeQuotaInvoiceResponse;
	}
}
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

import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse.Data.ResultsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse.Data.ResultsItem.Content;
import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse.Data.ResultsItem.KeyValueInfosItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse.Data.ResultsItem.KeyValueInfosItem.ValuePositionsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeTicketInvoiceResponse.Data.ResultsItem.SliceRectangleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeTicketInvoiceResponseUnmarshaller {

	public static RecognizeTicketInvoiceResponse unmarshall(RecognizeTicketInvoiceResponse recognizeTicketInvoiceResponse, UnmarshallerContext _ctx) {
		
		recognizeTicketInvoiceResponse.setRequestId(_ctx.stringValue("RecognizeTicketInvoiceResponse.RequestId"));
		recognizeTicketInvoiceResponse.setCode(_ctx.stringValue("RecognizeTicketInvoiceResponse.Code"));
		recognizeTicketInvoiceResponse.setMessage(_ctx.stringValue("RecognizeTicketInvoiceResponse.Message"));

		Data data = new Data();
		data.setCount(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Count"));
		data.setHeight(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Height"));
		data.setWidth(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Width"));
		data.setOrgHeight(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.OrgHeight"));
		data.setOrgWidth(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.OrgWidth"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTicketInvoiceResponse.Data.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setIndex(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Index"));
			resultsItem.setType(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Type"));

			Content content = new Content();
			content.setInvoiceCode(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.InvoiceCode"));
			content.setInvoiceNumber(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.InvoiceNumber"));
			content.setInvoiceDate(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.InvoiceDate"));
			content.setAntiFakeCode(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.AntiFakeCode"));
			content.setPayeeName(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.PayeeName"));
			content.setPayeeRegisterNo(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.PayeeRegisterNo"));
			content.setPayerName(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.PayerName"));
			content.setPayerRegisterNo(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.PayerRegisterNo"));
			content.setSumAmount(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].Content.SumAmount"));
			resultsItem.setContent(content);

			List<KeyValueInfosItem> keyValueInfos = new ArrayList<KeyValueInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos.Length"); j++) {
				KeyValueInfosItem keyValueInfosItem = new KeyValueInfosItem();
				keyValueInfosItem.setKey(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos["+ j +"].Key"));
				keyValueInfosItem.setValue(_ctx.stringValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos["+ j +"].Value"));
				keyValueInfosItem.setValueScore(_ctx.floatValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos["+ j +"].ValueScore"));

				List<ValuePositionsItem> valuePositions = new ArrayList<ValuePositionsItem>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos["+ j +"].ValuePositions.Length"); k++) {
					ValuePositionsItem valuePositionsItem = new ValuePositionsItem();
					valuePositionsItem.setX(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos["+ j +"].ValuePositions["+ k +"].X"));
					valuePositionsItem.setY(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].KeyValueInfos["+ j +"].ValuePositions["+ k +"].Y"));

					valuePositions.add(valuePositionsItem);
				}
				keyValueInfosItem.setValuePositions(valuePositions);

				keyValueInfos.add(keyValueInfosItem);
			}
			resultsItem.setKeyValueInfos(keyValueInfos);

			List<SliceRectangleItem> sliceRectangle = new ArrayList<SliceRectangleItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].SliceRectangle.Length"); j++) {
				SliceRectangleItem sliceRectangleItem = new SliceRectangleItem();
				sliceRectangleItem.setX(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].SliceRectangle["+ j +"].X"));
				sliceRectangleItem.setY(_ctx.longValue("RecognizeTicketInvoiceResponse.Data.Results["+ i +"].SliceRectangle["+ j +"].Y"));

				sliceRectangle.add(sliceRectangleItem);
			}
			resultsItem.setSliceRectangle(sliceRectangle);

			results.add(resultsItem);
		}
		data.setResults(results);
		recognizeTicketInvoiceResponse.setData(data);
	 
	 	return recognizeTicketInvoiceResponse;
	}
}
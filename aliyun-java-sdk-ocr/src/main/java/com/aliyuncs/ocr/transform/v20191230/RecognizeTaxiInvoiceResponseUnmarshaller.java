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

import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data.Invoice;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data.Invoice.InvoiceRoi;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data.Invoice.Item;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data.Invoice.Item.ItemRoi;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data.Invoice.Item.ItemRoi.Center;
import com.aliyuncs.ocr.model.v20191230.RecognizeTaxiInvoiceResponse.Data.Invoice.Item.ItemRoi.Size;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeTaxiInvoiceResponseUnmarshaller {

	public static RecognizeTaxiInvoiceResponse unmarshall(RecognizeTaxiInvoiceResponse recognizeTaxiInvoiceResponse, UnmarshallerContext _ctx) {
		
		recognizeTaxiInvoiceResponse.setRequestId(_ctx.stringValue("RecognizeTaxiInvoiceResponse.RequestId"));

		Data data = new Data();

		List<Invoice> invoices = new ArrayList<Invoice>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTaxiInvoiceResponse.Data.Invoices.Length"); i++) {
			Invoice invoice = new Invoice();
			invoice.setRotateType(_ctx.integerValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].RotateType"));

			InvoiceRoi invoiceRoi = new InvoiceRoi();
			invoiceRoi.setH(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].InvoiceRoi.H"));
			invoiceRoi.setW(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].InvoiceRoi.W"));
			invoiceRoi.setX(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].InvoiceRoi.X"));
			invoiceRoi.setY(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].InvoiceRoi.Y"));
			invoice.setInvoiceRoi(invoiceRoi);

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setText(_ctx.stringValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items["+ j +"].Text"));

				ItemRoi itemRoi = new ItemRoi();
				itemRoi.setAngle(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items["+ j +"].ItemRoi.Angle"));

				Center center = new Center();
				center.setX(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items["+ j +"].ItemRoi.Center.X"));
				center.setY(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items["+ j +"].ItemRoi.Center.Y"));
				itemRoi.setCenter(center);

				Size size = new Size();
				size.setH(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items["+ j +"].ItemRoi.Size.H"));
				size.setW(_ctx.floatValue("RecognizeTaxiInvoiceResponse.Data.Invoices["+ i +"].Items["+ j +"].ItemRoi.Size.W"));
				itemRoi.setSize(size);
				item.setItemRoi(itemRoi);

				items.add(item);
			}
			invoice.setItems(items);

			invoices.add(invoice);
		}
		data.setInvoices(invoices);
		recognizeTaxiInvoiceResponse.setData(data);
	 
	 	return recognizeTaxiInvoiceResponse;
	}
}
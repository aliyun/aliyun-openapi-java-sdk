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

import com.aliyuncs.ocr.model.v20191230.RecognizeVATInvoiceResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeVATInvoiceResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeVATInvoiceResponse.Data.Box;
import com.aliyuncs.ocr.model.v20191230.RecognizeVATInvoiceResponse.Data.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeVATInvoiceResponseUnmarshaller {

	public static RecognizeVATInvoiceResponse unmarshall(RecognizeVATInvoiceResponse recognizeVATInvoiceResponse, UnmarshallerContext _ctx) {
		
		recognizeVATInvoiceResponse.setRequestId(_ctx.stringValue("RecognizeVATInvoiceResponse.RequestId"));

		Data data = new Data();

		Content content = new Content();
		content.setInvoiceCode(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.InvoiceCode"));
		content.setInvoiceNo(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.InvoiceNo"));
		content.setInvoiceDate(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.InvoiceDate"));
		content.setAntiFakeCode(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.AntiFakeCode"));
		content.setPayerName(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayerName"));
		content.setPayerRegisterNo(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayerRegisterNo"));
		content.setPayerAddress(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayerAddress"));
		content.setPayerBankName(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayerBankName"));
		content.setWithoutTaxAmount(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.WithoutTaxAmount"));
		content.setTaxAmount(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.TaxAmount"));
		content.setSumAmount(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.SumAmount"));
		content.setInvoiceAmount(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.InvoiceAmount"));
		content.setPayeeName(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayeeName"));
		content.setPayeeRegisterNo(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayeeRegisterNo"));
		content.setPayeeAddress(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayeeAddress"));
		content.setPayeeBankName(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.PayeeBankName"));
		content.setPayee(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.Payee"));
		content.setChecker(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.Checker"));
		content.setClerk(_ctx.stringValue("RecognizeVATInvoiceResponse.Data.Content.Clerk"));
		data.setContent(content);

		Box box = new Box();

		List<Float> invoiceCodes = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceCodes.Length"); i++) {
			invoiceCodes.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceCodes["+ i +"]"));
		}
		box.setInvoiceCodes(invoiceCodes);

		List<Float> invoiceNoes = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceNoes.Length"); i++) {
			invoiceNoes.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceNoes["+ i +"]"));
		}
		box.setInvoiceNoes(invoiceNoes);

		List<Float> invoiceDates = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceDates.Length"); i++) {
			invoiceDates.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceDates["+ i +"]"));
		}
		box.setInvoiceDates(invoiceDates);

		List<Float> invoiceFakeCodes = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceFakeCodes.Length"); i++) {
			invoiceFakeCodes.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceFakeCodes["+ i +"]"));
		}
		box.setInvoiceFakeCodes(invoiceFakeCodes);

		List<Float> payerNames = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayerNames.Length"); i++) {
			payerNames.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayerNames["+ i +"]"));
		}
		box.setPayerNames(payerNames);

		List<Float> payerRegisterNoes = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayerRegisterNoes.Length"); i++) {
			payerRegisterNoes.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayerRegisterNoes["+ i +"]"));
		}
		box.setPayerRegisterNoes(payerRegisterNoes);

		List<Float> payerAddresses = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayerAddresses.Length"); i++) {
			payerAddresses.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayerAddresses["+ i +"]"));
		}
		box.setPayerAddresses(payerAddresses);

		List<Float> payerBankNames = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayerBankNames.Length"); i++) {
			payerBankNames.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayerBankNames["+ i +"]"));
		}
		box.setPayerBankNames(payerBankNames);

		List<Float> withoutTaxAmounts = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.WithoutTaxAmounts.Length"); i++) {
			withoutTaxAmounts.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.WithoutTaxAmounts["+ i +"]"));
		}
		box.setWithoutTaxAmounts(withoutTaxAmounts);

		List<Float> taxAmounts = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.TaxAmounts.Length"); i++) {
			taxAmounts.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.TaxAmounts["+ i +"]"));
		}
		box.setTaxAmounts(taxAmounts);

		List<Float> sumAmounts = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.SumAmounts.Length"); i++) {
			sumAmounts.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.SumAmounts["+ i +"]"));
		}
		box.setSumAmounts(sumAmounts);

		List<Float> invoiceAmounts = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceAmounts.Length"); i++) {
			invoiceAmounts.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.InvoiceAmounts["+ i +"]"));
		}
		box.setInvoiceAmounts(invoiceAmounts);

		List<Float> payeeNames = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayeeNames.Length"); i++) {
			payeeNames.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayeeNames["+ i +"]"));
		}
		box.setPayeeNames(payeeNames);

		List<Float> payeeRegisterNoes = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayeeRegisterNoes.Length"); i++) {
			payeeRegisterNoes.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayeeRegisterNoes["+ i +"]"));
		}
		box.setPayeeRegisterNoes(payeeRegisterNoes);

		List<Float> payeeAddresses = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayeeAddresses.Length"); i++) {
			payeeAddresses.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayeeAddresses["+ i +"]"));
		}
		box.setPayeeAddresses(payeeAddresses);

		List<Float> payeeBankNames = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.PayeeBankNames.Length"); i++) {
			payeeBankNames.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.PayeeBankNames["+ i +"]"));
		}
		box.setPayeeBankNames(payeeBankNames);

		List<Float> payees = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.Payees.Length"); i++) {
			payees.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.Payees["+ i +"]"));
		}
		box.setPayees(payees);

		List<Float> checkers = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.Checkers.Length"); i++) {
			checkers.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.Checkers["+ i +"]"));
		}
		box.setCheckers(checkers);

		List<Float> clerks = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVATInvoiceResponse.Data.Box.Clerks.Length"); i++) {
			clerks.add(_ctx.floatValue("RecognizeVATInvoiceResponse.Data.Box.Clerks["+ i +"]"));
		}
		box.setClerks(clerks);
		data.setBox(box);
		recognizeVATInvoiceResponse.setData(data);
	 
	 	return recognizeVATInvoiceResponse;
	}
}
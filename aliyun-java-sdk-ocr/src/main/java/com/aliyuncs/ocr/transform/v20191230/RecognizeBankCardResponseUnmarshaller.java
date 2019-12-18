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

import com.aliyuncs.ocr.model.v20191230.RecognizeBankCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeBankCardResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeBankCardResponseUnmarshaller {

	public static RecognizeBankCardResponse unmarshall(RecognizeBankCardResponse recognizeBankCardResponse, UnmarshallerContext _ctx) {
		
		recognizeBankCardResponse.setRequestId(_ctx.stringValue("RecognizeBankCardResponse.RequestId"));

		Data data = new Data();
		data.setBankName(_ctx.stringValue("RecognizeBankCardResponse.Data.BankName"));
		data.setCardNumber(_ctx.stringValue("RecognizeBankCardResponse.Data.CardNumber"));
		data.setValidDate(_ctx.stringValue("RecognizeBankCardResponse.Data.ValidDate"));
		recognizeBankCardResponse.setData(data);
	 
	 	return recognizeBankCardResponse;
	}
}
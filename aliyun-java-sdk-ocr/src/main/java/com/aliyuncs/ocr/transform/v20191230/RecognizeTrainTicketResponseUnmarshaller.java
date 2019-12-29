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

import com.aliyuncs.ocr.model.v20191230.RecognizeTrainTicketResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeTrainTicketResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeTrainTicketResponseUnmarshaller {

	public static RecognizeTrainTicketResponse unmarshall(RecognizeTrainTicketResponse recognizeTrainTicketResponse, UnmarshallerContext _ctx) {
		
		recognizeTrainTicketResponse.setRequestId(_ctx.stringValue("RecognizeTrainTicketResponse.RequestId"));

		Data data = new Data();
		data.setDate(_ctx.stringValue("RecognizeTrainTicketResponse.Data.Date"));
		data.setDestination(_ctx.stringValue("RecognizeTrainTicketResponse.Data.Destination"));
		data.setLevel(_ctx.stringValue("RecognizeTrainTicketResponse.Data.Level"));
		data.setNumber(_ctx.stringValue("RecognizeTrainTicketResponse.Data.Number"));
		data.setName(_ctx.stringValue("RecognizeTrainTicketResponse.Data.Name"));
		data.setDepartureStation(_ctx.stringValue("RecognizeTrainTicketResponse.Data.DepartureStation"));
		data.setSeat(_ctx.stringValue("RecognizeTrainTicketResponse.Data.Seat"));
		data.setPrice(_ctx.floatValue("RecognizeTrainTicketResponse.Data.Price"));
		recognizeTrainTicketResponse.setData(data);
	 
	 	return recognizeTrainTicketResponse;
	}
}
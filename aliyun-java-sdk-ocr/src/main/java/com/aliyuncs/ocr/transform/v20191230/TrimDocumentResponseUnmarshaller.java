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

import com.aliyuncs.ocr.model.v20191230.TrimDocumentResponse;
import com.aliyuncs.ocr.model.v20191230.TrimDocumentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TrimDocumentResponseUnmarshaller {

	public static TrimDocumentResponse unmarshall(TrimDocumentResponse trimDocumentResponse, UnmarshallerContext _ctx) {
		
		trimDocumentResponse.setRequestId(_ctx.stringValue("TrimDocumentResponse.RequestId"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("TrimDocumentResponse.Data.Content"));
		trimDocumentResponse.setData(data);
	 
	 	return trimDocumentResponse;
	}
}
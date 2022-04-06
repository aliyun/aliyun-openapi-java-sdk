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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ExportCustomCallTaggingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportCustomCallTaggingResponseUnmarshaller {

	public static ExportCustomCallTaggingResponse unmarshall(ExportCustomCallTaggingResponse exportCustomCallTaggingResponse, UnmarshallerContext _ctx) {
		
		exportCustomCallTaggingResponse.setRequestId(_ctx.stringValue("ExportCustomCallTaggingResponse.RequestId"));
		exportCustomCallTaggingResponse.setHttpStatusCode(_ctx.integerValue("ExportCustomCallTaggingResponse.HttpStatusCode"));
		exportCustomCallTaggingResponse.setCode(_ctx.stringValue("ExportCustomCallTaggingResponse.Code"));
		exportCustomCallTaggingResponse.setMessage(_ctx.stringValue("ExportCustomCallTaggingResponse.Message"));
		exportCustomCallTaggingResponse.setData(_ctx.stringValue("ExportCustomCallTaggingResponse.Data"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExportCustomCallTaggingResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ExportCustomCallTaggingResponse.Params["+ i +"]"));
		}
		exportCustomCallTaggingResponse.setParams(params);
	 
	 	return exportCustomCallTaggingResponse;
	}
}
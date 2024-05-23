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

import com.aliyuncs.ccc.model.v20200701.DeleteDocumentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDocumentResponseUnmarshaller {

	public static DeleteDocumentResponse unmarshall(DeleteDocumentResponse deleteDocumentResponse, UnmarshallerContext _ctx) {
		
		deleteDocumentResponse.setRequestId(_ctx.stringValue("DeleteDocumentResponse.RequestId"));
		deleteDocumentResponse.setHttpStatusCode(_ctx.integerValue("DeleteDocumentResponse.HttpStatusCode"));
		deleteDocumentResponse.setCode(_ctx.stringValue("DeleteDocumentResponse.Code"));
		deleteDocumentResponse.setMessage(_ctx.stringValue("DeleteDocumentResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteDocumentResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("DeleteDocumentResponse.Params["+ i +"]"));
		}
		deleteDocumentResponse.setParams(params);
	 
	 	return deleteDocumentResponse;
	}
}
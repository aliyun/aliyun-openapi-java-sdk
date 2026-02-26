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

import com.aliyuncs.ccc.model.v20200701.GetDocumentUploadParametersResponse;
import com.aliyuncs.ccc.model.v20200701.GetDocumentUploadParametersResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocumentUploadParametersResponseUnmarshaller {

	public static GetDocumentUploadParametersResponse unmarshall(GetDocumentUploadParametersResponse getDocumentUploadParametersResponse, UnmarshallerContext _ctx) {
		
		getDocumentUploadParametersResponse.setRequestId(_ctx.stringValue("GetDocumentUploadParametersResponse.RequestId"));
		getDocumentUploadParametersResponse.setHttpStatusCode(_ctx.integerValue("GetDocumentUploadParametersResponse.HttpStatusCode"));
		getDocumentUploadParametersResponse.setCode(_ctx.stringValue("GetDocumentUploadParametersResponse.Code"));
		getDocumentUploadParametersResponse.setMessage(_ctx.stringValue("GetDocumentUploadParametersResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDocumentUploadParametersResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetDocumentUploadParametersResponse.Params["+ i +"]"));
		}
		getDocumentUploadParametersResponse.setParams(params);

		Data data = new Data();
		data.setAccessKeyId(_ctx.stringValue("GetDocumentUploadParametersResponse.Data.AccessKeyId"));
		data.setPolicy(_ctx.stringValue("GetDocumentUploadParametersResponse.Data.Policy"));
		data.setSignature(_ctx.stringValue("GetDocumentUploadParametersResponse.Data.Signature"));
		data.setFilePath(_ctx.stringValue("GetDocumentUploadParametersResponse.Data.FilePath"));
		data.setHost(_ctx.stringValue("GetDocumentUploadParametersResponse.Data.Host"));
		data.setExpireTime(_ctx.integerValue("GetDocumentUploadParametersResponse.Data.ExpireTime"));
		getDocumentUploadParametersResponse.setData(data);
	 
	 	return getDocumentUploadParametersResponse;
	}
}
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

package com.aliyuncs.alimt.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alimt.model.v20181012.GetTranslateImageBatchResultResponse;
import com.aliyuncs.alimt.model.v20181012.GetTranslateImageBatchResultResponse.Data;
import com.aliyuncs.alimt.model.v20181012.GetTranslateImageBatchResultResponse.Data.CertificateImageTranslateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTranslateImageBatchResultResponseUnmarshaller {

	public static GetTranslateImageBatchResultResponse unmarshall(GetTranslateImageBatchResultResponse getTranslateImageBatchResultResponse, UnmarshallerContext _ctx) {
		
		getTranslateImageBatchResultResponse.setRequestId(_ctx.stringValue("GetTranslateImageBatchResultResponse.RequestId"));
		getTranslateImageBatchResultResponse.setCode(_ctx.integerValue("GetTranslateImageBatchResultResponse.Code"));
		getTranslateImageBatchResultResponse.setMessage(_ctx.stringValue("GetTranslateImageBatchResultResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetTranslateImageBatchResultResponse.Data.Status"));

		List<CertificateImageTranslateResult> result = new ArrayList<CertificateImageTranslateResult>();
		for (int i = 0; i < _ctx.lengthValue("GetTranslateImageBatchResultResponse.Data.Result.Length"); i++) {
			CertificateImageTranslateResult certificateImageTranslateResult = new CertificateImageTranslateResult();
			certificateImageTranslateResult.setInPaintingUrl(_ctx.stringValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].InPaintingUrl"));
			certificateImageTranslateResult.setFinalImageUrl(_ctx.stringValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].FinalImageUrl"));
			certificateImageTranslateResult.setTemplateJson(_ctx.stringValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].TemplateJson"));
			certificateImageTranslateResult.setSourceImageUrl(_ctx.stringValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].SourceImageUrl"));
			certificateImageTranslateResult.setCode(_ctx.integerValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].Code"));
			certificateImageTranslateResult.setMessage(_ctx.stringValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].Message"));
			certificateImageTranslateResult.setSuccess(_ctx.booleanValue("GetTranslateImageBatchResultResponse.Data.Result["+ i +"].Success"));

			result.add(certificateImageTranslateResult);
		}
		data.setResult(result);
		getTranslateImageBatchResultResponse.setData(data);
	 
	 	return getTranslateImageBatchResultResponse;
	}
}
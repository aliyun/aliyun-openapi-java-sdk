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

package com.aliyuncs.visionai_poc.transform.v20200408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.visionai_poc.model.v20200408.RecognizeEntityResponse;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeEntityResponse.Response;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeEntityResponse.Response.Data;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeEntityResponse.Response.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeEntityResponseUnmarshaller {

	public static RecognizeEntityResponse unmarshall(RecognizeEntityResponse recognizeEntityResponse, UnmarshallerContext _ctx) {
		
		recognizeEntityResponse.setCode(_ctx.integerValue("RecognizeEntityResponse.Code"));
		recognizeEntityResponse.setMessage(_ctx.stringValue("RecognizeEntityResponse.Message"));
		recognizeEntityResponse.setSuccess(_ctx.booleanValue("RecognizeEntityResponse.Success"));

		Response response = new Response();
		response.setSuccess(_ctx.booleanValue("RecognizeEntityResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("RecognizeEntityResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("RecognizeEntityResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("RecognizeEntityResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("RecognizeEntityResponse.Response.ErrorMessage"));

		Data data = new Data();
		data.setCallSubModelApi(_ctx.integerValue("RecognizeEntityResponse.Response.Data.CallSubModelApi"));
		data.setRequestId(_ctx.stringValue("RecognizeEntityResponse.Response.Data.RequestId"));
		data.setUseSubModelResult(_ctx.integerValue("RecognizeEntityResponse.Response.Data.UseSubModelResult"));

		List<Node> result = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeEntityResponse.Response.Data.Result.Length"); i++) {
			Node node = new Node();
			node.setScore(_ctx.stringValue("RecognizeEntityResponse.Response.Data.Result["+ i +"].Score"));
			node.setTag(_ctx.stringValue("RecognizeEntityResponse.Response.Data.Result["+ i +"].Tag"));

			result.add(node);
		}
		data.setResult(result);
		response.setData(data);
		recognizeEntityResponse.setResponse(response);
	 
	 	return recognizeEntityResponse;
	}
}
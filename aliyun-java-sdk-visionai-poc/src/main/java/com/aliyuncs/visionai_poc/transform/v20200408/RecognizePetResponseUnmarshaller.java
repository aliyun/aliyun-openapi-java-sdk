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

import com.aliyuncs.visionai_poc.model.v20200408.RecognizePetResponse;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizePetResponse.Response;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizePetResponse.Response.Data;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizePetResponse.Response.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizePetResponseUnmarshaller {

	public static RecognizePetResponse unmarshall(RecognizePetResponse recognizePetResponse, UnmarshallerContext _ctx) {
		
		recognizePetResponse.setCode(_ctx.stringValue("RecognizePetResponse.Code"));
		recognizePetResponse.setSuccess(_ctx.booleanValue("RecognizePetResponse.Success"));
		recognizePetResponse.setMessage(_ctx.stringValue("RecognizePetResponse.Message"));

		Response response = new Response();
		response.setSuccess(_ctx.booleanValue("RecognizePetResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("RecognizePetResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("RecognizePetResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("RecognizePetResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("RecognizePetResponse.Response.ErrorMessage"));

		Data data = new Data();
		data.setExternal(_ctx.stringValue("RecognizePetResponse.Response.Data.External"));
		data.setModelName(_ctx.stringValue("RecognizePetResponse.Response.Data.ModelName"));
		data.setConfidence(_ctx.stringValue("RecognizePetResponse.Response.Data.Confidence"));
		data.setProp(_ctx.stringValue("RecognizePetResponse.Response.Data.Prop"));
		data.setName(_ctx.stringValue("RecognizePetResponse.Response.Data.Name"));
		data.setPicUrl(_ctx.stringValue("RecognizePetResponse.Response.Data.PicUrl"));
		data.setSptId(_ctx.stringValue("RecognizePetResponse.Response.Data.SptId"));
		data.setRoid(_ctx.stringValue("RecognizePetResponse.Response.Data.Roid"));
		data.setTips(_ctx.stringValue("RecognizePetResponse.Response.Data.Tips"));
		data.setDescription(_ctx.stringValue("RecognizePetResponse.Response.Data.Description"));
		data.setPredictRes(_ctx.stringValue("RecognizePetResponse.Response.Data.PredictRes"));

		List<Node> predictability = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("RecognizePetResponse.Response.Data.Predictability.Length"); i++) {
			Node node = new Node();
			node.setScore(_ctx.stringValue("RecognizePetResponse.Response.Data.Predictability["+ i +"].Score"));
			node.setTag(_ctx.stringValue("RecognizePetResponse.Response.Data.Predictability["+ i +"].Tag"));

			predictability.add(node);
		}
		data.setPredictability(predictability);
		response.setData(data);
		recognizePetResponse.setResponse(response);
	 
	 	return recognizePetResponse;
	}
}
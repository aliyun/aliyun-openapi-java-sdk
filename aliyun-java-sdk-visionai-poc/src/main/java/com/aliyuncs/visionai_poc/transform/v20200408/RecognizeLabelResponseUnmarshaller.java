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

import com.aliyuncs.visionai_poc.model.v20200408.RecognizeLabelResponse;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeLabelResponse.Response;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeLabelResponse.Response.Data;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeLabelResponse.Response.Data.Node;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeLabelResponse.Response.Data.Node.PropertiesResults;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeLabelResponse.Response.Data.Node.PropertiesResults.SubNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeLabelResponseUnmarshaller {

	public static RecognizeLabelResponse unmarshall(RecognizeLabelResponse recognizeLabelResponse, UnmarshallerContext _ctx) {
		
		recognizeLabelResponse.setCode(_ctx.stringValue("RecognizeLabelResponse.Code"));
		recognizeLabelResponse.setSuccess(_ctx.booleanValue("RecognizeLabelResponse.Success"));
		recognizeLabelResponse.setMessage(_ctx.stringValue("RecognizeLabelResponse.Message"));

		Response response = new Response();
		response.setSuccess(_ctx.booleanValue("RecognizeLabelResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("RecognizeLabelResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("RecognizeLabelResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("RecognizeLabelResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("RecognizeLabelResponse.Response.ErrorMessage"));

		Data data = new Data();

		List<Node> objects = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeLabelResponse.Response.Data.Objects.Length"); i++) {
			Node node = new Node();

			PropertiesResults propertiesResults = new PropertiesResults();
			propertiesResults.setPropertyId(_ctx.stringValue("RecognizeLabelResponse.Response.Data.Objects["+ i +"].PropertiesResults.PropertyId"));
			propertiesResults.setPropertyName(_ctx.stringValue("RecognizeLabelResponse.Response.Data.Objects["+ i +"].PropertiesResults.PropertyName"));

			List<SubNode> values = new ArrayList<SubNode>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeLabelResponse.Response.Data.Objects["+ i +"].PropertiesResults.Values.Length"); j++) {
				SubNode subNode = new SubNode();
				subNode.setProbability(_ctx.integerValue("RecognizeLabelResponse.Response.Data.Objects["+ i +"].PropertiesResults.Values["+ j +"].Probability"));
				subNode.setValueId(_ctx.stringValue("RecognizeLabelResponse.Response.Data.Objects["+ i +"].PropertiesResults.Values["+ j +"].ValueId"));
				subNode.setValueName(_ctx.stringValue("RecognizeLabelResponse.Response.Data.Objects["+ i +"].PropertiesResults.Values["+ j +"].ValueName"));

				values.add(subNode);
			}
			propertiesResults.setValues(values);
			node.setPropertiesResults(propertiesResults);

			objects.add(node);
		}
		data.setObjects(objects);
		response.setData(data);
		recognizeLabelResponse.setResponse(response);
	 
	 	return recognizeLabelResponse;
	}
}
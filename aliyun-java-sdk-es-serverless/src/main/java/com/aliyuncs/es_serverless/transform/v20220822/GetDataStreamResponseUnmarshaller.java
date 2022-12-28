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

package com.aliyuncs.es_serverless.transform.v20220822;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.es_serverless.model.v20220822.GetDataStreamResponse;
import com.aliyuncs.es_serverless.model.v20220822.GetDataStreamResponse.Result;
import com.aliyuncs.es_serverless.model.v20220822.GetDataStreamResponse.Result.Template;
import com.aliyuncs.es_serverless.model.v20220822.GetDataStreamResponse.Result.Template.MappingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataStreamResponseUnmarshaller {

	public static GetDataStreamResponse unmarshall(GetDataStreamResponse getDataStreamResponse, UnmarshallerContext _ctx) {
		
		getDataStreamResponse.setRequestId(_ctx.stringValue("GetDataStreamResponse.requestId"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetDataStreamResponse.result.appName"));
		result.setRegionId(_ctx.stringValue("GetDataStreamResponse.result.regionId"));
		result.setDeletePhase(_ctx.stringValue("GetDataStreamResponse.result.deletePhase"));
		result.setDataStreamId(_ctx.stringValue("GetDataStreamResponse.result.dataStreamId"));
		result.setDataStreamName(_ctx.stringValue("GetDataStreamResponse.result.dataStreamName"));
		result.setType(_ctx.stringValue("GetDataStreamResponse.result.type"));
		result.setCreateTime(_ctx.stringValue("GetDataStreamResponse.result.createTime"));
		result.setTimeStampKey(_ctx.stringValue("GetDataStreamResponse.result.timeStampKey"));

		Template template = new Template();

		List<MappingsItem> mappings = new ArrayList<MappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataStreamResponse.result.template.mappings.Length"); i++) {
			MappingsItem mappingsItem = new MappingsItem();
			mappingsItem.setType(_ctx.stringValue("GetDataStreamResponse.result.template.mappings["+ i +"].type"));
			mappingsItem.setCaseSensitive(_ctx.booleanValue("GetDataStreamResponse.result.template.mappings["+ i +"].caseSensitive"));
			mappingsItem.setDocValues(_ctx.booleanValue("GetDataStreamResponse.result.template.mappings["+ i +"].docValues"));
			mappingsItem.setIndex(_ctx.booleanValue("GetDataStreamResponse.result.template.mappings["+ i +"].index"));
			mappingsItem.setKey(_ctx.stringValue("GetDataStreamResponse.result.template.mappings["+ i +"].key"));

			List<String> tokenizeOnChars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDataStreamResponse.result.template.mappings["+ i +"].tokenizeOnChars.Length"); j++) {
				tokenizeOnChars.add(_ctx.stringValue("GetDataStreamResponse.result.template.mappings["+ i +"].tokenizeOnChars["+ j +"]"));
			}
			mappingsItem.setTokenizeOnChars(tokenizeOnChars);

			List<String> properties = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDataStreamResponse.result.template.mappings["+ i +"].properties.Length"); j++) {
				properties.add(_ctx.stringValue("GetDataStreamResponse.result.template.mappings["+ i +"].properties["+ j +"]"));
			}
			mappingsItem.setProperties(properties);

			mappings.add(mappingsItem);
		}
		template.setMappings(mappings);
		result.setTemplate(template);
		getDataStreamResponse.setResult(result);
	 
	 	return getDataStreamResponse;
	}
}
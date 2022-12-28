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

import com.aliyuncs.es_serverless.model.v20220822.ListDataStreamsResponse;
import com.aliyuncs.es_serverless.model.v20220822.ListDataStreamsResponse.DataStream;
import com.aliyuncs.es_serverless.model.v20220822.ListDataStreamsResponse.DataStream.Template;
import com.aliyuncs.es_serverless.model.v20220822.ListDataStreamsResponse.DataStream.Template.MappingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataStreamsResponseUnmarshaller {

	public static ListDataStreamsResponse unmarshall(ListDataStreamsResponse listDataStreamsResponse, UnmarshallerContext _ctx) {
		
		listDataStreamsResponse.setRequestId(_ctx.stringValue("ListDataStreamsResponse.requestId"));
		listDataStreamsResponse.setTotalCount(_ctx.integerValue("ListDataStreamsResponse.totalCount"));

		List<DataStream> result = new ArrayList<DataStream>();
		for (int i = 0; i < _ctx.lengthValue("ListDataStreamsResponse.result.Length"); i++) {
			DataStream dataStream = new DataStream();
			dataStream.setAppName(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].appName"));
			dataStream.setRegionId(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].regionId"));
			dataStream.setDeletePhase(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].deletePhase"));
			dataStream.setDataStreamName(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].dataStreamName"));
			dataStream.setDataStreamId(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].dataStreamId"));
			dataStream.setType(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].type"));
			dataStream.setCreateTime(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].createTime"));
			dataStream.setTimeStampKey(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].timeStampKey"));

			Template template = new Template();

			List<MappingsItem> mappings = new ArrayList<MappingsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDataStreamsResponse.result["+ i +"].template.mappings.Length"); j++) {
				MappingsItem mappingsItem = new MappingsItem();
				mappingsItem.setType(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].type"));
				mappingsItem.setCaseSensitive(_ctx.booleanValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].caseSensitive"));
				mappingsItem.setDocValues(_ctx.booleanValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].docValues"));
				mappingsItem.setIndex(_ctx.booleanValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].index"));
				mappingsItem.setKey(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].key"));

				List<String> tokenizeOnChars = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].tokenizeOnChars.Length"); k++) {
					tokenizeOnChars.add(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].tokenizeOnChars["+ k +"]"));
				}
				mappingsItem.setTokenizeOnChars(tokenizeOnChars);

				List<String> properties = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].properties.Length"); k++) {
					properties.add(_ctx.stringValue("ListDataStreamsResponse.result["+ i +"].template.mappings["+ j +"].properties["+ k +"]"));
				}
				mappingsItem.setProperties(properties);

				mappings.add(mappingsItem);
			}
			template.setMappings(mappings);
			dataStream.setTemplate(template);

			result.add(dataStream);
		}
		listDataStreamsResponse.setResult(result);
	 
	 	return listDataStreamsResponse;
	}
}
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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribePopApiResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePopApiResponse.OpenApiMetaListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePopApiResponseUnmarshaller {

	public static DescribePopApiResponse unmarshall(DescribePopApiResponse describePopApiResponse, UnmarshallerContext _ctx) {
		
		describePopApiResponse.setRequestId(_ctx.stringValue("DescribePopApiResponse.RequestId"));
		describePopApiResponse.setPopCode(_ctx.stringValue("DescribePopApiResponse.PopCode"));
		describePopApiResponse.setVersion(_ctx.stringValue("DescribePopApiResponse.Version"));
		describePopApiResponse.setApiName(_ctx.stringValue("DescribePopApiResponse.ApiName"));
		describePopApiResponse.setApiMeta(_ctx.mapValue("DescribePopApiResponse.ApiMeta"));

		List<OpenApiMetaListItem> openApiMetaList = new ArrayList<OpenApiMetaListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePopApiResponse.OpenApiMetaList.Length"); i++) {
			OpenApiMetaListItem openApiMetaListItem = new OpenApiMetaListItem();
			openApiMetaListItem.setName(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].Name"));
			openApiMetaListItem.setRequired(_ctx.booleanValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].Required"));
			openApiMetaListItem.setExampleValue(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].ExampleValue"));
			openApiMetaListItem.setDescription(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].Description"));
			openApiMetaListItem.setIn(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].In"));
			openApiMetaListItem.setVisibility(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].Visibility"));
			openApiMetaListItem.setType(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].Type"));
			openApiMetaListItem.setIsRequired(_ctx.booleanValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].IsRequired"));
			openApiMetaListItem.setStyle(_ctx.stringValue("DescribePopApiResponse.OpenApiMetaList["+ i +"].Style"));

			openApiMetaList.add(openApiMetaListItem);
		}
		describePopApiResponse.setOpenApiMetaList(openApiMetaList);
	 
	 	return describePopApiResponse;
	}
}
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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.ListExperimentMetasResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListExperimentMetasResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExperimentMetasResponseUnmarshaller {

	public static ListExperimentMetasResponse unmarshall(ListExperimentMetasResponse listExperimentMetasResponse, UnmarshallerContext _ctx) {
		
		listExperimentMetasResponse.setRequestId(_ctx.stringValue("ListExperimentMetasResponse.RequestId"));
		listExperimentMetasResponse.setCode(_ctx.stringValue("ListExperimentMetasResponse.Code"));
		listExperimentMetasResponse.setCurrentPage(_ctx.integerValue("ListExperimentMetasResponse.CurrentPage"));
		listExperimentMetasResponse.setMessage(_ctx.stringValue("ListExperimentMetasResponse.Message"));
		listExperimentMetasResponse.setPageSize(_ctx.integerValue("ListExperimentMetasResponse.PageSize"));
		listExperimentMetasResponse.setPages(_ctx.integerValue("ListExperimentMetasResponse.Pages"));
		listExperimentMetasResponse.setSuccess(_ctx.booleanValue("ListExperimentMetasResponse.Success"));
		listExperimentMetasResponse.setTotal(_ctx.integerValue("ListExperimentMetasResponse.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExperimentMetasResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setExperimentId(_ctx.stringValue("ListExperimentMetasResponse.Content["+ i +"].ExperimentId"));
			contentItem.setName(_ctx.stringValue("ListExperimentMetasResponse.Content["+ i +"].Name"));
			contentItem.setCreateTime(_ctx.longValue("ListExperimentMetasResponse.Content["+ i +"].CreateTime"));
			contentItem.setState(_ctx.stringValue("ListExperimentMetasResponse.Content["+ i +"].State"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListExperimentMetasResponse.Content["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListExperimentMetasResponse.Content["+ i +"].Tags["+ j +"]"));
			}
			contentItem.setTags(tags);

			content.add(contentItem);
		}
		listExperimentMetasResponse.setContent(content);
	 
	 	return listExperimentMetasResponse;
	}
}
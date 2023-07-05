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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.ListTagResourcesInfoResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListTagResourcesInfoResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListTagResourcesInfoResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesInfoResponseUnmarshaller {

	public static ListTagResourcesInfoResponse unmarshall(ListTagResourcesInfoResponse listTagResourcesInfoResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesInfoResponse.setRequestId(_ctx.stringValue("ListTagResourcesInfoResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListTagResourcesInfoResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListTagResourcesInfoResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListTagResourcesInfoResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesInfoResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceId(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].ResourceId"));
			resource.setResourceName(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].ResourceName"));
			resource.setResourceUrl(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].ResourceUrl"));
			resource.setRegionId(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].RegionId"));
			resource.setProductGroup(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].ProductGroup"));
			resource.setProduct(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].Product"));
			resource.setApp(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].App"));
			resource.setExtension(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].Extension"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListTagResourcesInfoResponse.Data.Result["+ i +"].Tags["+ j +"]"));
			}
			resource.setTags(tags);

			result.add(resource);
		}
		data.setResult(result);
		listTagResourcesInfoResponse.setData(data);
	 
	 	return listTagResourcesInfoResponse;
	}
}
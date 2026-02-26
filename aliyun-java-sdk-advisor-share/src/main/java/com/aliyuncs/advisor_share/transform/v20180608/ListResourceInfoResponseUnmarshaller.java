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

import com.aliyuncs.advisor_share.model.v20180608.ListResourceInfoResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListResourceInfoResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListResourceInfoResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceInfoResponseUnmarshaller {

	public static ListResourceInfoResponse unmarshall(ListResourceInfoResponse listResourceInfoResponse, UnmarshallerContext _ctx) {
		
		listResourceInfoResponse.setRequestId(_ctx.stringValue("ListResourceInfoResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListResourceInfoResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListResourceInfoResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListResourceInfoResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceInfoResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceId(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].ResourceId"));
			resource.setResourceName(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].ResourceName"));
			resource.setResourceUrl(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].ResourceUrl"));
			resource.setProductGroup(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].ProductGroup"));
			resource.setProduct(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].Product"));
			resource.setRegionId(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].RegionId"));
			resource.setApp(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].App"));
			resource.setExtension(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].Extension"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceInfoResponse.Data.Result["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListResourceInfoResponse.Data.Result["+ i +"].Tags["+ j +"]"));
			}
			resource.setTags(tags);

			result.add(resource);
		}
		data.setResult(result);
		listResourceInfoResponse.setData(data);
	 
	 	return listResourceInfoResponse;
	}
}
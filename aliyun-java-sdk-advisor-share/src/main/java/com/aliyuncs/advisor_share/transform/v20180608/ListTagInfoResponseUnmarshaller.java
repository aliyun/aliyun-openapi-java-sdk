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

import com.aliyuncs.advisor_share.model.v20180608.ListTagInfoResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListTagInfoResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListTagInfoResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagInfoResponseUnmarshaller {

	public static ListTagInfoResponse unmarshall(ListTagInfoResponse listTagInfoResponse, UnmarshallerContext _ctx) {
		
		listTagInfoResponse.setRequestId(_ctx.stringValue("ListTagInfoResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListTagInfoResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListTagInfoResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListTagInfoResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagInfoResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setTagId(_ctx.longValue("ListTagInfoResponse.Data.Result["+ i +"].TagId"));
			resource.setTagKey(_ctx.stringValue("ListTagInfoResponse.Data.Result["+ i +"].TagKey"));
			resource.setTagValue(_ctx.stringValue("ListTagInfoResponse.Data.Result["+ i +"].TagValue"));
			resource.setRegionId(_ctx.stringValue("ListTagInfoResponse.Data.Result["+ i +"].RegionId"));
			resource.setResourceCount(_ctx.integerValue("ListTagInfoResponse.Data.Result["+ i +"].ResourceCount"));

			result.add(resource);
		}
		data.setResult(result);
		listTagInfoResponse.setData(data);
	 
	 	return listTagInfoResponse;
	}
}
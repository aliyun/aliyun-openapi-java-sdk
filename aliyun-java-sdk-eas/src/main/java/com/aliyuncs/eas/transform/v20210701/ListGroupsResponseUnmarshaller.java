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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListGroupsResponse;
import com.aliyuncs.eas.model.v20210701.ListGroupsResponse.服务组列表;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsResponseUnmarshaller {

	public static ListGroupsResponse unmarshall(ListGroupsResponse listGroupsResponse, UnmarshallerContext _ctx) {
		
		listGroupsResponse.setRequestId(_ctx.stringValue("ListGroupsResponse.RequestId"));
		listGroupsResponse.setPageSize(_ctx.longValue("ListGroupsResponse.PageSize"));
		listGroupsResponse.setPageNumber(_ctx.longValue("ListGroupsResponse.PageNumber"));
		listGroupsResponse.setTotalCount(_ctx.longValue("ListGroupsResponse.TotalCount"));

		List<服务组列表> groups = new ArrayList<服务组列表>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsResponse.Groups.Length"); i++) {
			服务组列表 服务组列表 = new 服务组列表();
			服务组列表.setName(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].Name"));
			服务组列表.setClusterId(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].ClusterId"));
			服务组列表.setCreateTime(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].CreateTime"));
			服务组列表.setUpdateTime(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].UpdateTime"));
			服务组列表.setQueueService(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].QueueService"));
			服务组列表.setInternetEndpoint(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].InternetEndpoint"));
			服务组列表.setIntranetEndpoint(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].IntranetEndpoint"));
			服务组列表.setAccessToken(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].AccessToken"));

			groups.add(服务组列表);
		}
		listGroupsResponse.setGroups(groups);
	 
	 	return listGroupsResponse;
	}
}
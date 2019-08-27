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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListHostPoolResponse;
import com.aliyuncs.emr.model.v20160408.ListHostPoolResponse.HostPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHostPoolResponseUnmarshaller {

	public static ListHostPoolResponse unmarshall(ListHostPoolResponse listHostPoolResponse, UnmarshallerContext _ctx) {
		
		listHostPoolResponse.setRequestId(_ctx.stringValue("ListHostPoolResponse.RequestId"));
		listHostPoolResponse.setTotalCount(_ctx.integerValue("ListHostPoolResponse.TotalCount"));
		listHostPoolResponse.setPageNumber(_ctx.integerValue("ListHostPoolResponse.PageNumber"));
		listHostPoolResponse.setPageSize(_ctx.integerValue("ListHostPoolResponse.PageSize"));

		List<HostPool> hostPoolList = new ArrayList<HostPool>();
		for (int i = 0; i < _ctx.lengthValue("ListHostPoolResponse.HostPoolList.Length"); i++) {
			HostPool hostPool = new HostPool();
			hostPool.setName(_ctx.stringValue("ListHostPoolResponse.HostPoolList["+ i +"].Name"));
			hostPool.setBizId(_ctx.stringValue("ListHostPoolResponse.HostPoolList["+ i +"].BizId"));
			hostPool.setStatus(_ctx.stringValue("ListHostPoolResponse.HostPoolList["+ i +"].Status"));
			hostPool.setType(_ctx.stringValue("ListHostPoolResponse.HostPoolList["+ i +"].Type"));
			hostPool.setDescription(_ctx.stringValue("ListHostPoolResponse.HostPoolList["+ i +"].Description"));
			hostPool.setHostCount(_ctx.integerValue("ListHostPoolResponse.HostPoolList["+ i +"].HostCount"));
			hostPool.setGmtCreate(_ctx.longValue("ListHostPoolResponse.HostPoolList["+ i +"].GmtCreate"));

			hostPoolList.add(hostPool);
		}
		listHostPoolResponse.setHostPoolList(hostPoolList);
	 
	 	return listHostPoolResponse;
	}
}
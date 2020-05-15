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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindInstanceNodeListResponse;
import com.aliyuncs.csb.model.v20171118.FindInstanceNodeListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindInstanceNodeListResponse.Data.InstanceNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindInstanceNodeListResponseUnmarshaller {

	public static FindInstanceNodeListResponse unmarshall(FindInstanceNodeListResponse findInstanceNodeListResponse, UnmarshallerContext _ctx) {
		
		findInstanceNodeListResponse.setRequestId(_ctx.stringValue("FindInstanceNodeListResponse.RequestId"));
		findInstanceNodeListResponse.setCode(_ctx.integerValue("FindInstanceNodeListResponse.Code"));
		findInstanceNodeListResponse.setMessage(_ctx.stringValue("FindInstanceNodeListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindInstanceNodeListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindInstanceNodeListResponse.Data.PageNumber"));

		List<InstanceNode> instanceNodeList = new ArrayList<InstanceNode>();
		for (int i = 0; i < _ctx.lengthValue("FindInstanceNodeListResponse.Data.InstanceNodeList.Length"); i++) {
			InstanceNode instanceNode = new InstanceNode();
			instanceNode.setId(_ctx.longValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].Id"));
			instanceNode.setInstanceName(_ctx.stringValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].InstanceName"));
			instanceNode.setIsImported(_ctx.booleanValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].IsImported"));
			instanceNode.setGroupAddress(_ctx.stringValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].GroupAddress"));
			instanceNode.setBrokerAddress(_ctx.stringValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].BrokerAddress"));
			instanceNode.setEdasTenantInfo(_ctx.stringValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].EdasTenantInfo"));
			instanceNode.setImportedName(_ctx.stringValue("FindInstanceNodeListResponse.Data.InstanceNodeList["+ i +"].ImportedName"));

			instanceNodeList.add(instanceNode);
		}
		data.setInstanceNodeList(instanceNodeList);
		findInstanceNodeListResponse.setData(data);
	 
	 	return findInstanceNodeListResponse;
	}
}
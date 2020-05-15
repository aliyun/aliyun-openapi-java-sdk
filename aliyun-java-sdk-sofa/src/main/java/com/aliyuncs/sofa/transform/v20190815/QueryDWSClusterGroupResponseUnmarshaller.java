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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryDWSClusterGroupResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDWSClusterGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDWSClusterGroupResponseUnmarshaller {

	public static QueryDWSClusterGroupResponse unmarshall(QueryDWSClusterGroupResponse queryDWSClusterGroupResponse, UnmarshallerContext _ctx) {
		
		queryDWSClusterGroupResponse.setRequestId(_ctx.stringValue("QueryDWSClusterGroupResponse.RequestId"));
		queryDWSClusterGroupResponse.setResultCode(_ctx.stringValue("QueryDWSClusterGroupResponse.ResultCode"));
		queryDWSClusterGroupResponse.setResultMessage(_ctx.stringValue("QueryDWSClusterGroupResponse.ResultMessage"));

		Data data = new Data();
		data.setDefaultClusterName(_ctx.stringValue("QueryDWSClusterGroupResponse.Data.DefaultClusterName"));

		List<String> clusterNameGroup = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDWSClusterGroupResponse.Data.ClusterNameGroup.Length"); i++) {
			clusterNameGroup.add(_ctx.stringValue("QueryDWSClusterGroupResponse.Data.ClusterNameGroup["+ i +"]"));
		}
		data.setClusterNameGroup(clusterNameGroup);
		queryDWSClusterGroupResponse.setData(data);
	 
	 	return queryDWSClusterGroupResponse;
	}
}
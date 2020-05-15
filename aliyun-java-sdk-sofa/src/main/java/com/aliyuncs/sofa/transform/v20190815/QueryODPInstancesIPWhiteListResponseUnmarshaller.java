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

import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesIPWhiteListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPInstancesIPWhiteListResponseUnmarshaller {

	public static QueryODPInstancesIPWhiteListResponse unmarshall(QueryODPInstancesIPWhiteListResponse queryODPInstancesIPWhiteListResponse, UnmarshallerContext _ctx) {
		
		queryODPInstancesIPWhiteListResponse.setRequestId(_ctx.stringValue("QueryODPInstancesIPWhiteListResponse.RequestId"));
		queryODPInstancesIPWhiteListResponse.setResultCode(_ctx.stringValue("QueryODPInstancesIPWhiteListResponse.ResultCode"));
		queryODPInstancesIPWhiteListResponse.setResultMessage(_ctx.stringValue("QueryODPInstancesIPWhiteListResponse.ResultMessage"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPInstancesIPWhiteListResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryODPInstancesIPWhiteListResponse.Data["+ i +"]"));
		}
		queryODPInstancesIPWhiteListResponse.setData(data);
	 
	 	return queryODPInstancesIPWhiteListResponse;
	}
}
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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendListResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendListResponse.BackendInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackendListResponseUnmarshaller {

	public static DescribeBackendListResponse unmarshall(DescribeBackendListResponse describeBackendListResponse, UnmarshallerContext _ctx) {
		
		describeBackendListResponse.setRequestId(_ctx.stringValue("DescribeBackendListResponse.RequestId"));
		describeBackendListResponse.setPageNumber(_ctx.integerValue("DescribeBackendListResponse.PageNumber"));
		describeBackendListResponse.setPageSize(_ctx.integerValue("DescribeBackendListResponse.PageSize"));
		describeBackendListResponse.setTotalCount(_ctx.integerValue("DescribeBackendListResponse.TotalCount"));

		List<BackendInfo> backendInfoList = new ArrayList<BackendInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackendListResponse.BackendInfoList.Length"); i++) {
			BackendInfo backendInfo = new BackendInfo();
			backendInfo.setBackendName(_ctx.stringValue("DescribeBackendListResponse.BackendInfoList["+ i +"].BackendName"));
			backendInfo.setBackendType(_ctx.stringValue("DescribeBackendListResponse.BackendInfoList["+ i +"].BackendType"));
			backendInfo.setModifiedTime(_ctx.stringValue("DescribeBackendListResponse.BackendInfoList["+ i +"].ModifiedTime"));
			backendInfo.setDescription(_ctx.stringValue("DescribeBackendListResponse.BackendInfoList["+ i +"].Description"));
			backendInfo.setCreatedTime(_ctx.stringValue("DescribeBackendListResponse.BackendInfoList["+ i +"].CreatedTime"));
			backendInfo.setBackendId(_ctx.stringValue("DescribeBackendListResponse.BackendInfoList["+ i +"].BackendId"));

			backendInfoList.add(backendInfo);
		}
		describeBackendListResponse.setBackendInfoList(backendInfoList);
	 
	 	return describeBackendListResponse;
	}
}
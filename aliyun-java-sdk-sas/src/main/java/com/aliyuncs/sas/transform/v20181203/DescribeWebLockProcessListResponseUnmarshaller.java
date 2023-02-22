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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeWebLockProcessListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWebLockProcessListResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockProcessListResponseUnmarshaller {

	public static DescribeWebLockProcessListResponse unmarshall(DescribeWebLockProcessListResponse describeWebLockProcessListResponse, UnmarshallerContext _ctx) {
		
		describeWebLockProcessListResponse.setRequestId(_ctx.stringValue("DescribeWebLockProcessListResponse.RequestId"));
		describeWebLockProcessListResponse.setCurrentPage(_ctx.integerValue("DescribeWebLockProcessListResponse.CurrentPage"));
		describeWebLockProcessListResponse.setPageSize(_ctx.integerValue("DescribeWebLockProcessListResponse.PageSize"));
		describeWebLockProcessListResponse.setTotalCount(_ctx.integerValue("DescribeWebLockProcessListResponse.TotalCount"));

		List<Info> list = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebLockProcessListResponse.List.Length"); i++) {
			Info info = new Info();
			info.setStatus(_ctx.integerValue("DescribeWebLockProcessListResponse.List["+ i +"].Status"));
			info.setProcessName(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].ProcessName"));
			info.setUuid(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].Uuid"));
			info.setInternetIp(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].InternetIp"));
			info.setInstanceName(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].InstanceName"));
			info.setProcessPath(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].ProcessPath"));
			info.setCount(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].Count"));
			info.setIntranetIp(_ctx.stringValue("DescribeWebLockProcessListResponse.List["+ i +"].IntranetIp"));

			list.add(info);
		}
		describeWebLockProcessListResponse.setList(list);
	 
	 	return describeWebLockProcessListResponse;
	}
}
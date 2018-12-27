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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWebLockBindListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWebLockBindListResponse.Bind;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockBindListResponseUnmarshaller {

	public static DescribeWebLockBindListResponse unmarshall(DescribeWebLockBindListResponse describeWebLockBindListResponse, UnmarshallerContext context) {
		
		describeWebLockBindListResponse.setRequestId(context.stringValue("DescribeWebLockBindListResponse.RequestId"));
		describeWebLockBindListResponse.setPageSize(context.integerValue("DescribeWebLockBindListResponse.PageSize"));
		describeWebLockBindListResponse.setCurrentPage(context.integerValue("DescribeWebLockBindListResponse.CurrentPage"));
		describeWebLockBindListResponse.setTotalCount(context.integerValue("DescribeWebLockBindListResponse.TotalCount"));

		List<Bind> bindList = new ArrayList<Bind>();
		for (int i = 0; i < context.lengthValue("DescribeWebLockBindListResponse.BindList.Length"); i++) {
			Bind bind = new Bind();
			bind.setUuid(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].Uuid"));
			bind.setInstanceName(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].InstanceName"));
			bind.setInternetIp(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].InternetIp"));
			bind.setIntranetIp(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].IntranetIp"));
			bind.setOs(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].Os"));
			bind.setDirCount(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].DirCount"));
			bind.setServiceStatus(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].ServiceStatus"));
			bind.setServiceCode(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].ServiceCode"));
			bind.setServiceDetail(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].ServiceDetail"));
			bind.setStatus(context.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].Status"));

			bindList.add(bind);
		}
		describeWebLockBindListResponse.setBindList(bindList);
	 
	 	return describeWebLockBindListResponse;
	}
}
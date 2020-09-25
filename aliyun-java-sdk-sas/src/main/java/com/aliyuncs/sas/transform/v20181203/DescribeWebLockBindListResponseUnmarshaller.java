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

import com.aliyuncs.sas.model.v20181203.DescribeWebLockBindListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWebLockBindListResponse.Bind;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockBindListResponseUnmarshaller {

	public static DescribeWebLockBindListResponse unmarshall(DescribeWebLockBindListResponse describeWebLockBindListResponse, UnmarshallerContext _ctx) {
		
		describeWebLockBindListResponse.setRequestId(_ctx.stringValue("DescribeWebLockBindListResponse.RequestId"));
		describeWebLockBindListResponse.setPageSize(_ctx.integerValue("DescribeWebLockBindListResponse.PageSize"));
		describeWebLockBindListResponse.setCurrentPage(_ctx.integerValue("DescribeWebLockBindListResponse.CurrentPage"));
		describeWebLockBindListResponse.setTotalCount(_ctx.integerValue("DescribeWebLockBindListResponse.TotalCount"));

		List<Bind> bindList = new ArrayList<Bind>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebLockBindListResponse.BindList.Length"); i++) {
			Bind bind = new Bind();
			bind.setUuid(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].Uuid"));
			bind.setInstanceName(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].InstanceName"));
			bind.setInternetIp(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].InternetIp"));
			bind.setIntranetIp(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].IntranetIp"));
			bind.setOs(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].Os"));
			bind.setDirCount(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].DirCount"));
			bind.setServiceStatus(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].ServiceStatus"));
			bind.setServiceCode(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].ServiceCode"));
			bind.setServiceDetail(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].ServiceDetail"));
			bind.setStatus(_ctx.stringValue("DescribeWebLockBindListResponse.BindList["+ i +"].Status"));
			bind.setPercent(_ctx.integerValue("DescribeWebLockBindListResponse.BindList["+ i +"].Percent"));

			bindList.add(bind);
		}
		describeWebLockBindListResponse.setBindList(bindList);
	 
	 	return describeWebLockBindListResponse;
	}
}
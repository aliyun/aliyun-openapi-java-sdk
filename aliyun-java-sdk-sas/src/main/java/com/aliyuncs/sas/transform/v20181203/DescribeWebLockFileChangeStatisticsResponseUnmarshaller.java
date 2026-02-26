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

import com.aliyuncs.sas.model.v20181203.DescribeWebLockFileChangeStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWebLockFileChangeStatisticsResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockFileChangeStatisticsResponseUnmarshaller {

	public static DescribeWebLockFileChangeStatisticsResponse unmarshall(DescribeWebLockFileChangeStatisticsResponse describeWebLockFileChangeStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeWebLockFileChangeStatisticsResponse.setRequestId(_ctx.stringValue("DescribeWebLockFileChangeStatisticsResponse.RequestId"));
		describeWebLockFileChangeStatisticsResponse.setCurrentPage(_ctx.integerValue("DescribeWebLockFileChangeStatisticsResponse.CurrentPage"));
		describeWebLockFileChangeStatisticsResponse.setPageSize(_ctx.integerValue("DescribeWebLockFileChangeStatisticsResponse.PageSize"));
		describeWebLockFileChangeStatisticsResponse.setTotalCount(_ctx.integerValue("DescribeWebLockFileChangeStatisticsResponse.TotalCount"));

		List<Info> list = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebLockFileChangeStatisticsResponse.List.Length"); i++) {
			Info info = new Info();
			info.setCount(_ctx.integerValue("DescribeWebLockFileChangeStatisticsResponse.List["+ i +"].Count"));
			info.setFile(_ctx.stringValue("DescribeWebLockFileChangeStatisticsResponse.List["+ i +"].File"));

			list.add(info);
		}
		describeWebLockFileChangeStatisticsResponse.setList(list);
	 
	 	return describeWebLockFileChangeStatisticsResponse;
	}
}
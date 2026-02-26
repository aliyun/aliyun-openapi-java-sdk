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

import com.aliyuncs.sas.model.v20181203.DescribeWebLockFileTypeSummaryResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWebLockFileTypeSummaryResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockFileTypeSummaryResponseUnmarshaller {

	public static DescribeWebLockFileTypeSummaryResponse unmarshall(DescribeWebLockFileTypeSummaryResponse describeWebLockFileTypeSummaryResponse, UnmarshallerContext _ctx) {
		
		describeWebLockFileTypeSummaryResponse.setRequestId(_ctx.stringValue("DescribeWebLockFileTypeSummaryResponse.RequestId"));
		describeWebLockFileTypeSummaryResponse.setTotalCount(_ctx.integerValue("DescribeWebLockFileTypeSummaryResponse.TotalCount"));

		List<Info> list = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebLockFileTypeSummaryResponse.List.Length"); i++) {
			Info info = new Info();
			info.setType(_ctx.stringValue("DescribeWebLockFileTypeSummaryResponse.List["+ i +"].Type"));
			info.setCount(_ctx.integerValue("DescribeWebLockFileTypeSummaryResponse.List["+ i +"].Count"));

			list.add(info);
		}
		describeWebLockFileTypeSummaryResponse.setList(list);
	 
	 	return describeWebLockFileTypeSummaryResponse;
	}
}
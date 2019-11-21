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

import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningsResponse.CheckWarning;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckWarningsResponseUnmarshaller {

	public static DescribeCheckWarningsResponse unmarshall(DescribeCheckWarningsResponse describeCheckWarningsResponse, UnmarshallerContext _ctx) {
		
		describeCheckWarningsResponse.setRequestId(_ctx.stringValue("DescribeCheckWarningsResponse.RequestId"));
		describeCheckWarningsResponse.setCount(_ctx.integerValue("DescribeCheckWarningsResponse.Count"));
		describeCheckWarningsResponse.setPageSize(_ctx.integerValue("DescribeCheckWarningsResponse.PageSize"));
		describeCheckWarningsResponse.setTotalCount(_ctx.integerValue("DescribeCheckWarningsResponse.TotalCount"));
		describeCheckWarningsResponse.setCurrentPage(_ctx.integerValue("DescribeCheckWarningsResponse.CurrentPage"));

		List<CheckWarning> checkWarnings = new ArrayList<CheckWarning>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckWarningsResponse.CheckWarnings.Length"); i++) {
			CheckWarning checkWarning = new CheckWarning();
			checkWarning.setUuid(_ctx.stringValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].Uuid"));
			checkWarning.setCheckId(_ctx.longValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].CheckId"));
			checkWarning.setCheckWarningId(_ctx.longValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].CheckWarningId"));
			checkWarning.setLevel(_ctx.stringValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].Level"));
			checkWarning.setItem(_ctx.stringValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].Item"));
			checkWarning.setType(_ctx.stringValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].Type"));
			checkWarning.setStatus(_ctx.integerValue("DescribeCheckWarningsResponse.CheckWarnings["+ i +"].Status"));

			checkWarnings.add(checkWarning);
		}
		describeCheckWarningsResponse.setCheckWarnings(checkWarnings);
	 
	 	return describeCheckWarningsResponse;
	}
}
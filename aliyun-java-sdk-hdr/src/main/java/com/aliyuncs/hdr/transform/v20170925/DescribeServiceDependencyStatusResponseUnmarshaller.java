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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeServiceDependencyStatusResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeServiceDependencyStatusResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceDependencyStatusResponseUnmarshaller {

	public static DescribeServiceDependencyStatusResponse unmarshall(DescribeServiceDependencyStatusResponse describeServiceDependencyStatusResponse, UnmarshallerContext _ctx) {
		
		describeServiceDependencyStatusResponse.setRequestId(_ctx.stringValue("DescribeServiceDependencyStatusResponse.RequestId"));
		describeServiceDependencyStatusResponse.setSuccess(_ctx.booleanValue("DescribeServiceDependencyStatusResponse.Success"));
		describeServiceDependencyStatusResponse.setCode(_ctx.stringValue("DescribeServiceDependencyStatusResponse.Code"));
		describeServiceDependencyStatusResponse.setMessage(_ctx.stringValue("DescribeServiceDependencyStatusResponse.Message"));
		describeServiceDependencyStatusResponse.setStatus(_ctx.booleanValue("DescribeServiceDependencyStatusResponse.Status"));

		List<Entry> entries = new ArrayList<Entry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceDependencyStatusResponse.Entries.Length"); i++) {
			Entry entry = new Entry();
			entry.setCheckItem(_ctx.stringValue("DescribeServiceDependencyStatusResponse.Entries["+ i +"].CheckItem"));
			entry.setInternal(_ctx.booleanValue("DescribeServiceDependencyStatusResponse.Entries["+ i +"].Internal"));
			entry.setDescription(_ctx.booleanValue("DescribeServiceDependencyStatusResponse.Entries["+ i +"].Description"));

			entries.add(entry);
		}
		describeServiceDependencyStatusResponse.setEntries(entries);
	 
	 	return describeServiceDependencyStatusResponse;
	}
}
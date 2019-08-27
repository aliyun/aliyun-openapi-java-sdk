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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesResponse.ForwardTableEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeForwardTableEntriesResponseUnmarshaller {

	public static DescribeForwardTableEntriesResponse unmarshall(DescribeForwardTableEntriesResponse describeForwardTableEntriesResponse, UnmarshallerContext _ctx) {
		
		describeForwardTableEntriesResponse.setRequestId(_ctx.stringValue("DescribeForwardTableEntriesResponse.RequestId"));
		describeForwardTableEntriesResponse.setTotalCount(_ctx.integerValue("DescribeForwardTableEntriesResponse.TotalCount"));
		describeForwardTableEntriesResponse.setPageNumber(_ctx.integerValue("DescribeForwardTableEntriesResponse.PageNumber"));
		describeForwardTableEntriesResponse.setPageSize(_ctx.integerValue("DescribeForwardTableEntriesResponse.PageSize"));

		List<ForwardTableEntry> forwardTableEntries = new ArrayList<ForwardTableEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeForwardTableEntriesResponse.ForwardTableEntries.Length"); i++) {
			ForwardTableEntry forwardTableEntry = new ForwardTableEntry();
			forwardTableEntry.setForwardTableId(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ForwardTableId"));
			forwardTableEntry.setForwardEntryId(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ForwardEntryId"));
			forwardTableEntry.setExternalIp(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ExternalIp"));
			forwardTableEntry.setExternalPort(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ExternalPort"));
			forwardTableEntry.setIpProtocol(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].IpProtocol"));
			forwardTableEntry.setInternalIp(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].InternalIp"));
			forwardTableEntry.setInternalPort(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].InternalPort"));
			forwardTableEntry.setStatus(_ctx.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].Status"));

			forwardTableEntries.add(forwardTableEntry);
		}
		describeForwardTableEntriesResponse.setForwardTableEntries(forwardTableEntries);
	 
	 	return describeForwardTableEntriesResponse;
	}
}
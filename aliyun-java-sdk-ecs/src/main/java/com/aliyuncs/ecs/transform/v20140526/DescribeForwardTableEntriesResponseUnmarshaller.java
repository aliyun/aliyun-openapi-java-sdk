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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeForwardTableEntriesResponseUnmarshaller {

	public static DescribeForwardTableEntriesResponse unmarshall(DescribeForwardTableEntriesResponse describeForwardTableEntriesResponse, UnmarshallerContext context) {
		
		describeForwardTableEntriesResponse.setRequestId(context.stringValue("DescribeForwardTableEntriesResponse.RequestId"));
		describeForwardTableEntriesResponse.setTotalCount(context.integerValue("DescribeForwardTableEntriesResponse.TotalCount"));
		describeForwardTableEntriesResponse.setPageNumber(context.integerValue("DescribeForwardTableEntriesResponse.PageNumber"));
		describeForwardTableEntriesResponse.setPageSize(context.integerValue("DescribeForwardTableEntriesResponse.PageSize"));

		List<ForwardTableEntry> forwardTableEntries = new ArrayList<ForwardTableEntry>();
		for (int i = 0; i < context.lengthValue("DescribeForwardTableEntriesResponse.ForwardTableEntries.Length"); i++) {
			ForwardTableEntry forwardTableEntry = new ForwardTableEntry();
			forwardTableEntry.setForwardTableId(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ForwardTableId"));
			forwardTableEntry.setForwardEntryId(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ForwardEntryId"));
			forwardTableEntry.setExternalIp(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ExternalIp"));
			forwardTableEntry.setExternalPort(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].ExternalPort"));
			forwardTableEntry.setIpProtocol(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].IpProtocol"));
			forwardTableEntry.setInternalIp(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].InternalIp"));
			forwardTableEntry.setInternalPort(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].InternalPort"));
			forwardTableEntry.setStatus(context.stringValue("DescribeForwardTableEntriesResponse.ForwardTableEntries["+ i +"].Status"));

			forwardTableEntries.add(forwardTableEntry);
		}
		describeForwardTableEntriesResponse.setForwardTableEntries(forwardTableEntries);
	 
	 	return describeForwardTableEntriesResponse;
	}
}
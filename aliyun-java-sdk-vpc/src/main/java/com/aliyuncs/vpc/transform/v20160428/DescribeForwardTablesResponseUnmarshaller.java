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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeForwardTablesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeForwardTablesResponse.ForwardTable;
import com.aliyuncs.vpc.model.v20160428.DescribeForwardTablesResponse.ForwardTable.ForwardEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeForwardTablesResponseUnmarshaller {

	public static DescribeForwardTablesResponse unmarshall(DescribeForwardTablesResponse describeForwardTablesResponse, UnmarshallerContext context) {
		
		describeForwardTablesResponse.setRequestId(context.stringValue("DescribeForwardTablesResponse.RequestId"));
		describeForwardTablesResponse.setTotalCount(context.integerValue("DescribeForwardTablesResponse.TotalCount"));
		describeForwardTablesResponse.setPageNumber(context.integerValue("DescribeForwardTablesResponse.PageNumber"));
		describeForwardTablesResponse.setPageSize(context.integerValue("DescribeForwardTablesResponse.PageSize"));

		List<ForwardTable> forwardTables = new ArrayList<ForwardTable>();
		for (int i = 0; i < context.lengthValue("DescribeForwardTablesResponse.ForwardTables.Length"); i++) {
			ForwardTable forwardTable = new ForwardTable();
			forwardTable.setNatGatewayId(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].NatGatewayId"));
			forwardTable.setForwardTableId(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardTableId"));
			forwardTable.setCreationTime(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].CreationTime"));

			List<ForwardEntry> forwardEntrys = new ArrayList<ForwardEntry>();
			for (int j = 0; j < context.lengthValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys.Length"); j++) {
				ForwardEntry forwardEntry = new ForwardEntry();
				forwardEntry.setForwardTableId(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].ForwardTableId"));
				forwardEntry.setForwardEntryId(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].ForwardEntryId"));
				forwardEntry.setExternalIp(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].ExternalIp"));
				forwardEntry.setExternalPort(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].ExternalPort"));
				forwardEntry.setIpProtocol(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].IpProtocol"));
				forwardEntry.setInternalIp(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].InternalIp"));
				forwardEntry.setInternalPort(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].InternalPort"));
				forwardEntry.setStatus(context.stringValue("DescribeForwardTablesResponse.ForwardTables["+ i +"].ForwardEntrys["+ j +"].Status"));

				forwardEntrys.add(forwardEntry);
			}
			forwardTable.setForwardEntrys(forwardEntrys);

			forwardTables.add(forwardTable);
		}
		describeForwardTablesResponse.setForwardTables(forwardTables);
	 
	 	return describeForwardTablesResponse;
	}
}
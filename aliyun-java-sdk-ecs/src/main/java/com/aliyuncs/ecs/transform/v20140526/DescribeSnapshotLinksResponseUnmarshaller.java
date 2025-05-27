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

import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse.SnapshotLink;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotLinksResponseUnmarshaller {

	public static DescribeSnapshotLinksResponse unmarshall(DescribeSnapshotLinksResponse describeSnapshotLinksResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotLinksResponse.setRequestId(_ctx.stringValue("DescribeSnapshotLinksResponse.RequestId"));
		describeSnapshotLinksResponse.setNextToken(_ctx.stringValue("DescribeSnapshotLinksResponse.NextToken"));
		describeSnapshotLinksResponse.setPageSize(_ctx.integerValue("DescribeSnapshotLinksResponse.PageSize"));
		describeSnapshotLinksResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotLinksResponse.PageNumber"));
		describeSnapshotLinksResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotLinksResponse.TotalCount"));

		List<SnapshotLink> snapshotLinks = new ArrayList<SnapshotLink>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotLinksResponse.SnapshotLinks.Length"); i++) {
			SnapshotLink snapshotLink = new SnapshotLink();
			snapshotLink.setInstantAccess(_ctx.booleanValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].InstantAccess"));
			snapshotLink.setTotalSize(_ctx.longValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalSize"));
			snapshotLink.setSourceDiskName(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskName"));
			snapshotLink.setSourceDiskSize(_ctx.integerValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskSize"));
			snapshotLink.setSourceDiskType(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskType"));
			snapshotLink.setInstanceId(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].InstanceId"));
			snapshotLink.setSnapshotLinkId(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SnapshotLinkId"));
			snapshotLink.setTotalCount(_ctx.integerValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalCount"));
			snapshotLink.setRegionId(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].RegionId"));
			snapshotLink.setSourceDiskId(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskId"));
			snapshotLink.setInstanceName(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].InstanceName"));
			snapshotLink.setCategory(_ctx.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].Category"));

			snapshotLinks.add(snapshotLink);
		}
		describeSnapshotLinksResponse.setSnapshotLinks(snapshotLinks);
	 
	 	return describeSnapshotLinksResponse;
	}
}
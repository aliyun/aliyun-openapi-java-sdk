/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse.SnapshotLink;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotLinksResponseUnmarshaller {

	public static DescribeSnapshotLinksResponse unmarshall(DescribeSnapshotLinksResponse describeSnapshotLinksResponse, UnmarshallerContext context) {
		
		describeSnapshotLinksResponse.setRequestId(context.stringValue("DescribeSnapshotLinksResponse.RequestId"));
		describeSnapshotLinksResponse.setTotalCount(context.integerValue("DescribeSnapshotLinksResponse.TotalCount"));
		describeSnapshotLinksResponse.setPageNumber(context.integerValue("DescribeSnapshotLinksResponse.PageNumber"));
		describeSnapshotLinksResponse.setPageSize(context.integerValue("DescribeSnapshotLinksResponse.PageSize"));

		List<SnapshotLink> snapshotLinks = new ArrayList<SnapshotLink>();
		for (int i = 0; i < context.lengthValue("DescribeSnapshotLinksResponse.SnapshotLinks.Length"); i++) {
			SnapshotLink snapshotLink = new SnapshotLink();
			snapshotLink.setSnapshotLinkId(context.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SnapshotLinkId"));
			snapshotLink.setRegionId(context.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].RegionId"));
			snapshotLink.setSourceDiskId(context.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskId"));
			snapshotLink.setSourceDiskSize(context.integerValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskSize"));
			snapshotLink.setSourceDiskType(context.stringValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskType"));
			snapshotLink.setTotalSize(context.integerValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalSize"));
			snapshotLink.setTotalCount(context.integerValue("DescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalCount"));

			snapshotLinks.add(snapshotLink);
		}
		describeSnapshotLinksResponse.setSnapshotLinks(snapshotLinks);
	 
	 	return describeSnapshotLinksResponse;
	}
}
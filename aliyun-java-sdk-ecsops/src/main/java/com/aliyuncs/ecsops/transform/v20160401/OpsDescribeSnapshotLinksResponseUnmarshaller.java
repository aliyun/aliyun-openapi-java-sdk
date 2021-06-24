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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotLinksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotLinksResponse.SnapshotLink;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSnapshotLinksResponseUnmarshaller {

	public static OpsDescribeSnapshotLinksResponse unmarshall(OpsDescribeSnapshotLinksResponse opsDescribeSnapshotLinksResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSnapshotLinksResponse.setRequestId(_ctx.stringValue("OpsDescribeSnapshotLinksResponse.RequestId"));
		opsDescribeSnapshotLinksResponse.setTotalCount(_ctx.integerValue("OpsDescribeSnapshotLinksResponse.TotalCount"));
		opsDescribeSnapshotLinksResponse.setPageSize(_ctx.integerValue("OpsDescribeSnapshotLinksResponse.PageSize"));
		opsDescribeSnapshotLinksResponse.setPageNumber(_ctx.integerValue("OpsDescribeSnapshotLinksResponse.PageNumber"));

		List<SnapshotLink> snapshotLinks = new ArrayList<SnapshotLink>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks.Length"); i++) {
			SnapshotLink snapshotLink = new SnapshotLink();
			snapshotLink.setSourceDiskId(_ctx.stringValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskId"));
			snapshotLink.setTotalSize(_ctx.longValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalSize"));
			snapshotLink.setSourceDiskSize(_ctx.integerValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskSize"));
			snapshotLink.setSourceDiskType(_ctx.stringValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceDiskType"));
			snapshotLink.setTotalCount(_ctx.integerValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalCount"));
			snapshotLink.setSnapshotLinkId(_ctx.stringValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].SnapshotLinkId"));
			snapshotLink.setRegionId(_ctx.stringValue("OpsDescribeSnapshotLinksResponse.SnapshotLinks["+ i +"].RegionId"));

			snapshotLinks.add(snapshotLink);
		}
		opsDescribeSnapshotLinksResponse.setSnapshotLinks(snapshotLinks);
	 
	 	return opsDescribeSnapshotLinksResponse;
	}
}
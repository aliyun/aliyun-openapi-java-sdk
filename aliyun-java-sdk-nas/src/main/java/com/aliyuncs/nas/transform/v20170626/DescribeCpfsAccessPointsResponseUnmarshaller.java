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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeCpfsAccessPointsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeCpfsAccessPointsResponse.AccessPoint;
import com.aliyuncs.nas.model.v20170626.DescribeCpfsAccessPointsResponse.AccessPoint.RootDirectory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCpfsAccessPointsResponseUnmarshaller {

	public static DescribeCpfsAccessPointsResponse unmarshall(DescribeCpfsAccessPointsResponse describeCpfsAccessPointsResponse, UnmarshallerContext _ctx) {
		
		describeCpfsAccessPointsResponse.setRequestId(_ctx.stringValue("DescribeCpfsAccessPointsResponse.RequestId"));
		describeCpfsAccessPointsResponse.setTotalCount(_ctx.integerValue("DescribeCpfsAccessPointsResponse.TotalCount"));
		describeCpfsAccessPointsResponse.setPageSize(_ctx.integerValue("DescribeCpfsAccessPointsResponse.PageSize"));
		describeCpfsAccessPointsResponse.setNextToken(_ctx.stringValue("DescribeCpfsAccessPointsResponse.NextToken"));
		describeCpfsAccessPointsResponse.setPageNumber(_ctx.integerValue("DescribeCpfsAccessPointsResponse.PageNumber"));
		describeCpfsAccessPointsResponse.setMaxResults(_ctx.integerValue("DescribeCpfsAccessPointsResponse.MaxResults"));

		List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCpfsAccessPointsResponse.AccessPoints.Length"); i++) {
			AccessPoint accessPoint = new AccessPoint();
			accessPoint.setStatus(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].Status"));
			accessPoint.setModifyTime(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].ModifyTime"));
			accessPoint.setDescription(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].Description"));
			accessPoint.setCreateTime(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].CreateTime"));
			accessPoint.setAccessPointId(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].AccessPointId"));
			accessPoint.setFileSystemId(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].FileSystemId"));
			accessPoint.setRegionId(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].RegionId"));
			accessPoint.setARN(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].ARN"));

			RootDirectory rootDirectory = new RootDirectory();
			rootDirectory.setRootPath(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].RootDirectory.RootPath"));
			rootDirectory.setRootPathStatus(_ctx.stringValue("DescribeCpfsAccessPointsResponse.AccessPoints["+ i +"].RootDirectory.RootPathStatus"));
			accessPoint.setRootDirectory(rootDirectory);

			accessPoints.add(accessPoint);
		}
		describeCpfsAccessPointsResponse.setAccessPoints(accessPoints);
	 
	 	return describeCpfsAccessPointsResponse;
	}
}
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

import com.aliyuncs.sas.model.v20181203.DescribeGroupedMaliciousFilesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFile;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedMaliciousFilesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupedMaliciousFilesResponseUnmarshaller {

	public static DescribeGroupedMaliciousFilesResponse unmarshall(DescribeGroupedMaliciousFilesResponse describeGroupedMaliciousFilesResponse, UnmarshallerContext _ctx) {
		
		describeGroupedMaliciousFilesResponse.setRequestId(_ctx.stringValue("DescribeGroupedMaliciousFilesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeGroupedMaliciousFilesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeGroupedMaliciousFilesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeGroupedMaliciousFilesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeGroupedMaliciousFilesResponse.PageInfo.CurrentPage"));
		describeGroupedMaliciousFilesResponse.setPageInfo(pageInfo);

		List<GroupedMaliciousFile> groupedMaliciousFileResponse = new ArrayList<GroupedMaliciousFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse.Length"); i++) {
			GroupedMaliciousFile groupedMaliciousFile = new GroupedMaliciousFile();
			groupedMaliciousFile.setMaliciousName(_ctx.stringValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].MaliciousName"));
			groupedMaliciousFile.setMaliciousMd5(_ctx.stringValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].MaliciousMd5"));
			groupedMaliciousFile.setFirstScanTimestamp(_ctx.longValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].FirstScanTimestamp"));
			groupedMaliciousFile.setLatestScanTimestamp(_ctx.longValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].LatestScanTimestamp"));
			groupedMaliciousFile.setStatus(_ctx.integerValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].Status"));
			groupedMaliciousFile.setLevel(_ctx.stringValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].Level"));
			groupedMaliciousFile.setImageCount(_ctx.longValue("DescribeGroupedMaliciousFilesResponse.GroupedMaliciousFileResponse["+ i +"].ImageCount"));

			groupedMaliciousFileResponse.add(groupedMaliciousFile);
		}
		describeGroupedMaliciousFilesResponse.setGroupedMaliciousFileResponse(groupedMaliciousFileResponse);
	 
	 	return describeGroupedMaliciousFilesResponse;
	}
}
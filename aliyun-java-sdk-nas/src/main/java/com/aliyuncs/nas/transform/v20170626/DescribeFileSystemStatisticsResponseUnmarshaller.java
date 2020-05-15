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

import com.aliyuncs.nas.model.v20170626.DescribeFileSystemStatisticsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemStatisticsResponse.FileSystemStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileSystemStatisticsResponseUnmarshaller {

	public static DescribeFileSystemStatisticsResponse unmarshall(DescribeFileSystemStatisticsResponse describeFileSystemStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeFileSystemStatisticsResponse.setRequestId(_ctx.stringValue("DescribeFileSystemStatisticsResponse.RequestId"));
		describeFileSystemStatisticsResponse.setTotalCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.TotalCount"));
		describeFileSystemStatisticsResponse.setPageSize(_ctx.integerValue("DescribeFileSystemStatisticsResponse.PageSize"));
		describeFileSystemStatisticsResponse.setPageNumber(_ctx.integerValue("DescribeFileSystemStatisticsResponse.PageNumber"));

		List<FileSystemStatistic> fileSystemStatistics = new ArrayList<FileSystemStatistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics.Length"); i++) {
			FileSystemStatistic fileSystemStatistic = new FileSystemStatistic();
			fileSystemStatistic.setFileSystemType(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].FileSystemType"));
			fileSystemStatistic.setTotalCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].TotalCount"));
			fileSystemStatistic.setMeteredSize(_ctx.longValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].MeteredSize"));
			fileSystemStatistic.setExpiredCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].ExpiredCount"));
			fileSystemStatistic.setExpiringCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].ExpiringCount"));

			fileSystemStatistics.add(fileSystemStatistic);
		}
		describeFileSystemStatisticsResponse.setFileSystemStatistics(fileSystemStatistics);
	 
	 	return describeFileSystemStatisticsResponse;
	}
}
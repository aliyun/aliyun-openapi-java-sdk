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
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemStatisticsResponse.FileSystem;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemStatisticsResponse.FileSystem._Package;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemStatisticsResponse.FileSystemStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileSystemStatisticsResponseUnmarshaller {

	public static DescribeFileSystemStatisticsResponse unmarshall(DescribeFileSystemStatisticsResponse describeFileSystemStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeFileSystemStatisticsResponse.setRequestId(_ctx.stringValue("DescribeFileSystemStatisticsResponse.RequestId"));
		describeFileSystemStatisticsResponse.setTotalCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.TotalCount"));
		describeFileSystemStatisticsResponse.setPageSize(_ctx.integerValue("DescribeFileSystemStatisticsResponse.PageSize"));
		describeFileSystemStatisticsResponse.setPageNumber(_ctx.integerValue("DescribeFileSystemStatisticsResponse.PageNumber"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFileSystemStatisticsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setStatus(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Status"));
			fileSystem.setStorageType(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].StorageType"));
			fileSystem.setDescription(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Description"));
			fileSystem.setZoneId(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].ZoneId"));
			fileSystem.setMeteredIASize(_ctx.longValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].MeteredIASize"));
			fileSystem.setCreateTime(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].CreateTime"));
			fileSystem.setMeteredSize(_ctx.longValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].MeteredSize"));
			fileSystem.setCapacity(_ctx.longValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Capacity"));
			fileSystem.setChargeType(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].ChargeType"));
			fileSystem.setProtocolType(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].ProtocolType"));
			fileSystem.setFileSystemType(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].FileSystemType"));
			fileSystem.setExpiredTime(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].ExpiredTime"));
			fileSystem.setFileSystemId(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystem.setRegionId(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].RegionId"));

			List<_Package> packages = new ArrayList<_Package>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Packages.Length"); j++) {
				_Package _package = new _Package();
				_package.setSize(_ctx.longValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Packages["+ j +"].Size"));
				_package.setExpiredTime(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Packages["+ j +"].ExpiredTime"));
				_package.setStartTime(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Packages["+ j +"].StartTime"));
				_package.setPackageId(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystems["+ i +"].Packages["+ j +"].PackageId"));

				packages.add(_package);
			}
			fileSystem.setPackages(packages);

			fileSystems.add(fileSystem);
		}
		describeFileSystemStatisticsResponse.setFileSystems(fileSystems);

		List<FileSystemStatistic> fileSystemStatistics = new ArrayList<FileSystemStatistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics.Length"); i++) {
			FileSystemStatistic fileSystemStatistic = new FileSystemStatistic();
			fileSystemStatistic.setTotalCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].TotalCount"));
			fileSystemStatistic.setExpiredCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].ExpiredCount"));
			fileSystemStatistic.setFileSystemType(_ctx.stringValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].FileSystemType"));
			fileSystemStatistic.setMeteredSize(_ctx.longValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].MeteredSize"));
			fileSystemStatistic.setExpiringCount(_ctx.integerValue("DescribeFileSystemStatisticsResponse.FileSystemStatistics["+ i +"].ExpiringCount"));

			fileSystemStatistics.add(fileSystemStatistic);
		}
		describeFileSystemStatisticsResponse.setFileSystemStatistics(fileSystemStatistics);
	 
	 	return describeFileSystemStatisticsResponse;
	}
}
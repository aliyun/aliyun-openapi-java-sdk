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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsStorageUsageDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsStorageUsageDataResponse.StorageUsageDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsStorageUsageDataResponseUnmarshaller {

	public static DescribeVsStorageUsageDataResponse unmarshall(DescribeVsStorageUsageDataResponse describeVsStorageUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeVsStorageUsageDataResponse.setRequestId(_ctx.stringValue("DescribeVsStorageUsageDataResponse.RequestId"));

		List<StorageUsageDataModule> storageUsage = new ArrayList<StorageUsageDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsStorageUsageDataResponse.StorageUsage.Length"); i++) {
			StorageUsageDataModule storageUsageDataModule = new StorageUsageDataModule();
			storageUsageDataModule.setTimeStamp(_ctx.stringValue("DescribeVsStorageUsageDataResponse.StorageUsage["+ i +"].TimeStamp"));
			storageUsageDataModule.setBucket(_ctx.stringValue("DescribeVsStorageUsageDataResponse.StorageUsage["+ i +"].Bucket"));
			storageUsageDataModule.setStorageDataValue(_ctx.integerValue("DescribeVsStorageUsageDataResponse.StorageUsage["+ i +"].StorageDataValue"));

			storageUsage.add(storageUsageDataModule);
		}
		describeVsStorageUsageDataResponse.setStorageUsage(storageUsage);
	 
	 	return describeVsStorageUsageDataResponse;
	}
}
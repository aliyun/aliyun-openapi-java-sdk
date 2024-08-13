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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodTieringStorageDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodTieringStorageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodTieringStorageDataResponseUnmarshaller {

	public static DescribeVodTieringStorageDataResponse unmarshall(DescribeVodTieringStorageDataResponse describeVodTieringStorageDataResponse, UnmarshallerContext _ctx) {
		
		describeVodTieringStorageDataResponse.setRequestId(_ctx.stringValue("DescribeVodTieringStorageDataResponse.RequestId"));

		List<DataModule> storageData = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodTieringStorageDataResponse.StorageData.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodTieringStorageDataResponse.StorageData["+ i +"].TimeStamp"));
			dataModule.setRegion(_ctx.stringValue("DescribeVodTieringStorageDataResponse.StorageData["+ i +"].Region"));
			dataModule.setStorageClass(_ctx.stringValue("DescribeVodTieringStorageDataResponse.StorageData["+ i +"].StorageClass"));
			dataModule.setStorageUtilization(_ctx.longValue("DescribeVodTieringStorageDataResponse.StorageData["+ i +"].StorageUtilization"));
			dataModule.setLessthanMonthDatasize(_ctx.longValue("DescribeVodTieringStorageDataResponse.StorageData["+ i +"].LessthanMonthDatasize"));

			storageData.add(dataModule);
		}
		describeVodTieringStorageDataResponse.setStorageData(storageData);
	 
	 	return describeVodTieringStorageDataResponse;
	}
}
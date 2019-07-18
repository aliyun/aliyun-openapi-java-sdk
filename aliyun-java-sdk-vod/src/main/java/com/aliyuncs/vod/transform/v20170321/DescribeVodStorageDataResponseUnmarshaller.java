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

import com.aliyuncs.vod.model.v20170321.DescribeVodStorageDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodStorageDataResponse.StorageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodStorageDataResponseUnmarshaller {

	public static DescribeVodStorageDataResponse unmarshall(DescribeVodStorageDataResponse describeVodStorageDataResponse, UnmarshallerContext _ctx) {
		
		describeVodStorageDataResponse.setRequestId(_ctx.stringValue("DescribeVodStorageDataResponse.RequestId"));
		describeVodStorageDataResponse.setDataInterval(_ctx.stringValue("DescribeVodStorageDataResponse.DataInterval"));

		List<StorageDataItem> storageData = new ArrayList<StorageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodStorageDataResponse.StorageData.Length"); i++) {
			StorageDataItem storageDataItem = new StorageDataItem();
			storageDataItem.setTimeStamp(_ctx.stringValue("DescribeVodStorageDataResponse.StorageData["+ i +"].TimeStamp"));
			storageDataItem.setStorageUtilization(_ctx.stringValue("DescribeVodStorageDataResponse.StorageData["+ i +"].StorageUtilization"));
			storageDataItem.setNetworkOut(_ctx.stringValue("DescribeVodStorageDataResponse.StorageData["+ i +"].NetworkOut"));

			storageData.add(storageDataItem);
		}
		describeVodStorageDataResponse.setStorageData(storageData);
	 
	 	return describeVodStorageDataResponse;
	}
}
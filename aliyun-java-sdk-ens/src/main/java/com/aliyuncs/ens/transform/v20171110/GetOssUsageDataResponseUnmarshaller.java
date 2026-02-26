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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.GetOssUsageDataResponse;
import com.aliyuncs.ens.model.v20171110.GetOssUsageDataResponse.UsageListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssUsageDataResponseUnmarshaller {

	public static GetOssUsageDataResponse unmarshall(GetOssUsageDataResponse getOssUsageDataResponse, UnmarshallerContext _ctx) {
		
		getOssUsageDataResponse.setRequestId(_ctx.stringValue("GetOssUsageDataResponse.RequestId"));

		List<UsageListItem> usageList = new ArrayList<UsageListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOssUsageDataResponse.UsageList.Length"); i++) {
			UsageListItem usageListItem = new UsageListItem();
			usageListItem.setLanRxBw(_ctx.longValue("GetOssUsageDataResponse.UsageList["+ i +"].LanRxBw"));
			usageListItem.setLanTxBw(_ctx.longValue("GetOssUsageDataResponse.UsageList["+ i +"].LanTxBw"));
			usageListItem.setPoint(_ctx.longValue("GetOssUsageDataResponse.UsageList["+ i +"].Point"));
			usageListItem.setPointTs(_ctx.stringValue("GetOssUsageDataResponse.UsageList["+ i +"].PointTs"));
			usageListItem.setStorageUsageByte(_ctx.longValue("GetOssUsageDataResponse.UsageList["+ i +"].StorageUsageByte"));
			usageListItem.setWanRxBw(_ctx.longValue("GetOssUsageDataResponse.UsageList["+ i +"].WanRxBw"));
			usageListItem.setWanTxBw(_ctx.longValue("GetOssUsageDataResponse.UsageList["+ i +"].WanTxBw"));

			usageList.add(usageListItem);
		}
		getOssUsageDataResponse.setUsageList(usageList);
	 
	 	return getOssUsageDataResponse;
	}
}
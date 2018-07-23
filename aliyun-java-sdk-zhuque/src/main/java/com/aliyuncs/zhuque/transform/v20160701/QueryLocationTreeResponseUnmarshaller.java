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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.QueryLocationTreeResponse;
import com.aliyuncs.zhuque.model.v20160701.QueryLocationTreeResponse.CloudInstanceItem;
import com.aliyuncs.zhuque.model.v20160701.QueryLocationTreeResponse.CloudInstanceItem.RegionItem;
import com.aliyuncs.zhuque.model.v20160701.QueryLocationTreeResponse.CloudInstanceItem.RegionItem.AZoneItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLocationTreeResponseUnmarshaller {

	public static QueryLocationTreeResponse unmarshall(QueryLocationTreeResponse queryLocationTreeResponse, UnmarshallerContext context) {
		
		queryLocationTreeResponse.setRequestId(context.stringValue("QueryLocationTreeResponse.RequestId"));
		queryLocationTreeResponse.setCustomerId(context.stringValue("QueryLocationTreeResponse.CustomerId"));

		List<CloudInstanceItem> cloudInstanceList = new ArrayList<CloudInstanceItem>();
		for (int i = 0; i < context.lengthValue("QueryLocationTreeResponse.CloudInstanceList.Length"); i++) {
			CloudInstanceItem cloudInstanceItem = new CloudInstanceItem();
			cloudInstanceItem.setCloudInsatnceId(context.stringValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].CloudInsatnceId"));
			cloudInstanceItem.setDisplayName(context.stringValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].DisplayName"));

			List<RegionItem> regionList = new ArrayList<RegionItem>();
			for (int j = 0; j < context.lengthValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].RegionList.Length"); j++) {
				RegionItem regionItem = new RegionItem();
				regionItem.setRegionId(context.stringValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].RegionList["+ j +"].RegionId"));
				regionItem.setDisplayName(context.stringValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].RegionList["+ j +"].DisplayName"));

				List<AZoneItem> aZoneList = new ArrayList<AZoneItem>();
				for (int k = 0; k < context.lengthValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].RegionList["+ j +"].AZoneList.Length"); k++) {
					AZoneItem aZoneItem = new AZoneItem();
					aZoneItem.setAZoneId(context.stringValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].RegionList["+ j +"].AZoneList["+ k +"].AZoneId"));
					aZoneItem.setDisplayName(context.stringValue("QueryLocationTreeResponse.CloudInstanceList["+ i +"].RegionList["+ j +"].AZoneList["+ k +"].DisplayName"));

					aZoneList.add(aZoneItem);
				}
				regionItem.setAZoneList(aZoneList);

				regionList.add(regionItem);
			}
			cloudInstanceItem.setRegionList(regionList);

			cloudInstanceList.add(cloudInstanceItem);
		}
		queryLocationTreeResponse.setCloudInstanceList(cloudInstanceList);
	 
	 	return queryLocationTreeResponse;
	}
}
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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeCrossRegionLogBackupFilesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCrossRegionLogBackupFilesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossRegionLogBackupFilesResponseUnmarshaller {

	public static DescribeCrossRegionLogBackupFilesResponse unmarshall(DescribeCrossRegionLogBackupFilesResponse describeCrossRegionLogBackupFilesResponse, UnmarshallerContext context) {
		
		describeCrossRegionLogBackupFilesResponse.setRequestId(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.RequestId"));
		describeCrossRegionLogBackupFilesResponse.setRegionId(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.RegionId"));
		describeCrossRegionLogBackupFilesResponse.setDBInstanceId(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.DBInstanceId"));
		describeCrossRegionLogBackupFilesResponse.setStartTime(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.StartTime"));
		describeCrossRegionLogBackupFilesResponse.setEndTime(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.EndTime"));
		describeCrossRegionLogBackupFilesResponse.setTotalRecordCount(context.integerValue("DescribeCrossRegionLogBackupFilesResponse.TotalRecordCount"));
		describeCrossRegionLogBackupFilesResponse.setPageRecordCount(context.integerValue("DescribeCrossRegionLogBackupFilesResponse.PageRecordCount"));
		describeCrossRegionLogBackupFilesResponse.setPageNumber(context.integerValue("DescribeCrossRegionLogBackupFilesResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeCrossRegionLogBackupFilesResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setCrossLogBackupId(context.integerValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossLogBackupId"));
			item.setCrossBackupRegion(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossBackupRegion"));
			item.setCrossLogBackupSize(context.longValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossLogBackupSize"));
			item.setLogBeginTime(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LogBeginTime"));
			item.setLogEndTime(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LogEndTime"));
			item.setCrossDownloadLink(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossDownloadLink"));
			item.setCrossIntranetDownloadLink(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossIntranetDownloadLink"));
			item.setLinkExpiredTime(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LinkExpiredTime"));
			item.setLogFileName(context.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LogFileName"));
			item.setInstanceId(context.integerValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].InstanceId"));

			items.add(item);
		}
		describeCrossRegionLogBackupFilesResponse.setItems(items);
	 
	 	return describeCrossRegionLogBackupFilesResponse;
	}
}
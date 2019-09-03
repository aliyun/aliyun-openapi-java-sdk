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

	public static DescribeCrossRegionLogBackupFilesResponse unmarshall(DescribeCrossRegionLogBackupFilesResponse describeCrossRegionLogBackupFilesResponse, UnmarshallerContext _ctx) {
		
		describeCrossRegionLogBackupFilesResponse.setRequestId(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.RequestId"));
		describeCrossRegionLogBackupFilesResponse.setRegionId(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.RegionId"));
		describeCrossRegionLogBackupFilesResponse.setDBInstanceId(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.DBInstanceId"));
		describeCrossRegionLogBackupFilesResponse.setStartTime(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.StartTime"));
		describeCrossRegionLogBackupFilesResponse.setEndTime(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.EndTime"));
		describeCrossRegionLogBackupFilesResponse.setTotalRecordCount(_ctx.integerValue("DescribeCrossRegionLogBackupFilesResponse.TotalRecordCount"));
		describeCrossRegionLogBackupFilesResponse.setPageRecordCount(_ctx.integerValue("DescribeCrossRegionLogBackupFilesResponse.PageRecordCount"));
		describeCrossRegionLogBackupFilesResponse.setPageNumber(_ctx.integerValue("DescribeCrossRegionLogBackupFilesResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossRegionLogBackupFilesResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setCrossLogBackupId(_ctx.integerValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossLogBackupId"));
			item.setCrossBackupRegion(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossBackupRegion"));
			item.setCrossLogBackupSize(_ctx.longValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossLogBackupSize"));
			item.setLogBeginTime(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LogBeginTime"));
			item.setLogEndTime(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LogEndTime"));
			item.setCrossDownloadLink(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossDownloadLink"));
			item.setCrossIntranetDownloadLink(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].CrossIntranetDownloadLink"));
			item.setLinkExpiredTime(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LinkExpiredTime"));
			item.setLogFileName(_ctx.stringValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].LogFileName"));
			item.setInstanceId(_ctx.integerValue("DescribeCrossRegionLogBackupFilesResponse.Items["+ i +"].InstanceId"));

			items.add(item);
		}
		describeCrossRegionLogBackupFilesResponse.setItems(items);
	 
	 	return describeCrossRegionLogBackupFilesResponse;
	}
}
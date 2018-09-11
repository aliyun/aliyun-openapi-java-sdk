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

import com.aliyuncs.rds.model.v20140815.DescribeSqlLogTimeDistributionResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlLogTimeDistributionResponse.Distribution;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlLogTimeDistributionResponseUnmarshaller {

	public static DescribeSqlLogTimeDistributionResponse unmarshall(DescribeSqlLogTimeDistributionResponse describeSqlLogTimeDistributionResponse, UnmarshallerContext context) {
		
		describeSqlLogTimeDistributionResponse.setRequestId(context.stringValue("DescribeSqlLogTimeDistributionResponse.RequestId"));
		describeSqlLogTimeDistributionResponse.setDBInstanceID(context.integerValue("DescribeSqlLogTimeDistributionResponse.DBInstanceID"));
		describeSqlLogTimeDistributionResponse.setDBInstanceName(context.stringValue("DescribeSqlLogTimeDistributionResponse.DBInstanceName"));
		describeSqlLogTimeDistributionResponse.setStartTime(context.stringValue("DescribeSqlLogTimeDistributionResponse.StartTime"));
		describeSqlLogTimeDistributionResponse.setEndTime(context.stringValue("DescribeSqlLogTimeDistributionResponse.EndTime"));
		describeSqlLogTimeDistributionResponse.setTemplateHash(context.longValue("DescribeSqlLogTimeDistributionResponse.TemplateHash"));
		describeSqlLogTimeDistributionResponse.setItemsNumbers(context.integerValue("DescribeSqlLogTimeDistributionResponse.ItemsNumbers"));

		List<Distribution> items = new ArrayList<Distribution>();
		for (int i = 0; i < context.lengthValue("DescribeSqlLogTimeDistributionResponse.Items.Length"); i++) {
			Distribution distribution = new Distribution();
			distribution.setQueryStartTime(context.stringValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].QueryStartTime"));
			distribution.setTotalConsume(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].TotalConsume"));
			distribution.setTotalCounts(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].TotalCounts"));
			distribution.setTotalScanRows(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].TotalScanRows"));
			distribution.setTotalUpdateRows(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].TotalUpdateRows"));
			distribution.setSelectCounts(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].SelectCounts"));
			distribution.setUpdateCounts(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].UpdateCounts"));
			distribution.setInsertCounts(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].InsertCounts"));
			distribution.setDeleteCounts(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].DeleteCounts"));
			distribution.setLoginCounts(context.longValue("DescribeSqlLogTimeDistributionResponse.Items["+ i +"].LoginCounts"));

			items.add(distribution);
		}
		describeSqlLogTimeDistributionResponse.setItems(items);
	 
	 	return describeSqlLogTimeDistributionResponse;
	}
}
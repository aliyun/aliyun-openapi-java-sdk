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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataLimitSetResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet.DataLimit;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet.OssBucket;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataLimitSetResponseUnmarshaller {

	public static DescribeDataLimitSetResponse unmarshall(DescribeDataLimitSetResponse describeDataLimitSetResponse, UnmarshallerContext context) {
		
		describeDataLimitSetResponse.setRequestId(context.stringValue("DescribeDataLimitSetResponse.RequestId"));

		DataLimitSet dataLimitSet = new DataLimitSet();
		dataLimitSet.setResourceType(context.integerValue("DescribeDataLimitSetResponse.DataLimitSet.ResourceType"));

		List<DataLimit> dataLimitList = new ArrayList<DataLimit>();
		for (int i = 0; i < context.lengthValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList.Length"); i++) {
			DataLimit dataLimit = new DataLimit();
			dataLimit.setRegionId(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].RegionId"));
			dataLimit.setLocalName(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].LocalName"));
			dataLimit.setParentId(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].ParentId"));
			dataLimit.setId(context.longValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].Id"));
			dataLimit.setUserName(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].UserName"));
			dataLimit.setGmtCreate(context.longValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].GmtCreate"));
			dataLimit.setConnector(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].Connector"));

			dataLimitList.add(dataLimit);
		}
		dataLimitSet.setDataLimitList(dataLimitList);

		List<OssBucket> ossBucketList = new ArrayList<OssBucket>();
		for (int i = 0; i < context.lengthValue("DescribeDataLimitSetResponse.DataLimitSet.OssBucketList.Length"); i++) {
			OssBucket ossBucket = new OssBucket();
			ossBucket.setBucketName(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.OssBucketList["+ i +"].BucketName"));
			ossBucket.setRegionId(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.OssBucketList["+ i +"].RegionId"));

			ossBucketList.add(ossBucket);
		}
		dataLimitSet.setOssBucketList(ossBucketList);

		List<Region> regionList = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("DescribeDataLimitSetResponse.DataLimitSet.RegionList.Length"); i++) {
			Region region = new Region();
			region.setLocalName(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.RegionList["+ i +"].LocalName"));
			region.setRegionId(context.stringValue("DescribeDataLimitSetResponse.DataLimitSet.RegionList["+ i +"].RegionId"));

			regionList.add(region);
		}
		dataLimitSet.setRegionList(regionList);
		describeDataLimitSetResponse.setDataLimitSet(dataLimitSet);
	 
	 	return describeDataLimitSetResponse;
	}
}
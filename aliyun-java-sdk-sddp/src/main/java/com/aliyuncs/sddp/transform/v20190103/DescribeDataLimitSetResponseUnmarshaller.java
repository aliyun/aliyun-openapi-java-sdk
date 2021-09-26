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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitSetResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet;
import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet.DataLimit;
import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet.OssBucket;
import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitSetResponse.DataLimitSet.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataLimitSetResponseUnmarshaller {

	public static DescribeDataLimitSetResponse unmarshall(DescribeDataLimitSetResponse describeDataLimitSetResponse, UnmarshallerContext _ctx) {
		
		describeDataLimitSetResponse.setRequestId(_ctx.stringValue("DescribeDataLimitSetResponse.RequestId"));

		DataLimitSet dataLimitSet = new DataLimitSet();
		dataLimitSet.setResourceType(_ctx.longValue("DescribeDataLimitSetResponse.DataLimitSet.ResourceType"));
		dataLimitSet.setResourceTypeCode(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.ResourceTypeCode"));
		dataLimitSet.setTotalCount(_ctx.integerValue("DescribeDataLimitSetResponse.DataLimitSet.TotalCount"));

		List<DataLimit> dataLimitList = new ArrayList<DataLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList.Length"); i++) {
			DataLimit dataLimit = new DataLimit();
			dataLimit.setRegionId(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].RegionId"));
			dataLimit.setLocalName(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].LocalName"));
			dataLimit.setParentId(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].ParentId"));
			dataLimit.setId(_ctx.longValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].Id"));
			dataLimit.setUserName(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].UserName"));
			dataLimit.setGmtCreate(_ctx.longValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].GmtCreate"));
			dataLimit.setConnector(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].Connector"));
			dataLimit.setCheckStatus(_ctx.integerValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].CheckStatus"));
			dataLimit.setCheckStatusName(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].CheckStatusName"));
			dataLimit.setResourceType(_ctx.longValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].ResourceType"));
			dataLimit.setResourceTypeCode(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].ResourceTypeCode"));
			dataLimit.setAuditStatus(_ctx.integerValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].AuditStatus"));
			dataLimit.setLogStoreDay(_ctx.integerValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].LogStoreDay"));
			dataLimit.setPort(_ctx.integerValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].Port"));
			dataLimit.setEventStatus(_ctx.integerValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].EventStatus"));
			dataLimit.setSupportEvent(_ctx.booleanValue("DescribeDataLimitSetResponse.DataLimitSet.DataLimitList["+ i +"].SupportEvent"));

			dataLimitList.add(dataLimit);
		}
		dataLimitSet.setDataLimitList(dataLimitList);

		List<OssBucket> ossBucketList = new ArrayList<OssBucket>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataLimitSetResponse.DataLimitSet.OssBucketList.Length"); i++) {
			OssBucket ossBucket = new OssBucket();
			ossBucket.setBucketName(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.OssBucketList["+ i +"].BucketName"));
			ossBucket.setRegionId(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.OssBucketList["+ i +"].RegionId"));

			ossBucketList.add(ossBucket);
		}
		dataLimitSet.setOssBucketList(ossBucketList);

		List<Region> regionList = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataLimitSetResponse.DataLimitSet.RegionList.Length"); i++) {
			Region region = new Region();
			region.setLocalName(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.RegionList["+ i +"].LocalName"));
			region.setRegionId(_ctx.stringValue("DescribeDataLimitSetResponse.DataLimitSet.RegionList["+ i +"].RegionId"));

			regionList.add(region);
		}
		dataLimitSet.setRegionList(regionList);
		describeDataLimitSetResponse.setDataLimitSet(dataLimitSet);
	 
	 	return describeDataLimitSetResponse;
	}
}
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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceListResponse;
import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceListResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHiTSDBInstanceListResponseUnmarshaller {

	public static DescribeHiTSDBInstanceListResponse unmarshall(DescribeHiTSDBInstanceListResponse describeHiTSDBInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeHiTSDBInstanceListResponse.setRequestId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.RequestId"));
		describeHiTSDBInstanceListResponse.setPageNumber(_ctx.integerValue("DescribeHiTSDBInstanceListResponse.PageNumber"));
		describeHiTSDBInstanceListResponse.setPageSize(_ctx.integerValue("DescribeHiTSDBInstanceListResponse.PageSize"));
		describeHiTSDBInstanceListResponse.setTotal(_ctx.integerValue("DescribeHiTSDBInstanceListResponse.Total"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHiTSDBInstanceListResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			instance.setInstanceAlias(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceAlias"));
			instance.setInstanceDescription(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceDescription"));
			instance.setUserId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].UserId"));
			instance.setRegionId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].ZoneId"));
			instance.setInstanceStatus(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceStatus"));
			instance.setChargeType(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].ChargeType"));
			instance.setNetworkType(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].NetworkType"));
			instance.setGmtCreated(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].GmtCreated"));
			instance.setGmtExpire(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].GmtExpire"));
			instance.setInstanceClass(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceClass"));
			instance.setInstanceStorage(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceStorage"));
			instance.setInstanceTps(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].InstanceTps"));
			instance.setLockMode(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].LockMode"));
			instance.setEngineType(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].EngineType"));
			instance.setMaxSeriesPerDatabase(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].MaxSeriesPerDatabase"));
			instance.setVpcId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].VpcId"));
			instance.setVswitchId(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].VswitchId"));
			instance.setStatus(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].Status"));
			instance.setPaymentType(_ctx.stringValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].PaymentType"));
			instance.setCreateTime(_ctx.longValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			instance.setExpiredTime(_ctx.longValue("DescribeHiTSDBInstanceListResponse.InstanceList["+ i +"].ExpiredTime"));

			instanceList.add(instance);
		}
		describeHiTSDBInstanceListResponse.setInstanceList(instanceList);
	 
	 	return describeHiTSDBInstanceListResponse;
	}
}
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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceListResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormInstanceListResponse.LindormInstanceSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormInstanceListResponseUnmarshaller {

	public static GetLindormInstanceListResponse unmarshall(GetLindormInstanceListResponse getLindormInstanceListResponse, UnmarshallerContext _ctx) {
		
		getLindormInstanceListResponse.setRequestId(_ctx.stringValue("GetLindormInstanceListResponse.RequestId"));
		getLindormInstanceListResponse.setPageNumber(_ctx.integerValue("GetLindormInstanceListResponse.PageNumber"));
		getLindormInstanceListResponse.setPageSize(_ctx.integerValue("GetLindormInstanceListResponse.PageSize"));
		getLindormInstanceListResponse.setTotal(_ctx.integerValue("GetLindormInstanceListResponse.Total"));

		List<LindormInstanceSummary> instanceList = new ArrayList<LindormInstanceSummary>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormInstanceListResponse.InstanceList.Length"); i++) {
			LindormInstanceSummary lindormInstanceSummary = new LindormInstanceSummary();
			lindormInstanceSummary.setInstanceId(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			lindormInstanceSummary.setInstanceAlias(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].InstanceAlias"));
			lindormInstanceSummary.setRegionId(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].RegionId"));
			lindormInstanceSummary.setZoneId(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].ZoneId"));
			lindormInstanceSummary.setInstanceStatus(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].InstanceStatus"));
			lindormInstanceSummary.setPayType(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].PayType"));
			lindormInstanceSummary.setNetworkType(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].NetworkType"));
			lindormInstanceSummary.setCreateTime(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			lindormInstanceSummary.setExpireTime(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].ExpireTime"));
			lindormInstanceSummary.setInstanceStorage(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].InstanceStorage"));
			lindormInstanceSummary.setServiceType(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].ServiceType"));
			lindormInstanceSummary.setEngineType(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].EngineType"));
			lindormInstanceSummary.setAliUid(_ctx.longValue("GetLindormInstanceListResponse.InstanceList["+ i +"].AliUid"));
			lindormInstanceSummary.setVpcId(_ctx.stringValue("GetLindormInstanceListResponse.InstanceList["+ i +"].VpcId"));

			instanceList.add(lindormInstanceSummary);
		}
		getLindormInstanceListResponse.setInstanceList(instanceList);
	 
	 	return getLindormInstanceListResponse;
	}
}
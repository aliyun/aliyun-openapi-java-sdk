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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeExpireZonesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeExpireZonesResponse.ExpireZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeExpireZonesResponseUnmarshaller {

	public static OpsDescribeExpireZonesResponse unmarshall(OpsDescribeExpireZonesResponse opsDescribeExpireZonesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeExpireZonesResponse.setRequestId(_ctx.stringValue("OpsDescribeExpireZonesResponse.RequestId"));
		opsDescribeExpireZonesResponse.setTotal(_ctx.integerValue("OpsDescribeExpireZonesResponse.Total"));
		opsDescribeExpireZonesResponse.setPageSize(_ctx.integerValue("OpsDescribeExpireZonesResponse.PageSize"));
		opsDescribeExpireZonesResponse.setPageNumber(_ctx.integerValue("OpsDescribeExpireZonesResponse.PageNumber"));

		List<ExpireZone> expireZoneSet = new ArrayList<ExpireZone>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeExpireZonesResponse.ExpireZoneSet.Length"); i++) {
			ExpireZone expireZone = new ExpireZone();
			expireZone.setNumericId(_ctx.longValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].NumericId"));
			expireZone.setSourceZoneNo(_ctx.stringValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].SourceZoneNo"));
			expireZone.setTargetZoneNo(_ctx.stringValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].TargetZoneNo"));
			expireZone.setSourceIzNo(_ctx.stringValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].SourceIzNo"));
			expireZone.setTargetIzNo(_ctx.stringValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].TargetIzNo"));
			expireZone.setExpireStrategy(_ctx.integerValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].ExpireStrategy"));
			expireZone.setExpireTime(_ctx.stringValue("OpsDescribeExpireZonesResponse.ExpireZoneSet["+ i +"].ExpireTime"));

			expireZoneSet.add(expireZone);
		}
		opsDescribeExpireZonesResponse.setExpireZoneSet(expireZoneSet);
	 
	 	return opsDescribeExpireZonesResponse;
	}
}
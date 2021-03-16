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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOsTypesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOsTypesResponse.OsType;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeOsTypesResponseUnmarshaller {

	public static OpsDescribeOsTypesResponse unmarshall(OpsDescribeOsTypesResponse opsDescribeOsTypesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeOsTypesResponse.setRequestId(_ctx.stringValue("OpsDescribeOsTypesResponse.RequestId"));
		opsDescribeOsTypesResponse.setTotalCount(_ctx.integerValue("OpsDescribeOsTypesResponse.TotalCount"));
		opsDescribeOsTypesResponse.setPageNumber(_ctx.integerValue("OpsDescribeOsTypesResponse.PageNumber"));
		opsDescribeOsTypesResponse.setPageSize(_ctx.integerValue("OpsDescribeOsTypesResponse.PageSize"));

		List<OsType> osTypes = new ArrayList<OsType>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOsTypesResponse.OsTypes.Length"); i++) {
			OsType osType = new OsType();
			osType.setOsTypeId(_ctx.longValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsTypeId"));
			osType.setKind(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].Kind"));
			osType.setPlatform(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].Platform"));
			osType.setOsName(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsName"));
			osType.setOsNameEn(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsNameEn"));
			osType.setOsBit(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsBit"));
			osType.setMaxCpu(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MaxCpu"));
			osType.setMinCpu(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MinCpu"));
			osType.setMaxMemory(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MaxMemory"));
			osType.setMinMemory(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MinMemory"));
			osType.setOsLicense(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsLicense"));

			osTypes.add(osType);
		}
		opsDescribeOsTypesResponse.setOsTypes(osTypes);
	 
	 	return opsDescribeOsTypesResponse;
	}
}
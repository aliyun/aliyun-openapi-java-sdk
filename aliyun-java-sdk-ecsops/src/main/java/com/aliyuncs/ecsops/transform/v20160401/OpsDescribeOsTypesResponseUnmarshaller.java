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
		opsDescribeOsTypesResponse.setPageSize(_ctx.integerValue("OpsDescribeOsTypesResponse.PageSize"));
		opsDescribeOsTypesResponse.setPageNumber(_ctx.integerValue("OpsDescribeOsTypesResponse.PageNumber"));

		List<OsType> osTypes = new ArrayList<OsType>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOsTypesResponse.OsTypes.Length"); i++) {
			OsType osType = new OsType();
			osType.setMinCpu(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MinCpu"));
			osType.setKind(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].Kind"));
			osType.setOsName(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsName"));
			osType.setOsBit(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsBit"));
			osType.setMaxCpu(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MaxCpu"));
			osType.setPlatform(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].Platform"));
			osType.setMinMemory(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MinMemory"));
			osType.setMaxMemory(_ctx.integerValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].MaxMemory"));
			osType.setOsNameEn(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsNameEn"));
			osType.setOsTypeId(_ctx.longValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsTypeId"));
			osType.setArchitecture(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].Architecture"));
			osType.setOsLicense(_ctx.stringValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsLicense"));
			osType.setOsTypeBit(_ctx.longValue("OpsDescribeOsTypesResponse.OsTypes["+ i +"].OsTypeBit"));

			osTypes.add(osType);
		}
		opsDescribeOsTypesResponse.setOsTypes(osTypes);
	 
	 	return opsDescribeOsTypesResponse;
	}
}
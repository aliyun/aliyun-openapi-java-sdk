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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWarningMetasResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWarningMetasResponse.WarningMetas;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeWarningMetasResponseUnmarshaller {

	public static OpsDescribeWarningMetasResponse unmarshall(OpsDescribeWarningMetasResponse opsDescribeWarningMetasResponse, UnmarshallerContext _ctx) {
		
		opsDescribeWarningMetasResponse.setRequestId(_ctx.stringValue("OpsDescribeWarningMetasResponse.RequestId"));
		opsDescribeWarningMetasResponse.setCode(_ctx.stringValue("OpsDescribeWarningMetasResponse.Code"));
		opsDescribeWarningMetasResponse.setMessage(_ctx.stringValue("OpsDescribeWarningMetasResponse.Message"));
		opsDescribeWarningMetasResponse.setSuccess(_ctx.stringValue("OpsDescribeWarningMetasResponse.Success"));
		opsDescribeWarningMetasResponse.setTotalCount(_ctx.integerValue("OpsDescribeWarningMetasResponse.TotalCount"));
		opsDescribeWarningMetasResponse.setPageNumber(_ctx.integerValue("OpsDescribeWarningMetasResponse.PageNumber"));
		opsDescribeWarningMetasResponse.setPageSize(_ctx.integerValue("OpsDescribeWarningMetasResponse.PageSize"));

		List<WarningMetas> data = new ArrayList<WarningMetas>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeWarningMetasResponse.Data.Length"); i++) {
			WarningMetas warningMetas = new WarningMetas();
			warningMetas.setId(_ctx.longValue("OpsDescribeWarningMetasResponse.Data["+ i +"].Id"));
			warningMetas.setGmtCreate(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].GmtCreate"));
			warningMetas.setGmtModified(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].GmtModified"));
			warningMetas.setWarningMetaId(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].WarningMetaId"));
			warningMetas.setProductName(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].ProductName"));
			warningMetas.setSourceSystem(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].SourceSystem"));
			warningMetas.setApp(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].App"));
			warningMetas.setLevel(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].Level"));
			warningMetas.setOwnerTeam(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].OwnerTeam"));
			warningMetas.setOwner(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].Owner"));
			warningMetas.setOwnerName(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].OwnerName"));
			warningMetas.setPhoneNumber(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].PhoneNumber"));
			warningMetas.setDiagnoseCategory(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].DiagnoseCategory"));
			warningMetas.setMonitorTitle(_ctx.stringValue("OpsDescribeWarningMetasResponse.Data["+ i +"].MonitorTitle"));

			data.add(warningMetas);
		}
		opsDescribeWarningMetasResponse.setData(data);
	 
	 	return opsDescribeWarningMetasResponse;
	}
}
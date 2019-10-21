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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumAdminStatusResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumAdminStatusResponse.ConsortimeAdminStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumAdminStatusResponseUnmarshaller {

	public static DescribeFabricConsortiumAdminStatusResponse unmarshall(DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatusResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumAdminStatusResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumAdminStatusResponse.RequestId"));
		describeFabricConsortiumAdminStatusResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumAdminStatusResponse.Success"));
		describeFabricConsortiumAdminStatusResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumAdminStatusResponse.ErrorCode"));

		List<ConsortimeAdminStatus> result = new ArrayList<ConsortimeAdminStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumAdminStatusResponse.Result.Length"); i++) {
			ConsortimeAdminStatus consortimeAdminStatus = new ConsortimeAdminStatus();
			consortimeAdminStatus.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumAdminStatusResponse.Result["+ i +"].ConsortiumId"));
			consortimeAdminStatus.setConsortiumAdministrator(_ctx.booleanValue("DescribeFabricConsortiumAdminStatusResponse.Result["+ i +"].ConsortiumAdministrator"));

			result.add(consortimeAdminStatus);
		}
		describeFabricConsortiumAdminStatusResponse.setResult(result);
	 
	 	return describeFabricConsortiumAdminStatusResponse;
	}
}
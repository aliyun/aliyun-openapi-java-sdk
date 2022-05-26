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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.MapToHavanaBindIdResponse;
import com.aliyuncs.account_crm.model.v20160606.MapToHavanaBindIdResponse.PkHavanaBindMappingDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class MapToHavanaBindIdResponseUnmarshaller {

	public static MapToHavanaBindIdResponse unmarshall(MapToHavanaBindIdResponse mapToHavanaBindIdResponse, UnmarshallerContext _ctx) {
		
		mapToHavanaBindIdResponse.setRequestId(_ctx.stringValue("MapToHavanaBindIdResponse.RequestId"));
		mapToHavanaBindIdResponse.setCode(_ctx.stringValue("MapToHavanaBindIdResponse.Code"));
		mapToHavanaBindIdResponse.setMessage(_ctx.stringValue("MapToHavanaBindIdResponse.Message"));
		mapToHavanaBindIdResponse.setHttpCode(_ctx.stringValue("MapToHavanaBindIdResponse.HttpCode"));
		mapToHavanaBindIdResponse.setSuccess(_ctx.booleanValue("MapToHavanaBindIdResponse.Success"));

		List<PkHavanaBindMappingDto> data = new ArrayList<PkHavanaBindMappingDto>();
		for (int i = 0; i < _ctx.lengthValue("MapToHavanaBindIdResponse.Data.Length"); i++) {
			PkHavanaBindMappingDto pkHavanaBindMappingDto = new PkHavanaBindMappingDto();
			pkHavanaBindMappingDto.setBindHid(_ctx.stringValue("MapToHavanaBindIdResponse.Data["+ i +"].BindHid"));
			pkHavanaBindMappingDto.setHavanaBindId(_ctx.stringValue("MapToHavanaBindIdResponse.Data["+ i +"].HavanaBindId"));
			pkHavanaBindMappingDto.setHavanaBindStation(_ctx.stringValue("MapToHavanaBindIdResponse.Data["+ i +"].HavanaBindStation"));
			pkHavanaBindMappingDto.setPk(_ctx.stringValue("MapToHavanaBindIdResponse.Data["+ i +"].Pk"));

			data.add(pkHavanaBindMappingDto);
		}
		mapToHavanaBindIdResponse.setData(data);
	 
	 	return mapToHavanaBindIdResponse;
	}
}
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

import com.aliyuncs.account_crm.model.v20160606.MapFromHavanaBindIdResponse;
import com.aliyuncs.account_crm.model.v20160606.MapFromHavanaBindIdResponse.PkHavanaBindMappingDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class MapFromHavanaBindIdResponseUnmarshaller {

	public static MapFromHavanaBindIdResponse unmarshall(MapFromHavanaBindIdResponse mapFromHavanaBindIdResponse, UnmarshallerContext _ctx) {
		
		mapFromHavanaBindIdResponse.setRequestId(_ctx.stringValue("MapFromHavanaBindIdResponse.RequestId"));
		mapFromHavanaBindIdResponse.setCode(_ctx.stringValue("MapFromHavanaBindIdResponse.Code"));
		mapFromHavanaBindIdResponse.setMessage(_ctx.stringValue("MapFromHavanaBindIdResponse.Message"));
		mapFromHavanaBindIdResponse.setHttpCode(_ctx.stringValue("MapFromHavanaBindIdResponse.HttpCode"));
		mapFromHavanaBindIdResponse.setSuccess(_ctx.booleanValue("MapFromHavanaBindIdResponse.Success"));

		List<PkHavanaBindMappingDto> data = new ArrayList<PkHavanaBindMappingDto>();
		for (int i = 0; i < _ctx.lengthValue("MapFromHavanaBindIdResponse.Data.Length"); i++) {
			PkHavanaBindMappingDto pkHavanaBindMappingDto = new PkHavanaBindMappingDto();
			pkHavanaBindMappingDto.setBindHid(_ctx.stringValue("MapFromHavanaBindIdResponse.Data["+ i +"].BindHid"));
			pkHavanaBindMappingDto.setHavanaBindId(_ctx.stringValue("MapFromHavanaBindIdResponse.Data["+ i +"].HavanaBindId"));
			pkHavanaBindMappingDto.setHavanaBindStation(_ctx.stringValue("MapFromHavanaBindIdResponse.Data["+ i +"].HavanaBindStation"));
			pkHavanaBindMappingDto.setPk(_ctx.stringValue("MapFromHavanaBindIdResponse.Data["+ i +"].Pk"));

			data.add(pkHavanaBindMappingDto);
		}
		mapFromHavanaBindIdResponse.setData(data);
	 
	 	return mapFromHavanaBindIdResponse;
	}
}
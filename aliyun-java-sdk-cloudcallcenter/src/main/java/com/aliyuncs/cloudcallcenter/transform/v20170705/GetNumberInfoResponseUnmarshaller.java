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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetNumberInfoResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetNumberInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNumberInfoResponseUnmarshaller {

	public static GetNumberInfoResponse unmarshall(GetNumberInfoResponse getNumberInfoResponse, UnmarshallerContext context) {
		
		getNumberInfoResponse.setRequestId(context.stringValue("GetNumberInfoResponse.RequestId"));
		getNumberInfoResponse.setSuccess(context.booleanValue("GetNumberInfoResponse.Success"));
		getNumberInfoResponse.setCode(context.stringValue("GetNumberInfoResponse.Code"));
		getNumberInfoResponse.setMessage(context.stringValue("GetNumberInfoResponse.Message"));
		getNumberInfoResponse.setHttpStatusCode(context.integerValue("GetNumberInfoResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTaobaoUid(context.longValue("GetNumberInfoResponse.Data.TaobaoUid"));
		data.setRamId(context.longValue("GetNumberInfoResponse.Data.RamId"));
		data.setRealNameInsId(context.longValue("GetNumberInfoResponse.Data.RealNameInsId"));
		data.setNumber(context.stringValue("GetNumberInfoResponse.Data.Number"));
		data.setRegionNameProvince(context.stringValue("GetNumberInfoResponse.Data.RegionNameProvince"));
		data.setRegionNameCity(context.stringValue("GetNumberInfoResponse.Data.RegionNameCity"));
		data.setCorpName(context.stringValue("GetNumberInfoResponse.Data.CorpName"));
		data.setMonthlyPrice(context.stringValue("GetNumberInfoResponse.Data.MonthlyPrice"));
		data.setGmtCreate(context.longValue("GetNumberInfoResponse.Data.GmtCreate"));
		getNumberInfoResponse.setData(data);
	 
	 	return getNumberInfoResponse;
	}
}
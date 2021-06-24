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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDemandPerformResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDemandPerformResponse.DemandPerformInfoModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDemandPerformResponseUnmarshaller {

	public static OpsDescribeDemandPerformResponse unmarshall(OpsDescribeDemandPerformResponse opsDescribeDemandPerformResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDemandPerformResponse.setRequestId(_ctx.stringValue("OpsDescribeDemandPerformResponse.RequestId"));
		opsDescribeDemandPerformResponse.setMessage(_ctx.stringValue("OpsDescribeDemandPerformResponse.Message"));
		opsDescribeDemandPerformResponse.setCode(_ctx.stringValue("OpsDescribeDemandPerformResponse.Code"));
		opsDescribeDemandPerformResponse.setSuccess(_ctx.booleanValue("OpsDescribeDemandPerformResponse.Success"));

		List<DemandPerformInfoModel> demandPerformInfoModelList = new ArrayList<DemandPerformInfoModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDemandPerformResponse.DemandPerformInfoModelList.Length"); i++) {
			DemandPerformInfoModel demandPerformInfoModel = new DemandPerformInfoModel();
			demandPerformInfoModel.setStatus(_ctx.stringValue("OpsDescribeDemandPerformResponse.DemandPerformInfoModelList["+ i +"].Status"));
			demandPerformInfoModel.setAmount(_ctx.integerValue("OpsDescribeDemandPerformResponse.DemandPerformInfoModelList["+ i +"].Amount"));
			demandPerformInfoModel.setConsumeCnt(_ctx.integerValue("OpsDescribeDemandPerformResponse.DemandPerformInfoModelList["+ i +"].ConsumeCnt"));
			demandPerformInfoModel.setSubDemandId(_ctx.stringValue("OpsDescribeDemandPerformResponse.DemandPerformInfoModelList["+ i +"].SubDemandId"));
			demandPerformInfoModel.setDemandId(_ctx.stringValue("OpsDescribeDemandPerformResponse.DemandPerformInfoModelList["+ i +"].DemandId"));

			demandPerformInfoModelList.add(demandPerformInfoModel);
		}
		opsDescribeDemandPerformResponse.setDemandPerformInfoModelList(demandPerformInfoModelList);
	 
	 	return opsDescribeDemandPerformResponse;
	}
}
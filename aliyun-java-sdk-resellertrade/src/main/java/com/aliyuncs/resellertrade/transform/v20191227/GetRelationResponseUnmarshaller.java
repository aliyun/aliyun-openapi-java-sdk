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

package com.aliyuncs.resellertrade.transform.v20191227;

import com.aliyuncs.resellertrade.model.v20191227.GetRelationResponse;
import com.aliyuncs.resellertrade.model.v20191227.GetRelationResponse.Data;
import com.aliyuncs.resellertrade.model.v20191227.GetRelationResponse.Data.ResellerProductModeDO;
import com.aliyuncs.resellertrade.model.v20191227.GetRelationResponse.Data.ResellerProductRuleDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRelationResponseUnmarshaller {

	public static GetRelationResponse unmarshall(GetRelationResponse getRelationResponse, UnmarshallerContext _ctx) {
		
		getRelationResponse.setRequestId(_ctx.stringValue("GetRelationResponse.RequestId"));
		getRelationResponse.setCode(_ctx.stringValue("GetRelationResponse.Code"));
		getRelationResponse.setMessage(_ctx.stringValue("GetRelationResponse.Message"));
		getRelationResponse.setSuccess(_ctx.booleanValue("GetRelationResponse.Success"));
		getRelationResponse.set_Class(_ctx.stringValue("GetRelationResponse.Class"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetRelationResponse.Data.Status"));
		data.setEndTime(_ctx.longValue("GetRelationResponse.Data.EndTime"));
		data.setStartTime(_ctx.longValue("GetRelationResponse.Data.StartTime"));
		data.setUserType(_ctx.stringValue("GetRelationResponse.Data.UserType"));
		data.set_Class(_ctx.stringValue("GetRelationResponse.Data.Class"));
		data.setResellerUid(_ctx.longValue("GetRelationResponse.Data.ResellerUid"));
		data.setTopReseller(_ctx.booleanValue("GetRelationResponse.Data.TopReseller"));
		data.setUid(_ctx.longValue("GetRelationResponse.Data.Uid"));
		data.setCanLoginOfficial(_ctx.booleanValue("GetRelationResponse.Data.CanLoginOfficial"));

		ResellerProductModeDO resellerProductModeDO = new ResellerProductModeDO();
		resellerProductModeDO.setProductName(_ctx.stringValue("GetRelationResponse.Data.ResellerProductModeDO.ProductName"));
		resellerProductModeDO.setIsService(_ctx.longValue("GetRelationResponse.Data.ResellerProductModeDO.IsService"));
		resellerProductModeDO.set_Class(_ctx.stringValue("GetRelationResponse.Data.ResellerProductModeDO.Class"));
		resellerProductModeDO.setProductCode(_ctx.stringValue("GetRelationResponse.Data.ResellerProductModeDO.ProductCode"));
		data.setResellerProductModeDO(resellerProductModeDO);

		ResellerProductRuleDO resellerProductRuleDO = new ResellerProductRuleDO();
		resellerProductRuleDO.set_Class(_ctx.stringValue("GetRelationResponse.Data.ResellerProductRuleDO.Class"));
		resellerProductRuleDO.setMultiOrder(_ctx.booleanValue("GetRelationResponse.Data.ResellerProductRuleDO.MultiOrder"));
		resellerProductRuleDO.setCommodityRoute(_ctx.booleanValue("GetRelationResponse.Data.ResellerProductRuleDO.CommodityRoute"));
		resellerProductRuleDO.setPayMode(_ctx.stringValue("GetRelationResponse.Data.ResellerProductRuleDO.PayMode"));
		data.setResellerProductRuleDO(resellerProductRuleDO);
		getRelationResponse.setData(data);
	 
	 	return getRelationResponse;
	}
}
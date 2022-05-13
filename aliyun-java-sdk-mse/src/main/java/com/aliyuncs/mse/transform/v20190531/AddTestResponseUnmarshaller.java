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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.AddTestResponse;
import com.aliyuncs.mse.model.v20190531.AddTestResponse.Data;
import com.aliyuncs.mse.model.v20190531.AddTestResponse.Data.Gateways;
import com.aliyuncs.mse.model.v20190531.AddTestResponse.Data.Gateways.InternetSlbItem;
import com.aliyuncs.mse.model.v20190531.AddTestResponse.Data.Gateways.SlbItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTestResponseUnmarshaller {

	public static AddTestResponse unmarshall(AddTestResponse addTestResponse, UnmarshallerContext _ctx) {
		
		addTestResponse.setRequestId(_ctx.stringValue("AddTestResponse.RequestId"));
		addTestResponse.setHttpStatusCode(_ctx.integerValue("AddTestResponse.HttpStatusCode"));
		addTestResponse.setMessage(_ctx.stringValue("AddTestResponse.Message"));
		addTestResponse.setCode(_ctx.integerValue("AddTestResponse.Code"));
		addTestResponse.setSuccess(_ctx.booleanValue("AddTestResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("AddTestResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("AddTestResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("AddTestResponse.Data.PageSize"));

		List<Gateways> result = new ArrayList<Gateways>();
		for (int i = 0; i < _ctx.lengthValue("AddTestResponse.Data.Result.Length"); i++) {
			Gateways gateways = new Gateways();
			gateways.setId(_ctx.longValue("AddTestResponse.Data.Result["+ i +"].Id"));
			gateways.setName(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Name"));
			gateways.setGatewayUniqueId(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].GatewayUniqueId"));
			gateways.setGatewayType(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].GatewayType"));
			gateways.setRegion(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Region"));
			gateways.setPrimaryUser(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].PrimaryUser"));
			gateways.setStatus(_ctx.integerValue("AddTestResponse.Data.Result["+ i +"].Status"));
			gateways.setAhasOn(_ctx.booleanValue("AddTestResponse.Data.Result["+ i +"].AhasOn"));
			gateways.setArmsOn(_ctx.booleanValue("AddTestResponse.Data.Result["+ i +"].ArmsOn"));
			gateways.setSpec(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Spec"));
			gateways.setReplica(_ctx.integerValue("AddTestResponse.Data.Result["+ i +"].Replica"));
			gateways.setGmtCreate(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].GmtCreate"));
			gateways.setGmtModified(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].GmtModified"));
			gateways.setStatusDesc(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].StatusDesc"));
			gateways.setUpgrade(_ctx.booleanValue("AddTestResponse.Data.Result["+ i +"].Upgrade"));
			gateways.setMustUpgrade(_ctx.booleanValue("AddTestResponse.Data.Result["+ i +"].MustUpgrade"));
			gateways.setCurrentVersion(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].CurrentVersion"));
			gateways.setLatestVersion(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].LatestVersion"));
			gateways.setVswitch2(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Vswitch2"));
			gateways.setInstanceId(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InstanceId"));
			gateways.setChargeType(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].ChargeType"));
			gateways.setEndDate(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].EndDate"));
			gateways.setTag(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Tag"));

			List<SlbItem> slb = new ArrayList<SlbItem>();
			for (int j = 0; j < _ctx.lengthValue("AddTestResponse.Data.Result["+ i +"].Slb.Length"); j++) {
				SlbItem slbItem = new SlbItem();
				slbItem.setSlbIp(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].SlbIp"));
				slbItem.setSlbPort(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].SlbPort"));
				slbItem.setSlbSpec(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].SlbSpec"));
				slbItem.setType(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].Type"));
				slbItem.setGatewaySlbStatus(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].GatewaySlbStatus"));
				slbItem.setStatusDesc(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].StatusDesc"));
				slbItem.setGatewaySlbMode(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].GatewaySlbMode"));
				slbItem.setSlbId(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].Slb["+ j +"].SlbId"));

				slb.add(slbItem);
			}
			gateways.setSlb(slb);

			List<InternetSlbItem> internetSlb = new ArrayList<InternetSlbItem>();
			for (int j = 0; j < _ctx.lengthValue("AddTestResponse.Data.Result["+ i +"].InternetSlb.Length"); j++) {
				InternetSlbItem internetSlbItem = new InternetSlbItem();
				internetSlbItem.setSlbIp(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].SlbIp"));
				internetSlbItem.setSlbPort(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].SlbPort"));
				internetSlbItem.setSlbSpec(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].SlbSpec"));
				internetSlbItem.setType(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].Type"));
				internetSlbItem.setInternetNetworkFlow(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].InternetNetworkFlow"));
				internetSlbItem.setGatewaySlbStatus(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].GatewaySlbStatus"));
				internetSlbItem.setStatusDesc(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].StatusDesc"));
				internetSlbItem.setGatewaySlbMode(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].GatewaySlbMode"));
				internetSlbItem.setSlbId(_ctx.stringValue("AddTestResponse.Data.Result["+ i +"].InternetSlb["+ j +"].SlbId"));

				internetSlb.add(internetSlbItem);
			}
			gateways.setInternetSlb(internetSlb);

			result.add(gateways);
		}
		data.setResult(result);
		addTestResponse.setData(data);
	 
	 	return addTestResponse;
	}
}
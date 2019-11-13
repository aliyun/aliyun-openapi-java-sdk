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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.GetOrderResponse;
import com.aliyuncs.csb.model.v20171118.GetOrderResponse.Data;
import com.aliyuncs.csb.model.v20171118.GetOrderResponse.Data.Order;
import com.aliyuncs.csb.model.v20171118.GetOrderResponse.Data.Order.ErrorTypeCatagory;
import com.aliyuncs.csb.model.v20171118.GetOrderResponse.Data.Order.Service;
import com.aliyuncs.csb.model.v20171118.GetOrderResponse.Data.Order.SlaInfo;
import com.aliyuncs.csb.model.v20171118.GetOrderResponse.Data.Order.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderResponseUnmarshaller {

	public static GetOrderResponse unmarshall(GetOrderResponse getOrderResponse, UnmarshallerContext _ctx) {
		
		getOrderResponse.setRequestId(_ctx.stringValue("GetOrderResponse.RequestId"));
		getOrderResponse.setCode(_ctx.integerValue("GetOrderResponse.Code"));
		getOrderResponse.setMessage(_ctx.stringValue("GetOrderResponse.Message"));

		Data data = new Data();

		Order order = new Order();
		order.setAlias(_ctx.stringValue("GetOrderResponse.Data.Order.Alias"));
		order.setCredentialGroupId(_ctx.longValue("GetOrderResponse.Data.Order.CredentialGroupId"));
		order.setCsbId(_ctx.longValue("GetOrderResponse.Data.Order.CsbId"));
		order.setDauthGroupName(_ctx.stringValue("GetOrderResponse.Data.Order.DauthGroupName"));
		order.setGmtCreate(_ctx.longValue("GetOrderResponse.Data.Order.GmtCreate"));
		order.setGmtModified(_ctx.longValue("GetOrderResponse.Data.Order.GmtModified"));
		order.setGroupName(_ctx.stringValue("GetOrderResponse.Data.Order.GroupName"));
		order.setId(_ctx.longValue("GetOrderResponse.Data.Order.Id"));
		order.setProjectName(_ctx.stringValue("GetOrderResponse.Data.Order.ProjectName"));
		order.setServiceId(_ctx.longValue("GetOrderResponse.Data.Order.ServiceId"));
		order.setServiceName(_ctx.stringValue("GetOrderResponse.Data.Order.ServiceName"));
		order.setServiceStatus(_ctx.integerValue("GetOrderResponse.Data.Order.ServiceStatus"));
		order.setServiceVersion(_ctx.stringValue("GetOrderResponse.Data.Order.ServiceVersion"));
		order.setStatisticName(_ctx.stringValue("GetOrderResponse.Data.Order.StatisticName"));
		order.setStatus(_ctx.integerValue("GetOrderResponse.Data.Order.Status"));
		order.setStrictWhiteListJson(_ctx.stringValue("GetOrderResponse.Data.Order.StrictWhiteListJson"));
		order.setUserId(_ctx.stringValue("GetOrderResponse.Data.Order.UserId"));

		List<String> strictWhiteList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderResponse.Data.Order.StrictWhiteList.Length"); i++) {
			strictWhiteList.add(_ctx.stringValue("GetOrderResponse.Data.Order.StrictWhiteList["+ i +"]"));
		}
		order.setStrictWhiteList(strictWhiteList);

		Service service = new Service();
		service.setAccessParamsJSON(_ctx.stringValue("GetOrderResponse.Data.Order.Service.AccessParamsJSON"));
		service.setActive(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.Active"));
		service.setAlias(_ctx.stringValue("GetOrderResponse.Data.Order.Service.Alias"));
		service.setAllVisiable(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.AllVisiable"));
		service.setConsumeTypesJSON(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ConsumeTypesJSON"));
		service.setCreateTime(_ctx.longValue("GetOrderResponse.Data.Order.Service.CreateTime"));
		service.setCsbId(_ctx.longValue("GetOrderResponse.Data.Order.Service.CsbId"));
		service.setErrDefJSON(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ErrDefJSON"));
		service.setId(_ctx.longValue("GetOrderResponse.Data.Order.Service.Id"));
		service.setInterfaceName(_ctx.stringValue("GetOrderResponse.Data.Order.Service.InterfaceName"));
		service.setOldVersion(_ctx.stringValue("GetOrderResponse.Data.Order.Service.OldVersion"));
		service.setOttFlag(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.OttFlag"));
		service.setOwnerId(_ctx.stringValue("GetOrderResponse.Data.Order.Service.OwnerId"));
		service.setPrincipalName(_ctx.stringValue("GetOrderResponse.Data.Order.Service.PrincipalName"));
		service.setProjectId(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ProjectId"));
		service.setProjectName(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ProjectName"));
		service.setProvideType(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ProvideType"));
		service.setSSL(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.SSL"));
		service.setScope(_ctx.stringValue("GetOrderResponse.Data.Order.Service.Scope"));
		service.setServiceName(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ServiceName"));
		service.setServiceProviderType(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ServiceProviderType"));
		service.setServiceVersion(_ctx.stringValue("GetOrderResponse.Data.Order.Service.ServiceVersion"));
		service.setSkipAuth(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.SkipAuth"));
		service.setStatisticName(_ctx.stringValue("GetOrderResponse.Data.Order.Service.StatisticName"));
		service.setStatus(_ctx.integerValue("GetOrderResponse.Data.Order.Service.Status"));
		service.setUserId(_ctx.longValue("GetOrderResponse.Data.Order.Service.UserId"));
		service.setValidConsumeTypes(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.ValidConsumeTypes"));
		service.setValidProvideType(_ctx.booleanValue("GetOrderResponse.Data.Order.Service.ValidProvideType"));
		order.setService(service);

		SlaInfo slaInfo = new SlaInfo();
		slaInfo.setQph(_ctx.stringValue("GetOrderResponse.Data.Order.SlaInfo.Qph"));
		slaInfo.setQps(_ctx.stringValue("GetOrderResponse.Data.Order.SlaInfo.Qps"));
		order.setSlaInfo(slaInfo);

		Total total = new Total();
		total.setErrorNum(_ctx.integerValue("GetOrderResponse.Data.Order.Total.ErrorNum"));
		total.setTotal(_ctx.integerValue("GetOrderResponse.Data.Order.Total.Total"));
		order.setTotal(total);

		List<ErrorTypeCatagory> errorTypeCatagoryList = new ArrayList<ErrorTypeCatagory>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList.Length"); i++) {
			ErrorTypeCatagory errorTypeCatagory = new ErrorTypeCatagory();
			errorTypeCatagory.setTotal(_ctx.integerValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList["+ i +"].Total"));
			errorTypeCatagory.setErrorNum(_ctx.integerValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList["+ i +"].ErrorNum"));
			errorTypeCatagory.setName(_ctx.stringValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList["+ i +"].Name"));

			errorTypeCatagoryList.add(errorTypeCatagory);
		}
		order.setErrorTypeCatagoryList(errorTypeCatagoryList);
		data.setOrder(order);
		getOrderResponse.setData(data);
	 
	 	return getOrderResponse;
	}
}
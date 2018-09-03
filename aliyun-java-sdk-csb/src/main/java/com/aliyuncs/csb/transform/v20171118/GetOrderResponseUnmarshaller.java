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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderResponseUnmarshaller {

	public static GetOrderResponse unmarshall(GetOrderResponse getOrderResponse, UnmarshallerContext context) {
		
		getOrderResponse.setRequestId(context.stringValue("GetOrderResponse.RequestId"));
		getOrderResponse.setCode(context.integerValue("GetOrderResponse.Code"));
		getOrderResponse.setMessage(context.stringValue("GetOrderResponse.Message"));

		Data data = new Data();

		Order order = new Order();
		order.setAlias(context.stringValue("GetOrderResponse.Data.Order.Alias"));
		order.setCredentialGroupId(context.longValue("GetOrderResponse.Data.Order.CredentialGroupId"));
		order.setCsbId(context.longValue("GetOrderResponse.Data.Order.CsbId"));
		order.setDauthGroupName(context.stringValue("GetOrderResponse.Data.Order.DauthGroupName"));
		order.setGmtCreate(context.longValue("GetOrderResponse.Data.Order.GmtCreate"));
		order.setGmtModified(context.longValue("GetOrderResponse.Data.Order.GmtModified"));
		order.setGroupName(context.stringValue("GetOrderResponse.Data.Order.GroupName"));
		order.setId(context.longValue("GetOrderResponse.Data.Order.Id"));
		order.setProjectName(context.stringValue("GetOrderResponse.Data.Order.ProjectName"));
		order.setServiceId(context.longValue("GetOrderResponse.Data.Order.ServiceId"));
		order.setServiceName(context.stringValue("GetOrderResponse.Data.Order.ServiceName"));
		order.setServiceStatus(context.integerValue("GetOrderResponse.Data.Order.ServiceStatus"));
		order.setServiceVersion(context.stringValue("GetOrderResponse.Data.Order.ServiceVersion"));
		order.setStatisticName(context.stringValue("GetOrderResponse.Data.Order.StatisticName"));
		order.setStatus(context.integerValue("GetOrderResponse.Data.Order.Status"));
		order.setStrictWhiteListJson(context.stringValue("GetOrderResponse.Data.Order.StrictWhiteListJson"));
		order.setUserId(context.stringValue("GetOrderResponse.Data.Order.UserId"));

		List<String> strictWhiteList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetOrderResponse.Data.Order.StrictWhiteList.Length"); i++) {
			strictWhiteList.add(context.stringValue("GetOrderResponse.Data.Order.StrictWhiteList["+ i +"]"));
		}
		order.setStrictWhiteList(strictWhiteList);

		Service service = new Service();
		service.setAccessParamsJSON(context.stringValue("GetOrderResponse.Data.Order.Service.AccessParamsJSON"));
		service.setActive(context.booleanValue("GetOrderResponse.Data.Order.Service.Active"));
		service.setAlias(context.stringValue("GetOrderResponse.Data.Order.Service.Alias"));
		service.setAllVisiable(context.booleanValue("GetOrderResponse.Data.Order.Service.AllVisiable"));
		service.setConsumeTypesJSON(context.stringValue("GetOrderResponse.Data.Order.Service.ConsumeTypesJSON"));
		service.setCreateTime(context.longValue("GetOrderResponse.Data.Order.Service.CreateTime"));
		service.setCsbId(context.longValue("GetOrderResponse.Data.Order.Service.CsbId"));
		service.setErrDefJSON(context.stringValue("GetOrderResponse.Data.Order.Service.ErrDefJSON"));
		service.setId(context.longValue("GetOrderResponse.Data.Order.Service.Id"));
		service.setInterfaceName(context.stringValue("GetOrderResponse.Data.Order.Service.InterfaceName"));
		service.setOldVersion(context.stringValue("GetOrderResponse.Data.Order.Service.OldVersion"));
		service.setOttFlag(context.booleanValue("GetOrderResponse.Data.Order.Service.OttFlag"));
		service.setOwnerId(context.stringValue("GetOrderResponse.Data.Order.Service.OwnerId"));
		service.setPrincipalName(context.stringValue("GetOrderResponse.Data.Order.Service.PrincipalName"));
		service.setProjectId(context.stringValue("GetOrderResponse.Data.Order.Service.ProjectId"));
		service.setProjectName(context.stringValue("GetOrderResponse.Data.Order.Service.ProjectName"));
		service.setProvideType(context.stringValue("GetOrderResponse.Data.Order.Service.ProvideType"));
		service.setSSL(context.booleanValue("GetOrderResponse.Data.Order.Service.SSL"));
		service.setScope(context.stringValue("GetOrderResponse.Data.Order.Service.Scope"));
		service.setServiceName(context.stringValue("GetOrderResponse.Data.Order.Service.ServiceName"));
		service.setServiceProviderType(context.stringValue("GetOrderResponse.Data.Order.Service.ServiceProviderType"));
		service.setServiceVersion(context.stringValue("GetOrderResponse.Data.Order.Service.ServiceVersion"));
		service.setSkipAuth(context.booleanValue("GetOrderResponse.Data.Order.Service.SkipAuth"));
		service.setStatisticName(context.stringValue("GetOrderResponse.Data.Order.Service.StatisticName"));
		service.setStatus(context.integerValue("GetOrderResponse.Data.Order.Service.Status"));
		service.setUserId(context.longValue("GetOrderResponse.Data.Order.Service.UserId"));
		service.setValidConsumeTypes(context.booleanValue("GetOrderResponse.Data.Order.Service.ValidConsumeTypes"));
		service.setValidProvideType(context.booleanValue("GetOrderResponse.Data.Order.Service.ValidProvideType"));
		order.setService(service);

		SlaInfo slaInfo = new SlaInfo();
		slaInfo.setQph(context.stringValue("GetOrderResponse.Data.Order.SlaInfo.Qph"));
		slaInfo.setQps(context.stringValue("GetOrderResponse.Data.Order.SlaInfo.Qps"));
		order.setSlaInfo(slaInfo);

		Total total = new Total();
		total.setErrorNum(context.integerValue("GetOrderResponse.Data.Order.Total.ErrorNum"));
		total.setTotal(context.integerValue("GetOrderResponse.Data.Order.Total.Total"));
		order.setTotal(total);

		List<ErrorTypeCatagory> errorTypeCatagoryList = new ArrayList<ErrorTypeCatagory>();
		for (int i = 0; i < context.lengthValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList.Length"); i++) {
			ErrorTypeCatagory errorTypeCatagory = new ErrorTypeCatagory();
			errorTypeCatagory.setTotal(context.integerValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList["+ i +"].Total"));
			errorTypeCatagory.setErrorNum(context.integerValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList["+ i +"].ErrorNum"));
			errorTypeCatagory.setName(context.stringValue("GetOrderResponse.Data.Order.ErrorTypeCatagoryList["+ i +"].Name"));

			errorTypeCatagoryList.add(errorTypeCatagory);
		}
		order.setErrorTypeCatagoryList(errorTypeCatagoryList);
		data.setOrder(order);
		getOrderResponse.setData(data);
	 
	 	return getOrderResponse;
	}
}
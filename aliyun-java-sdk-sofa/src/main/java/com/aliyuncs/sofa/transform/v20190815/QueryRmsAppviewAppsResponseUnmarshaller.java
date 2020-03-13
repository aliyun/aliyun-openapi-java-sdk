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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem.AppDomainsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem.DataByResourceTypeItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem.DataByResourceTypeItem.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem.ItemTypeAlertingItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem.ItemTypeConfiguredItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAppviewAppsResponse.Response.ResultItem.ResourceIdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAppviewAppsResponseUnmarshaller {

	public static QueryRmsAppviewAppsResponse unmarshall(QueryRmsAppviewAppsResponse queryRmsAppviewAppsResponse, UnmarshallerContext _ctx) {
		
		queryRmsAppviewAppsResponse.setRequestId(_ctx.stringValue("QueryRmsAppviewAppsResponse.RequestId"));
		queryRmsAppviewAppsResponse.setResultCode(_ctx.stringValue("QueryRmsAppviewAppsResponse.ResultCode"));
		queryRmsAppviewAppsResponse.setResultMessage(_ctx.stringValue("QueryRmsAppviewAppsResponse.ResultMessage"));

		Response response = new Response();
		response.setCurrentPage(_ctx.longValue("QueryRmsAppviewAppsResponse.Response.CurrentPage"));
		response.setPageSize(_ctx.longValue("QueryRmsAppviewAppsResponse.Response.PageSize"));
		response.setTotalSize(_ctx.longValue("QueryRmsAppviewAppsResponse.Response.TotalSize"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppId(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].AppId"));
			resultItem.setAppName(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].AppName"));
			resultItem.setLevelId(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].LevelId"));
			resultItem.setLevelName(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].LevelName"));
			resultItem.setOwnerId(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].OwnerId"));
			resultItem.setOwnerName(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].OwnerName"));
			resultItem.setStackId(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].StackId"));
			resultItem.setStackName(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].StackName"));

			List<AppDomainsItem> appDomains = new ArrayList<AppDomainsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].AppDomains.Length"); j++) {
				AppDomainsItem appDomainsItem = new AppDomainsItem();
				appDomainsItem.setId(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].AppDomains["+ j +"].Id"));
				appDomainsItem.setName(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].AppDomains["+ j +"].Name"));

				appDomains.add(appDomainsItem);
			}
			resultItem.setAppDomains(appDomains);

			List<DataByResourceTypeItem> dataByResourceType = new ArrayList<DataByResourceTypeItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType.Length"); j++) {
				DataByResourceTypeItem dataByResourceTypeItem = new DataByResourceTypeItem();
				dataByResourceTypeItem.setResourceAlertCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].ResourceAlertCount"));
				dataByResourceTypeItem.setResourceAllCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].ResourceAllCount"));
				dataByResourceTypeItem.setResourceNormalCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].ResourceNormalCount"));
				dataByResourceTypeItem.setResourceType(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].ResourceType"));
				dataByResourceTypeItem.setResourceUnconfigedCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].ResourceUnconfigedCount"));

				List<String> alertResourceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].AlertResourceIds.Length"); k++) {
					alertResourceIds.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].AlertResourceIds["+ k +"]"));
				}
				dataByResourceTypeItem.setAlertResourceIds(alertResourceIds);

				List<String> allResourceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].AllResourceIds.Length"); k++) {
					allResourceIds.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].AllResourceIds["+ k +"]"));
				}
				dataByResourceTypeItem.setAllResourceIds(allResourceIds);

				List<String> monitorPorts = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].MonitorPorts.Length"); k++) {
					monitorPorts.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].MonitorPorts["+ k +"]"));
				}
				dataByResourceTypeItem.setMonitorPorts(monitorPorts);

				List<String> normalResourceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].NormalResourceIds.Length"); k++) {
					normalResourceIds.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].NormalResourceIds["+ k +"]"));
				}
				dataByResourceTypeItem.setNormalResourceIds(normalResourceIds);

				List<String> unconfigedResourceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].UnconfigedResourceIds.Length"); k++) {
					unconfigedResourceIds.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].UnconfigedResourceIds["+ k +"]"));
				}
				dataByResourceTypeItem.setUnconfigedResourceIds(unconfigedResourceIds);

				Data data = new Data();
				data.setAppId(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.AppId"));
				data.setAppName(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.AppName"));
				data.setMonitorEnable(_ctx.booleanValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.MonitorEnable"));
				data.setMonitorPort(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.MonitorPort"));
				data.setNormalResourceIds(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.NormalResourceIds"));
				data.setResourcesAlertCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourcesAlertCount"));
				data.setResourcesCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourcesCount"));
				data.setResourcesNormalCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourcesNormalCount"));
				data.setResourcesUnconfigedCount(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourcesUnconfigedCount"));
				data.setResourceType(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourceType"));

				List<String> alertResourceIds1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.AlertResourceIds.Length"); k++) {
					alertResourceIds1.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.AlertResourceIds["+ k +"]"));
				}
				data.setAlertResourceIds1(alertResourceIds1);

				List<String> itemTypeConfig = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ItemTypeConfig.Length"); k++) {
					itemTypeConfig.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ItemTypeConfig["+ k +"]"));
				}
				data.setItemTypeConfig(itemTypeConfig);

				List<String> itemTypeNoneConfig = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ItemTypeNoneConfig.Length"); k++) {
					itemTypeNoneConfig.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ItemTypeNoneConfig["+ k +"]"));
				}
				data.setItemTypeNoneConfig(itemTypeNoneConfig);

				List<String> itemTypePartialConfig = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ItemTypePartialConfig.Length"); k++) {
					itemTypePartialConfig.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ItemTypePartialConfig["+ k +"]"));
				}
				data.setItemTypePartialConfig(itemTypePartialConfig);

				List<String> resourceIds2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourceIds.Length"); k++) {
					resourceIds2.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.ResourceIds["+ k +"]"));
				}
				data.setResourceIds2(resourceIds2);

				List<String> unconfigedResourceIds3 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.UnconfigedResourceIds.Length"); k++) {
					unconfigedResourceIds3.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].DataByResourceType["+ j +"].Data.UnconfigedResourceIds["+ k +"]"));
				}
				data.setUnconfigedResourceIds3(unconfigedResourceIds3);
				dataByResourceTypeItem.setData(data);

				dataByResourceType.add(dataByResourceTypeItem);
			}
			resultItem.setDataByResourceType(dataByResourceType);

			List<ItemTypeAlertingItem> itemTypeAlerting = new ArrayList<ItemTypeAlertingItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeAlerting.Length"); j++) {
				ItemTypeAlertingItem itemTypeAlertingItem = new ItemTypeAlertingItem();
				itemTypeAlertingItem.setKey(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeAlerting["+ j +"].Key"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeAlerting["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeAlerting["+ j +"].Values["+ k +"]"));
				}
				itemTypeAlertingItem.setValues(values);

				itemTypeAlerting.add(itemTypeAlertingItem);
			}
			resultItem.setItemTypeAlerting(itemTypeAlerting);

			List<ItemTypeConfiguredItem> itemTypeConfigured = new ArrayList<ItemTypeConfiguredItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeConfigured.Length"); j++) {
				ItemTypeConfiguredItem itemTypeConfiguredItem = new ItemTypeConfiguredItem();
				itemTypeConfiguredItem.setKey(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeConfigured["+ j +"].Key"));

				List<String> values4 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeConfigured["+ j +"].Values.Length"); k++) {
					values4.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ItemTypeConfigured["+ j +"].Values["+ k +"]"));
				}
				itemTypeConfiguredItem.setValues4(values4);

				itemTypeConfigured.add(itemTypeConfiguredItem);
			}
			resultItem.setItemTypeConfigured(itemTypeConfigured);

			List<ResourceIdsItem> resourceIds = new ArrayList<ResourceIdsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ResourceIds.Length"); j++) {
				ResourceIdsItem resourceIdsItem = new ResourceIdsItem();
				resourceIdsItem.setKey(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ResourceIds["+ j +"].Key"));

				List<String> values5 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ResourceIds["+ j +"].Values.Length"); k++) {
					values5.add(_ctx.stringValue("QueryRmsAppviewAppsResponse.Response.Result["+ i +"].ResourceIds["+ j +"].Values["+ k +"]"));
				}
				resourceIdsItem.setValues5(values5);

				resourceIds.add(resourceIdsItem);
			}
			resultItem.setResourceIds(resourceIds);

			result.add(resultItem);
		}
		response.setResult(result);
		queryRmsAppviewAppsResponse.setResponse(response);
	 
	 	return queryRmsAppviewAppsResponse;
	}
}
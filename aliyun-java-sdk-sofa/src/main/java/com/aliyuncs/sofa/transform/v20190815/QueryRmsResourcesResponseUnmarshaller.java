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

import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.AlertRuleConfigurationStatusVo;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.AlertRuleInfoVo;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.ListenerConfigsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.ListenerConfigsItem.AlertRuleInfoVo1;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.ListenerConfigsItem.Listener;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.ListenersItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.ListenersItem.CellsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourcesResponse.Response.DataItem.ListenersItem.OptionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsResourcesResponseUnmarshaller {

	public static QueryRmsResourcesResponse unmarshall(QueryRmsResourcesResponse queryRmsResourcesResponse, UnmarshallerContext _ctx) {
		
		queryRmsResourcesResponse.setRequestId(_ctx.stringValue("QueryRmsResourcesResponse.RequestId"));
		queryRmsResourcesResponse.setResultCode(_ctx.stringValue("QueryRmsResourcesResponse.ResultCode"));
		queryRmsResourcesResponse.setResultMessage(_ctx.stringValue("QueryRmsResourcesResponse.ResultMessage"));

		Response response = new Response();
		response.setCurrentPage(_ctx.longValue("QueryRmsResourcesResponse.Response.CurrentPage"));
		response.setPageSize(_ctx.longValue("QueryRmsResourcesResponse.Response.PageSize"));
		response.setTotalSize(_ctx.stringValue("QueryRmsResourcesResponse.Response.TotalSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCapacity(_ctx.longValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Capacity"));
			dataItem.setContainerId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ContainerId"));
			dataItem.setCreatedDateTime(_ctx.longValue("QueryRmsResourcesResponse.Response.Data["+ i +"].CreatedDateTime"));
			dataItem.setDatabaseType(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].DatabaseType"));
			dataItem.setDataAccessLevel(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].DataAccessLevel"));
			dataItem.setHostIp(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].HostIp"));
			dataItem.setIaasId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].IaasId"));
			dataItem.setIdcName(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].IdcName"));
			dataItem.setInstanceType(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].InstanceType"));
			dataItem.setIp(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Ip"));
			dataItem.setPrivateIp(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].PrivateIp"));
			dataItem.setPublicIp(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].PublicIp"));
			dataItem.setResourceId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ResourceId"));
			dataItem.setResourceName(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ResourceName"));
			dataItem.setStatus(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Status"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].WorkspaceId"));

			List<String> vipAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].VipAddress.Length"); j++) {
				vipAddress.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].VipAddress["+ j +"]"));
			}
			dataItem.setVipAddress(vipAddress);

			AlertRuleConfigurationStatusVo alertRuleConfigurationStatusVo = new AlertRuleConfigurationStatusVo();

			List<String> itemTypeAlerting2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleConfigurationStatusVo.ItemTypeAlerting.Length"); j++) {
				itemTypeAlerting2.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleConfigurationStatusVo.ItemTypeAlerting["+ j +"]"));
			}
			alertRuleConfigurationStatusVo.setItemTypeAlerting2(itemTypeAlerting2);

			List<String> itemTypeConfigured = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleConfigurationStatusVo.ItemTypeConfigured.Length"); j++) {
				itemTypeConfigured.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleConfigurationStatusVo.ItemTypeConfigured["+ j +"]"));
			}
			alertRuleConfigurationStatusVo.setItemTypeConfigured(itemTypeConfigured);

			List<String> itemTypeNotConfigured = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleConfigurationStatusVo.ItemTypeNotConfigured.Length"); j++) {
				itemTypeNotConfigured.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleConfigurationStatusVo.ItemTypeNotConfigured["+ j +"]"));
			}
			alertRuleConfigurationStatusVo.setItemTypeNotConfigured(itemTypeNotConfigured);
			dataItem.setAlertRuleConfigurationStatusVo(alertRuleConfigurationStatusVo);

			AlertRuleInfoVo alertRuleInfoVo = new AlertRuleInfoVo();
			alertRuleInfoVo.setAlertState(_ctx.booleanValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.AlertState"));

			List<String> itemTypeAlerting3 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.ItemTypeAlerting.Length"); j++) {
				itemTypeAlerting3.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.ItemTypeAlerting["+ j +"]"));
			}
			alertRuleInfoVo.setItemTypeAlerting3(itemTypeAlerting3);

			List<String> itemTypeConfig4 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.ItemTypeConfig.Length"); j++) {
				itemTypeConfig4.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.ItemTypeConfig["+ j +"]"));
			}
			alertRuleInfoVo.setItemTypeConfig4(itemTypeConfig4);

			List<String> itemTypeNoneConfig5 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.ItemTypeNoneConfig.Length"); j++) {
				itemTypeNoneConfig5.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].AlertRuleInfoVo.ItemTypeNoneConfig["+ j +"]"));
			}
			alertRuleInfoVo.setItemTypeNoneConfig5(itemTypeNoneConfig5);
			dataItem.setAlertRuleInfoVo(alertRuleInfoVo);

			List<ListenersItem> listeners = new ArrayList<ListenersItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners.Length"); j++) {
				ListenersItem listenersItem = new ListenersItem();
				listenersItem.setBackendServerPort(_ctx.longValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].BackendServerPort"));
				listenersItem.setIaasId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].IaasId"));
				listenersItem.setIdcId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].IdcId"));
				listenersItem.setIdcName(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].IdcName"));
				listenersItem.setIp(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Ip"));
				listenersItem.setListenerPort(_ctx.longValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].ListenerPort"));
				listenersItem.setMasterId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].MasterId"));
				listenersItem.setPaasId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].PaasId"));
				listenersItem.setPort(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Port"));
				listenersItem.setProviderId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].ProviderId"));
				listenersItem.setRegionId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].RegionId"));
				listenersItem.setResourceId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].ResourceId"));
				listenersItem.setResourceName(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].ResourceName"));
				listenersItem.setResourceType(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].ResourceType"));
				listenersItem.setSn(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Sn"));
				listenersItem.setStatus(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Status"));
				listenersItem.setTenantId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].TenantId"));
				listenersItem.setUtcCreated(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].UtcCreated"));
				listenersItem.setVersion(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Version"));
				listenersItem.setWorkspaceId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].WorkspaceId"));
				listenersItem.setZoneId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].ZoneId"));

				List<String> appServiceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].AppServiceIds.Length"); k++) {
					appServiceIds.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].AppServiceIds["+ k +"]"));
				}
				listenersItem.setAppServiceIds(appServiceIds);

				List<String> assignedAppIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].AssignedAppIds.Length"); k++) {
					assignedAppIds.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].AssignedAppIds["+ k +"]"));
				}
				listenersItem.setAssignedAppIds(assignedAppIds);

				List<CellsItem> cells = new ArrayList<CellsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Cells.Length"); k++) {
					CellsItem cellsItem = new CellsItem();
					cellsItem.setCellId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Cells["+ k +"].CellId"));
					cellsItem.setCellName(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Cells["+ k +"].CellName"));

					cells.add(cellsItem);
				}
				listenersItem.setCells(cells);

				List<OptionsItem> options = new ArrayList<OptionsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Options.Length"); k++) {
					OptionsItem optionsItem = new OptionsItem();
					optionsItem.setKey(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Options["+ k +"].Key"));
					optionsItem.setValue(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].Listeners["+ j +"].Options["+ k +"].Value"));

					options.add(optionsItem);
				}
				listenersItem.setOptions(options);

				listeners.add(listenersItem);
			}
			dataItem.setListeners(listeners);

			List<ListenerConfigsItem> listenerConfigs = new ArrayList<ListenerConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs.Length"); j++) {
				ListenerConfigsItem listenerConfigsItem = new ListenerConfigsItem();

				AlertRuleInfoVo1 alertRuleInfoVo1 = new AlertRuleInfoVo1();
				alertRuleInfoVo1.setAlertState(_ctx.booleanValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.AlertState"));

				List<String> itemTypeAlerting = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.ItemTypeAlerting.Length"); k++) {
					itemTypeAlerting.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.ItemTypeAlerting["+ k +"]"));
				}
				alertRuleInfoVo1.setItemTypeAlerting(itemTypeAlerting);

				List<String> itemTypeConfig = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.ItemTypeConfig.Length"); k++) {
					itemTypeConfig.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.ItemTypeConfig["+ k +"]"));
				}
				alertRuleInfoVo1.setItemTypeConfig(itemTypeConfig);

				List<String> itemTypeNoneConfig = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.ItemTypeNoneConfig.Length"); k++) {
					itemTypeNoneConfig.add(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].AlertRuleInfoVo.ItemTypeNoneConfig["+ k +"]"));
				}
				alertRuleInfoVo1.setItemTypeNoneConfig(itemTypeNoneConfig);
				listenerConfigsItem.setAlertRuleInfoVo1(alertRuleInfoVo1);

				Listener listener = new Listener();
				listener.setId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].Listener.Id"));
				listener.setLoadBalancerId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].Listener.LoadBalancerId"));
				listener.setPort(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].Listener.Port"));
				listener.setTenantId(_ctx.stringValue("QueryRmsResourcesResponse.Response.Data["+ i +"].ListenerConfigs["+ j +"].Listener.TenantId"));
				listenerConfigsItem.setListener(listener);

				listenerConfigs.add(listenerConfigsItem);
			}
			dataItem.setListenerConfigs(listenerConfigs);

			data.add(dataItem);
		}
		response.setData(data);
		queryRmsResourcesResponse.setResponse(response);
	 
	 	return queryRmsResourcesResponse;
	}
}
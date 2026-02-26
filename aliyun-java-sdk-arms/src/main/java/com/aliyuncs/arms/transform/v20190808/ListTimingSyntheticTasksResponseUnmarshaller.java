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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item.CommonSetting;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item.CommonSetting.CustomHost;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item.CommonSetting.CustomHost.Host;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item.CommonSetting.CustomPrometheusSetting;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item.CommonSetting.CustomVPCSetting;
import com.aliyuncs.arms.model.v20190808.ListTimingSyntheticTasksResponse.Data.Item.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTimingSyntheticTasksResponseUnmarshaller {

	public static ListTimingSyntheticTasksResponse unmarshall(ListTimingSyntheticTasksResponse listTimingSyntheticTasksResponse, UnmarshallerContext _ctx) {
		
		listTimingSyntheticTasksResponse.setRequestId(_ctx.stringValue("ListTimingSyntheticTasksResponse.RequestId"));
		listTimingSyntheticTasksResponse.setCode(_ctx.longValue("ListTimingSyntheticTasksResponse.Code"));
		listTimingSyntheticTasksResponse.setMessage(_ctx.stringValue("ListTimingSyntheticTasksResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Total"));
		data.setPage(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListTimingSyntheticTasksResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setTaskId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].TaskId"));
			item.setRegionId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].RegionId"));
			item.setName(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Name"));
			item.setTaskType(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].TaskType"));
			item.setUrl(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Url"));
			item.setMonitorCategory(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].MonitorCategory"));
			item.setFrequency(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Frequency"));
			item.setMonitorNum(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].MonitorNum"));
			item.setStatus(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Status"));
			item.setGmtCreate(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].GmtModified"));
			item.setResourceGroupId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].ResourceGroupId"));

			CommonSetting commonSetting = new CommonSetting();
			commonSetting.setIpType(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.IpType"));
			commonSetting.setMonitorSamples(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.MonitorSamples"));
			commonSetting.setIsOpenTrace(_ctx.booleanValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.IsOpenTrace"));
			commonSetting.setTraceClientType(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.TraceClientType"));
			commonSetting.setXtraceRegion(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.XtraceRegion"));

			CustomHost customHost = new CustomHost();
			customHost.setSelectType(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomHost.SelectType"));

			List<Host> hosts = new ArrayList<Host>();
			for (int j = 0; j < _ctx.lengthValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomHost.Hosts.Length"); j++) {
				Host host = new Host();
				host.setDomain(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomHost.Hosts["+ j +"].Domain"));
				host.setIpType(_ctx.integerValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomHost.Hosts["+ j +"].IpType"));

				List<String> ips = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomHost.Hosts["+ j +"].Ips.Length"); k++) {
					ips.add(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomHost.Hosts["+ j +"].Ips["+ k +"]"));
				}
				host.setIps(ips);

				hosts.add(host);
			}
			customHost.setHosts(hosts);
			commonSetting.setCustomHost(customHost);

			CustomVPCSetting customVPCSetting = new CustomVPCSetting();
			customVPCSetting.setRegionId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomVPCSetting.RegionId"));
			customVPCSetting.setVpcId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomVPCSetting.VpcId"));
			customVPCSetting.setVSwitchId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomVPCSetting.VSwitchId"));
			customVPCSetting.setSecureGroupId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomVPCSetting.SecureGroupId"));
			commonSetting.setCustomVPCSetting(customVPCSetting);

			CustomPrometheusSetting customPrometheusSetting = new CustomPrometheusSetting();
			customPrometheusSetting.setPrometheusLabels(_ctx.mapValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomPrometheusSetting.PrometheusLabels"));
			customPrometheusSetting.setPrometheusClusterId(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomPrometheusSetting.PrometheusClusterId"));
			customPrometheusSetting.setPrometheusClusterRegion(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].CommonSetting.CustomPrometheusSetting.PrometheusClusterRegion"));
			commonSetting.setCustomPrometheusSetting(customPrometheusSetting);
			item.setCommonSetting(commonSetting);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListTimingSyntheticTasksResponse.Data.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			item.setTags(tags);

			items.add(item);
		}
		data.setItems(items);
		listTimingSyntheticTasksResponse.setData(data);
	 
	 	return listTimingSyntheticTasksResponse;
	}
}
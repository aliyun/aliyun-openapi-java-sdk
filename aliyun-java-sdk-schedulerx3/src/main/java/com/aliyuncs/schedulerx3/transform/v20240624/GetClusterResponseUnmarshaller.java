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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.GetClusterResponse;
import com.aliyuncs.schedulerx3.model.v20240624.GetClusterResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.GetClusterResponse.Data.VswitchesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterResponseUnmarshaller {

	public static GetClusterResponse unmarshall(GetClusterResponse getClusterResponse, UnmarshallerContext _ctx) {
		
		getClusterResponse.setRequestId(_ctx.stringValue("GetClusterResponse.RequestId"));
		getClusterResponse.setCode(_ctx.integerValue("GetClusterResponse.Code"));
		getClusterResponse.setMessage(_ctx.stringValue("GetClusterResponse.Message"));
		getClusterResponse.setSuccess(_ctx.booleanValue("GetClusterResponse.Success"));

		Data data = new Data();
		data.setClusterId(_ctx.stringValue("GetClusterResponse.Data.ClusterId"));
		data.setClusterName(_ctx.stringValue("GetClusterResponse.Data.ClusterName"));
		data.setClusterSpec(_ctx.stringValue("GetClusterResponse.Data.ClusterSpec"));
		data.setProductType(_ctx.integerValue("GetClusterResponse.Data.ProductType"));
		data.setEngineType(_ctx.stringValue("GetClusterResponse.Data.EngineType"));
		data.setEngineVersion(_ctx.stringValue("GetClusterResponse.Data.EngineVersion"));
		data.setStatus(_ctx.integerValue("GetClusterResponse.Data.Status"));
		data.setCreateTime(_ctx.stringValue("GetClusterResponse.Data.CreateTime"));
		data.setEndTime(_ctx.stringValue("GetClusterResponse.Data.EndTime"));
		data.setIntranetDomain(_ctx.stringValue("GetClusterResponse.Data.IntranetDomain"));
		data.setInternetDomain(_ctx.stringValue("GetClusterResponse.Data.InternetDomain"));
		data.setChargeType(_ctx.stringValue("GetClusterResponse.Data.ChargeType"));
		data.setKubeConfig(_ctx.stringValue("GetClusterResponse.Data.KubeConfig"));
		data.setJobNum(_ctx.integerValue("GetClusterResponse.Data.JobNum"));
		data.setWorkerNum(_ctx.integerValue("GetClusterResponse.Data.WorkerNum"));
		data.setVpcId(_ctx.stringValue("GetClusterResponse.Data.VpcId"));
		data.setMaxJobNum(_ctx.integerValue("GetClusterResponse.Data.MaxJobNum"));
		data.setSpm(_ctx.integerValue("GetClusterResponse.Data.Spm"));

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterResponse.Data.Zones.Length"); i++) {
			zones.add(_ctx.stringValue("GetClusterResponse.Data.Zones["+ i +"]"));
		}
		data.setZones(zones);

		List<VswitchesItem> vSwitches = new ArrayList<VswitchesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterResponse.Data.VSwitches.Length"); i++) {
			VswitchesItem vswitchesItem = new VswitchesItem();
			vswitchesItem.setZoneId(_ctx.stringValue("GetClusterResponse.Data.VSwitches["+ i +"].ZoneId"));
			vswitchesItem.setVSwitchId(_ctx.stringValue("GetClusterResponse.Data.VSwitches["+ i +"].VSwitchId"));

			vSwitches.add(vswitchesItem);
		}
		data.setVSwitches(vSwitches);
		getClusterResponse.setData(data);
	 
	 	return getClusterResponse;
	}
}
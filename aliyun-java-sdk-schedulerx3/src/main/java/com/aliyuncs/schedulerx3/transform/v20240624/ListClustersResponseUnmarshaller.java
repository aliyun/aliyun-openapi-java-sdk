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

import com.aliyuncs.schedulerx3.model.v20240624.ListClustersResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListClustersResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.ListClustersResponse.Data.Record;
import com.aliyuncs.schedulerx3.model.v20240624.ListClustersResponse.Data.Record.VswitchesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext _ctx) {
		
		listClustersResponse.setRequestId(_ctx.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setCode(_ctx.integerValue("ListClustersResponse.Code"));
		listClustersResponse.setMessage(_ctx.stringValue("ListClustersResponse.Message"));
		listClustersResponse.setSuccess(_ctx.booleanValue("ListClustersResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListClustersResponse.Data.Total"));
		data.setPageNumber(_ctx.integerValue("ListClustersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListClustersResponse.Data.PageSize"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setClusterId(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].ClusterId"));
			record.setClusterName(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].ClusterName"));
			record.setClusterSpec(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].ClusterSpec"));
			record.setProductType(_ctx.integerValue("ListClustersResponse.Data.Records["+ i +"].ProductType"));
			record.setEngineType(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].EngineType"));
			record.setEngineVersion(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].EngineVersion"));
			record.setStatus(_ctx.integerValue("ListClustersResponse.Data.Records["+ i +"].Status"));
			record.setCreateTime(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].CreateTime"));
			record.setEndTime(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].EndTime"));
			record.setIntranetDomain(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].IntranetDomain"));
			record.setInternetDomain(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].InternetDomain"));
			record.setChargeType(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].ChargeType"));
			record.setVpcId(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].VpcId"));
			record.setSpInstanceId(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].SpInstanceId"));

			List<VswitchesItem> vSwitches = new ArrayList<VswitchesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClustersResponse.Data.Records["+ i +"].VSwitches.Length"); j++) {
				VswitchesItem vswitchesItem = new VswitchesItem();
				vswitchesItem.setZoneId(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].VSwitches["+ j +"].ZoneId"));
				vswitchesItem.setVSwitchId(_ctx.stringValue("ListClustersResponse.Data.Records["+ i +"].VSwitches["+ j +"].VSwitchId"));

				vSwitches.add(vswitchesItem);
			}
			record.setVSwitches(vSwitches);

			records.add(record);
		}
		data.setRecords(records);
		listClustersResponse.setData(data);
	 
	 	return listClustersResponse;
	}
}
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

package com.aliyuncs.ddosdiversion.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddosdiversion.model.v20230701.ListInstanceResponse;
import com.aliyuncs.ddosdiversion.model.v20230701.ListInstanceResponse.DataItem;
import com.aliyuncs.ddosdiversion.model.v20230701.ListInstanceResponse.DataItem.Data;
import com.aliyuncs.ddosdiversion.model.v20230701.ListInstanceResponse.DataItem.Data.Spec;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext _ctx) {
		
		listInstanceResponse.setRequestId(_ctx.stringValue("ListInstanceResponse.RequestId"));
		listInstanceResponse.setCode(_ctx.longValue("ListInstanceResponse.Code"));
		listInstanceResponse.setMessage(_ctx.stringValue("ListInstanceResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTotal(_ctx.longValue("ListInstanceResponse.Data["+ i +"].Total"));
			dataItem.setPage(_ctx.longValue("ListInstanceResponse.Data["+ i +"].Page"));
			dataItem.setNum(_ctx.longValue("ListInstanceResponse.Data["+ i +"].Num"));

			List<Data> instances = new ArrayList<Data>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Data["+ i +"].Instances.Length"); j++) {
				Data data2 = new Data();
				data2.setUserId(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].UserId"));
				data2.setSaleId(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].SaleId"));
				data2.setInstanceId(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].InstanceId"));
				data2.setName(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Name"));
				data2.setStatus(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Status"));
				data2.setComment(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Comment"));
				data2.setMessage(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Message"));
				data2.setGmtExpire(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].GmtExpire"));
				data2.setGmtCreate(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].GmtCreate"));
				data2.setGmtModify(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].GmtModify"));

				Spec spec = new Spec();
				spec.setIdcNumbers(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.IdcNumbers"));
				spec.setNormalBandwidth(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.NormalBandwidth"));
				spec.setIpSubnetNums(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.IpSubnetNums"));
				spec.setCoverage(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.Coverage"));
				spec.setEdition(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.Edition"));
				spec.setMitigationCapacity(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.MitigationCapacity"));
				spec.setMitigationNums(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.MitigationNums"));
				spec.setDiversionType(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.DiversionType"));
				spec.setMitigationAnalysis(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.MitigationAnalysis"));
				spec.setMitigationAnalysisCapacity(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.MitigationAnalysisCapacity"));
				spec.setInitialInstallation(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.InitialInstallation"));
				spec.setInitialQty(_ctx.stringValue("ListInstanceResponse.Data["+ i +"].Instances["+ j +"].Spec.InitialQty"));
				data2.setSpec(spec);

				instances.add(data2);
			}
			dataItem.setInstances(instances);

			data.add(dataItem);
		}
		listInstanceResponse.setData(data);
	 
	 	return listInstanceResponse;
	}
}
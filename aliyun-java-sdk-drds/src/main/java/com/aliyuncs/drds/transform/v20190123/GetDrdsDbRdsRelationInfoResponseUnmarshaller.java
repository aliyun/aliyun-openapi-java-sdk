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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.GetDrdsDbRdsRelationInfoResponse;
import com.aliyuncs.drds.model.v20190123.GetDrdsDbRdsRelationInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDrdsDbRdsRelationInfoResponseUnmarshaller {

	public static GetDrdsDbRdsRelationInfoResponse unmarshall(GetDrdsDbRdsRelationInfoResponse getDrdsDbRdsRelationInfoResponse, UnmarshallerContext _ctx) {
		
		getDrdsDbRdsRelationInfoResponse.setRequestId(_ctx.stringValue("GetDrdsDbRdsRelationInfoResponse.RequestId"));
		getDrdsDbRdsRelationInfoResponse.setSuccess(_ctx.booleanValue("GetDrdsDbRdsRelationInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDrdsDbRdsRelationInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRdsInstanceId(_ctx.stringValue("GetDrdsDbRdsRelationInfoResponse.Data["+ i +"].RdsInstanceId"));
			dataItem.setUsedInstanceId(_ctx.stringValue("GetDrdsDbRdsRelationInfoResponse.Data["+ i +"].UsedInstanceId"));
			dataItem.setUsedInstanceType(_ctx.stringValue("GetDrdsDbRdsRelationInfoResponse.Data["+ i +"].UsedInstanceType"));

			List<String> readOnlyInstanceInfo = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDrdsDbRdsRelationInfoResponse.Data["+ i +"].ReadOnlyInstanceInfo.Length"); j++) {
				readOnlyInstanceInfo.add(_ctx.stringValue("GetDrdsDbRdsRelationInfoResponse.Data["+ i +"].ReadOnlyInstanceInfo["+ j +"]"));
			}
			dataItem.setReadOnlyInstanceInfo(readOnlyInstanceInfo);

			data.add(dataItem);
		}
		getDrdsDbRdsRelationInfoResponse.setData(data);
	 
	 	return getDrdsDbRdsRelationInfoResponse;
	}
}
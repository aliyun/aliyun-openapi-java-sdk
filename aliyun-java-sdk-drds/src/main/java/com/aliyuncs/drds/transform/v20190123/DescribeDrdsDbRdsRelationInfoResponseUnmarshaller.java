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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbRdsRelationInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbRdsRelationInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbRdsRelationInfoResponseUnmarshaller {

	public static DescribeDrdsDbRdsRelationInfoResponse unmarshall(DescribeDrdsDbRdsRelationInfoResponse describeDrdsDbRdsRelationInfoResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbRdsRelationInfoResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbRdsRelationInfoResponse.RequestId"));
		describeDrdsDbRdsRelationInfoResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbRdsRelationInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDbRdsRelationInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRdsInstanceId(_ctx.stringValue("DescribeDrdsDbRdsRelationInfoResponse.Data["+ i +"].RdsInstanceId"));
			dataItem.setUsedInstanceId(_ctx.stringValue("DescribeDrdsDbRdsRelationInfoResponse.Data["+ i +"].UsedInstanceId"));
			dataItem.setUsedInstanceType(_ctx.stringValue("DescribeDrdsDbRdsRelationInfoResponse.Data["+ i +"].UsedInstanceType"));

			List<String> readOnlyInstanceInfo = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsDbRdsRelationInfoResponse.Data["+ i +"].ReadOnlyInstanceInfo.Length"); j++) {
				readOnlyInstanceInfo.add(_ctx.stringValue("DescribeDrdsDbRdsRelationInfoResponse.Data["+ i +"].ReadOnlyInstanceInfo["+ j +"]"));
			}
			dataItem.setReadOnlyInstanceInfo(readOnlyInstanceInfo);

			data.add(dataItem);
		}
		describeDrdsDbRdsRelationInfoResponse.setData(data);
	 
	 	return describeDrdsDbRdsRelationInfoResponse;
	}
}
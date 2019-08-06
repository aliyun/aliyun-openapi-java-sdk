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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbRelationInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbRelationInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbRelationInfoResponseUnmarshaller {

	public static DescribeDrdsDbRelationInfoResponse unmarshall(DescribeDrdsDbRelationInfoResponse describeDrdsDbRelationInfoResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbRelationInfoResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbRelationInfoResponse.RequestId"));
		describeDrdsDbRelationInfoResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbRelationInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDbRelationInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRdsInstanceId(_ctx.stringValue("DescribeDrdsDbRelationInfoResponse.Data["+ i +"].RdsInstanceId"));

			List<String> readOnlyInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsDbRelationInfoResponse.Data["+ i +"].ReadOnlyInstanceIds.Length"); j++) {
				readOnlyInstanceIds.add(_ctx.stringValue("DescribeDrdsDbRelationInfoResponse.Data["+ i +"].ReadOnlyInstanceIds["+ j +"]"));
			}
			dataItem.setReadOnlyInstanceIds(readOnlyInstanceIds);

			data.add(dataItem);
		}
		describeDrdsDbRelationInfoResponse.setData(data);
	 
	 	return describeDrdsDbRelationInfoResponse;
	}
}
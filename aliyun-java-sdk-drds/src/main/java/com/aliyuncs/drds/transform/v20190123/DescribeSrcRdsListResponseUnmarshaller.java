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

import com.aliyuncs.drds.model.v20190123.DescribeSrcRdsListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeSrcRdsListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSrcRdsListResponseUnmarshaller {

	public static DescribeSrcRdsListResponse unmarshall(DescribeSrcRdsListResponse describeSrcRdsListResponse, UnmarshallerContext _ctx) {
		
		describeSrcRdsListResponse.setRequestId(_ctx.stringValue("DescribeSrcRdsListResponse.RequestId"));
		describeSrcRdsListResponse.setSuccess(_ctx.booleanValue("DescribeSrcRdsListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSrcRdsListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRds(_ctx.stringValue("DescribeSrcRdsListResponse.Data["+ i +"].Rds"));
			dataItem.setDbName(_ctx.stringValue("DescribeSrcRdsListResponse.Data["+ i +"].DbName"));

			data.add(dataItem);
		}
		describeSrcRdsListResponse.setData(data);
	 
	 	return describeSrcRdsListResponse;
	}
}
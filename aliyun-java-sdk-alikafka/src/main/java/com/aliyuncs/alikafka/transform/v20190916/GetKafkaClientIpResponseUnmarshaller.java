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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetKafkaClientIpResponse;
import com.aliyuncs.alikafka.model.v20190916.GetKafkaClientIpResponse.Data;
import com.aliyuncs.alikafka.model.v20190916.GetKafkaClientIpResponse.Data.DataItem;
import com.aliyuncs.alikafka.model.v20190916.GetKafkaClientIpResponse.Data.DataItem.DataItem3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKafkaClientIpResponseUnmarshaller {

	public static GetKafkaClientIpResponse unmarshall(GetKafkaClientIpResponse getKafkaClientIpResponse, UnmarshallerContext _ctx) {
		
		getKafkaClientIpResponse.setRequestId(_ctx.stringValue("GetKafkaClientIpResponse.RequestId"));
		getKafkaClientIpResponse.setSuccess(_ctx.booleanValue("GetKafkaClientIpResponse.Success"));
		getKafkaClientIpResponse.setCode(_ctx.longValue("GetKafkaClientIpResponse.Code"));
		getKafkaClientIpResponse.setMessage(_ctx.stringValue("GetKafkaClientIpResponse.Message"));

		Data data = new Data();
		data.setSearchTimeRange(_ctx.integerValue("GetKafkaClientIpResponse.Data.SearchTimeRange"));
		data.setAlert(_ctx.booleanValue("GetKafkaClientIpResponse.Data.Alert"));
		data.setTimeLimitDay(_ctx.integerValue("GetKafkaClientIpResponse.Data.TimeLimitDay"));
		data.setStartDate(_ctx.longValue("GetKafkaClientIpResponse.Data.StartDate"));
		data.setEndDate(_ctx.longValue("GetKafkaClientIpResponse.Data.EndDate"));

		List<DataItem> data1 = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetKafkaClientIpResponse.Data.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("GetKafkaClientIpResponse.Data.Data["+ i +"].Name"));

			List<DataItem3> data2 = new ArrayList<DataItem3>();
			for (int j = 0; j < _ctx.lengthValue("GetKafkaClientIpResponse.Data.Data["+ i +"].Data.Length"); j++) {
				DataItem3 dataItem3 = new DataItem3();
				dataItem3.setIp(_ctx.stringValue("GetKafkaClientIpResponse.Data.Data["+ i +"].Data["+ j +"].Ip"));
				dataItem3.setNum(_ctx.longValue("GetKafkaClientIpResponse.Data.Data["+ i +"].Data["+ j +"].Num"));

				data2.add(dataItem3);
			}
			dataItem.setData2(data2);

			data1.add(dataItem);
		}
		data.setData1(data1);
		getKafkaClientIpResponse.setData(data);
	 
	 	return getKafkaClientIpResponse;
	}
}
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

package com.aliyuncs.yundun_ds.transform.v20190103;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.DataCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.DataCount.Instance;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.DataCount.Oss;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.DataCount.Table;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.DepartCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.EventCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTotalCountResponse.EventCount.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTotalCountResponseUnmarshaller {

	public static DescribeTotalCountResponse unmarshall(DescribeTotalCountResponse describeTotalCountResponse, UnmarshallerContext context) {
		
		describeTotalCountResponse.setRequestId(context.stringValue("DescribeTotalCountResponse.RequestId"));

		DataCount dataCount = new DataCount();

		Instance instance = new Instance();
		instance.setTotalCount(context.longValue("DescribeTotalCountResponse.DataCount.Instance.TotalCount"));
		instance.setCount(context.longValue("DescribeTotalCountResponse.DataCount.Instance.Count"));
		instance.setSensitiveCount(context.longValue("DescribeTotalCountResponse.DataCount.Instance.SensitiveCount"));
		instance.setLastCount(context.longValue("DescribeTotalCountResponse.DataCount.Instance.LastCount"));
		instance.setLastSensitiveCount(context.longValue("DescribeTotalCountResponse.DataCount.Instance.LastSensitiveCount"));
		dataCount.setInstance(instance);

		Table table = new Table();
		table.setTotalCount(context.longValue("DescribeTotalCountResponse.DataCount.Table.TotalCount"));
		table.setCount(context.longValue("DescribeTotalCountResponse.DataCount.Table.Count"));
		table.setSensitiveCount(context.longValue("DescribeTotalCountResponse.DataCount.Table.SensitiveCount"));
		table.setLastCount(context.longValue("DescribeTotalCountResponse.DataCount.Table.LastCount"));
		table.setLastSensitiveCount(context.longValue("DescribeTotalCountResponse.DataCount.Table.LastSensitiveCount"));
		dataCount.setTable(table);

		Oss oss = new Oss();
		oss.setTotalCount(context.longValue("DescribeTotalCountResponse.DataCount.Oss.TotalCount"));
		oss.setCount(context.longValue("DescribeTotalCountResponse.DataCount.Oss.Count"));
		oss.setSensitiveCount(context.longValue("DescribeTotalCountResponse.DataCount.Oss.SensitiveCount"));
		oss.setLastCount(context.longValue("DescribeTotalCountResponse.DataCount.Oss.LastCount"));
		oss.setLastSensitiveCount(context.longValue("DescribeTotalCountResponse.DataCount.Oss.LastSensitiveCount"));
		dataCount.setOss(oss);
		describeTotalCountResponse.setDataCount(dataCount);

		EventCount eventCount = new EventCount();

		Total total = new Total();
		total.setTotalCount(context.longValue("DescribeTotalCountResponse.EventCount.Total.TotalCount"));
		total.setUndealCount(context.longValue("DescribeTotalCountResponse.EventCount.Total.UndealCount"));
		total.setConfirmCount(context.longValue("DescribeTotalCountResponse.EventCount.Total.ConfirmCount"));
		total.setExcludeCount(context.longValue("DescribeTotalCountResponse.EventCount.Total.ExcludeCount"));
		eventCount.setTotal(total);
		describeTotalCountResponse.setEventCount(eventCount);

		DepartCount departCount = new DepartCount();
		departCount.setDepartCount(context.longValue("DescribeTotalCountResponse.DepartCount.DepartCount"));
		departCount.setCount(context.longValue("DescribeTotalCountResponse.DepartCount.Count"));
		departCount.setUserCount(context.longValue("DescribeTotalCountResponse.DepartCount.UserCount"));
		departCount.setDtCount(context.longValue("DescribeTotalCountResponse.DepartCount.DtCount"));
		departCount.setSubCount(context.longValue("DescribeTotalCountResponse.DepartCount.SubCount"));
		departCount.setSensitiveCount(context.longValue("DescribeTotalCountResponse.DepartCount.SensitiveCount"));
		describeTotalCountResponse.setDepartCount(departCount);
	 
	 	return describeTotalCountResponse;
	}
}
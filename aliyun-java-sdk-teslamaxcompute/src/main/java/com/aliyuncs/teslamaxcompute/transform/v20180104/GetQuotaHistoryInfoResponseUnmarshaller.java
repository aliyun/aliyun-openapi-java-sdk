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

package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point.CpuMaxQuota;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point.CpuMinQuota;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point.CpuUsed;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point.MemMaxQuota;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point.MemMinQuota;
import com.aliyuncs.teslamaxcompute.model.v20180104.GetQuotaHistoryInfoResponse.DataItem.Point.MemUsed;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaHistoryInfoResponseUnmarshaller {

	public static GetQuotaHistoryInfoResponse unmarshall(GetQuotaHistoryInfoResponse getQuotaHistoryInfoResponse, UnmarshallerContext context) {
		
		getQuotaHistoryInfoResponse.setRequestId(context.stringValue("GetQuotaHistoryInfoResponse.RequestId"));
		getQuotaHistoryInfoResponse.setCode(context.integerValue("GetQuotaHistoryInfoResponse.Code"));
		getQuotaHistoryInfoResponse.setMessage(context.stringValue("GetQuotaHistoryInfoResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("GetQuotaHistoryInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimes(context.integerValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Times"));

			Point point = new Point();

			CpuMaxQuota cpuMaxQuota = new CpuMaxQuota();
			cpuMaxQuota.setMin(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuMaxQuota.Min"));
			cpuMaxQuota.setMax(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuMaxQuota.Max"));
			cpuMaxQuota.setAvg(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuMaxQuota.Avg"));
			point.setCpuMaxQuota(cpuMaxQuota);

			CpuMinQuota cpuMinQuota = new CpuMinQuota();
			cpuMinQuota.setMin(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuMinQuota.Min"));
			cpuMinQuota.setMax(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuMinQuota.Max"));
			cpuMinQuota.setAvg(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuMinQuota.Avg"));
			point.setCpuMinQuota(cpuMinQuota);

			MemUsed memUsed = new MemUsed();
			memUsed.setMin(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemUsed.Min"));
			memUsed.setMax(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemUsed.Max"));
			memUsed.setAvg(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemUsed.Avg"));
			point.setMemUsed(memUsed);

			CpuUsed cpuUsed = new CpuUsed();
			cpuUsed.setMin(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuUsed.Min"));
			cpuUsed.setMax(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuUsed.Max"));
			cpuUsed.setAvg(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.CpuUsed.Avg"));
			point.setCpuUsed(cpuUsed);

			MemMaxQuota memMaxQuota = new MemMaxQuota();
			memMaxQuota.setMin(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemMaxQuota.Min"));
			memMaxQuota.setMax(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemMaxQuota.Max"));
			memMaxQuota.setAvg(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemMaxQuota.Avg"));
			point.setMemMaxQuota(memMaxQuota);

			MemMinQuota memMinQuota = new MemMinQuota();
			memMinQuota.setMin(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemMinQuota.Min"));
			memMinQuota.setMax(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemMinQuota.Max"));
			memMinQuota.setAvg(context.floatValue("GetQuotaHistoryInfoResponse.Data["+ i +"].Point.MemMinQuota.Avg"));
			point.setMemMinQuota(memMinQuota);
			dataItem.setPoint(point);

			data.add(dataItem);
		}
		getQuotaHistoryInfoResponse.setData(data);
	 
	 	return getQuotaHistoryInfoResponse;
	}
}
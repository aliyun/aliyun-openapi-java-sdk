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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeCustinsResourceInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCustinsResourceInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustinsResourceInfoResponseUnmarshaller {

	public static DescribeCustinsResourceInfoResponse unmarshall(DescribeCustinsResourceInfoResponse describeCustinsResourceInfoResponse, UnmarshallerContext _ctx) {
		
		describeCustinsResourceInfoResponse.setRequestId(_ctx.stringValue("DescribeCustinsResourceInfoResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustinsResourceInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMaxIopsIncreaseRatio(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxIopsIncreaseRatio"));
			dataItem.setMaxConnIncreaseRatioValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxConnIncreaseRatioValue"));
			dataItem.setMemoryAdjustDeadline(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MemoryAdjustDeadline"));
			dataItem.setMemAdjustableMaxValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MemAdjustableMaxValue"));
			dataItem.setIopsAdjustableMaxValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].IopsAdjustableMaxValue"));
			dataItem.setCpuIncreaseRatio(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].CpuIncreaseRatio"));
			dataItem.setMaxIopsIncreaseRatioValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxIopsIncreaseRatioValue"));
			dataItem.setOriginMaxConn(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].OriginMaxConn"));
			dataItem.setMemoryIncreaseRatioValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MemoryIncreaseRatioValue"));
			dataItem.setMaxConnIncreaseRatio(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxConnIncreaseRatio"));
			dataItem.setCpuIncreaseRatioValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].CpuIncreaseRatioValue"));
			dataItem.setOriginMaxIops(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].OriginMaxIops"));
			dataItem.setMaxConnAdjustableMaxValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxConnAdjustableMaxValue"));
			dataItem.setMaxConnAdjustDeadline(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxConnAdjustDeadline"));
			dataItem.setMaxIopsAdjustDeadline(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MaxIopsAdjustDeadline"));
			dataItem.setOriginMemory(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].OriginMemory"));
			dataItem.setMemAdjustableMaxRatio(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MemAdjustableMaxRatio"));
			dataItem.setCpuAdjustableMaxValue(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].CpuAdjustableMaxValue"));
			dataItem.setCpuAdjustableMaxRatio(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].CpuAdjustableMaxRatio"));
			dataItem.setCpuAdjustDeadline(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].CpuAdjustDeadline"));
			dataItem.setMemoryIncreaseRatio(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].MemoryIncreaseRatio"));
			dataItem.setOriginCpu(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].OriginCpu"));
			dataItem.setDBInstanceId(_ctx.stringValue("DescribeCustinsResourceInfoResponse.Data["+ i +"].DBInstanceId"));

			data.add(dataItem);
		}
		describeCustinsResourceInfoResponse.setData(data);
	 
	 	return describeCustinsResourceInfoResponse;
	}
}
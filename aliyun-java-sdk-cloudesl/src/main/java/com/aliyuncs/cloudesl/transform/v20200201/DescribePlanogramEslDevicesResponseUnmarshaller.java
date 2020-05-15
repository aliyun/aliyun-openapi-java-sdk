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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramEslDevicesResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramEslDevicesResponse.EslDeviceLayerInfo;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramEslDevicesResponse.EslDeviceLayerInfo.EslDevicePositionInfo;
import com.aliyuncs.cloudesl.model.v20200201.DescribePlanogramEslDevicesResponse.EslDeviceLayerInfo.EslDevicePositionInfo.EslDevicePlanogramInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlanogramEslDevicesResponseUnmarshaller {

	public static DescribePlanogramEslDevicesResponse unmarshall(DescribePlanogramEslDevicesResponse describePlanogramEslDevicesResponse, UnmarshallerContext _ctx) {
		
		describePlanogramEslDevicesResponse.setRequestId(_ctx.stringValue("DescribePlanogramEslDevicesResponse.RequestId"));
		describePlanogramEslDevicesResponse.setCode(_ctx.stringValue("DescribePlanogramEslDevicesResponse.Code"));
		describePlanogramEslDevicesResponse.setDynamicCode(_ctx.stringValue("DescribePlanogramEslDevicesResponse.DynamicCode"));
		describePlanogramEslDevicesResponse.setDynamicMessage(_ctx.stringValue("DescribePlanogramEslDevicesResponse.DynamicMessage"));
		describePlanogramEslDevicesResponse.setErrorCode(_ctx.stringValue("DescribePlanogramEslDevicesResponse.ErrorCode"));
		describePlanogramEslDevicesResponse.setErrorMessage(_ctx.stringValue("DescribePlanogramEslDevicesResponse.ErrorMessage"));
		describePlanogramEslDevicesResponse.setMessage(_ctx.stringValue("DescribePlanogramEslDevicesResponse.Message"));
		describePlanogramEslDevicesResponse.setShelf(_ctx.stringValue("DescribePlanogramEslDevicesResponse.Shelf"));
		describePlanogramEslDevicesResponse.setStoreId(_ctx.stringValue("DescribePlanogramEslDevicesResponse.StoreId"));
		describePlanogramEslDevicesResponse.setSuccess(_ctx.booleanValue("DescribePlanogramEslDevicesResponse.Success"));

		List<EslDeviceLayerInfo> eslDeviceLayerInfos = new ArrayList<EslDeviceLayerInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos.Length"); i++) {
			EslDeviceLayerInfo eslDeviceLayerInfo = new EslDeviceLayerInfo();
			eslDeviceLayerInfo.setLayer(_ctx.integerValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].Layer"));

			List<EslDevicePositionInfo> eslDevicePositionInfos = new ArrayList<EslDevicePositionInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos.Length"); j++) {
				EslDevicePositionInfo eslDevicePositionInfo = new EslDevicePositionInfo();
				eslDevicePositionInfo.setColumn(_ctx.stringValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos["+ j +"].Column"));

				List<EslDevicePlanogramInfo> eslDevicePlanogramInfos = new ArrayList<EslDevicePlanogramInfo>();
				for (int k = 0; k < _ctx.lengthValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos["+ j +"].EslDevicePlanogramInfos.Length"); k++) {
					EslDevicePlanogramInfo eslDevicePlanogramInfo = new EslDevicePlanogramInfo();
					eslDevicePlanogramInfo.setEslBarCode(_ctx.stringValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos["+ j +"].EslDevicePlanogramInfos["+ k +"].EslBarCode"));
					eslDevicePlanogramInfo.setEslModel(_ctx.stringValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos["+ j +"].EslDevicePlanogramInfos["+ k +"].EslModel"));
					eslDevicePlanogramInfo.setItemBarCode(_ctx.stringValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos["+ j +"].EslDevicePlanogramInfos["+ k +"].ItemBarCode"));
					eslDevicePlanogramInfo.setItemTitle(_ctx.stringValue("DescribePlanogramEslDevicesResponse.EslDeviceLayerInfos["+ i +"].EslDevicePositionInfos["+ j +"].EslDevicePlanogramInfos["+ k +"].ItemTitle"));

					eslDevicePlanogramInfos.add(eslDevicePlanogramInfo);
				}
				eslDevicePositionInfo.setEslDevicePlanogramInfos(eslDevicePlanogramInfos);

				eslDevicePositionInfos.add(eslDevicePositionInfo);
			}
			eslDeviceLayerInfo.setEslDevicePositionInfos(eslDevicePositionInfos);

			eslDeviceLayerInfos.add(eslDeviceLayerInfo);
		}
		describePlanogramEslDevicesResponse.setEslDeviceLayerInfos(eslDeviceLayerInfos);
	 
	 	return describePlanogramEslDevicesResponse;
	}
}
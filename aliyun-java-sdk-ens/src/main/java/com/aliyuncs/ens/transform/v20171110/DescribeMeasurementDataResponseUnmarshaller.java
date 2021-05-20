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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeMeasurementDataResponse;
import com.aliyuncs.ens.model.v20171110.DescribeMeasurementDataResponse.MeasurementData;
import com.aliyuncs.ens.model.v20171110.DescribeMeasurementDataResponse.MeasurementData.BandWidthFeeData;
import com.aliyuncs.ens.model.v20171110.DescribeMeasurementDataResponse.MeasurementData.ResourceFeeData;
import com.aliyuncs.ens.model.v20171110.DescribeMeasurementDataResponse.MeasurementData.ResourceFeeDataDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMeasurementDataResponseUnmarshaller {

	public static DescribeMeasurementDataResponse unmarshall(DescribeMeasurementDataResponse describeMeasurementDataResponse, UnmarshallerContext _ctx) {
		
		describeMeasurementDataResponse.setRequestId(_ctx.stringValue("DescribeMeasurementDataResponse.RequestId"));

		List<MeasurementData> measurementDatas = new ArrayList<MeasurementData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMeasurementDataResponse.MeasurementDatas.Length"); i++) {
			MeasurementData measurementData = new MeasurementData();
			measurementData.setChargeModel(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ChargeModel"));
			measurementData.setCostCycle(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].CostCycle"));
			measurementData.setCostEndTime(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].CostEndTime"));
			measurementData.setCostStartTime(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].CostStartTime"));

			ResourceFeeData resourceFeeData = new ResourceFeeData();
			resourceFeeData.setMemory(_ctx.integerValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeData.Memory"));
			resourceFeeData.setStorage(_ctx.integerValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeData.Storage"));
			resourceFeeData.setVcpu(_ctx.integerValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeData.Vcpu"));
			measurementData.setResourceFeeData(resourceFeeData);

			List<BandWidthFeeData> bandWidthFeeDatas = new ArrayList<BandWidthFeeData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas.Length"); j++) {
				BandWidthFeeData bandWidthFeeData = new BandWidthFeeData();
				bandWidthFeeData.setCostCode(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostCode"));
				bandWidthFeeData.setCostName(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostName"));
				bandWidthFeeData.setCostVal(_ctx.integerValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostVal"));

				bandWidthFeeDatas.add(bandWidthFeeData);
			}
			measurementData.setBandWidthFeeDatas(bandWidthFeeDatas);

			List<ResourceFeeDataDetail> resourceFeeDataDetails = new ArrayList<ResourceFeeDataDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeDataDetails.Length"); j++) {
				ResourceFeeDataDetail resourceFeeDataDetail = new ResourceFeeDataDetail();
				resourceFeeDataDetail.setCostCode(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeDataDetails["+ j +"].CostCode"));
				resourceFeeDataDetail.setCostName(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeDataDetails["+ j +"].CostName"));
				resourceFeeDataDetail.setCostVal(_ctx.integerValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeDataDetails["+ j +"].CostVal"));
				resourceFeeDataDetail.setResourceType(_ctx.stringValue("DescribeMeasurementDataResponse.MeasurementDatas["+ i +"].ResourceFeeDataDetails["+ j +"].ResourceType"));

				resourceFeeDataDetails.add(resourceFeeDataDetail);
			}
			measurementData.setResourceFeeDataDetails(resourceFeeDataDetails);

			measurementDatas.add(measurementData);
		}
		describeMeasurementDataResponse.setMeasurementDatas(measurementDatas);
	 
	 	return describeMeasurementDataResponse;
	}
}
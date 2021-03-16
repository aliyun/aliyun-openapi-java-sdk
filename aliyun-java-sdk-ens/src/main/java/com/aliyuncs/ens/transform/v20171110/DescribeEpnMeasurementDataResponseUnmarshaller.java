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

import com.aliyuncs.ens.model.v20171110.DescribeEpnMeasurementDataResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEpnMeasurementDataResponse.MeasurementData;
import com.aliyuncs.ens.model.v20171110.DescribeEpnMeasurementDataResponse.MeasurementData.BandWidthFeeData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEpnMeasurementDataResponseUnmarshaller {

	public static DescribeEpnMeasurementDataResponse unmarshall(DescribeEpnMeasurementDataResponse describeEpnMeasurementDataResponse, UnmarshallerContext _ctx) {
		
		describeEpnMeasurementDataResponse.setRequestId(_ctx.stringValue("DescribeEpnMeasurementDataResponse.RequestId"));

		List<MeasurementData> measurementDatas = new ArrayList<MeasurementData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnMeasurementDataResponse.MeasurementDatas.Length"); i++) {
			MeasurementData measurementData = new MeasurementData();
			measurementData.setChargeModel(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].ChargeModel"));
			measurementData.setCostCycle(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].CostCycle"));
			measurementData.setCostStartTime(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].CostStartTime"));
			measurementData.setCostEndTime(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].CostEndTime"));

			List<BandWidthFeeData> bandWidthFeeDatas = new ArrayList<BandWidthFeeData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas.Length"); j++) {
				BandWidthFeeData bandWidthFeeData = new BandWidthFeeData();
				bandWidthFeeData.setCostVal(_ctx.integerValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostVal"));
				bandWidthFeeData.setIspLine(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].IspLine"));
				bandWidthFeeData.setCostCode(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostCode"));
				bandWidthFeeData.setCostType(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostType"));
				bandWidthFeeData.setCostName(_ctx.stringValue("DescribeEpnMeasurementDataResponse.MeasurementDatas["+ i +"].BandWidthFeeDatas["+ j +"].CostName"));

				bandWidthFeeDatas.add(bandWidthFeeData);
			}
			measurementData.setBandWidthFeeDatas(bandWidthFeeDatas);

			measurementDatas.add(measurementData);
		}
		describeEpnMeasurementDataResponse.setMeasurementDatas(measurementDatas);
	 
	 	return describeEpnMeasurementDataResponse;
	}
}
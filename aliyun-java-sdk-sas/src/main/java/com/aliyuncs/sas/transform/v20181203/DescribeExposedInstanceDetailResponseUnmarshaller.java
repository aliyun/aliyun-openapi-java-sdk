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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceDetailResponse.ExposedChain;
import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceDetailResponse.ExposedChain.ScaVulRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExposedInstanceDetailResponseUnmarshaller {

	public static DescribeExposedInstanceDetailResponse unmarshall(DescribeExposedInstanceDetailResponse describeExposedInstanceDetailResponse, UnmarshallerContext _ctx) {
		
		describeExposedInstanceDetailResponse.setRequestId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.RequestId"));

		List<ExposedChain> exposedChains = new ArrayList<ExposedChain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExposedInstanceDetailResponse.ExposedChains.Length"); i++) {
			ExposedChain exposedChain = new ExposedChain();
			exposedChain.setUuid(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].Uuid"));
			exposedChain.setIntranetIp(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].IntranetIp"));
			exposedChain.setInternetIp(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].InternetIp"));
			exposedChain.setExposureComponent(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureComponent"));
			exposedChain.setExposureType(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureType"));
			exposedChain.setExposurePort(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposurePort"));
			exposedChain.setExposureIp(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureIp"));
			exposedChain.setExposureTypeId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureTypeId"));
			exposedChain.setInstanceId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].InstanceId"));
			exposedChain.setInstanceName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].InstanceName"));
			exposedChain.setRegionId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RegionId"));

			List<ScaVulRecord> realVulList = new ArrayList<ScaVulRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList.Length"); j++) {
				ScaVulRecord scaVulRecord = new ScaVulRecord();
				scaVulRecord.setAliasName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].AliasName"));
				scaVulRecord.setNecessity(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Necessity"));
				scaVulRecord.setName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Name"));
				scaVulRecord.setType(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Type"));
				scaVulRecord.setUuid(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Uuid"));

				realVulList.add(scaVulRecord);
			}
			exposedChain.setRealVulList(realVulList);

			List<ScaVulRecord> allVulList = new ArrayList<ScaVulRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList.Length"); j++) {
				ScaVulRecord scaVulRecord_ = new ScaVulRecord();
				scaVulRecord_.setAliasName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].AliasName"));
				scaVulRecord_.setNecessity(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Necessity"));
				scaVulRecord_.setName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Name"));
				scaVulRecord_.setType(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Type"));
				scaVulRecord_.setUuid(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Uuid"));

				allVulList.add(scaVulRecord_);
			}
			exposedChain.setAllVulList(allVulList);

			exposedChains.add(exposedChain);
		}
		describeExposedInstanceDetailResponse.setExposedChains(exposedChains);
	 
	 	return describeExposedInstanceDetailResponse;
	}
}
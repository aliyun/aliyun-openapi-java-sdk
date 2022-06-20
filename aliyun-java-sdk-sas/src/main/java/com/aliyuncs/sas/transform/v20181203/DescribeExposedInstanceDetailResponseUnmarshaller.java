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
			exposedChain.setExposureIp(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureIp"));
			exposedChain.setGroupNo(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].GroupNo"));
			exposedChain.setInternetIp(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].InternetIp"));
			exposedChain.setInstanceId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].InstanceId"));
			exposedChain.setExposureType(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureType"));
			exposedChain.setIntranetIp(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].IntranetIp"));
			exposedChain.setExposureTypeId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureTypeId"));
			exposedChain.setRegionId(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RegionId"));
			exposedChain.setUuid(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].Uuid"));
			exposedChain.setExposurePort(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposurePort"));
			exposedChain.setInstanceName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].InstanceName"));
			exposedChain.setExposureComponent(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].ExposureComponent"));

			List<ScaVulRecord> realVulList = new ArrayList<ScaVulRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList.Length"); j++) {
				ScaVulRecord scaVulRecord = new ScaVulRecord();
				scaVulRecord.setType(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Type"));
				scaVulRecord.setNecessity(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Necessity"));
				scaVulRecord.setUuid(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Uuid"));
				scaVulRecord.setAliasName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].AliasName"));
				scaVulRecord.setName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].RealVulList["+ j +"].Name"));

				realVulList.add(scaVulRecord);
			}
			exposedChain.setRealVulList(realVulList);

			List<ScaVulRecord> allVulList = new ArrayList<ScaVulRecord>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList.Length"); j++) {
				ScaVulRecord scaVulRecord1 = new ScaVulRecord();
				scaVulRecord1.setType(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Type"));
				scaVulRecord1.setNecessity(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Necessity"));
				scaVulRecord1.setUuid(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Uuid"));
				scaVulRecord1.setAliasName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].AliasName"));
				scaVulRecord1.setName(_ctx.stringValue("DescribeExposedInstanceDetailResponse.ExposedChains["+ i +"].AllVulList["+ j +"].Name"));

				allVulList.add(scaVulRecord1);
			}
			exposedChain.setAllVulList(allVulList);

			exposedChains.add(exposedChain);
		}
		describeExposedInstanceDetailResponse.setExposedChains(exposedChains);
	 
	 	return describeExposedInstanceDetailResponse;
	}
}
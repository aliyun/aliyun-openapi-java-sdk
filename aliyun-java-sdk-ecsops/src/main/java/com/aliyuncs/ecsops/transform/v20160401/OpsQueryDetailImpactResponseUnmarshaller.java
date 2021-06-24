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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailImpactResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailImpactResponse.ImpactDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDetailImpactResponseUnmarshaller {

	public static OpsQueryDetailImpactResponse unmarshall(OpsQueryDetailImpactResponse opsQueryDetailImpactResponse, UnmarshallerContext _ctx) {
		
		opsQueryDetailImpactResponse.setRequestId(_ctx.stringValue("OpsQueryDetailImpactResponse.RequestId"));
		opsQueryDetailImpactResponse.setTotalCount(_ctx.integerValue("OpsQueryDetailImpactResponse.TotalCount"));

		List<ImpactDetailInfo> impactDetailInfos = new ArrayList<ImpactDetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDetailImpactResponse.ImpactDetailInfos.Length"); i++) {
			ImpactDetailInfo impactDetailInfo = new ImpactDetailInfo();
			impactDetailInfo.setStatus(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Status"));
			impactDetailInfo.setPhysicalModel(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].PhysicalModel"));
			impactDetailInfo.setGcLevel(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].GcLevel"));
			impactDetailInfo.setRoom(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Room"));
			impactDetailInfo.setCluster(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Cluster"));
			impactDetailInfo.setIsStorageNc(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].IsStorageNc"));
			impactDetailInfo.setNcIp(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].NcIp"));
			impactDetailInfo.setAdditionalInfo(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].AdditionalInfo"));
			impactDetailInfo.setGocCores(_ctx.floatValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].GocCores"));
			impactDetailInfo.setRegion(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Region"));
			impactDetailInfo.setWarningLevel(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].WarningLevel"));
			impactDetailInfo.setAsw(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Asw"));
			impactDetailInfo.setExceptionTime(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].ExceptionTime"));
			impactDetailInfo.setIsLocalDisk(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].IsLocalDisk"));
			impactDetailInfo.setIdc(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Idc"));
			impactDetailInfo.setCores(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Cores"));
			impactDetailInfo.setProductName(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].ProductName"));
			impactDetailInfo.setAZone(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].AZone"));
			impactDetailInfo.setAliUid(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].AliUid"));
			impactDetailInfo.setInstanceId(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].InstanceId"));
			impactDetailInfo.setInstanceType(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].InstanceType"));
			impactDetailInfo.setIsPhysicalMachine(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].IsPhysicalMachine"));
			impactDetailInfo.setRack(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Rack"));
			impactDetailInfo.setZone(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Zone"));
			impactDetailInfo.setReason(_ctx.stringValue("OpsQueryDetailImpactResponse.ImpactDetailInfos["+ i +"].Reason"));

			impactDetailInfos.add(impactDetailInfo);
		}
		opsQueryDetailImpactResponse.setImpactDetailInfos(impactDetailInfos);
	 
	 	return opsQueryDetailImpactResponse;
	}
}
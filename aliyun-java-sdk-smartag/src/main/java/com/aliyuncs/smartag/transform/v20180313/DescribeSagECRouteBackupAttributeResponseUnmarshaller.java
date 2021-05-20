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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagECRouteBackupAttributeResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagECRouteBackupAttributeResponse.Cidr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagECRouteBackupAttributeResponseUnmarshaller {

	public static DescribeSagECRouteBackupAttributeResponse unmarshall(DescribeSagECRouteBackupAttributeResponse describeSagECRouteBackupAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSagECRouteBackupAttributeResponse.setRequestId(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.RequestId"));
		describeSagECRouteBackupAttributeResponse.setHcIp(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.HcIp"));
		describeSagECRouteBackupAttributeResponse.setStatus(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.Status"));
		describeSagECRouteBackupAttributeResponse.setExpressConnectionInterface(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.ExpressConnectionInterface"));
		describeSagECRouteBackupAttributeResponse.setRouteBackup(_ctx.booleanValue("DescribeSagECRouteBackupAttributeResponse.RouteBackup"));
		describeSagECRouteBackupAttributeResponse.setExpressConnectionNexthop(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.ExpressConnectionNexthop"));
		describeSagECRouteBackupAttributeResponse.setSagId(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.SagId"));

		List<Cidr> cidrs = new ArrayList<Cidr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagECRouteBackupAttributeResponse.Cidrs.Length"); i++) {
			Cidr cidr = new Cidr();
			cidr.setEnableBackup(_ctx.booleanValue("DescribeSagECRouteBackupAttributeResponse.Cidrs["+ i +"].EnableBackup"));
			cidr.setCidr(_ctx.stringValue("DescribeSagECRouteBackupAttributeResponse.Cidrs["+ i +"].Cidr"));

			cidrs.add(cidr);
		}
		describeSagECRouteBackupAttributeResponse.setCidrs(cidrs);
	 
	 	return describeSagECRouteBackupAttributeResponse;
	}
}
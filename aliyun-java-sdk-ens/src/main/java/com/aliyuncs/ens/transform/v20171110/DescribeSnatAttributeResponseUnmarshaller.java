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

import com.aliyuncs.ens.model.v20171110.DescribeSnatAttributeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSnatAttributeResponse.Snatip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnatAttributeResponseUnmarshaller {

	public static DescribeSnatAttributeResponse unmarshall(DescribeSnatAttributeResponse describeSnatAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSnatAttributeResponse.setRequestId(_ctx.stringValue("DescribeSnatAttributeResponse.RequestId"));
		describeSnatAttributeResponse.setNatGatewayId(_ctx.stringValue("DescribeSnatAttributeResponse.NatGatewayId"));
		describeSnatAttributeResponse.setSnatEntryId(_ctx.stringValue("DescribeSnatAttributeResponse.SnatEntryId"));
		describeSnatAttributeResponse.setSnatIp(_ctx.stringValue("DescribeSnatAttributeResponse.SnatIp"));
		describeSnatAttributeResponse.setSourceCIDR(_ctx.stringValue("DescribeSnatAttributeResponse.SourceCIDR"));
		describeSnatAttributeResponse.setSnatEntryName(_ctx.stringValue("DescribeSnatAttributeResponse.SnatEntryName"));
		describeSnatAttributeResponse.setStatus(_ctx.stringValue("DescribeSnatAttributeResponse.Status"));
		describeSnatAttributeResponse.setCreationTime(_ctx.stringValue("DescribeSnatAttributeResponse.CreationTime"));
		describeSnatAttributeResponse.setStandbySnatIp(_ctx.stringValue("DescribeSnatAttributeResponse.StandbySnatIp"));
		describeSnatAttributeResponse.setStandbyStatus(_ctx.stringValue("DescribeSnatAttributeResponse.StandbyStatus"));

		List<Snatip> snatIps = new ArrayList<Snatip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnatAttributeResponse.SnatIps.Length"); i++) {
			Snatip snatip = new Snatip();
			snatip.setIp(_ctx.stringValue("DescribeSnatAttributeResponse.SnatIps["+ i +"].Ip"));
			snatip.setStatus(_ctx.stringValue("DescribeSnatAttributeResponse.SnatIps["+ i +"].Status"));
			snatip.setCreationTime(_ctx.stringValue("DescribeSnatAttributeResponse.SnatIps["+ i +"].CreationTime"));

			snatIps.add(snatip);
		}
		describeSnatAttributeResponse.setSnatIps(snatIps);
	 
	 	return describeSnatAttributeResponse;
	}
}
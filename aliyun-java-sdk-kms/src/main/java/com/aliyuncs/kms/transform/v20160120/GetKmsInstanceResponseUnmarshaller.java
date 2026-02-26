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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.GetKmsInstanceResponse;
import com.aliyuncs.kms.model.v20160120.GetKmsInstanceResponse.KmsInstance;
import com.aliyuncs.kms.model.v20160120.GetKmsInstanceResponse.KmsInstance.BindVpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKmsInstanceResponseUnmarshaller {

	public static GetKmsInstanceResponse unmarshall(GetKmsInstanceResponse getKmsInstanceResponse, UnmarshallerContext _ctx) {
		
		getKmsInstanceResponse.setRequestId(_ctx.stringValue("GetKmsInstanceResponse.RequestId"));

		KmsInstance kmsInstance = new KmsInstance();
		kmsInstance.setInstanceId(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.InstanceId"));
		kmsInstance.setInstanceName(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.InstanceName"));
		kmsInstance.setStatus(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.Status"));
		kmsInstance.setCreateTime(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.CreateTime"));
		kmsInstance.setSpec(_ctx.longValue("GetKmsInstanceResponse.KmsInstance.Spec"));
		kmsInstance.setKeyNum(_ctx.longValue("GetKmsInstanceResponse.KmsInstance.KeyNum"));
		kmsInstance.setSecretNum(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.SecretNum"));
		kmsInstance.setVpcNum(_ctx.longValue("GetKmsInstanceResponse.KmsInstance.VpcNum"));
		kmsInstance.setVpcId(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.VpcId"));
		kmsInstance.setZoneIds(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.ZoneIds"));
		kmsInstance.setVswitchIds(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.VswitchIds"));
		kmsInstance.setEndDate(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.EndDate"));
		kmsInstance.setStartDate(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.StartDate"));
		kmsInstance.setCaCertificateChainPem(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.CaCertificateChainPem"));

		List<BindVpc> bindVpcs = new ArrayList<BindVpc>();
		for (int i = 0; i < _ctx.lengthValue("GetKmsInstanceResponse.KmsInstance.BindVpcs.Length"); i++) {
			BindVpc bindVpc = new BindVpc();
			bindVpc.setRegionId(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.BindVpcs["+ i +"].RegionId"));
			bindVpc.setVpcId(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.BindVpcs["+ i +"].VpcId"));
			bindVpc.setVpcOwnerId(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.BindVpcs["+ i +"].VpcOwnerId"));
			bindVpc.setVSwitchId(_ctx.stringValue("GetKmsInstanceResponse.KmsInstance.BindVpcs["+ i +"].VSwitchId"));

			bindVpcs.add(bindVpc);
		}
		kmsInstance.setBindVpcs(bindVpcs);
		getKmsInstanceResponse.setKmsInstance(kmsInstance);
	 
	 	return getKmsInstanceResponse;
	}
}